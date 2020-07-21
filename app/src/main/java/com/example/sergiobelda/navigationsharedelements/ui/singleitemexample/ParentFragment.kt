package com.example.sergiobelda.navigationsharedelements.ui.singleitemexample


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.sergiobelda.navigationsharedelements.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_parent.*

/**
 * A simple [Fragment] subclass.
 *
 */
class ParentFragment : BottomSheetDialogFragment() {
    companion object {
        const val IMAGE_URI = "https://i.scdn.co/image/8d5eabf813797aa39f6e8186f702a1998d12fe40"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_parent, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardView.setOnClickListener {
            val openIntent = Intent(requireActivity(), DetailActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                requireActivity(),
                imageView,
                "imageView"
            )
            startActivity(openIntent, options.toBundle())
//            val extras = FragmentNavigatorExtras(
//                imageView to "imageView"
//            )
//            findNavController().navigate(R.id.detailAction, null, null, extras)
        }
        Glide.with(context!!).load(IMAGE_URI).centerCrop().into(imageView)
    }
}
