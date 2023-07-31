package com.example.kotlinrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val personList: List<Person> = listOf(
            Person("Mad bee", "12345678", R.drawable.madbee),
            Person("Silas", "2233445566", R.drawable.unworthy)
        )

        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = RecyclerView.HORIZONTAL
        recyclerView.layoutManager = layoutManager

        val myAdapter = MyAdapter(personList)
        recyclerView.adapter = myAdapter
    }
}