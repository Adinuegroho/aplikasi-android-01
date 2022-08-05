package com.example.projekakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvSepatu: RecyclerView
    private var list: ArrayList<Sepatu> = arrayListOf()
    private var title: String = "Home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBar(title)

        rvSepatu = findViewById(R.id.rv_sepatu)
        rvSepatu.setHasFixedSize(true)

        list.addAll(SepatuData.listData)
        showRecyclerCardView()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.menu_about -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }


    private fun showRecyclerCardView(){
        rvSepatu.layoutManager = LinearLayoutManager(this)
        val cardViewSepatuAdapter = CardViewSepatuAdapter(list)
        rvSepatu.adapter = cardViewSepatuAdapter

        cardViewSepatuAdapter.setOnItemCallback(object : CardViewSepatuAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Sepatu) {
                val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_PHOTO, data.photo)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, data.name)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_PRICE, data.price)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_TIPE, data.tipe)
                startActivity(moveWithDataIntent)
            }
        })
    }

    private fun setActionBar(title: String) {
        supportActionBar?.title = title
    }
}