package com.example.sergiobelda.navigationsharedelements.ui.singleitemexample

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.sergiobelda.navigationsharedelements.R
import com.example.sergiobelda.navigationsharedelements.ui.singleitemexample.DetailFragment.Companion.HEADER_IMAGE_URI
import com.example.sergiobelda.navigationsharedelements.ui.singleitemexample.DetailFragment.Companion.IMAGE_URI
import kotlinx.android.synthetic.main.fragment_full_screen_detail.*

class FullScreenDetailFragment: Fragment(R.layout.fragment_full_screen_detail) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("APP_TAG", "FullScreenDetailFragment: onViewCreated");
        Glide.with(requireContext()).load(ParentFragment.IMAGE_URI).centerCrop().into(imageView)
        imageView.setOnClickListener {
            Glide.with(requireContext()).load(HEADER_IMAGE_URI).centerCrop().into(imageView)
        }
    }
}