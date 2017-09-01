package kr.wonjun.clothet.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import kr.wonjun.clothet.Fragment.AlarmFragment

/**
 * Created by eka on 2017. 9. 1..
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> AlarmFragment.newInstance()
            1 -> AlarmFragment.newInstance()
            2 -> AlarmFragment.newInstance()
            3 -> AlarmFragment.newInstance()
            else -> AlarmFragment.newInstance()
        }
    }

    override fun getCount(): Int = 4

}