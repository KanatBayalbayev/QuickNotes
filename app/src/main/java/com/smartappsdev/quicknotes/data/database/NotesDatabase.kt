package com.smartappsdev.quicknotes.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.smartappsdev.quicknotes.data.models.NoteDTO

@Database(entities = [NoteDTO::class], version = 1, exportSchema = false)
abstract class NotesDatabase: RoomDatabase() {

    abstract fun notesDAO(): NotesDAO

    companion object{

        private var INSTANCE: NotesDatabase? = null
        private val LOCK = Any()
        private const val DB_NAME = "notes.db"

        fun getInstance(context: Context): NotesDatabase {
            synchronized(LOCK) {
                INSTANCE?.let { return it }
                val instance =
                    Room.databaseBuilder(
                        context,
                        NotesDatabase::class.java,
                        DB_NAME
                    ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}