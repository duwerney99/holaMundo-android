package com.example.semana1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this, this)

        findViewById<Button>(R.id.btnPlay).setOnClickListener{speak()}

    }

    private fun speak(){
        var message: String = findViewById<TextView>(R.id.etMessage).text.toString()

        if (message.isEmpty()){ //Si esta vacio el text isEmpty devuelve message
            findViewById<TextView>(R.id.tvStatus).text = getString(R.string.tts_introduce_text)
            message = "Por favor pon algo en el edit text"
        }

        tts!!.speak(message, TextToSpeech.QUEUE_FLUSH, null, "")
    }

    override fun onInit(status: Int) {
        if (status === TextToSpeech.SUCCESS){
            findViewById<TextView>(R.id.tvStatus).text = getString(R.string.tts_active)
            tts!!.language = Locale("ES")
        } else {
            findViewById<TextView>(R.id.tvStatus).text = getString(R.string.tts_no_active)
        }
    }

    override fun onDestroy() {
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }
}