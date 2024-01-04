package com.f08movies.ui.login;

import android.content.SharedPreferences;
import androidx.lifecycle.ViewModelProvider;
import com.f08movies.data.repository.AuthRepository;
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
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public LoginActivity_MembersInjector(Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.sharedPreferencesEditorProvider = sharedPreferencesEditorProvider;
    this.tokenManagerProvider = tokenManagerProvider;
    this.settingsManagerProvider = settingsManagerProvider;
    this.authRepositoryProvider = authRepositoryProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<SharedPreferences.Editor> sharedPreferencesEditorProvider,
      Provider<TokenManager> tokenManagerProvider,
      Provider<SettingsManager> settingsManagerProvider,
      Provider<AuthRepository> authRepositoryProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new LoginActivity_MembersInjector(sharedPreferencesProvider, sharedPreferencesEditorProvider, tokenManagerProvider, settingsManagerProvider, authRepositoryProvider, viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectSharedPreferencesEditor(instance, sharedPreferencesEditorProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.f08movies.ui.login.LoginActivity.sharedPreferences")
  public static void injectSharedPreferences(LoginActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.f08movies.ui.login.LoginActivity.sharedPreferencesEditor")
  public static void injectSharedPreferencesEditor(LoginActivity instance,
      SharedPreferences.Editor sharedPreferencesEditor) {
    instance.sharedPreferencesEditor = sharedPreferencesEditor;
  }

  @InjectedFieldSignature("com.f08movies.ui.login.LoginActivity.tokenManager")
  public static void injectTokenManager(LoginActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }

  @InjectedFieldSignature("com.f08movies.ui.login.LoginActivity.settingsManager")
  public static void injectSettingsManager(LoginActivity instance,
      SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }

  @InjectedFieldSignature("com.f08movies.ui.login.LoginActivity.authRepository")
  public static void injectAuthRepository(LoginActivity instance, AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.f08movies.ui.login.LoginActivity.viewModelFactory")
  public static void injectViewModelFactory(LoginActivity instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
