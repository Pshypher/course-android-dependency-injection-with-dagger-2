package com.techyourchance.dagger2course.common.dependnecyinjection.presentation

import androidx.savedstate.SavedStateRegistryOwner
import com.techyourchance.dagger2course.screens.questiondetails.QuestionDetailsActivity
import com.techyourchance.dagger2course.screens.questionslist.QuestionsListActivity
import com.techyourchance.dagger2course.screens.questionslist.QuestionsListFragment
import com.techyourchance.dagger2course.screens.viewmodel.ViewModelActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Subcomponent

@PresentationScope
@Subcomponent(modules = [ViewModelModule::class])
interface PresentationComponent {

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun savedStateRegistryOwner(savedStateRegistryOwner: SavedStateRegistryOwner): Builder
        fun build(): PresentationComponent
    }

    fun inject(fragment: QuestionsListFragment)
    fun inject(activity: QuestionDetailsActivity)
    fun inject(questionsListActivity: QuestionsListActivity)
    fun inject(viewModelActivity: ViewModelActivity)
}