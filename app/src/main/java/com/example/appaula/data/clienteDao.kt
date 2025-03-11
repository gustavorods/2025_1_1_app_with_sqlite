package com.example.appaula.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface clienteDao {
    @Insert // pode usar @Upsert tbm
    suspend fun insert(cliente: cliente) // função suspensa não vai rodar automaticamente quando a classe for chamada, só vai rodar quando a função em si for chamada

    @Update
    suspend fun update(cliente: cliente)

    @Delete
    suspend fun delete(cliente: cliente)

    @Query("SELECT * from clientes")
    fun listar(): Flow<List<cliente>> // As funções de query nao precisam ser "suspend fun" por conta que não alteram algo no banco de dados
}