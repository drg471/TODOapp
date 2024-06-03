package com.drg.todoapp.tasks

import com.drg.todoapp.categories.TaskCategory

data class Task (val name: String, val category: TaskCategory, var isSelected: Boolean = false){
}