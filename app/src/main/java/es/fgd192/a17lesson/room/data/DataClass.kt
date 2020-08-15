package es.fgd192.a17lesson.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.PasswordAuthentication

@Entity
data class DataClass(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var ETone: String,
    var ETtwo: String
)