package kr.wonjun.clothet.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import kr.wonjun.clothet.Fragment.AlarmFragment
import kr.wonjun.clothet.Fragment.MyClosetFragment
import kr.wonjun.clothet.Fragment.NewsfeedFragment
import kr.wonjun.clothet.Fragment.SaveCodyFragment

/**
 * Created by eka on 2017. 9. 1..
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NewsfeedFragment.newInstance()
            1 -> MyClosetFragment.newInstance()
            2 -> SaveCodyFragment.newInstance()
            3 -> AlarmFragment.newInstance()
            else -> AlarmFragment.newInstance()
        }
    }

    override fun getCount(): Int = 4

}