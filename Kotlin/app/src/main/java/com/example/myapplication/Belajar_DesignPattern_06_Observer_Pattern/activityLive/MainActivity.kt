package com.example.myapplication.Belajar_DesignPattern_06_Observer_Pattern.activityLive

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_live.*

class MainActivity : AppCompatActivity() {

    private lateinit var mLiveDataTimerViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live)

        mLiveDataTimerViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        subscribe()
    }

    private fun subscribe(){
        // Observer Design Pattern dengan LiveData
        val elapsedTimeObserver = Observer<Long?>{
                aLong ->
            val newText = this@MainActivity.resources.getString(R.string.seconds, aLong)
            timer_textView.text = newText
        }

        // Observer Design Pattern dengan LiveData
        mLiveDataTimerViewModel.getElapsedTime().observe(this, elapsedTimeObserver)
    }
}