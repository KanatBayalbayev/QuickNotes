package com.smartappsdev.quicknotes.di

import android.app.Application
import com.smartappsdev.quicknotes.data.database.NotesDAO
import com.smartappsdev.quicknotes.data.database.NotesDatabase
import com.smartappsdev.quicknotes.data.repository.NotesRepositoryImpl
import com.smartappsdev.quicknotes.domain.repository.NotesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {


    @ApplicationScope
    @Binds
    fun bindNotesRepository(impl: NotesRepositoryImpl): NotesRepository

    companion object {

        @ApplicationScope
        @Provides
        fun provideNotesDAO(
            application: Application
        ): NotesDAO {
            return NotesDatabase.getInstance(application).notesDAO()
        }
    }

}