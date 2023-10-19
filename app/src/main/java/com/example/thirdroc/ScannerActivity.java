package com.example.thirdroc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.zxing.Result;

import java.io.IOException;

public class ScannerActivity extends AppCompatActivity {

  CodeScannerView codeScannerView;
  CodeScanner codescan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
       codeScannerView=findViewById(R.id.suface);
       codescan =new CodeScanner(this,codeScannerView);
       codescan.setDecodeCallback(new DecodeCallback() {
           @Override
           public void onDecoded(@NonNull Result result) {
               runOnUiThread(new Runnable() {
                   @Override
                   public void run() {
                       Toast.makeText(ScannerActivity.this,result.getText(),Toast.LENGTH_SHORT).show();
                   }
               });
           }
       });
         codeScannerView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 codescan.startPreview();
             }
         });
    }

    @Override
    protected void onResume() {
        super.onResume();
       codescan.startPreview();
    }

    @Override
    protected void onPause() {
      codescan.releaseResources();
        super.onPause();
    }
  }
