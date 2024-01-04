package com.f08movies.di.module;

import com.f08movies.ui.animes.AnimeDetailsActivity;
import com.f08movies.ui.base.BaseActivity;
import com.f08movies.ui.casts.CastDetailsActivity;
import com.f08movies.ui.downloadmanager.ui.main.DownloadManagerFragment;
import com.f08movies.ui.login.LoginActivity;
import com.f08movies.ui.login.PasswordForget;
import com.f08movies.ui.moviedetails.MovieDetailsActivity;
import com.f08movies.ui.notifications.NotificationManager;
import com.f08movies.ui.payment.Payment;
import com.f08movies.ui.payment.PaymentDetails;
import com.f08movies.ui.payment.PaymentPaypal;
import com.f08movies.ui.payment.PaymentStripe;
import com.f08movies.ui.player.activities.EasyPlexMainPlayer;
import com.f08movies.ui.player.activities.EmbedActivity;
import com.f08movies.ui.profile.EditProfileActivity;
import com.f08movies.ui.register.RegisterActivity;
import com.f08movies.ui.register.RegistrationSucess;
import com.f08movies.ui.seriedetails.EpisodeDetailsActivity;
import com.f08movies.ui.seriedetails.SerieDetailsActivity;
import com.f08movies.ui.splash.SplashActivity;
import com.f08movies.ui.streaming.StreamingetailsActivity;
import com.f08movies.ui.trailer.TrailerPreviewActivity;
import com.f08movies.ui.upcoming.UpcomingTitlesActivity;
import com.f08movies.ui.users.PhoneAuthActivity;
import com.f08movies.ui.users.UserProfiles;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Binds all sub-components within the app. Add bindings for other sub-components here.
 * @ContributesAndroidInjector was introduced removing the need to:
 * a) Create separate components annotated with @Subcomponent (the need to define @Subcomponent classes.)
 * b) Write custom annotations like @PerActivity.
 *
 * @author Yobex.
 */
@Module
public abstract class ActivityModule {




    @ContributesAndroidInjector()
    abstract PhoneAuthActivity contributePhoneAuthActivity();

    @ContributesAndroidInjector()
    abstract UserProfiles contributeUserProfiles();

    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract BaseActivity contributeMainActivity();

    @ContributesAndroidInjector(modules = FragmentBuildersModule.class)
    abstract DownloadManagerFragment contributeMainActivityDown();

    @ContributesAndroidInjector()
    abstract Payment contributePayment();

    @ContributesAndroidInjector()
    abstract PaymentPaypal contributePaymentPaypal();

    @ContributesAndroidInjector()
    abstract PaymentStripe contributePaymentStripe();

    @ContributesAndroidInjector()
    abstract NotificationManager contributeNotificationManager();

    @ContributesAndroidInjector()
    abstract PaymentDetails contributePaymentDetails();

    @ContributesAndroidInjector()
    abstract RegistrationSucess contributeRegistrationSucess();

    @ContributesAndroidInjector()
    abstract EditProfileActivity contributeEditProfileActivity();

    @ContributesAndroidInjector()
    abstract MovieDetailsActivity contributeMovieDetailActivity();

    @ContributesAndroidInjector()
    abstract SerieDetailsActivity contributeSerieDetailActivity();

    @ContributesAndroidInjector()
    abstract LoginActivity contributeLoginActivity();

    @ContributesAndroidInjector()
    abstract RegisterActivity contributeRegisterActivity();

    @ContributesAndroidInjector()
    abstract TrailerPreviewActivity contributeTrailerPreviewActivity();

    @ContributesAndroidInjector()
    abstract UpcomingTitlesActivity contributeUpcomingTitlesActivity();

    @ContributesAndroidInjector()
    abstract AnimeDetailsActivity contributeAnimeDetailsActivity();

    @ContributesAndroidInjector()
    abstract SplashActivity contributeSplashActivity();

    @ContributesAndroidInjector()
    abstract EmbedActivity contributeEmbedActivity();

    @ContributesAndroidInjector()
    abstract EasyPlexMainPlayer contributeEasyPlexMainPlayer();

    @ContributesAndroidInjector()
    abstract PasswordForget contributePasswordForget();

    @ContributesAndroidInjector()
    abstract CastDetailsActivity contributeCastDetailsActivity();

    @ContributesAndroidInjector()
    abstract StreamingetailsActivity contributeStreamingetailsActivity();

    @ContributesAndroidInjector()
    abstract EpisodeDetailsActivity contributeEpisodeDetailsActivity();
}
