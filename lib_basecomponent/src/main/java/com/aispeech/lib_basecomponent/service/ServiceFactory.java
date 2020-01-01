package com.aispeech.lib_basecomponent.service;

import com.aispeech.lib_basecomponent.service.Login.EmptyLoginService;
import com.aispeech.lib_basecomponent.service.i.ILoginService;

/**
 * @创建者 luhaisheng
 * @创建时间 2020/1/1 21:04
 * @描述 工厂类
 *
 */
public class ServiceFactory {
    /*
    *登录组件
    *@author luhaisheng
    *@time 2020/1/1 21:10
    */
    private ILoginService mIALoginService;

    private ServiceFactory(){

    }

    private static class ServiceFactoryInner{
        private static ServiceFactory sSERVICEFACTORY = new ServiceFactory();
    }

    public static ServiceFactory getInstance(){ return  ServiceFactoryInner.sSERVICEFACTORY;}

    public void setILoginService(ILoginService iLoginService){
        this.mIALoginService = iLoginService;
    }

    public ILoginService getILoginServic(){
        if (mIALoginService == null){
            return new EmptyLoginService();
        }else{
            return mIALoginService;
        }
    }

}
