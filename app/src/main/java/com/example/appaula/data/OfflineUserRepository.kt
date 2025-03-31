package com.example.appaula.data
import kotlinx.coroutines.flow.Flow
import userRepository

class OfflineUserRepository(private val ClienteDao: clienteDao) : userRepository {
    override fun getAllUserStream(): Flow<List<cliente>> = ClienteDao.getAllIUser()

    override fun getUserStream(id: Int): Flow<cliente?> = ClienteDao.getUser(id)

    override suspend fun insertUser(item: cliente) = ClienteDao.insert(item)

    override suspend fun deleteUser(item: cliente) = ClienteDao.delete(item)

    override suspend fun updateUser(item: cliente) = ClienteDao.update(item)
}