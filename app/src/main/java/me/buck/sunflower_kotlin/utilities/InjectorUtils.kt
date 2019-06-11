package me.buck.sunflower_kotlin.utilities

import android.content.Context
import com.google.samples.apps.sunflower.viewmodels.PlantDetailViewModelFactory
import com.google.samples.apps.sunflower.viewmodels.PlantListViewModelFactory
import me.buck.sunflower_kotlin.data.AppDatabase
import me.buck.sunflower_kotlin.data.GardenPlantingRepository
import me.buck.sunflower_kotlin.data.PlantRepository
import me.buck.sunflower_kotlin.viewmodels.GardenPlantingListViewModelFactory

/**
 * Created by buck on 2019-06-12
 */
object InjectorUtils {

    private fun getPlantRepository(context: Context):PlantRepository{
        return PlantRepository.getInstance(
            AppDatabase.getInstance(context).plantDao()
        )
    }

    private fun getGardenPlantingRepository(context: Context): GardenPlantingRepository {
        return GardenPlantingRepository.getInstance(
            AppDatabase.getInstance(context.applicationContext).gardenPlantingDao())
    }

    fun provideGardenPlantingListViewModelFactory(
        context: Context
    ): GardenPlantingListViewModelFactory {
        val repository = getGardenPlantingRepository(context)
        return GardenPlantingListViewModelFactory(repository)
    }

    fun providePlantListViewModelFactory(context: Context): PlantListViewModelFactory {
        val repository = getPlantRepository(context)
        return PlantListViewModelFactory(repository)
    }

    fun providePlantDetailViewModelFactory(
        context: Context,
        plantId: String
    ): PlantDetailViewModelFactory {
        return PlantDetailViewModelFactory(getPlantRepository(context),
            getGardenPlantingRepository(context), plantId)
    }
}