package com.example.pertemuan9.repository

import com.example.pertemuan9.room.Siswa
import com.example.pertemuan9.room.SiswaDAO
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {

    fun getAllSiswaStream(): Flow<List<Siswa>>

    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositoriSiswa(
    private val siswaDao: SiswaDAO
) : RepositoriSiswa {

    override fun getAllSiswaStream(): Flow<List<Siswa>> =
        siswaDao.getAllSiswa()

    override suspend fun insertSiswa(siswa: Siswa) =
        siswaDao.insert(siswa)
}