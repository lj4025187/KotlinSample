package com.example.jia.kotlinsample.activities

import android.Manifest
import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Message
import com.example.jia.kotlinsample.SampleApp
import com.fighter.loader.ReaperApi

/**
 * Created by jia on 7/7/17.
 */
class BaseActivity : Activity(), Handler.Callback {

    lateinit var mReaperApi : ReaperApi
    lateinit var mContext : Context
    lateinit var mMainHandler : Handler

    val REQUESTED_PERMISSIONS = listOf(Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.WRITE_SETTINGS)

    override fun handleMessage(p0: Message?): Boolean {
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (application is SampleApp) {
        }
    }
}