package br.aprendizado.portifoliogithubbootcampsantander.data.repositories


import br.aprendizado.portifoliogithubbootcampsantander.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}