package com.example.todoit

interface TaskItemClickListener
{

    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem: TaskItem)
}