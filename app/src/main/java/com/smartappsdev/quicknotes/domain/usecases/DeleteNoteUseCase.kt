package com.smartappsdev.quicknotes.domain.usecases

import com.smartappsdev.quicknotes.domain.repository.NotesRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val notesRepository: NotesRepository
) {

    suspend fun deleteNote(note: Note) {
        notesRepository.deleteNote(note)
    }
}