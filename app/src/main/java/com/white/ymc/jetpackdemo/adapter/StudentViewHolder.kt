package com.white.ymc.jetpackdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.white.ymc.jetpackdemo.R
import com.white.ymc.jetpackdemo.db.Student

/**
 * view holder
 */

class StudentViewHolder(parent: ViewGroup) : androidx.recyclerview.widget.RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)) {

    private val nameView = itemView.findViewById<TextView>(R.id.name)
    var student: Student? = null

    /**
     * Items might be null if they are not paged in yet. PagedListAdapter will re-bind the
     * ViewHolder when Item is loaded.
     */
    fun bindTo(student: Student?) {
        this.student = student
        nameView.text = student?.name
    }
}