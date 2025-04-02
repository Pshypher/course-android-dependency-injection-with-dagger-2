package com.techyourchance.dagger2course.screens.common.fragments

import androidx.fragment.app.Fragment
import com.techyourchance.dagger2course.screens.common.activities.BaseActivity

open class BaseFragment: Fragment() {

    private val presentationComponent by lazy {
        (requireActivity() as BaseActivity).activityComponent
            .presentationComponentBuilder()
            .savedStateRegistryOwner(this)
            .build()
    }

    protected val injector get() = presentationComponent
}