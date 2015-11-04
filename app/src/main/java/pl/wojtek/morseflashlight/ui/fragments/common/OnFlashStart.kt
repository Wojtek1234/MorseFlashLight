package pl.wojtek.morseflashlight.ui.fragments.common

import pl.wojtek.morseflashlight.controller.FlashController

interface OnFlashStart {
    fun doOnFlash(flashController: FlashController)
}
