package com.britishbroadcast.frinder.model

import androidx.room.TypeConverter
import com.britishbroadcast.frinder.model.data.Geometry
import com.britishbroadcast.frinder.model.data.OpeningHours
import com.britishbroadcast.frinder.model.data.Photo
import com.britishbroadcast.frinder.model.data.PlusCode
import com.google.gson.Gson
import java.util.*

class PlaceTypeConvertor {
    //  For Geometry
    @TypeConverter
    fun stringToGeometry(geometryString: String): Geometry {
        return Gson().fromJson(geometryString, Geometry::class.java)
    }

    @TypeConverter
    fun geometryToString(geometry: Geometry): String {
        return Gson().toJson(geometry)
    }
    //End of Geometry


    //For OpeningHours
    @TypeConverter
    fun stringToOpeningHours(openingHours: String): OpeningHours {
        return Gson().fromJson(openingHours, OpeningHours::class.java)
    }

    @TypeConverter
    fun openingHoursToString(openingHours: OpeningHours): String {
        return Gson().toJson(openingHours)
    }
    //End of OpeningHours

    //For PlusCode
    @TypeConverter
    fun stringToPlusCode(plusCode: String): PlusCode {
        return Gson().fromJson(plusCode, PlusCode::class.java)
    }

    @TypeConverter
    fun plusCodeToString(plusCode: PlusCode): String {
        return Gson().toJson(plusCode)
    }
    //End of PlusCode

    //For List<Photo>
    @TypeConverter
    fun stringToPhotos(photos: String): List<Photo> {
        val photo = Gson().fromJson(photos, Array<Photo>::class.java)
        return Arrays.asList(photo) as List<Photo>
    }

    @TypeConverter
    fun photosToString(photos: List<Photo>): String {
        return Gson().toJson(photos)
    }
    //End of List<Photo>

    //For Types
    @TypeConverter
    fun stringToTypes(types: String): List<String> {
        val type = Gson().fromJson(types, Array<String>::class.java)
        return Arrays.asList(type) as List<String>
    }

    @TypeConverter
    fun typesToString(types: List<String>): String {
        return Gson().toJson(types)
    }
    //End of Types
}