package com.example.thirdroc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.zxing.WriterException;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class QR_Code extends AppCompatActivity {
    ImageView img;
    EditText edtxt;
    Button btn;
    Bitmap bitmap;

    QRGEncoder qrEncode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr_code);
        img=findViewById(R.id.qrimg);
        edtxt=findViewById(R.id.txt);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(edtxt.getText().toString())){
                    Toast.makeText(QR_Code.this, "Enter some text to generate QR Code", Toast.LENGTH_SHORT).show();
                }
                else{
//                    WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);
//
//                    Display display = manager.getDefaultDisplay();
//
//                    Point point=new Point();
//                    display.getSize(point);
//
//                    int width = point.x;
//                    int height = point.y;
//
//                    int dimen = width < height ? width : height;
//                    dimen = dimen * 3 / 4;

                    qrEncode =new QRGEncoder(edtxt.getText().toString(),null, QRGContents.Type.TEXT,50);
                    try {
                        bitmap = qrEncode.encodeAsBitmap();
                    img.setImageBitmap(bitmap);
                    }catch (WriterException e){
                        Log.d("Tag",e.toString());
                    }
                }
            }
        });
    }
}