package kr.wonjun.clothet.Fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my_closet.view.*
import kr.wonjun.clothet.Activity.ClosetMoreActivity
import kr.wonjun.clothet.R
import org.jetbrains.anko.support.v4.startActivity


class MyClosetFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_my_closet, container, false)

        view.closet_category_1.setOnClickListener { onClick(it, 1) }
        view.closet_category_2.setOnClickListener { onClick(it, 2) }
        view.closet_category_3.setOnClickListener { onClick(it, 3) }
        view.closet_category_4.setOnClickListener { onClick(it, 4) }
        view.closet_category_5.setOnClickListener { onClick(it, 5) }
        view.closet_category_6.setOnClickListener { onClick(it, 6) }

        return view
    }

    fun onClick(view: View, pos: Int) {
        startActivity<ClosetMoreActivity>()
    }

    companion object {
        fun newInstance(): MyClosetFragment = MyClosetFragment()
    }
}
