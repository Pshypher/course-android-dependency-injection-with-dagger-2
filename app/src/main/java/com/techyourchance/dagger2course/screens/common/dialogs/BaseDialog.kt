package com.techyourchance.dagger2course.screens.common.dialogs

import androidx.fragment.app.DialogFragment
import com.techyourchance.dagger2course.screens.common.activities.BaseActivity

open class BaseDialog: DialogFragment() {

    private val presentationComponent by lazy {
        (requireActivity() as BaseActivity).activityComponent
            .presentationComponentBuilder()
            .savedStateRegistryOwner(this)
            .build()
    }

    protected val injector get() = presentationComponent
}