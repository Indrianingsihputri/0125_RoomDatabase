package com.example.pertemuan9

import android.app.Application
import com.example.pertemuan9.repository.ContainerApp
import com.example.pertemuan9.repository.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()

        container = ContainerDataApp(this)
    }
}