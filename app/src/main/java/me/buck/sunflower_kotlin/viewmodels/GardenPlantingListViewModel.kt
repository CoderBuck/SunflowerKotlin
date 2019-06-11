package me.buck.sunflower_kotlin.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import me.buck.sunflower_kotlin.data.GardenPlantingRepository
import me.buck.sunflower_kotlin.data.PlantAndGardenPlantings

/**
 * Created by gwf on 2019/6/11
 */
class GardenPlantingListViewModel internal constructor(
    gardenPlantingRepository: GardenPlantingRepository
) : ViewModel(){

    val gardenPlantings = gardenPlantingRepository.getGardenPlantings()

//    val plantAndGardenPlantings: LiveData<List<PlantAndGardenPlantings>> =
//        gardenPlantingRepository.getPlantAndGardenPlantings().map { plantings ->
////            plantings.filter { it.gardenPlantings.isNotEmpty() }
//        }
}