package com.example.projekakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    private var title: String = "Detail"

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_TIPE = "extra_tipe"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBar(title)

        val imgDataReceiver: ImageView = findViewById(R.id.img_item_detail_photo)
        val tvItemName: TextView = findViewById(R.id.tv_item_detail_name)
        val tvItemPrice: TextView = findViewById(R.id.tv_item_detail_price)
        val tvItemDetail: TextView = findViewById(R.id.tv_item_detail_detail)
        val tvItemTipe: TextView = findViewById(R.id.tv_item_detail_tipe)
        val btnBuy: Button = findViewById(R.id.btn_buy)

        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val price = intent.getIntExtra(EXTRA_PRICE, 0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val tipe = intent.getStringExtra(EXTRA_TIPE)

        val textPrice ="IDR ${price}K"
        val textButton = "Buy IDR ${price}K"

        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(350,380 ))
            .into(imgDataReceiver)

        tvItemName.text = name
        tvItemPrice.text = textPrice
        tvItemDetail.text = detail
        btnBuy.text = textButton
        tvItemTipe.text = tipe

        btnBuy.setOnClickListener{
            Toast.makeText(this, "Kamu Membeli $name dengan harga ${price}K", Toast.LENGTH_SHORT).show()
        }

    }

    private fun setActionBar(title: String) {
        supportActionBar?.title = title
    }

}