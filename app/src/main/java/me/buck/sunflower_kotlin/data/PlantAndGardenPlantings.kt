package me.buck.sunflower_kotlin.data

import androidx.room.Embedded

/**
 * Created by gwf on 2019/6/11
 */
class PlantAndGardenPlantings {

    @Embedded
    lateinit var plant: Plant


}