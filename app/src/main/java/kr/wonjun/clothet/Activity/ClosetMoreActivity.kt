package kr.wonjun.clothet.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_closet_more.*
import kr.wonjun.clothet.Adapter.CodyRecyclerViewAdapter
import kr.wonjun.clothet.R
import kr.wonjun.clothet.Model.ShoppingItem
import org.jetbrains.anko.startActivity

class ClosetMoreActivity : AppCompatActivity() {
    val items = ArrayList<ShoppingItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_closet_more)

        val adapter = CodyRecyclerViewAdapter(this, items)
        closet_more_recyclerView.adapter = adapter
        adapter.itemClick = object : CodyRecyclerViewAdapter.ItemClick {
            override fun onItemClick(view: View?, position: Int) {
                startActivity<InStyleActivity>()
            }
        }
        closet_more_recyclerView.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
    }
}
