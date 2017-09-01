package kr.wonjun.clothet.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.wonjun.clothet.Model.AlarmItem
import kr.wonjun.clothet.R
import kotlinx.android.synthetic.main.alarm_item.view.*

/**
 * Created by eka on 2017. 9. 1..
 */
class AlarmRecyclerViewAdapter(var items: ArrayList<AlarmItem>, var context: Context) : RecyclerView.Adapter<AlarmRecyclerViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.alarm_item, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(items.get(position))
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: AlarmItem) {
            itemView.alarm_item_name1.text = item.name1
            itemView.alarm_item_name2.text = item.name2
            itemView.alarm_item_act1.text = item.act1
            itemView.alarm_item_act2.text = item.act2
            val late: Long = System.currentTimeMillis() - item.time.time
            val minute: Long = 1000 * 60
            val hour: Long = minute * 60
            val day: Long = hour * 24
            val month: Long = day * 30
            val year: Long = month * 12
            when (late) {
                in 1..minute -> itemView.alarm_item_time.text = "" + late / 1000 + "초 전"
                in minute..hour -> itemView.alarm_item_time.text = "" + late / minute + "분 전"
                in hour..day -> itemView.alarm_item_time.text = "" + late / hour + "시간 전"
                in day..month -> itemView.alarm_item_time.text = "" + late / day + "일 전"
                in month..year -> itemView.alarm_item_time.text = "" + late / month + "월 전"
                else -> itemView.alarm_item_time.text = "" + late / year + "년 전"
            }
        }
    }
}