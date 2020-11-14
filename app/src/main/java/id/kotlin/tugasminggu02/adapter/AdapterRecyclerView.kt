package id.kotlin.tugasminggu02.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.kotlin.tugasminggu02.R
import id.kotlin.tugasminggu02.model.Anggota


class AdapterRecyclerView(
    private val context: Context,
    private val data: List<Anggota>?,
    private val itemClick: OnClickListener
) : RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.list_item,
            parent, false)
        return ViewHolder(view);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data?.get(position)
        holder.foto.setImageResource(item?.foto ?: 0)
        holder.nama.text = item?.nama
        holder.view.setOnClickListener {
            itemClick.detailData(item)
        }
    }

    override fun getItemCount(): Int  = data?.size ?:0

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        var foto = view.findViewById<ImageView>(R.id.image)
        var nama = view.findViewById<TextView>(R.id.nama)
    }

    interface OnClickListener {
        fun detailData(item: Anggota?)
    }


}