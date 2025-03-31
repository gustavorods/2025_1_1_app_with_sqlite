import com.example.appaula.data.cliente
import kotlinx.coroutines.flow.Flow

interface userRepository {

    fun getAllUserStream(): Flow<List<cliente>>

    fun getUserStream(id: Int): Flow<cliente?>

    suspend fun insertUser(item: cliente)

    suspend fun deleteUser(item: cliente)

    suspend fun updateUser(item: cliente)
}
