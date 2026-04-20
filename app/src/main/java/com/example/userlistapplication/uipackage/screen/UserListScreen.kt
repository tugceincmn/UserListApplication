package com.example.userlistapplication.uipackage.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.userlistapplication.uipackage.components.UserItem
import com.example.userlistapplication.uipackage.viewmodel.UserUiState
import com.example.userlistapplication.uipackage.viewmodel.UserViewModel

@Composable
fun UserListScreen(viewModel: UserViewModel = viewModel()) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Box(modifier = Modifier.fillMaxSize()) {
        when (val state = uiState) {
            is UserUiState.Loading -> CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
            is UserUiState.Success -> {
                LazyColumn {
                    items(state.users) { user -> UserItem(user) }
                }
            }
            is UserUiState.Error -> {
                Column(modifier = Modifier.align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(state.message)
                    Button(onClick = { viewModel.fetchUsers() }) { Text("Tekrar Dene") }
                }
            }
        }
    }
}