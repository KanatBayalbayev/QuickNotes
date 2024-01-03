package com.smartappsdev.quicknotes.domain.usecases

import androidx.lifecycle.LiveData
import com.smartappsdev.quicknotes.domain.repository.NotesRepository
import javax.inject.Inject

class GetNotesListUseCase @Inject constructor(
    private val notesRepository: NotesRepository
) {

    fun editNote(): LiveData<List<Note>> {
      return  notesRepository.getNotesList()
    }
}