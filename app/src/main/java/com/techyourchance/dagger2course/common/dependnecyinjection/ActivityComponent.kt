package com.techyourchance.dagger2course.common.dependnecyinjection

import android.view.LayoutInflater
import androidx.fragment.app.FragmentManager
import com.techyourchance.dagger2course.networking.StackoverflowApi
import com.techyourchance.dagger2course.screens.common.ScreensNavigator
import dagger.Component

@Component(modules = [ActivityModule::class])
interface ActivityComponent {

    fun stackoverflowApi(): StackoverflowApi

    fun screensNavigator(): ScreensNavigator

    fun layoutInflater(): LayoutInflater

    fun fragmentManager(): FragmentManager
}