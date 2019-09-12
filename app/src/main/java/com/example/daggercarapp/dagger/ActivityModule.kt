package com.example.daggercarapp.dagger

import com.example.daggercarapp.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule {

    @Provides
    @Singleton
    fun provideCar(wheels:Wheels, engine: Engine): Car{

        return Car(wheels, engine)
    }

    @Provides
    @Singleton
    fun provideEngine(piston: Piston): Engine{
        return Engine(piston )
    }

    @Provides
    @Singleton
    fun providePiston(capacity: Capacity) = Piston(capacity)

    @Provides
    @Singleton
    fun provideCapacity() = Capacity()

    @Provides
    @Singleton
    fun provideWheels() = Wheels()

}

