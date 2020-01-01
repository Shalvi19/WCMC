package com.example.pra6_17it019;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ImageView imageFlashlight;
    private CameraManager cameraManager;
    private String cameraID;
    private boolean flash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)) {
            Toast.makeText(getApplicationContext(), "No Flash", Toast.LENGTH_SHORT);
            finish();
            System.exit(0);
        }
        button = findViewById(R.id.button);
        imageFlashlight = findViewById(R.id.flashlight);
        flash = false;
        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            cameraID = cameraManager.getCameraIdList()[0];
        } catch (CameraAccessException e) {
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    cameraManager.setTorchMode(cameraID, flash = !flash);
                    if(flash==true){
                        Toast.makeText(getApplicationContext(),"Flash is on",Toast.LENGTH_SHORT).show();}
                    else
                    {   Toast.makeText(getApplicationContext(),"Flash is off",Toast.LENGTH_SHORT).show();}


                } catch (CameraAccessException e) {
                }
            }
        });

        imageFlashlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    cameraManager.setTorchMode(cameraID, flash = !flash);
                } catch (CameraAccessException e) {
                }
            }
        });
    }
}


