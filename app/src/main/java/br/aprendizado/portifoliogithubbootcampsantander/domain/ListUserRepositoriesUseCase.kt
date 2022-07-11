package br.aprendizado.portifoliogithubbootcampsantander.domain


import br.aprendizado.portifoliogithubbootcampsantander.core.UseCase
import br.aprendizado.portifoliogithubbootcampsantander.data.model.Repo
import br.aprendizado.portifoliogithubbootcampsantander.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}