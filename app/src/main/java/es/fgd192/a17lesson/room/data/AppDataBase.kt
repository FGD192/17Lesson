package es.fgd192.a17lesson.room.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DataClass::class,DataClass2::class], version = 2)
abstract class AppDataBase  : RoomDatabase() {
    abstract fun getDao(): ETDao
    abstract fun injectDao(): ETDao2
}