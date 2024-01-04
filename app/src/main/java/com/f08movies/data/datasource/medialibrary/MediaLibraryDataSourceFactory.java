package com.f08movies.data.datasource.medialibrary;

import androidx.annotation.NonNull;
import androidx.paging.DataSource;

import com.f08movies.data.datasource.genreslist.MoviesGenreListDataSource;
import com.f08movies.data.local.entity.Media;
import com.f08movies.ui.manager.SettingsManager;

public class MediaLibraryDataSourceFactory extends DataSource.Factory {

    private final String query;

    private final SettingsManager settingsManager;

    public MediaLibraryDataSourceFactory(String query,SettingsManager settingsManager) {
        this.settingsManager = settingsManager;
        this.query = query;

    }

    @NonNull
    @Override
    public DataSource<Integer, Media> create() {
        return new MoviesGenreListDataSource(query, settingsManager);
    }

}
