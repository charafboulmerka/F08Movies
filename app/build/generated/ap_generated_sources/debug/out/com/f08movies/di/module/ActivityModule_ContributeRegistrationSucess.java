package com.f08movies.di.module;

import com.f08movies.ui.register.RegistrationSucess;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents = ActivityModule_ContributeRegistrationSucess.RegistrationSucessSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributeRegistrationSucess {
  private ActivityModule_ContributeRegistrationSucess() {}

  @Binds
  @IntoMap
  @ClassKey(RegistrationSucess.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RegistrationSucessSubcomponent.Factory builder);

  @Subcomponent
  public interface RegistrationSucessSubcomponent extends AndroidInjector<RegistrationSucess> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RegistrationSucess> {}
  }
}
