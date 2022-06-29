package edu.xfolex.parkingplacefinder.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.xfolex.parkingplacefinder.data.database.ParkingSpotDatabase
import edu.xfolex.parkingplacefinder.data.repository.ParkingSpotRepositoryImpl
import edu.xfolex.parkingplacefinder.domain.reposotory.ParkingSpotRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application): ParkingSpotDatabase =
        Room.databaseBuilder(
            app,
            ParkingSpotDatabase::class.java,
            "parkingspots.db"
        ).build()

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db: ParkingSpotDatabase): ParkingSpotRepository =
        ParkingSpotRepositoryImpl(db.dao)
}