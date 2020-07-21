package com.example.sergiobelda.navigationsharedelements.ui.singleitemexample

import android.os.Bundle
import android.transition.Transition
import android.transition.TransitionValues
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.sergiobelda.navigationsharedelements.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity(R.layout.activity_detail) {
    private val animationListener: Transition.TransitionListener = object : Transition.TransitionListener {
        override fun onTransitionEnd(transition: Transition?) {
            Log.d("APP_TAG", "DetailActivity: onTransitionEnd");
        }

        override fun onTransitionResume(transition: Transition?) {
            Log.d("APP_TAG", "DetailActivity: onTransitionResume");
        }

        override fun onTransitionPause(transition: Transition?) {
            Log.d("APP_TAG", "DetailActivity: onTransitionPause");
        }

        override fun onTransitionCancel(transition: Transition?) {
            Log.d("APP_TAG", "DetailActivity: onTransitionCancel");
        }

        override fun onTransitionStart(transition: Transition?) {
            Log.d("APP_TAG", "DetailActivity: onTransitionStart");
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
//        window?.?.addListener(animationListener)
        super.onCreate(savedInstanceState)
        Glide.with(this).load(ParentFragment.IMAGE_URI).centerCrop().into(imageView)
//        supportFragmentManager.beginTransaction().add(R.id.container, FullScreenDetailFragment()).commit()
    }

    override fun onEnterAnimationComplete() {
        super.onEnterAnimationComplete()
        Log.d("APP_TAG", "DetailActivity: onEnterAnimationComplete");
        supportFragmentManager.beginTransaction().add(R.id.container, FullScreenDetailFragment()).commit()

    }
}