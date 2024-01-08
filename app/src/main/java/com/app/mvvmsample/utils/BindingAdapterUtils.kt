package com.app.mvvmsample.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.app.mvvmsample.R
import com.bumptech.glide.Glide

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 08/01/2024
 */

//@BindingAdapter("loadImage")
fun loadImage(thumbing:ImageView,url:String){
    Glide.with(thumbing)
        .load(url)
        .circleCrop()
        .placeholder(R.drawable.ic_launcher_foreground)
        .error(R.drawable.ic_launcher_foreground)
        .fallback(R.drawable.ic_launcher_foreground)
        .into(thumbing)
}