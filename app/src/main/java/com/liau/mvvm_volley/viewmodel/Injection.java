package com.liau.mvvm_volley.viewmodel;

import android.content.Context;

import com.liau.mvvm_volley.data.DataRepository;

/**
 * Created by Budiliauw87 on 2021-01-05.
 * budiliauw87.github.io
 * Budiliauw87@gmail.com
 */
public class Injection {
    public static DataRepository provideRepository(Context context) {
        return DataRepository.getInstance();
    }
}
