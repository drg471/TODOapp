package com.drg.todoapp.categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.drg.todoapp.R

class CategoriesAdapter (private val categories: List<TaskCategory>, private val onItemSelected: (Int) -> Unit):
    RecyclerView.Adapter<CategoriesViewHolder>() {

    //Monta la vista
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_category, parent, false)
        return CategoriesViewHolder(view)
    }

    //Pasa la información que tiene que pintar
    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position], onItemSelected)
    }

    override fun getItemCount(): Int = categories.size
}