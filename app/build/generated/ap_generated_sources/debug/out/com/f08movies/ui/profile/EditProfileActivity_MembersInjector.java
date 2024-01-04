package com.f08movies.ui.profile;

import androidx.lifecycle.ViewModelProvider;
import com.f08movies.data.repository.AuthRepository;
import com.f08movies.ui.manager.AuthManager;
import com.f08movies.ui.manager.SettingsManager;
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
public final class EditProfileActivity_MembersInjector implements MembersInjector<EditProfileActivity> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<AuthManager> authManagerProvider;

  public EditProfileActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider, Provider<AuthManager> authManagerProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.authManagerProvider = authManagerProvider;
  }

  public static MembersInjector<EditProfileActivity> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider, Provider<AuthManager> authManagerProvider) {
    return new EditProfileActivity_MembersInjector(viewModelFactoryProvider, settingsManagerProvider, authRepositoryProvider, authManagerProvider);
  }

  @Override
  public void injectMembers(EditProfileActivity instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
  }

  @InjectedFieldSignature("com.f08movies.ui.profile.EditProfileActivity.viewModelFactory")
  public static void injectViewModelFactory(EditProfileActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }

  @InjectedFieldSignature("com.f08movies.ui.profile.EditProfileActivity.settingsManager")
  public static void injectSettingsManager(EditProfileActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.f08movies.ui.profile.EditProfileActivity.authRepository")
  public static void injectAuthRepository(EditProfileActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.f08movies.ui.profile.EditProfileActivity.authManager")
  public static void injectAuthManager(EditProfileActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }
}
