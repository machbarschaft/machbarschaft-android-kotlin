package jetzt.machbarschaft.android.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.widget.AppCompatImageView
import androidx.fragment.app.Fragment
import jetzt.machbarschaft.android.R

class IntroFragment(private val slideIndex: Int) : Fragment() {
    companion object {
        const val SLIDES_COUNT = 4
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_intro, container, false)
        val imageViewIntro = view.findViewById<AppCompatImageView>(R.id.imageview_intro)
        val textViewIntro = view.findViewById<TextView>(R.id.textview_intro)

        imageViewIntro.setImageDrawable(view.context.getDrawable(slideDrawable()))
        textViewIntro.text = view.context.getString(slideText())
        return view
    }

    @DrawableRes
    private fun slideDrawable(): Int {
        return when (slideIndex) {
            0 -> R.drawable.ic_swipe_right
            1 -> R.drawable.search_location
            2 -> R.drawable.ic_phone_in_talk_black_24dp
            3 -> R.drawable.supermarket
            else -> throw IllegalStateException("No intro slide defined for index $slideIndex!")
        }
    }

    @StringRes
    private fun slideText(): Int {
        return when (slideIndex) {
            0 -> R.string.intro_1_text
            1 -> R.string.intro_2_text
            2 -> R.string.intro_3_text
            3 -> R.string.intro_4_text
            else -> throw IllegalStateException("No intro slide defined for index $slideIndex!")
        }
    }
}