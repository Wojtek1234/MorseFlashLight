package pl.wojtek.morseflashlight.ui.fragments


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.fragment_main_functionality.view.textInputEdit
import pl.wojtek.morseflashlight.R
import pl.wojtek.morseflashlight.controller.FlashController
import pl.wojtek.morseflashlight.model.morseMap
import pl.wojtek.morseflashlight.ui.fragments.common.BaseFragment


/**
 * A simple [Fragment] subclass.
 */
class MainFunctionalityFragment : BaseFragment() {

    var listOfMorse= java.util.ArrayList<String>();

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_main_functionality, container, false)

        view.textInputEdit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                for (i in before downTo 0) {
                    listOfMorse.removeAt(start+before)
                }
                for(i in 0..count){
                    val charAt:String=s.toString()[start+i].toUpperCase().toString()
                    listOfMorse.add(start+i, morseMap.getRaw(charAt) as String)
                }
            }

            override fun afterTextChanged(s: Editable) {

            }
        })

        return view
    }


    override fun doOnFlash(flashController: FlashController) {
        throw UnsupportedOperationException()
    }

}// Required empty public constructor
