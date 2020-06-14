package com.example.openfiles;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;

import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;






public class MainActivity extends AppCompatActivity {

    Intent intent;
    PDFView pdfView;

    @Override
     protected void onCreate(Bundle savedInstanceState){

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    pdfView = findViewById(R.id.pdfView);
    intent = getIntent();

        if (intent.getAction().equals( Intent.ACTION_VIEW)){
            pdfView.fromUri(intent.getData()).load();
        }
        else {
            Toast.makeText(this, "Check", Toast.LENGTH_SHORT).show();

    }


    }
}