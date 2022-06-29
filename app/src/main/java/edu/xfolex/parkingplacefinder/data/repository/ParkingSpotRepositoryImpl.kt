package edu.xfolex.parkingplacefinder.data.repository

import edu.xfolex.parkingplacefinder.data.dao.ParkingSpotDao
import edu.xfolex.parkingplacefinder.domain.mapper.toParkingSpot
import edu.xfolex.parkingplacefinder.domain.mapper.toParkingSpotEntity
import edu.xfolex.parkingplacefinder.domain.model.ParkingSpot
import edu.xfolex.parkingplacefinder.domain.reposotory.ParkingSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepositoryImpl(
    private val dao: ParkingSpotDao
): ParkingSpotRepository {
    override suspend fun insertParkingSpot(spot: ParkingSpot) {
        dao.insertParkingSpot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParkingSpot(spot: ParkingSpot) {
        dao.deleteParkingSpot(spot.toParkingSpotEntity())
    }

    override fun getParkingSpots(): Flow<List<ParkingSpot>> = dao.getParkingSpots().map { spots ->
        spots.map {
            it.toParkingSpot()
        }
    }
}