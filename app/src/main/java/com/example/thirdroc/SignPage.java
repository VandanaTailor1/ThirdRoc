package com.example.thirdroc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.thirdroc.model.RetrofitClient;
import com.example.thirdroc.model.SingInterface;
import com.example.thirdroc.model.SingPojo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hbb20.CountryCodePicker;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignPage extends AppCompatActivity {
    AppCompatButton button;
    EditText edt;
    CountryCodePicker countryCodePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_page);
        button = findViewById(R.id.gntotp);
        countryCodePicker=findViewById(R.id.countrypic);
        edt=findViewById(R.id.edtnum);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //apiCall();
               // Intent intent;
                Intent intent1 = new Intent(SignPage.this, OtpActivity.class);
                startActivity(intent1);
            }
        });
    }
    public void apiCall(){
        RetrofitClient.getInstance().create(SingInterface.class)
                .getData(edt.getText().toString())
                .enqueue(new Callback<SingPojo>() {
                    @Override
                    public void onResponse(Call<SingPojo> call, Response<SingPojo> response) {
                        if (response.code()==200) {
                        Toast.makeText(SignPage.this, response.body().getMessage(), Toast.LENGTH_SHORT).show();
                         Intent intent1 = new Intent(SignPage.this, OtpActivity.class);
                         startActivity(intent1);
                       }
                       else if (response.code()==400){
                           Gson gson = new Gson();
                           Type type = new TypeToken<SingPojo>() {}.getType();
                           SingPojo errorResponse = gson.fromJson(response.errorBody().charStream(),type);
                           Toast.makeText(SignPage.this, errorResponse.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                    @Override
                    public void onFailure(Call<SingPojo> call, Throwable t) {

                    }
                });
    }
}