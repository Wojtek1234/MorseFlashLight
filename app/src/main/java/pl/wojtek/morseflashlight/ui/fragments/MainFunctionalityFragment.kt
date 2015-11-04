package pl.wojtek.morseflashlight.ui.fragments


import android.os.Bundle
import android.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import pl.wojtek.morseflashlight.R
import pl.wojtek.morseflashlight.controller.FlashController
import pl.wojtek.morseflashlight.ui.fragments.common.BaseFragment

/**
 * A simple [Fragment] subclass.
 */
class MainFunctionalityFragment : BaseFragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_functionality, container, false)
    }



    override fun doOnFlash(flashController: FlashController) {
        throw UnsupportedOperationException()
    }

}// Required empty public constructor
