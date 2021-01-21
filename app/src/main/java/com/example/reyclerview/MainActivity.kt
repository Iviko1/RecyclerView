package com.example.reyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val linkList = ArrayList<Photos>()

        linkList.add(Photos("https://images6.alphacoders.com/559/559731.jpg"))
        linkList.add(Photos("https://images4.alphacoders.com/817/817016.png"))
        linkList.add(Photos("https://images.alphacoders.com/495/495672.jpg"))
        linkList.add(Photos("https://images5.alphacoders.com/680/680381.png"))
        linkList.add(Photos("https://images5.alphacoders.com/328/328327.jpg"))
        linkList.add(Photos("https://images.alphacoders.com/102/102773.jpg"))
        linkList.add(Photos("https://images.alphacoders.com/499/499958.jpg"))
        linkList.add(Photos("https://images.alphacoders.com/681/681587.png"))


        val adapter = Adapter(linkList,this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this,2)
    }
}