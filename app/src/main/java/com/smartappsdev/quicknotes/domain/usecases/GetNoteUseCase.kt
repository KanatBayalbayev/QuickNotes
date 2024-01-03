package com.smartappsdev.quicknotes.domain.usecases

import com.smartappsdev.quicknotes.domain.repository.NotesRepository
import javax.inject.Inject

class GetNoteUseCase @Inject constructor(
    private val notesRepository: NotesRepository
) {

    suspend fun getNote(noteId: Int): Note {
        return notesRepository.getNote(noteId)
    }
}