package br.aprendizado.portifoliogithubbootcampsantander

import android.app.Application
import br.aprendizado.portifoliogithubbootcampsantander.data.di.DataModule
import br.aprendizado.portifoliogithubbootcampsantander.domain.di.DomainModule
import br.aprendizado.portifoliogithubbootcampsantander.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}