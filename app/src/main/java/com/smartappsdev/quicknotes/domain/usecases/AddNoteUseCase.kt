package com.smartappsdev.quicknotes.domain.usecases

import com.smartappsdev.quicknotes.domain.repository.NotesRepository
import javax.inject.Inject

class AddNoteUseCase @Inject constructor(
    private val notesRepository: NotesRepository
) {

   suspend fun addNote(note: Note) {
        notesRepository.addNote(note)
    }
}