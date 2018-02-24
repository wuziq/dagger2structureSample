package cof.gof.dagger2structure;

import cof.gof.dagger2structure.diModules.FlombulatorModule;
import cof.gof.dagger2structure.mainActivity.MainActivity;
import cof.gof.dagger2structure.secondaryActivity.SecondaryActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class BindingModule {
    @ContributesAndroidInjector(modules = {FlombulatorModule.class})
    abstract MainActivity contributesMainActivityInjector();

    @ContributesAndroidInjector(modules = {FlombulatorModule.class})
    abstract SecondaryActivity contributesSecondaryActivityInjector();
}
