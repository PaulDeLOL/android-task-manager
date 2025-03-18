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

package com.example.taskmanager.data

import com.example.taskmanager.R
import com.example.taskmanager.model.Task

/**
 * Task Manager data
 */
object LocalTasksDataProvider {
    val defaultTask = getTasksData()[0]

    fun getTasksData(): List<Task> {
        return listOf(
            Task(
                id = 1,
                titleResourceId = R.string.groceries,
                subtitleResourceId = R.string.groceries_subtitle,
                dueDate = "02-09-2025",
                completed = false,
                imageResourceId = R.drawable.groceries,
                tasksImageBanner = R.drawable.groceries_banner,
                taskDetails = R.string.groceries_details
            ),
            Task(
                id = 2,
                titleResourceId = R.string.workout,
                subtitleResourceId = R.string.workout_subtitle,
                dueDate = "02-04-2025",
                completed = true,
                imageResourceId = R.drawable.workout,
                tasksImageBanner = R.drawable.workout_banner,
                taskDetails = R.string.workout_details
            ),
            Task(
                id = 3,
                titleResourceId = R.string.blogpost,
                subtitleResourceId = R.string.blogpost_subtitle,
                dueDate = "02-04-2025",
                completed = false,
                imageResourceId = R.drawable.blogpost,
                tasksImageBanner = R.drawable.blogpost_banner,
                taskDetails = R.string.blogpost_details
            ),
            Task(
                id = 4,
                titleResourceId = R.string.assignment,
                subtitleResourceId = R.string.assignment_subtitle,
                dueDate = "02-09-2025",
                completed = false,
                imageResourceId = R.drawable.assignment,
                tasksImageBanner = R.drawable.assignment_banner,
                taskDetails = R.string.assignment_details
            ),
            Task(
                id = 5,
                titleResourceId = R.string.book,
                subtitleResourceId = R.string.book_subtitle,
                dueDate = "02-04-2025",
                completed = true,
                imageResourceId = R.drawable.book,
                tasksImageBanner = R.drawable.book_banner,
                taskDetails = R.string.book_details
            ),
            Task(
                id = 6,
                titleResourceId = R.string.trip,
                subtitleResourceId = R.string.trip_subtitle,
                dueDate = "02-07-2025",
                completed = false,
                imageResourceId = R.drawable.trip,
                tasksImageBanner = R.drawable.trip_banner,
                taskDetails = R.string.trip_details
            ),
            Task(
                id = 7,
                titleResourceId = R.string.organize,
                subtitleResourceId = R.string.organize_subtitle,
                dueDate = "02-05-2025",
                completed = true,
                imageResourceId = R.drawable.organize,
                tasksImageBanner = R.drawable.organize_banner,
                taskDetails = R.string.organize_details
            ),
            Task(
                id = 8,
                titleResourceId = R.string.course,
                subtitleResourceId = R.string.course_subtitle,
                dueDate = "02-04-2025",
                completed = true,
                imageResourceId = R.drawable.course,
                tasksImageBanner = R.drawable.course_banner,
                taskDetails = R.string.course_details
            ),
            Task(
                id = 9,
                titleResourceId = R.string.language,
                subtitleResourceId = R.string.language_subtitle,
                dueDate = "02-06-2025",
                completed = true,
                imageResourceId = R.drawable.language,
                tasksImageBanner = R.drawable.language_banner,
                taskDetails = R.string.language_details
            ),
            Task(
                id = 10,
                titleResourceId = R.string.help,
                subtitleResourceId = R.string.help_subtitle,
                dueDate = "02-06-2025",
                completed = false,
                imageResourceId = R.drawable.help,
                tasksImageBanner = R.drawable.help_banner,
                taskDetails = R.string.help_details
            ),
            Task(
                id = 11,
                titleResourceId = R.string.call,
                subtitleResourceId = R.string.call_subtitle,
                dueDate = "02-04-2025",
                completed = false,
                imageResourceId = R.drawable.call,
                tasksImageBanner = R.drawable.call_banner,
                taskDetails = R.string.call_details
            )
        )
    }
}
