package com.f08movies.ui.users;

import com.f08movies.data.repository.AuthRepository;
import com.f08movies.ui.manager.AuthManager;
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
public final class PhoneAuthActivity_MembersInjector implements MembersInjector<PhoneAuthActivity> {
  private final Provider<AuthRepository> authRepositoryProvider;

  private final Provider<AuthManager> authManagerProvider;

  private final Provider<TokenManager> tokenManagerProvider;

  public PhoneAuthActivity_MembersInjector(Provider<AuthRepository> authRepositoryProvider,
      Provider<AuthManager> authManagerProvider, Provider<TokenManager> tokenManagerProvider) {
    this.authRepositoryProvider = authRepositoryProvider;
    this.authManagerProvider = authManagerProvider;
    this.tokenManagerProvider = tokenManagerProvider;
  }

  public static MembersInjector<PhoneAuthActivity> create(
      Provider<AuthRepository> authRepositoryProvider, Provider<AuthManager> authManagerProvider,
      Provider<TokenManager> tokenManagerProvider) {
    return new PhoneAuthActivity_MembersInjector(authRepositoryProvider, authManagerProvider, tokenManagerProvider);
  }

  @Override
  public void injectMembers(PhoneAuthActivity instance) {
    injectAuthRepository(instance, authRepositoryProvider.get());
    injectAuthManager(instance, authManagerProvider.get());
    injectTokenManager(instance, tokenManagerProvider.get());
  }

  @InjectedFieldSignature("com.f08movies.ui.users.PhoneAuthActivity.authRepository")
  public static void injectAuthRepository(PhoneAuthActivity instance,
      AuthRepository authRepository) {
    instance.authRepository = authRepository;
  }

  @InjectedFieldSignature("com.f08movies.ui.users.PhoneAuthActivity.authManager")
  public static void injectAuthManager(PhoneAuthActivity instance, AuthManager authManager) {
    instance.authManager = authManager;
  }

  @InjectedFieldSignature("com.f08movies.ui.users.PhoneAuthActivity.tokenManager")
  public static void injectTokenManager(PhoneAuthActivity instance, TokenManager tokenManager) {
    instance.tokenManager = tokenManager;
  }
}
