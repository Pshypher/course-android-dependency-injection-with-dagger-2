package com.techyourchance.dagger2course.common.dependnecyinjection

import androidx.annotation.UiThread
import com.techyourchance.dagger2course.Constants
import com.techyourchance.dagger2course.networking.StackoverflowApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@UiThread
@Module
class AppModule() {

    @Provides
    fun retrofit(): Retrofit = Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()


    @Provides
    fun stackoverflowApi(retrofit: Retrofit): StackoverflowApi = retrofit
        .create(StackoverflowApi::class.java)
}