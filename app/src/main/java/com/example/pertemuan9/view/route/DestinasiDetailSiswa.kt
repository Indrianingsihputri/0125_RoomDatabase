package com.example.pertemuan9.view.route

import com.example.pertemuan9.R
import com.example.pertemuan9.uicontroller.DestinasiNavigasi

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_siswa"
    override val titleRes = R.string.edit_siswa
    const val itemIdAgrs = "idSiswa"
    val routeWihtArgs = "$route/($itemIdAgrs)"
}