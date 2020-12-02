package com.udemy.my_first_app

import com.udemy.core.di.CoreComponent
import com.udemy.core.di.DaggerCoreComponent
import com.udemy.my_first_app.di.DaggerAppComponent
import com.udemy.utility.di.DaggerUtilsComponent
import com.udemy.utility.di.UtilsComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApplication : DaggerApplication() {

    private lateinit var coreComponent: CoreComponent

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {

        return DaggerAppComponent
            .builder()
            .application(this)
            .coreComponent(getCoreComponent())
            .utilsComponent(getUtilsComponent())
            .build()

    }

    private fun getUtilsComponent() : UtilsComponent{

        return DaggerUtilsComponent
            .builder()
            .application(this)
            .build()

    }

    private fun getCoreComponent() : CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .build()
        }
        return  coreComponent
    }
}