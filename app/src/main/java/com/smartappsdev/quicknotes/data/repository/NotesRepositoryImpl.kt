package com.smartappsdev.quicknotes.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.smartappsdev.quicknotes.data.database.NotesDAO
import com.smartappsdev.quicknotes.data.mapper.NotesMapper
import com.smartappsdev.quicknotes.domain.repository.NotesRepository
import com.smartappsdev.quicknotes.domain.usecases.Note
import javax.inject.Inject

class NotesRepositoryImpl @Inject constructor(
    private val notesDao: NotesDAO,
    private val mapper: NotesMapper
) : NotesRepository {

    override suspend fun addNote(note: Note) {
        notesDao.addNote(mapper.mapEntityToDTO(note))
    }

    override suspend fun deleteNote(note: Note) {
        notesDao.deleteNote(note.id)
    }

    override suspend fun editNote(note: Note) {
        notesDao.addNote(mapper.mapEntityToDTO(note))
    }

    override suspend fun getNote(noteId: Int): Note {
        val dbModel = notesDao.getNote(noteId)
        return mapper.mapDTOToEntity(dbModel)
    }

    override fun getNotesList(): LiveData<List<Note>> = Transformations.map(
        notesDao.getNotesList()
    ) {
        mapper.mapListDTOToListEntity(it)
    }
}