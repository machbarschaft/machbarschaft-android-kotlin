package jetzt.machbarschaft.android.view.login

import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import jetzt.machbarschaft.android.view.login.intro_slides.IntroFragment
import jetzt.machbarschaft.android.view.login.intro_slides.IntroFragment2
import jetzt.machbarschaft.android.view.login.intro_slides.IntroFragment3
import jetzt.machbarschaft.android.view.login.intro_slides.IntroFragment4

class CustomPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position){
            0 -> fragment = IntroFragment()
            1 -> fragment = IntroFragment2()
            2 -> fragment = IntroFragment3()
            3 -> fragment = IntroFragment4()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return 4
    }

}