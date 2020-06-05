package jetzt.machbarschaft.android.view.login.intro_slides

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import jetzt.machbarschaft.android.R

/**
 * Intro slide 1
 */
class IntroFragment4 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_intro, container, false)
        val imageViewIntro = view.findViewById<AppCompatImageView>(R.id.imageview_intro)
        val textViewIntro = view.findViewById<TextView>(R.id.textview_intro)

        imageViewIntro.setImageDrawable(context?.getDrawable(R.drawable.supermarket))
        textViewIntro.text = context?.resources?.getString(R.string.intro_4_text)
        return view
    }
}