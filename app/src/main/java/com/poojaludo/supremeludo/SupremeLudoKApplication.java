package com.poojaludo.supremeludo;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sdk.perelander.Mob;
import com.sdk.perelander.MobConfig;

public class SupremeLudoKApplication extends Application {

    public MobConfig config;

    @Override
    public void onCreate() {
        super.onCreate();

        config = new MobConfig(this, "8y6aqpdkd2io","igkf2r");
        Mob.onCreate(config);
        registerActivityLifecycleCallbacks(new MobLifecycleCallbacks());

    }

    private static final class MobLifecycleCallbacks implements ActivityLifecycleCallbacks {
        @Override
        public void onActivityResumed(Activity activity) {
            Mob.onResume(activity);
        }
        @Override
        public void onActivityPaused(Activity activity) {
            Mob.onPause();
        }
        @Override
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {
        }
        @Override
        public void onActivityStarted(@NonNull Activity activity) {
        }
        @Override
        public void onActivityStopped(@NonNull Activity activity) {
        }
        @Override
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {
        }
        @Override
        public void onActivityDestroyed(@NonNull Activity activity) {
        }
    }



}
