package edu.xfolex.parkingplacefinder.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.xfolex.parkingplacefinder.data.dao.ParkingSpotDao
import edu.xfolex.parkingplacefinder.data.entity.ParkingSpotEntity

@Database(
    entities = [ParkingSpotEntity::class],
    version = 1,
    exportSchema = false
)
abstract class ParkingSpotDatabase: RoomDatabase() {

    abstract val dao: ParkingSpotDao

}