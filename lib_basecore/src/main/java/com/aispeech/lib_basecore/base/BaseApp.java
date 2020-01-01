package com.aispeech.lib_basecore.base;

import android.app.Application;

/**
 * @创建者 luhaisheng
 * @创建时间 2020/1/1 21:17
 * @描述
 */
public abstract class BaseApp extends Application {
    /**
     * Application 初始化
     */
    public abstract void initModuleApp(Application application);

    /**
     * 所有 Application 初始化后的自定义操作
     */
    public abstract void initModuleData(Application application);
}
