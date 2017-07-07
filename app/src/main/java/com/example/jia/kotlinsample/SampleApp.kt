package com.example.jia.kotlinsample

import android.app.Application
import com.fighter.loader.ReaperApi
import com.fighter.loader.ReaperInit

/**
 * Created by jia on 7/5/17.
 */
class SampleApp : Application(){

    var TAG : String = SampleApp::class.java.simpleName

    lateinit var mReaperApi : ReaperApi

    override fun onCreate() {
        super.onCreate()
        ReaperInit.init(this)
        mReaperApi.init(this, if (SampleConfig.TEST_MODE) SampleConfig.TEST_APP_ID else SampleConfig.RELEASE_APP_ID,
                if (SampleConfig.TEST_MODE) SampleConfig.TEST_APP_KEY else SampleConfig.RELEASE_APP_KEY,
                SampleConfig.TEST_MODE)
        if (SampleConfig.LOCAL_CONFIG)
            mReaperApi.setTargetConfig(ResponseGenerator.generate())
    }

    fun getReaperApi(): ReaperApi {
        return mReaperApi
    }
}