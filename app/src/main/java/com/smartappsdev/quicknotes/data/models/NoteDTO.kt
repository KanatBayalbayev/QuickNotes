package com.smartappsdev.quicknotes.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteDTO(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String

)
