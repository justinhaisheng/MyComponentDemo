package com.aispeech.lib_basecomponent.service.Login;

import android.app.Activity;
import android.os.Bundle;

import com.aispeech.lib_basecomponent.service.i.ILoginService;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/**
 * @创建者 luhaisheng
 * @创建时间 2020/1/1 21:04
 * @描述 空实现
 *
 *
 */
public class EmptyLoginService implements ILoginService {
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }

    @Override
    public Fragment newUserFragment(Activity activity, int containerId, FragmentManager manager, Bundle bundle, String tag) {
        return null;
    }




}
