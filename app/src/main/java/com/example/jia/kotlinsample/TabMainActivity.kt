package com.example.jia.kotlinsample

import android.app.Activity
import android.os.Bundle

/**
 * Created by jia on 7/4/17.
 */

class TabMainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    fun initView() {
        setContentView(R.layout.layout_main_activity)

    }
}
