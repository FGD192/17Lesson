package es.fgd192.a17lesson.room.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.fgd192.a17lesson.MyApp
import es.fgd192.a17lesson.R
import es.fgd192.a17lesson.room.data.AppDataBase
import es.fgd192.a17lesson.room.data.DataClass
import es.fgd192.a17lesson.room.data.DataClass2
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.second_activity.*

class FirstActivity : AppCompatActivity() {
    private var db: AppDataBase? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        setupListeners()
        db = MyApp.app?.getDB()

    }

    private fun setupListeners() {
        button.setOnClickListener {
            db?.injectDao()?.addUser2(fetchData())
            startActivity(Intent(this, MainActivity::class.java))
        }
    }

    private fun fetchData(): DataClass2 {
        return DataClass2(
            tilLogin = tilLogin.toString(),
            tilPassword = tilPassword.toString()
        )
    }
}