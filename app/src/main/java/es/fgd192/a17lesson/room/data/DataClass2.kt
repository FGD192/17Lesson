package es.fgd192.a17lesson.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataClass2 (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var tilLogin: String,
    var tilPassword: String
)