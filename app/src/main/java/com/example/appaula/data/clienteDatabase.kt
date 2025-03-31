package com.example.appaula.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [cliente::class],
    version = 1,
    exportSchema = false
)
abstract class clienteDatabase : RoomDatabase() {
    abstract fun clienteDao(): clienteDao

    companion object {
        @Volatile
        private var Instance: clienteDatabase? = null

        fun getDatabase(context: Context): clienteDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, clienteDatabase::class.java, "item_database")
                    .build()
                    .also { Instance = it }
            }
        }
    }
}