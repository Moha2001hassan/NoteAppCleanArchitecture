package com.mohassan.noteappcleanarchitecture.feature_note.data.repository

import com.mohassan.noteappcleanarchitecture.feature_note.data.data_source.NoteDao
import com.mohassan.noteappcleanarchitecture.feature_note.domain.model.Note
import com.mohassan.noteappcleanarchitecture.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNotesById(id: Int): Note? {
        return dao.getNotesById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
        return dao.deleteNote(note)
    }
}