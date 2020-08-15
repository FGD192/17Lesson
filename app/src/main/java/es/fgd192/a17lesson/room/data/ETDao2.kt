package es.fgd192.a17lesson.room.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ETDao2 {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser2(data: DataClass2)

    @Query("SELECT * FROM DataClass2")
    fun getData2(): List<DataClass2>
}