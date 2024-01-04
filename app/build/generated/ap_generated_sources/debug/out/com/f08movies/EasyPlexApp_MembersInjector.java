package com.f08movies;

import android.content.SharedPreferences;
import com.f08movies.ui.manager.SettingsManager;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
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
public final class EasyPlexApp_MembersInjector implements MembersInjector<EasyPlexApp> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<SettingsManager> settingsManagerProvider;

  public EasyPlexApp_MembersInjector(Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.androidInjectorProvider = androidInjectorProvider;
    this.settingsManagerProvider = settingsManagerProvider;
  }

  public static MembersInjector<EasyPlexApp> create(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<SettingsManager> settingsManagerProvider) {
    return new EasyPlexApp_MembersInjector(sharedPreferencesProvider, androidInjectorProvider, settingsManagerProvider);
  }

  @Override
  public void injectMembers(EasyPlexApp instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectAndroidInjector(instance, androidInjectorProvider.get());
    injectSettingsManager(instance, settingsManagerProvider.get());
  }

  @InjectedFieldSignature("com.f08movies.EasyPlexApp.sharedPreferences")
  public static void injectSharedPreferences(EasyPlexApp instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.f08movies.EasyPlexApp.androidInjector")
  public static void injectAndroidInjector(EasyPlexApp instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }

  @InjectedFieldSignature("com.f08movies.EasyPlexApp.settingsManager")
  public static void injectSettingsManager(EasyPlexApp instance, SettingsManager settingsManager) {
    instance.settingsManager = settingsManager;
  }
}
