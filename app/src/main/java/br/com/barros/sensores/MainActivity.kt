package br.com.barros.sensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun printSensors() {
        val sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        val sensorList = sensorManager.getSensorList(Sensor.TYPE_ALL)

        for(sensor in sensorList) {
            Log.i("SENSOR","Nome ${sensor.name} - Tipo ${sensor.stringType}")
        }
    }
}
