package me.buck.sunflower_kotlin.data

import androidx.room.*
import java.util.*

/**
 * Created by gwf on 2019/6/11
 */

@Entity(
    tableName = "garden_plantings",
    foreignKeys = [ForeignKey(entity = Plant::class, parentColumns = ["id"],childColumns = ["plant_id"])],
    indices = [Index("plant_id")]
)
data class GardenPlanting (

    @ColumnInfo(name = "plant_id")
    val plantId:String,
    @ColumnInfo(name = "plant_date")
    val plantDate:Calendar = Calendar.getInstance(),
    @ColumnInfo(name = "last_watering_date")
    val lastWateringDate:Calendar = Calendar.getInstance()
){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var gardenPlantingId:Long = 0
}