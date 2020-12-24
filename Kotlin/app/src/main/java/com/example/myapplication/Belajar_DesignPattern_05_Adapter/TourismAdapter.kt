package com.example.myapplication.Belajar_DesignPattern_05_Adapter

import Belajar_DesignPattern_05_Adapter.TourismEntity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class TourismAdapter(private val listData:ArrayList<TourismEntity>) : RecyclerView.Adapter<TourismAdapter.ListViewHolder>() {
    class ListViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        fun bind(listData:TourismEntity){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listData[position])
    }

    override fun getItemCount(): Int = listData.size

}