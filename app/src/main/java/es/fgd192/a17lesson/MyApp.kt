package es.fgd192.a17lesson

import android.app.Application
import androidx.room.Room
import es.fgd192.a17lesson.room.data.AppDataBase

class MyApp : Application() {

    private var db: AppDataBase? = null

    override fun onCreate() {
        super.onCreate()
        app = this
        db = Room.databaseBuilder(applicationContext, AppDataBase::class.java, "MY_DATABASE")
            .allowMainThreadQueries()
            .build()
    }
    fun getDB() :AppDataBase? =  db
    companion object {
        var app: MyApp? = null
    }
}