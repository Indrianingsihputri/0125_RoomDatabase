package com.example.pertemuan9.room

@Dao
interface SiswaDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)
}