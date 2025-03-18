/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.taskmanager.ui

import androidx.lifecycle.ViewModel
import com.example.taskmanager.data.LocalTasksDataProvider
import com.example.taskmanager.model.Task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

/**
 * View Model for Task Manager app
 */
class TaskViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        TasksUiState(
            tasksList = LocalTasksDataProvider.getTasksData(),
            currentTask = LocalTasksDataProvider.getTasksData().getOrElse(0) {
                LocalTasksDataProvider.defaultTask
            }
        )
    )
    val uiState: StateFlow<TasksUiState> = _uiState

    fun updateCurrentTask(selectedTask: Task) {
        _uiState.update {
            it.copy(currentTask = selectedTask)
        }
    }

    fun navigateToListPage() {
        _uiState.update {
            it.copy(isShowingListPage = true)
        }
    }


    fun navigateToDetailPage() {
        _uiState.update {
            it.copy(isShowingListPage = false)
        }
    }
}

data class TasksUiState(
    val tasksList: List<Task> = emptyList(),
    val currentTask: Task = LocalTasksDataProvider.defaultTask,
    val isShowingListPage: Boolean = true
)
