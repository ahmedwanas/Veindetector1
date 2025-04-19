package com.example.veindetector;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView previewImage;
    private TextView resultText;
    private Bitmap testImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        previewImage = findViewById(R.id.previewImage);
        resultText = findViewById(R.id.resultText);
        Button scanBtn = findViewById(R.id.startScanButton);

        // صورة افتراضية (اختبارية)
        testImage = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_foreground);
        previewImage.setImageBitmap(testImage);

        scanBtn.setOnClickListener(v -> {
            String aiResult = MockAIVeinDetector.analyzeImage(testImage);
            resultText.setText(aiResult);
            Toast.makeText(this, aiResult, Toast.LENGTH_SHORT).show();
        });
    }
}