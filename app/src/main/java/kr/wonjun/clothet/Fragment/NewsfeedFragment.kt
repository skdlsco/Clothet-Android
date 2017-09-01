package kr.wonjun.clothet.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_newsfeed.view.*
import kotlinx.android.synthetic.main.fragment_save_cody.view.*
import kr.wonjun.clothet.APIRequest
import kr.wonjun.clothet.Activity.InStyleActivity
import kr.wonjun.clothet.Adapter.CodyRecyclerViewAdapter
import kr.wonjun.clothet.Model.PostData
import kr.wonjun.clothet.R
import okhttp3.ResponseBody
import org.jetbrains.anko.support.v4.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsfeedFragment : Fragment() {
    private val items = ArrayList<PostData>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_newsfeed, container, false)
        val adapter = CodyRecyclerViewAdapter(context, items)
        view.newsfeed_recyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)
        view.newsfeed_recyclerView.adapter = adapter
        items.add(PostData("sdaf", "content", "title", "img", "like"))
        items.add(PostData("sdaf", "content", "title", "img", "like"))
        items.add(PostData("sdaf", "content", "title", "img", "like"))
        adapter.notifyDataSetChanged()
        adapter.itemClick = object : CodyRecyclerViewAdapter.ItemClick {
            override fun onItemClick(view: View?, position: Int) {
                startActivity<InStyleActivity>()
            }
        }
        return view
    }

    companion object {
        fun newInstance(): NewsfeedFragment = NewsfeedFragment()
    }

}