package id.kotlin.tugasminggu02

import android.app.Dialog
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import id.kotlin.tugasminggu02.adapter.AdapterListView
import id.kotlin.tugasminggu02.model.Anggota
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listAnggota = ArrayList<Anggota>()
        listAnggota.add(Anggota("Asep",8345678,R.mipmap.foto_orang_1_foreground,"Jakarta"))
        listAnggota.add(Anggota("Agus",8345678,R.mipmap.foto_orang_2_foreground,"Padang"))
        listAnggota.add(Anggota("Heri",8345678,R.mipmap.foto_orang_3_foreground,"Makasar"))
        listAnggota.add(Anggota("Hermawan",8345678,R.mipmap.foto_orang_4_foreground,"Palembang"))

        val adapter = AdapterListView(this, listAnggota)
        list.adapter = adapter

        list.setOnItemClickListener { _, _, position, _ ->
            Dialog(this).apply {
                requestWindowFeature(Window.FEATURE_NO_TITLE)
                setCancelable(true)
                setContentView(R.layout.detail_list_item)

                val image = this.findViewById<ImageView>(R.id.image)
                val nama = this.findViewById<TextView>(R.id.textNama)
                val nohp = this.findViewById<TextView>(R.id.textNohp)
                val alamat = this.findViewById<TextView>(R.id.textAlamat)
                val close = this.findViewById<Button>(R.id.close)

                val item = listAnggota.get(position)

                image.setImageResource(item.foto)
                nama.text = "Nama : ${item.nama}"
                nohp.text = "No Hp : ${item.nohp}"
                alamat.text = "Nama : ${item.alamat}"


                close.setOnClickListener {
                    this.dismiss()
                }
            }.show()
        }
    }
}
