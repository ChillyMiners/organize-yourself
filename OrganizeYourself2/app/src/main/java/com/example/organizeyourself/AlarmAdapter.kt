package com.example.organizeyourself

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlarmRecyclerAdapter(private val context: Context, private val alarms: List<TestAlarm>) :
    RecyclerView.Adapter<AlarmRecyclerAdapter.ViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.item_note_list, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = alarms.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var alarm = alarms[position]


    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textDays = itemView?.findViewById<TextView?>(R.id.textViewDays)
        val textTime = itemView?.findViewById<TextView?>(R.id.textViewTime)
    }
}