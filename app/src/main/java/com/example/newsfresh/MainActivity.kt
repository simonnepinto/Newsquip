package com.example.newsfresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onItemClicked(Item: String) {
        Toast.makeText(this, "Clicked item is $Item", Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recycler view requires a layout manager and adapter
        recyclerView.layoutManager = LinearLayoutManager(this)  //there are many layout managers for different outputs
        val items = fetchData()
        val adapter: NewsListAdapter = NewsListAdapter(items, this)
        recyclerView.adapter = adapter
    }

    private fun fetchData():ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 0 until 100){
            list.add("Item $i")
        }
        return list
    }
}
