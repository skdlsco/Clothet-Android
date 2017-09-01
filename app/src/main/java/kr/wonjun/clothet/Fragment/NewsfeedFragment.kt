package kr.wonjun.clothet.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_newsfeed.view.*
import kr.wonjun.clothet.Activity.InStyleActivity
import kr.wonjun.clothet.Adapter.CodyRecyclerViewAdapter
import kr.wonjun.clothet.Model.ShoppingItem
import kr.wonjun.clothet.R
import org.jetbrains.anko.support.v4.startActivity

class NewsfeedFragment : Fragment() {
    private val items = ArrayList<ShoppingItem>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_newsfeed, container, false)
        val adapter = CodyRecyclerViewAdapter(context, items)
        view.newsfeed_recyclerView.adapter = adapter
        adapter.itemClick = object : CodyRecyclerViewAdapter.ItemClick {
            override fun onItemClick(view: View?, position: Int) {
                startActivity<InStyleActivity>()
            }
        }
        view.newsfeed_recyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        return view
    }

    companion object {
        fun newInstance(): NewsfeedFragment = NewsfeedFragment()
    }

}