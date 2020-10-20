package com.example.webscrapping

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jsoup.Jsoup
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.movementMethod = ScrollingMovementMethod()

      button.setOnClickListener {

              thread{
                  // network call, so run it in the background
                  val doc = Jsoup.connect("").get()

                  val textElements = doc.getElementsByTag("h1").text()



                  // can't access UI elements from the background thread
                  this.runOnUiThread{

                      textView.setText(textElements.toString())

                  }
              }

      }

    }
}