package com.example.pertemuan9.room

import kotlinx.coroutines.flow.Flow

@Dao
interface SiswaDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}