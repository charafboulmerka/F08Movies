package com.f08movies.di;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.f08movies.ui.viewmodels.AnimeViewModel;
import com.f08movies.ui.viewmodels.CastersViewModel;
import com.f08movies.ui.viewmodels.HomeViewModel;
import com.f08movies.ui.viewmodels.GenresViewModel;
import com.f08movies.ui.viewmodels.LoginViewModel;
import com.f08movies.ui.viewmodels.MovieDetailViewModel;
import com.f08movies.ui.viewmodels.MoviesListViewModel;
import com.f08movies.ui.viewmodels.NetworksViewModel;
import com.f08movies.ui.viewmodels.PlayerViewModel;
import com.f08movies.ui.viewmodels.RegisterViewModel;
import com.f08movies.ui.viewmodels.SearchViewModel;
import com.f08movies.ui.viewmodels.SerieDetailViewModel;
import com.f08movies.ui.viewmodels.SettingsViewModel;
import com.f08movies.ui.viewmodels.StreamingDetailViewModel;
import com.f08movies.ui.viewmodels.StreamingGenresViewModel;
import com.f08movies.ui.viewmodels.UpcomingViewModel;
import com.f08movies.ui.viewmodels.UserViewModel;
import com.f08movies.viewmodel.MoviesViewModelFactory;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/*
 * @author Yobex.
 * */
@Module
public abstract class ViewModelModule {



    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel bindUserViewModel(UserViewModel userViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindHomeViewModel(HomeViewModel homeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(UpcomingViewModel.class)
    abstract ViewModel bindUpcomingViewModel(UpcomingViewModel upcomingViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(MovieDetailViewModel.class)
    abstract ViewModel bindMovieDetailViewModel(MovieDetailViewModel movieDetailViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SerieDetailViewModel.class)
    abstract ViewModel bindSerieDetailViewModel(SerieDetailViewModel serieDetailViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel.class)
    abstract ViewModel bindSearchViewModel(SearchViewModel searchViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel.class)
    abstract ViewModel bindLoginViewModel(LoginViewModel loginViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(RegisterViewModel.class)
    abstract ViewModel bindRegisterViewModel(RegisterViewModel registerViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(GenresViewModel.class)
    abstract ViewModel bindGenresViewModel(GenresViewModel genresViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(SettingsViewModel.class)
    abstract ViewModel bindSettingsViewModel(SettingsViewModel settingsViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(MoviesListViewModel.class)
    abstract ViewModel bindMoviesListViewModel(MoviesListViewModel moviesListViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(AnimeViewModel.class)
    abstract ViewModel bindAnimeViewModel(AnimeViewModel animeViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(StreamingDetailViewModel.class)
    abstract ViewModel bindStreamingDetailViewModel(StreamingDetailViewModel streamingDetailViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(StreamingGenresViewModel.class)
    abstract ViewModel bindStreamingGenresViewModel(StreamingGenresViewModel streamingGenresViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PlayerViewModel.class)
    abstract ViewModel bindStreamingPlayerViewModel(PlayerViewModel playerViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(CastersViewModel.class)
    abstract ViewModel bindCastersViewModel(CastersViewModel castersViewModel);


    @Binds
    @IntoMap
    @ViewModelKey(NetworksViewModel.class)
    abstract ViewModel bindNetworksViewModel(NetworksViewModel networksViewModel);


    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(MoviesViewModelFactory factory);


}
