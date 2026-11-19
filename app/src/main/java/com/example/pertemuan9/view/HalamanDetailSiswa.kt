package com.example.pertemuan9.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pertemuan9.R
import com.example.pertemuan9.view.route.DestinasiDetailSiswa
import com.example.pertemuan9.viewmodel.DetailViewModel
import com.example.pertemuan9.viewmodel.PenyediaViewModel
import kotlinx.coroutines.launch
import java.lang.reflect.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailSiswaScreen(
    navigateToEditItem: (Int) -> Unit,
    navigateBack: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: DetailViewModel = viewModel(factory = PenyediaViewModel.Factory)
) {
    Scaffold(
        topBar = {
            siswaTopAppBar(
                title = stringResource(DestinasiDetailSiswa.titleRes),
                canNavigateBack = true,
                navigateUp = navigateBack
            )
        },
        floatingActionButton = {
            val uiState = viewModel.uiDetailState.colllectAsState()
            FlotingActionButton(
                onClick = {
                    navigateToEditItem(uiState.value.detailSiswa.id)
                },
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_large))
            ){
                Icon(
                    imageVector = Icon.Default.Edit,
                    contentDescription = stringResource(R.string.update)
                )
            }
        }, modifier = Modifier
    ) { innerPadding ->
        val uiState = viewModel.uiDetailState.collectAsState()
        val coroutineScope = rememberCoroutineScope()
        BodyDetailDataSiswa(
            detailSiswaUiState = uiState.value,
            onDelete = { coroutineScope.launch {
                viewModel.deleteSiswa()
            }}
        )
    }
}

@Composable
private fun BodyDetailDataSiswa(
    detailSiswaState: DetailSiswaUiState,
    onDelete: () -> Unit,
    modifier: Modifier = Modifier
){
    column()
}