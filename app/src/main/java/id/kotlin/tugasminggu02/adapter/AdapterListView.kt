package id.kotlin.tugasminggu02.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import id.kotlin.tugasminggu02.R
import id.kotlin.tugasminggu02.model.Anggota

class AdapterListView (private val context: Context, private val data: ArrayList<Anggota>?) : BaseAdapter(){

    override fun getCount(): Int {
        return data?.size ?: 0
    }

    override fun getItem(position: Int): Any {
        return data?.get(position) ?: 0
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_item, parent, false)

        val foto= view.findViewById<ImageView>(R.id.image)
        val nama = view.findViewById<TextView>(R.id.nama)

        val item = data?.get(position)

        foto.setImageResource(item?.foto ?: 0)
        nama.text = item?.nama

        return view
    }
}