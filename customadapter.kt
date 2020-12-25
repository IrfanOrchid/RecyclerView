package com.example.kotlin1

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class customadapter (val userlist:ArrayList<user>) : RecyclerView.Adapter<customadapter.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val textviewname= itemView.findViewById(R.id.tv1) as TextView
        val textviewadd= itemView.findViewById(R.id.tv2) as TextView

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v= LayoutInflater.from(parent?.context).inflate(R.layout.list_data,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val u1:user=userlist[position]
        holder?.textviewname?.text=u1.name
        holder?.textviewadd?.text=u1.address


    }
}