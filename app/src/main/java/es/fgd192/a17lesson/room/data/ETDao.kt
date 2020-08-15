package es.fgd192.a17lesson.room.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ETDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(data: DataClass)

    @Query("SELECT * FROM DataClass")
    fun getData(): List<DataClass>
}

