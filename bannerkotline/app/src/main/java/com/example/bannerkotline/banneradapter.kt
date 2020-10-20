package com.example.bannerkotline

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter

class banneradapter:PagerAdapter{

    var context:Context
    var images:ArrayList<Int>
    lateinit var inflater:LayoutInflater

    constructor(context:Context,images:ArrayList<Int>):super(){

        this.context = context
        this.images = images

    }

    override fun isViewFromObject(view: View, `object`: Any):Boolean = view== `object`as LinearLayout


    override fun getCount(): Int =images.size


    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        var image:ImageView
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view:View = inflater.inflate(R.layout.sliderimageitem,container,false)
        image = view.findViewById(R.id.sliderimage)
        image.setBackgroundResource(images[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as LinearLayout)
    }



}