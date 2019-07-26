package com.yudha.ostry;

import android.app.Application;
import com.onesignal.OneSignal;

/**
 * Created by yudha on 25,July,2019
 */
public class ApplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
