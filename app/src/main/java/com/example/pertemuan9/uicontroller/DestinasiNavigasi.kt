package com.example.pertemuan9.uicontroller

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