package kr.wonjun.clothet

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.Window
import kotlinx.android.synthetic.main.dialog_info.*
import kr.wonjun.clothet.Model.InfoData


/**
 * Created by eka on 2017. 9. 2..
 */
class InfoDialog : Dialog {
    var info: InfoData

    constructor(context: Context?, info: InfoData) : super(context) {
        this.info = info
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_info)

        info_title.text = info.title
        info_category.text = info.category
        info_size.text = "" + info.size
        info_color.text = info.color
    }
}