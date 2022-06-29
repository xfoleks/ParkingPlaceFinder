package edu.xfolex.parkingplacefinder.domain.mapper

import edu.xfolex.parkingplacefinder.data.entity.ParkingSpotEntity
import edu.xfolex.parkingplacefinder.domain.model.ParkingSpot

fun ParkingSpotEntity.toParkingSpot(): ParkingSpot = ParkingSpot(
    id = id,
    latitude = latitude,
    longitude = longitude
)

fun ParkingSpot.toParkingSpotEntity(): ParkingSpotEntity = ParkingSpotEntity(
    id = id,
    latitude = latitude,
    longitude = longitude
)