package asdasd.com.quant.repository

import asdasd.com.quant.api.RetrofitInstance
import asdasd.com.quant.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost(): Response<Post> {
        return RetrofitInstance.api.getPost()
    }

    suspend fun getPost2(number: Int): Response<Post> {
        return RetrofitInstance.api.getPost2(number)
    }
}