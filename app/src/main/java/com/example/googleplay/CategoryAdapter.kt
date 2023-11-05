package com.example.googleplay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter( val categories : List<Category>, val context: Context) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    private val layoutInflater: LayoutInflater = LayoutInflater.from(context)
    class ViewHolder( itemView : View) :RecyclerView.ViewHolder(itemView){
        val categoryName : TextView = itemView.findViewById(R.id.category_name)
        val recyclerView : RecyclerView = itemView.findViewById(R.id.app_container)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = layoutInflater.inflate(R.layout.category, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = categories[position]
        holder.categoryName.text = category.name
        holder.recyclerView.adapter =  AppAdapter(context, category.apps)
        holder.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }
}