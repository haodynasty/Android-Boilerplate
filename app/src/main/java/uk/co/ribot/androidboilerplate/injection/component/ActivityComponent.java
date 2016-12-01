package uk.co.ribot.androidboilerplate.injection.component;

import dagger.Subcomponent;
import uk.co.ribot.androidboilerplate.injection.PerActivity;
import uk.co.ribot.androidboilerplate.injection.module.ActivityModule;
import uk.co.ribot.androidboilerplate.ui.main.MainActivity;

/**
 * This component inject dependencies to all Activities across the application
 * 子Component，它同时拥有父Component的作用域application和自己的作用域activity.使用时必须在父Component-ConfigPersistentComponent中返回自己
 */
@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    //必须要是具体的Activity，否则会注入失败
    void inject(MainActivity mainActivity);

    //在下面添加其他需要注入的Activity

}
