package me.buck.sunflower_kotlin.data

import androidx.room.Embedded
import androidx.room.Relation

/**
 * Created by gwf on 2019/6/11
 */
class PlantAndGardenPlantings {

    @Embedded
    lateinit var plant: Plant

    @Relation(parentColumn = "id", entityColumn = "plant_id")
    var gardenPlantings:List<GardenPlanting> = arrayListOf()


}