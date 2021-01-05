package com.liau.mvvm_volley.data;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/**
 * Created by Budiliauw87 on 2021-01-05.
 * budiliauw87.github.io
 * Budiliauw87@gmail.com
 */

public class DataRepository implements DataSource {
    private volatile static DataRepository INSTANCE = null;
    private MutableLiveData<Integer> integerLiveData = new MutableLiveData<>();
    private DataRepository() {
    }

    public static DataRepository getInstance(){
        if(INSTANCE == null)
            synchronized (DataRepository.class){
                if(INSTANCE == null)
                    INSTANCE = new DataRepository();
            }
        return INSTANCE;
    }

    @Override
    public LiveData<Integer> getNum() {
        integerLiveData.setValue(0);
        return integerLiveData;
    }

    @Override
    public void increaseNum() {
        final int currentNum = integerLiveData.getValue();
        integerLiveData.postValue(currentNum+1);
    }

}
