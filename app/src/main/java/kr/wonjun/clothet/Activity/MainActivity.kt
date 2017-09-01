package kr.wonjun.clothet.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.PopupMenu
import kotlinx.android.synthetic.main.toolbar.*
import kr.wonjun.clothet.R
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayShowTitleEnabled(false)
        }
        toolbar_menu.setOnClickListener { showPopup(it) }
    }

    private fun showPopup(v: View) {
        val popupMenu = PopupMenu(this, v)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.menu_closet -> {
                    Log.e("popup", "menu_closet")
                    startActivity<ClosetActivity>()
                    true
                }
                R.id.menu_avatar -> {
                    Log.e("popup", "menu_avatar")
                    true
                }
                else -> false
            }
        }
        popupMenu.inflate(R.menu.main_menu)
        popupMenu.show()
    }
}
