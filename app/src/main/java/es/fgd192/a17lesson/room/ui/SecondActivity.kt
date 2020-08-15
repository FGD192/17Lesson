package es.fgd192.a17lesson.room.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.fgd192.a17lesson.MyApp
import es.fgd192.a17lesson.R
import es.fgd192.a17lesson.room.data.AppDataBase
import es.fgd192.a17lesson.room.data.DataClass
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {

    private var db: AppDataBase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        setupListeners()
        db = MyApp.app?.getDB()

    }

    private fun setupListeners() {
        button.setOnClickListener {
            db?.getDao()?.addUser(fetchData())
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun fetchData():DataClass{
        return DataClass(
            ETone = ETone.text.toString(),
            ETtwo = ETtwo.text.toString()
        )
    }
}