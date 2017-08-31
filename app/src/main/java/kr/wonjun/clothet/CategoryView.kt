package kr.wonjun.clothet

import android.content.Context
import android.content.res.TypedArray
import android.support.v7.widget.CardView
import android.util.AttributeSet
import kotlinx.android.synthetic.main.category.view.*
import android.view.LayoutInflater


/**
 * Created by eka on 2017. 9. 1..
 */
class CategoryView : CardView {
    constructor(context: Context?) : super(context) {
        initView()
    }

    constructor(context: Context?, attrs: AttributeSet) : super(context, attrs) {
        initView()
        getAttrs(attrs)
    }

    constructor(context: Context?, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initView()
        getAttrs(attrs, defStyleAttr)
    }

    private fun initView() {
        val infService = Context.LAYOUT_INFLATER_SERVICE
        val li = context.getSystemService(infService) as LayoutInflater
        val v = li.inflate(R.layout.category, this, false)
        addView(v)
    }

    private fun getAttrs(attrs: AttributeSet) {
        val typedArray: TypedArray = getContext().obtainStyledAttributes(attrs, R.styleable.CategoryView);
        setTypeArray(typedArray)
    }

    private fun getAttrs(attrs: AttributeSet, defStyle: Int) {
        val typedArray: TypedArray = getContext().obtainStyledAttributes(attrs, R.styleable.CategoryView, defStyle, 0);
        setTypeArray(typedArray)
    }

    private fun setTypeArray(typedArray: TypedArray) {
        val text_ko: String = typedArray.getString(R.styleable.CategoryView_text_ko)
        category_text_ko.text = text_ko

        val text_en: String = typedArray.getString(R.styleable.CategoryView_text_en)
        category_text_en.text = text_en

        val src: Int = typedArray.getResourceId(R.styleable.CategoryView_img, 0)
        category_img.setImageResource(src)

        typedArray.recycle()
    }
}