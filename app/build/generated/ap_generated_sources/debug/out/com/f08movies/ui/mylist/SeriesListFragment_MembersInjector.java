package com.f08movies.ui.mylist;

import androidx.lifecycle.ViewModelProvider;
import com.f08movies.data.repository.AuthRepository;
import com.f08movies.data.repository.MediaRepository;
import com.f08movies.ui.manager.SettingsManager;
import com.f08movies.ui.manager.TokenManager;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SeriesListFragment_MembersInjector implements MembersInjector<SeriesListFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public SeriesListFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<SeriesListFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider,
      Provider<AuthRepository> authRepositoryProvider, Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new SeriesListFragment_MembersInjector(viewModelFactoryProvider, mediaRepositoryProvider, authRepositoryProvider, tokenManagerProvider, settingsManagerProvider);
  }

  @Override
  public void injectMembers(SeriesListFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.f08movies.ui.mylist.SeriesListFragment.viewModelFactory")
  public static void injectViewModelFactory(SeriesListFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.f08movies.ui.mylist.SeriesListFragment.mediaRepository")
  public static void injectMediaRepository(SeriesListFragment instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }

  @InjectedFieldSignature("com.f08movies.ui.mylist.SeriesListFragment.authRepository")
  public static void injectAuthRepository(SeriesListFragment instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.f08movies.ui.mylist.SeriesListFragment.tokenManager")
  public static void injectTokenManager(SeriesListFragment instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.f08movies.ui.mylist.SeriesListFragment.settingsManager")
  public static void injectSettingsManager(SeriesListFragment instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
