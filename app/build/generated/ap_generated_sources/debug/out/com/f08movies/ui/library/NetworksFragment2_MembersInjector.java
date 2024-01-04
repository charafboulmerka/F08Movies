package com.f08movies.ui.library;

import androidx.lifecycle.ViewModelProvider;
import com.f08movies.data.repository.MediaRepository;
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
public final class NetworksFragment2_MembersInjector implements MembersInjector<NetworksFragment2> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<MediaRepository> mediaRepositoryProvider;

  public NetworksFragment2_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.mediaRepositoryProvider = mediaRepositoryProvider;
  }

  public static MembersInjector<NetworksFragment2> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<MediaRepository> mediaRepositoryProvider) {
    return new NetworksFragment2_MembersInjector(viewModelFactoryProvider, mediaRepositoryProvider);
  }

  @Override
  public void injectMembers(NetworksFragment2 instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectMediaRepository(instance, mediaRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.f08movies.ui.library.NetworksFragment2.viewModelFactory")
  public static void injectViewModelFactory(NetworksFragment2 instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.f08movies.ui.library.NetworksFragment2.mediaRepository")
  public static void injectMediaRepository(NetworksFragment2 instance,
      MediaRepository mediaRepository) {
    instance.mediaRepository = mediaRepository;
  }
}
