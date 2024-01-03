package com.smartappsdev.quicknotes.presentation

import android.app.Application
import com.smartappsdev.quicknotes.di.DaggerApplicationComponent

class MainApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}