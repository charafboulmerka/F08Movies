package com.f08movies.di.module;

import com.f08movies.ui.animes.EpisodesFragment;
import com.f08movies.ui.downloadmanager.ui.main.DownloadsFragment;
import com.f08movies.ui.downloadmanager.ui.main.FinishedDownloadsFragment;
import com.f08movies.ui.downloadmanager.ui.main.QueuedDownloadsFragment;
import com.f08movies.ui.home.HomeFragment;
import com.f08movies.ui.library.AnimesFragment;
import com.f08movies.ui.library.LibraryFragment;
import com.f08movies.ui.library.LibraryStyleFragment;
import com.f08movies.ui.library.MoviesFragment;
import com.f08movies.ui.library.NetworksFragment;
import com.f08movies.ui.library.NetworksFragment2;
import com.f08movies.ui.library.SeriesFragment;
import com.f08movies.ui.mylist.AnimesListFragment;
import com.f08movies.ui.mylist.ListFragment;
import com.f08movies.ui.mylist.MoviesListFragment;
import com.f08movies.ui.mylist.SeriesListFragment;
import com.f08movies.ui.mylist.StreamingListFragment;
import com.f08movies.ui.search.DiscoverFragment;
import com.f08movies.ui.settings.SettingsActivity;
import com.f08movies.ui.streaming.StreamingFragment;
import com.f08movies.ui.upcoming.UpComingFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/*
 * @author Yobex.
 * */
@Module
public abstract class FragmentBuildersModule {


    @ContributesAndroidInjector
    abstract EpisodesFragment contributeEpisodesFragment();

    @ContributesAndroidInjector
    abstract FinishedDownloadsFragment contributeFinishedDownloadsFragment();


    @ContributesAndroidInjector
    abstract QueuedDownloadsFragment contributeQueuedDownloadsFragment();

    @ContributesAndroidInjector
    abstract DownloadsFragment contributeDownloadsFragment();

    @ContributesAndroidInjector
    abstract HomeFragment contributeHomeFragment();

    @ContributesAndroidInjector
    abstract UpComingFragment contributeUpcomingFragment();

    @ContributesAndroidInjector
    abstract DiscoverFragment contributeDiscoverFragment();

    @ContributesAndroidInjector
    abstract MoviesFragment contributeMoviesFragment();


    @ContributesAndroidInjector
    abstract LibraryStyleFragment contributeLibraryStyleFragment();

    @ContributesAndroidInjector
    abstract SeriesFragment contributeSeriesFragment();

    @ContributesAndroidInjector
    abstract LibraryFragment contributeLibraryFragment();

    @ContributesAndroidInjector
    abstract MoviesListFragment contributeMyListMoviesFragment();

    @ContributesAndroidInjector
    abstract AnimesFragment contributeAnimesFragment();

    @ContributesAndroidInjector
    abstract StreamingFragment contributeLiveFragment();

    @ContributesAndroidInjector
    abstract SettingsActivity contributeSettingsFragment();

    @ContributesAndroidInjector
    abstract ListFragment contributeListFragment();

    @ContributesAndroidInjector
    abstract SeriesListFragment contributeSeriesListFragment();

    @ContributesAndroidInjector
    abstract AnimesListFragment contributeAnimesListFragment();


    @ContributesAndroidInjector
    abstract NetworksFragment contributeNetworksFragment();

    @ContributesAndroidInjector
    abstract NetworksFragment2 contributeNetworksFragment2();

    @ContributesAndroidInjector
    abstract StreamingListFragment contributeStreamingListFragment();

}
