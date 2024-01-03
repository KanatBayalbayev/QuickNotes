package com.smartappsdev.quicknotes.data.mapper

import com.smartappsdev.quicknotes.data.models.NoteDTO
import com.smartappsdev.quicknotes.domain.usecases.Note
import javax.inject.Inject

class NotesMapper @Inject constructor() {

    fun mapEntityToDTO(note: Note) = NoteDTO(
        id = note.id,
        name = note.name
    )

    fun mapDTOToEntity(noteDbModel: NoteDTO) = Note(
        id = noteDbModel.id,
        name = noteDbModel.name
    )

    fun mapListDTOToListEntity(list: List<NoteDTO>) = list.map {
        mapDTOToEntity(it)
    }
}