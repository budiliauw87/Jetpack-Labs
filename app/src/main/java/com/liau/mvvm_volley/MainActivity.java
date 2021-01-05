package com.liau.mvvm_volley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.liau.mvvm_volley.databinding.ActivityMainBinding;
import com.liau.mvvm_volley.viewmodel.ViewModelFactory;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        viewModel = new ViewModelProvider(this,
                ViewModelFactory.getInstance(MainActivity.this)).get(MainViewModel.class);

        binding.floatingBtn.setOnClickListener((v) -> {
            viewModel.increaseNum();
            //Toast.makeText(this,"oke",Toast.LENGTH_SHORT).show();
        });

        viewModel.getNum().observe(this,integer -> {
            binding.tvNum.setText(String.valueOf(integer));
        });
    }
}