package kr.wonjun.clothet.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_in_style.*
import kr.wonjun.clothet.InfoDialog
import kr.wonjun.clothet.Model.InfoData
import kr.wonjun.clothet.R
import org.jetbrains.anko.textColor

class InStyleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in_style)

        var isFancy = false
        inStyle_prev.setOnClickListener {
            onBackPressed()
        }

        inStyle_info.setOnClickListener {
            var dialog: InfoDialog = InfoDialog(this, InfoData("asdf", "asdf", 30, "asdf"))
            dialog.show()
        }

        inStyle_gotcha_container.setOnClickListener {
            if (isFancy) {
                inStyle_gotcha_container.setBackgroundResource(R.drawable.box_stroke_white)
                inStyle_gotcha_text.textColor = resources.getColor(R.color.colorWhite)
                inStyle_gotcha_img.setImageResource(R.drawable.ic_fancy_off)
                isFancy = false
            } else {
                inStyle_gotcha_container.setBackgroundResource(R.drawable.box_solid_white)
                inStyle_gotcha_text.textColor = resources.getColor(R.color.colorPrimaryDark)
                inStyle_gotcha_img.setImageResource(R.drawable.ic_fancy_on)
                isFancy = true
            }
        }
    }
}
