package com.liau.mvvm_volley;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.liau.mvvm_volley.data.DataRepository;

/**
 * Created by Budiliauw87 on 2021-01-05.
 * budiliauw87.github.io
 * Budiliauw87@gmail.com
 */
public class MainViewModel extends ViewModel {
    private DataRepository dataRepository;

    public MainViewModel(DataRepository repository) {
        this.dataRepository = repository;
    }

    public LiveData<Integer> getNum() {
        return dataRepository.getNum();
    }

    public void increaseNum() {
        dataRepository.increaseNum();
    }
}
