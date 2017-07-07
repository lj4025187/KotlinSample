package com.example.jia.kotlinsample

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.fighter.loader.AdInfo

/**
 * Created by jia on 7/5/17.
 */
class AdAdapter : BaseAdapter() {

    var TAG: String = AdAdapter::class.java.simpleName

    lateinit var mData : List<AdInfo>

    fun setData(dataSet : List<AdInfo>) {
        mData = dataSet
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(p0: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(p0: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}