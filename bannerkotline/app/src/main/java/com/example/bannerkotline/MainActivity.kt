package com.example.bannerkotline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import com.denzcoskun.imageslider.models.SlideModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var images = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        images.add(R.drawable.one)
        images.add(R.drawable.two)


        var adapter:PagerAdapter = banneradapter(applicationContext,images)

        viewpager.adapter = adapter


        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel("https://4.img-dpreview.com/files/p/E~TS590x0~articles/3925134721/0266554465.jpeg"))
        imageList.add(SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct."))
        imageList.add(SlideModel("https://bit.ly/3fLJf72", "And people do that."))

        image_slider.setImageList(imageList)
    }
}