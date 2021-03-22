package com.britishbroadcast.frinder.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.britishbroadcast.frinder.model.PlaceTypeConvertor
import com.britishbroadcast.frinder.model.data.HangoutPlace

@Database(entities = [HangoutPlace::class], version = 1, exportSchema = false)
@TypeConverters(PlaceTypeConvertor::class)
abstract class DBRoom: RoomDatabase() {
    abstract fun hangoutPlaceDao(): HangoutPlaceDao
}