package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.quiz.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int correctAnswers = getIntent().getIntExtra("correct", 0);
        int totalQuestions = getIntent().getIntExtra("total", 0);


        binding.score.setText(String.format("%d/%d", correctAnswers, totalQuestions));


        binding.restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class  );

               finishAffinity();
            }
        });


    }

}