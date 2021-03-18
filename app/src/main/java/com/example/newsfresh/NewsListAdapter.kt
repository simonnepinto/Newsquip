package com.example.newsfresh

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter(private val items: ArrayList<String>, private val listener: NewsItemClicked): RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {  //called on creating view holder
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        //will convert the item_news.xml into view
        val viewHolder = NewsViewHolder(view)
        view.setOnClickListener{  //handle on click functionality
            listener.onItemClicked(items[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun getItemCount(): Int {
        return items.size  //size of the items
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {  //fills items with values
        val currentItem = items[position]
        holder.titleView.text = currentItem
    }
}

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView: TextView = itemView.findViewById(R.id.title)
}

interface NewsItemClicked{   //to inform the activity about onClick()
    fun onItemClicked(Item: String)
}