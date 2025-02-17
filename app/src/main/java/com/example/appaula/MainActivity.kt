package com.example.appaula

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appaula.ui.theme.AppAulaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppAulaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppAula()
                }
            }
        }
    }
}

@Composable
fun AppAula() {
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            Text("App Aula")
        }

        // Nome
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            var value_name_field by remember { mutableStateOf("") }

            TextField(
                value = value_name_field,
                onValueChange = { value_name_field = it },
                label = { Text("Nome") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // AQUI!

        // Endereço
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            var value_endereco_field by remember { mutableStateOf("") }

            TextField(
                value = value_endereco_field,
                onValueChange = { value_endereco_field = it },
                label = { Text("Endereço") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // AQUI!

        // Bairro
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            var value_bairro_field by remember { mutableStateOf("") }

            TextField(
                value = value_bairro_field,
                onValueChange = { value_bairro_field = it },
                label = { Text("Bairro") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // AQUI!

        // CEP
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            var value_cep_field by remember { mutableStateOf("") }

            TextField(
                value = value_cep_field,
                onValueChange = { value_cep_field = it },
                label = { Text("CEP") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // AQUI!

        // Cidade
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            var value_cidade_field by remember { mutableStateOf("") }

            TextField(
                value = value_cidade_field,
                onValueChange = { value_cidade_field = it },
                label = { Text("Cidade") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // AQUI!

        // Estado
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            var value_estado_field by remember { mutableStateOf("") }

            TextField(
                value = value_estado_field,
                onValueChange = { value_estado_field = it },
                label = { Text("Estado") }
            )
        }

        Spacer(modifier = Modifier.height(16.dp)) // AQUI!

        // Row dos botões de ação
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            // Cadastrar
            Column(
                Modifier
                    .fillMaxWidth(0.4f),
            ) {
                Button(onClick = {}) {
                    Text("Cadastrar")
                }
            }

            // Cancelar
            Column(

            ) {
                Button(onClick = {}) {
                    Text("Cancelar")
                }
            }
        }
    }
}

@Preview
@Composable
fun appAulaPreview() {
    AppAulaTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            AppAula()
        }
    }
}
