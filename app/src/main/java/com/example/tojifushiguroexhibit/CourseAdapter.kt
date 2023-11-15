package com.example.tojifushiguroexhibit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(
    private val courseItems: List<CourseItem>,
    private val itemClickListener: (CourseItem) -> Unit
) : RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.courseImage)
        val textView: TextView = view.findViewById(R.id.courseTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val currentItem = courseItems[position]
        holder.imageView.setImageResource(currentItem.imageResId)
        holder.textView.text = currentItem.title

        // Set click listener for the item view
        holder.itemView.setOnClickListener {
            itemClickListener(currentItem)
        }
    }

    override fun getItemCount() = courseItems.size
}
