package kr.wonjun.clothet.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.cody_item.view.*
import kr.wonjun.clothet.R
import android.util.TypedValue


/**
 * Created by eka on 2017. 9. 1..
 */
class CodyRecyclerViewAdapter(val context: Context) : RecyclerView.Adapter<CodyRecyclerViewAdapter.ViewHolder>() {
    override fun getItemCount(): Int = 6

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder? {
        val view: View = LayoutInflater.from(context).inflate(R.layout.cody_item, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bind(position, context)
        holder?.itemView?.setOnClickListener {
            itemClick?.onItemClick(holder.itemView, position)
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(position: Int, context: Context) {
            val params: LinearLayout.LayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            val margin = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10f, context.resources.displayMetrics).toInt()
            if (position % 2 == 0)
                params.marginEnd = margin
            else
                params.marginStart = margin
            itemView.layoutParams = params
            itemView.cody_img.setImageResource(R.drawable.ic_register_logo)
            itemView.cody_text.text = "코디" + position
        }
    }

    var itemClick: ItemClick? = null

    interface ItemClick {
        fun onItemClick(view: View?, position: Int)
    }
}
