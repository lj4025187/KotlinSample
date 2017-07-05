package com.example.jia.kotlinsample

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.layout_main_activity.*

/**
 * Created by jia on 7/4/17.
 */

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_main_activity)
        id_main_text_view.text = "Hello Kotlin"
        init(plus(1, 2).toString())
        toast("play with kotlin short toast")
        toast("play with kotlin long toast", Toast.LENGTH_LONG)
        var person = Person("test", 16)
        toast("play with tag", person.pName)
    }

    fun init(init: String) {
        id_main_text_view.text = init
    }

    fun toast(msg: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, msg, length).show()
    }

    fun toast(msg: String,
              tag: String = MainActivity::class.java.simpleName,
              length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, "[$tag] $msg", length).show()
    }

    fun plus(x: Int, y: Int): Int = x + y

    class Person(name: String, id: Int) {
        var pName : String = ""
        var pId : Int = 17
        init {
            pName = name
            pId = id
        }
    }
}
