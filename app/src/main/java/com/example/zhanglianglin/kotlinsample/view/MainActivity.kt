package com.example.zhanglianglin.kotlinsample.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

@Suppress("EXPERIMENTAL_FEATURE_WARNING")
/**
* @author zhanglianglin
* @since 2018/03/07
* @desc
* @version 1.0
*/
class MainActivity : FragmentActivity(){

    @SuppressLint("SetTextI18n")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        anko : find<TextView>(R.id.tv_test).text = "直接使用find<view类型>(view的ID)来获取到view"
//        tv_test.text = "同时，Kotlin还提供一种更激进的方法，通过在gradule中引用applyplugin:'kotlin-android-extensions'，彻底取消findViewById这个函数"
        verticalLayout {
            val name = textView(){
                text = "Anko却实现了在代码中简洁优雅地定义界面和布局，而且由于不需要读取和解析XML布局文件，Anko的性能表现更佳。"
                padding = 30
            }
            button("修改文案"){
                onClick {
                    name.text = "用6行代码就做出了一个有输入框、按钮、点击事件和Toast的界面和功能"
                    toast("已修改文案了,请仔细阅读!!!")
                }
            }
        }
    }
}