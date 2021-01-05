package com.liau.mvvm_volley.data;

import androidx.lifecycle.LiveData;

/**
 * Created by Budiliauw87 on 2021-01-05.
 * budiliauw87.github.io
 * Budiliauw87@gmail.com
 */
public interface DataSource {
    LiveData<Integer> getNum();
    void increaseNum();
}
