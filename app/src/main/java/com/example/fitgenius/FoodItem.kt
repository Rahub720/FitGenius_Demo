package com.example.fitgenius

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "HealthData")
data class FoodItem (
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "Foodname") val foodname: String?,
    @ColumnInfo(name = "Calories")  val calories: Int?
)