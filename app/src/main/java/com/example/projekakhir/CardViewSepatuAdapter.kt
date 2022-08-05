package com.example.projekakhir

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewSepatuAdapter(private val listSepatu: ArrayList<Sepatu>) :
    RecyclerView.Adapter<CardViewSepatuAdapter.CardViewViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Sepatu)
    }

    inner class CardViewViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.item_detail)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_price)
        var tvTipe: TextView = itemView.findViewById(R.id.tv_tipe)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val sepatu = listSepatu[position]
        val textPrice = "${sepatu.price}K"

        Glide.with(holder.itemView.context)
            .load(sepatu.photo)
            .apply(RequestOptions().override(350,380 ))
            .into(holder.imgPhoto)

        holder.tvName.text = sepatu.name
        holder.tvDetail.text = sepatu.detail
        holder.tvPrice.text = textPrice
        holder.tvTipe.text = sepatu.tipe

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(sepatu)
        }
    }

    override fun getItemCount(): Int {
        return listSepatu.size
    }
}