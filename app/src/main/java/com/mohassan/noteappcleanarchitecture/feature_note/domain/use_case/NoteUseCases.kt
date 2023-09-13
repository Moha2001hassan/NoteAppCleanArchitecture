package com.mohassan.noteappcleanarchitecture.feature_note.domain.use_case

data class NoteUseCases(  // wrapper class for single operation
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
