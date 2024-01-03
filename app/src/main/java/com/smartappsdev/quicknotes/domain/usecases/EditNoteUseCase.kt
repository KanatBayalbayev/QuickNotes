package com.smartappsdev.quicknotes.domain.usecases

import com.smartappsdev.quicknotes.domain.repository.NotesRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor(
    private val notesRepository: NotesRepository
) {

    suspend fun editNote(note: Note) {
        notesRepository.editNote(note)
    }
}