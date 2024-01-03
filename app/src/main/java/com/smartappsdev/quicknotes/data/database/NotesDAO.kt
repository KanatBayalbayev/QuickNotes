package com.smartappsdev.quicknotes.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.smartappsdev.quicknotes.data.models.NoteDTO

@Dao
interface NotesDAO {

    @Query("SELECT * FROM notes")
    fun getNotesList(): LiveData<List<NoteDTO>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(noteDTO: NoteDTO)

    @Query("DELETE FROM notes WHERE id=:noteId")
    suspend fun deleteNote(noteId: Int)

    @Query("SELECT * FROM notes WHERE id=:noteId LIMIT 1")
    suspend fun getNote(noteId: Int): NoteDTO
}