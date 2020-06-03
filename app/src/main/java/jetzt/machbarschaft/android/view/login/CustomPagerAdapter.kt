package jetzt.machbarschaft.android.view.login

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.viewpager.widget.PagerAdapter
import jetzt.machbarschaft.android.R

class CustomPagerAdapter(private val context: Context): PagerAdapter() {

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(context)
        val layout =
            inflater.inflate(R.layout.fragment_intro, container, false) as ViewGroup
        container.addView(layout)

        val imageViewIntro = container.findViewById<AppCompatImageView>(R.id.imageview_intro)
        val textViewIntro = container.findViewById<TextView>(R.id.textview_intro)

        when(position) {
            0 -> {
                imageViewIntro.setImageDrawable(context.getDrawable(R.drawable.ic_swipe_right))
                textViewIntro.text = context.resources.getString(R.string.intro_1_text)
            }
            1 -> {
                imageViewIntro.setImageDrawable(context.getDrawable(R.drawable.search_location))
                textViewIntro.text = context.resources.getString(R.string.intro_1_text)
            }
            2 -> {
                imageViewIntro.setImageDrawable(context.getDrawable(R.drawable.ic_phone_in_talk_black_24dp))
                textViewIntro.text = context.resources.getString(R.string.intro_1_text)
            }
            3 -> {
                imageViewIntro.setImageDrawable(context.getDrawable(R.drawable.supermarket))
                textViewIntro.text = context.resources.getString(R.string.intro_1_text)
            }
        }

        return layout
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return 4
    }


}