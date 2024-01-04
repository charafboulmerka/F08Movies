package com.f08movies.di.module;

import com.f08movies.ui.mylist.AnimesListFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import javax.annotation.processing.Generated;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeAnimesListFragment.AnimesListFragmentSubcomponent.class
)
@Generated("dagger.android.processor.AndroidProcessor")
public abstract class FragmentBuildersModule_ContributeAnimesListFragment {
  private FragmentBuildersModule_ContributeAnimesListFragment() {}

  @Binds
  @IntoMap
  @ClassKey(AnimesListFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      AnimesListFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface AnimesListFragmentSubcomponent extends AndroidInjector<AnimesListFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<AnimesListFragment> {}
  }
}
