package com.d121201023.taskmanager.repository

import androidx.lifecycle.LiveData
import com.d121201023.taskmanager.data.TaskDao
import com.d121201023.taskmanager.model.Task

class TaskRepository(private val taskDao: TaskDao) {
    val readAllData:LiveData<List<Task>> = taskDao.readAllData()
    val readAllDataHistory:LiveData<List<Task>> = taskDao.readAllDataHistory()

    suspend fun addTask(task: Task){
        taskDao.addTask(task)
    }
    suspend fun updateTask(task: Task){
        taskDao.updateTask(task)
    }
}