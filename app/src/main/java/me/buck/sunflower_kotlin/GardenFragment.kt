package me.buck.sunflower_kotlin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import me.buck.sunflower_kotlin.databinding.FragmentGardenBinding
import me.buck.sunflower_kotlin.utilities.InjectorUtils
import me.buck.sunflower_kotlin.viewmodels.GardenPlantingListViewModel


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class GardenFragment : Fragment() {

    private val viewModel:GardenPlantingListViewModel by viewModels {
        InjectorUtils.provideGardenPlantingListViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGardenBinding.inflate(inflater, container, false)




        return inflater.inflate(R.layout.fragment_garden, container, false)
    }


}
