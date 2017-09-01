package kr.wonjun.clothet.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_alarm.view.*
import kr.wonjun.clothet.Adapter.AlarmRecyclerViewAdapter
import kr.wonjun.clothet.Model.AlarmItem
import kr.wonjun.clothet.R
import java.sql.Time
import java.util.*


class AlarmFragment : Fragment() {
    var items: ArrayList<AlarmItem> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_alarm, container, false)
        val adapter = AlarmRecyclerViewAdapter(items, context)

        items.add(AlarmItem("박태준님이 ", "회원님의 코디를 ", "저장", "했습니다.", Time(System.currentTimeMillis())))
        view.alarm_recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        view.alarm_recyclerView.adapter = adapter

        return view
    }

    companion object {
        fun newInstance(): AlarmFragment = AlarmFragment()
    }
}
