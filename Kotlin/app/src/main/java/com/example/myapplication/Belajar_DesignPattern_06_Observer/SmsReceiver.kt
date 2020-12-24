package com.example.myapplication.Belajar_DesignPattern_06_Observer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.telephony.SmsMessage
import android.util.Log

class SmsReceiver:BroadcastReceiver() {
    private val TAG = SmsReceiver::class.java.simpleName
    override fun onReceive(context: Context?, intent: Intent?) {
        val bundle = intent?.extras
        try {
            if(bundle != null){
                val pdusObj = bundle.get("pdus") as Array<Any>

                for (aPdusObj in pdusObj){

                    // ================= Observer Design Pattern ===================================
                    //Untuk memperoleh obyek dari kelas SmsMessage, yaitu obyek currentMessage
                    //kita menggunakan metode getIncomingMessage().
                    // Metode ini akan mengembalikan currentMessage berdasarkan OS yang dijalankan oleh perangkat Android.
                    // Hal ini perlu dilakukan karena metode SmsMessage.createFromPdu((object);
                    // sudah deprecated(usang) di peranti dengan OS Marshmallow atau versi setelahnya.
                    val currentMessage = getIncomeingMessage(aPdusObj ,bundle)
                    //==============================================================================

                    val senderNum = currentMessage.displayOriginatingAddress
                    val message = currentMessage.displayMessageBody

                    Log.d(TAG,"senderNum : $senderNum; message : $message")
                }

            }
        } catch (e: Exception){
            Log.d(TAG,"Exception smsReceiver $e")
        }

    }

    private fun getIncomeingMessage(aObject:Any,bundles: Bundle): SmsMessage {
        val currentSMS : SmsMessage
        if(Build.VERSION.SDK_INT >= 23 ){
            val format = bundles.getString("format")
            currentSMS = SmsMessage.createFromPdu(aObject as ByteArray,format)
        } else currentSMS = SmsMessage.createFromPdu(aObject as ByteArray)
        return currentSMS
    }
}