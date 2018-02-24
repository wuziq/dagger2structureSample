package cof.gof.dagger2structure;

import cof.gof.dagger2structure.mainActivity.MainActivity;
import cof.gof.dagger2structure.secondaryActivity.SecondaryActivity;
import cof.gof.dagger2structure.testModules.FlombulatorTestModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class TestBindingModule {
    @ContributesAndroidInjector(modules = FlombulatorTestModule.class)
    abstract MainActivity contributesTestMainActivityInjector();

    @ContributesAndroidInjector(modules = FlombulatorTestModule.class)
    abstract SecondaryActivity contributesSecondaryActivityInjector();
}