package com.example.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks,btnCurrent,btnWishList,btnFavorites,btnFinished,btnAbout;
    private TextView txtLicence,txtUser;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,AllBooks.class);
                startActivity(intent);
            }
        });
    }


    private void initViews(){

        btnAllBooks =findViewById(R.id.btnAllBooks);
        btnCurrent =findViewById(R.id.btnCurrent);
        btnWishList =findViewById(R.id.btnWishList);
        btnFavorites =findViewById(R.id.btnFavorites);
        btnFinished =findViewById(R.id.btnFinished);
        btnAbout =findViewById(R.id.btnAbout);

        txtUser=findViewById(R.id.txtUser);
        txtLicence=findViewById(R.id.txtLicence);

        imageView=findViewById(R.id.imageView);


    }
}