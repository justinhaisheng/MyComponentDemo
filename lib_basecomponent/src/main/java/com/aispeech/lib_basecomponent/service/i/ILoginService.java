package com.aispeech.lib_basecomponent.service.i;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/**
 * @创建者 luhaisheng
 * @创建时间 2020/1/1 21:01
 * @描述 登录组件
 */
public interface ILoginService {

    boolean isLogin();
    String getAccountId();
    /**
     * 创建 UserFragment
     * @param activity
     * @param containerId
     * @param manager
     * @param bundle
     * @param tag
     * @return
     */
    Fragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle, String tag);


}
