package me.buck.sunflower_kotlin.adapters

import android.view.View
import androidx.databinding.BindingAdapter

/**
 * Created by buck on 2019-06-12
 */
@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}