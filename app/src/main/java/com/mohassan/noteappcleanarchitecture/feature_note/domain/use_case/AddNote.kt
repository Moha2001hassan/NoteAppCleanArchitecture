package com.mohassan.noteappcleanarchitecture.feature_note.domain.use_case

import com.mohassan.noteappcleanarchitecture.feature_note.domain.model.InvalidNoteException
import com.mohassan.noteappcleanarchitecture.feature_note.domain.model.Note
import com.mohassan.noteappcleanarchitecture.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()){
            throw InvalidNoteException("the title of the note can't be empty.")
        }
        if (note.content.isBlank()){
            throw InvalidNoteException("the content of the note can't be empty.")
        }
        repository.insertNote(note)
    }
}