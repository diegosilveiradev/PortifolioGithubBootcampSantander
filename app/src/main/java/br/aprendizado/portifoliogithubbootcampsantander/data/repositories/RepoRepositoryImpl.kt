package br.aprendizado.portifoliogithubbootcampsantander.data.repositories


import br.aprendizado.portifoliogithubbootcampsantander.core.RemoteException
import br.aprendizado.portifoliogithubbootcampsantander.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possivel fazer a busca no momento!")
        }
    }
}