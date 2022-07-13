package com.abidiahmed.fizzbuzz.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abidiahmed.fizzbuzz.R


class Adapter(data: ArrayList<String>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    var data: ArrayList<String> = ArrayList()

    init {
        this.data = data
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, null))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = data[position]
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView

        init {
            name = itemView.findViewById(R.id.item_name)
        }
    }


}