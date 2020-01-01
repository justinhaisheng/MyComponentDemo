package com.aispeech.login;

import android.app.Application;

import com.aispeech.lib_basecomponent.service.ServiceFactory;
import com.aispeech.lib_basecore.base.BaseApp;


public class LoginApp extends BaseApp {

    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setILoginService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
