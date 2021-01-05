package com.liau.mvvm_volley.viewmodel;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.liau.mvvm_volley.MainViewModel;
import com.liau.mvvm_volley.data.DataRepository;

/**
 * Created by Budiliauw87 on 2021-01-05.
 * budiliauw87.github.io
 * Budiliauw87@gmail.com
 */
public class ViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    private static volatile ViewModelFactory INSTANCE;
    private final DataRepository dataRepository;

    private ViewModelFactory(DataRepository repository) {
        this.dataRepository = repository;
    }

    public static ViewModelFactory getInstance(Context context) {
        if (INSTANCE == null)
            synchronized (ViewModelFactory.class){
                if (INSTANCE == null)
                    INSTANCE = new ViewModelFactory(Injection.provideRepository(context));
            }

        return INSTANCE;
    }

    //inject dataRepository to your viewmodel class here
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if(modelClass.isAssignableFrom(MainViewModel.class)){
            return (T) new MainViewModel(dataRepository);
        }
        throw new IllegalArgumentException("Unknown ViewModel class : "+ modelClass);

    }



}
