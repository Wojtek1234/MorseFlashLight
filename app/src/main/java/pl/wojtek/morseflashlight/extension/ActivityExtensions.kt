package pl.wojtek.morseflashlight.extension

import android.app.Activity
import android.view.View

inline fun <reified T : View> Activity.find(id: Int): T = findViewById(id) as T