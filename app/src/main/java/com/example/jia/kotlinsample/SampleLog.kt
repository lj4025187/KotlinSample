package com.example.jia.kotlinsample

import android.util.Log

/**
 * Created by jia on 7/5/17.
 */
class SampleLog {

    var TAG : String = "ReaperSample"
    var DEBUG_LOG : Boolean = true

    fun i(subTag: String, msg : String) {
        if(DEBUG_LOG)
            Log.i(TAG, "[$subTag]$msg")
    }

    fun e(subTag: String, msg : String) {
        if(DEBUG_LOG)
            Log.e(TAG, "[$subTag]$msg")
    }
}