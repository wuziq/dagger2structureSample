package cof.gof.dagger2structure;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(
        modules = {
                AndroidInjectionModule.class,
                BindingModule.class
        })
public interface MyApplicationComponent {

    void inject(Dagger2application dagger2application);
}
