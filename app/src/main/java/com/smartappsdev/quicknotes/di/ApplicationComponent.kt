package com.smartappsdev.quicknotes.di

import android.app.Application
import com.smartappsdev.quicknotes.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component


@ApplicationScope
@Component(modules = [DataModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)


    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}