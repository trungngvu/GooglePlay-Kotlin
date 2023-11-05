package com.example.googleplay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AppAdapter (val context : Context, private val apps : List<App>) :
    RecyclerView.Adapter<AppAdapter.CustomViewHolder>() {
    private val inflater : LayoutInflater = LayoutInflater.from(context)
    public class CustomViewHolder (itemView : View): RecyclerView.ViewHolder(itemView){
        val appNameView : TextView = itemView.findViewById(R.id.appname)
        val rankView : TextView = itemView.findViewById(R.id.rank)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = inflater.inflate(R.layout.item_app, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return apps.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val app = apps[position]
        holder.appNameView.text = app.name
        holder.rankView.text = app.rank

    }
}