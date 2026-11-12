package com.example.pertemuan9.uicontroller

import com.example.pertemuan9.R

interface DestinasiNavigasi {
    /**
     * Nama unik untuk menentukan jalur composable
     */
    val route: String

    /**
     * String resource ID yang berisi judul halaman
     */
    val titleRes: Int
}

object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}
