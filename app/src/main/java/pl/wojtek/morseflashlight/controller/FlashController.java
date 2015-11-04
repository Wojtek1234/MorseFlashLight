package pl.wojtek.morseflashlight.controller;

import android.hardware.Camera;

import static android.hardware.Camera.Parameters.*;


public class FlashController {

    private Camera camera;
    private boolean isLightning =false;


    public void doFlash(){
        if(isLightning)flashOf();
        else flash();
    }

    private void flash(){
        camera = Camera.open();
        Camera.Parameters p = camera.getParameters();
        p.setFlashMode(FLASH_MODE_TORCH);
        camera.setParameters(p);
        camera.startPreview();
        isLightning =true;

    }

    private void flashOf(){
        camera = Camera.open();
        Camera.Parameters p = camera.getParameters();
        p.setFlashMode(FLASH_MODE_OFF);
        camera.setParameters(p);
        camera.stopPreview();
        camera.release();
        isLightning =false;

    }
}
