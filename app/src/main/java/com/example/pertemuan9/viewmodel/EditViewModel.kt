package com.example.pertemuan9.viewmodel

import com.example.pertemuan9.view.route.DestinasiDetailSiswa

class EditViewModel {
    savedStateHandle : savedStateHandle,
    private val repositoriSiswa: repositoriSiswa: ViewModel(){
        var uiStateSiswa by mutableStatiOF(UIStateSiswa())
        private set

        private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetailSiswa.itemIdAgrs])
            init{
                viewModelScope.launch{
                    uiStateSiswa = repositoriSiswa.getSiswaStream(idSiswa)
                        .filterNotNull()
                        .first()
                        .toUiStateSiswa(true)
                }
            }
    }
}