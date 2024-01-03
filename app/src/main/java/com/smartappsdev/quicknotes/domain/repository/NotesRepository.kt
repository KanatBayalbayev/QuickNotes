package com.smartappsdev.quicknotes.domain.repository

import androidx.lifecycle.LiveData
import com.smartappsdev.quicknotes.domain.usecases.Note

interface NotesRepository {

    suspend fun addNote(note: Note)

    suspend fun deleteNote(note: Note)

    suspend fun editNote(note: Note)

    suspend fun getNote(noteId: Int): Note

    fun getNotesList(): LiveData<List<Note>>
}