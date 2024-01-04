package com.f08movies.di.module;

import com.f08movies.ui.payment.PaymentPaypal;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(subcomponents = ActivityModule_ContributePaymentPaypal.PaymentPaypalSubcomponent.class)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class ActivityModule_ContributePaymentPaypal {
  private ActivityModule_ContributePaymentPaypal() {}

  @Binds
  @IntoMap
  @ClassKey(PaymentPaypal.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PaymentPaypalSubcomponent.Factory builder);

  @Subcomponent
  public interface PaymentPaypalSubcomponent extends AndroidInjector<PaymentPaypal> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PaymentPaypal> {}
  }
}
