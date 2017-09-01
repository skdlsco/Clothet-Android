package kr.wonjun.clothet

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import kotlinx.android.synthetic.main.dialog_paying.*
import android.support.v7.app.AlertDialog


/**
 * Created by eka on 2017. 9. 2..
 */
class PayingDialog(context: Context?, var content: String, var price: Int) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_paying)

        paying_content.text = content
        paying_price.text = "" + price
        paying_cancel.setOnClickListener {
            onBackPressed()
        }
        paying_paying.setOnClickListener {
            dismiss()
            val alert = AlertDialog.Builder(context)
            alert.setPositiveButton("확인", { dialog, which ->
                dialog.dismiss()     //닫기
            })
            alert.setMessage("결제가 완료되었습니다.")
            alert.show()
        }
    }
}