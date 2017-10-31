package com.toandoan.todo.data.source.local

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.toandoan.todo.data.model.Task
import io.reactivex.Flowable

@Dao
interface TaskDAO {
  @Query("SELECT * FROM tasks")
  fun getTasks(): Flowable<MutableList<Task>>

  @Insert
  fun addTask(task: Task): Long

  @Query("DELETE FROM tasks")
  fun deleteAllTask(): Int
}