package com.f08movies.data.datasource.anime;

import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

import com.f08movies.data.local.entity.Media;
import com.f08movies.data.remote.ApiInterface;
import com.f08movies.ui.manager.SettingsManager;

import javax.inject.Inject;

public class AnimeDataSourceFactory extends DataSource.Factory {

    private final MutableLiveData<PageKeyedDataSource<Integer, Media>> animeLiveDataSource = new MutableLiveData<>();

    private final ApiInterface requestInterface;
    private final SettingsManager settingsManager;

    @Inject
    public AnimeDataSourceFactory(ApiInterface requestInterface,SettingsManager settingsManager) {
        this.requestInterface = requestInterface;
        this.settingsManager = settingsManager;
    }

    @Override
    public DataSource create() {

        AnimeDataSource animeDataSource = new AnimeDataSource(requestInterface,settingsManager);
        animeLiveDataSource.postValue(animeDataSource);

        return animeDataSource;

    }

    public MutableLiveData<PageKeyedDataSource<Integer, Media>> getItemLiveDataSource3() {
        return animeLiveDataSource;
    }

}
