package com.example.zhanglianglin.kotlinsample.view.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*
import org.jetbrains.anko.support.v4.UI

/**
 * @author zhanglianglin
 * @since 2018/03/08
 * @desc
 * @version 1.0
 */
class MainFragment : Fragment(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return UI { verticalLayout {
            val name = textView(){
                text = "Anko在Fragment中的实现"
                padding = 30
            }
        } }.view
    }

}