package edu.xfolex.parkingplacefinder.presentation

import com.google.maps.android.compose.MapProperties
import edu.xfolex.parkingplacefinder.domain.model.ParkingSpot

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = true
)