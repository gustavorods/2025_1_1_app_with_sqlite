package com.example.appaula.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "clientes") // plural || @Entity define que isso vai ser uma entidade
data class cliente ( // singular || "data" é pra definir que é uma classe de dados
    @PrimaryKey (autoGenerate = true) // pra criar os numeros automaticos
    val id: Int = 0, // define o numero de onde começa o escopo

    val nome: String,
    val endereco: String,
    val bairro: String,
    val cep: Int,
    val cidade:String,
)
