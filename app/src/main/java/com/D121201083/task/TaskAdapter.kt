package com.D121201083.task

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.D121201083.task.databinding.TaskItemBinding

class TaskAdapter(
    private val taskItems: List<TaskItem>,
    private val clickListener: TaskClickListener
): RecyclerView.Adapter<TaskView>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskView {
        val from = LayoutInflater.from(parent.context)
        val binding = TaskItemBinding.inflate(from, parent, false)
        return TaskView(parent.context, binding, clickListener)
    }

    override fun onBindViewHolder(holder: TaskView, position: Int) {
        holder.bindTaskItem(taskItems[position])
    }

    override fun getItemCount(): Int = taskItems.size
}