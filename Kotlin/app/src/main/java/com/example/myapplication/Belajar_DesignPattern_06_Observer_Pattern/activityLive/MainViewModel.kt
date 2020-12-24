package com.example.myapplication.Belajar_DesignPattern_06_Observer_Pattern.activityLive

import android.os.SystemClock
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel: ViewModel() {
    companion object{
        private const val ONE_SECOND = 1000
    }

    private var mInitialTime:Long = SystemClock.elapsedRealtime()
    private val mElapsedTime = MutableLiveData<Long?>()

    init {
        val timer = Timer()
        timer.scheduleAtFixedRate(object : TimerTask(){
            override fun run() {
                val newValue = (SystemClock.elapsedRealtime() - mInitialTime) / 1000
                mElapsedTime.postValue(newValue)
            }
        }, ONE_SECOND.toLong(), ONE_SECOND.toLong()
        )
    }

    fun getElapsedTime(): LiveData<Long?> {
        return mElapsedTime
    }
}