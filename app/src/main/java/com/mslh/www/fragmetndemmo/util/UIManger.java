package com.mslh.www.fragmetndemmo.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.transition.Transition;

import com.mslh.www.fragmetndemmo.GloableParams;
import com.mslh.www.fragmetndemmo.R;

/**
 * 中间容器的管理工具
 */
public class UIManger {
    private static UIManger uiManger = new UIManger();

    public static UIManger getinstance(){
        return uiManger;
    }

    public void changerFragment(Fragment fragment, boolean isAddBackStack, Bundle bundle){
        if (bundle != null){
            fragment.setArguments(bundle);
        }
        FragmentManager manger = GloableParams.MAIN.getSupportFragmentManager();
        FragmentTransaction transition=manger.beginTransaction();
        transition.replace(R.id.rl_middle,fragment);

        if (isAddBackStack){//判断是否允许添加到返回堆中
            transition.addToBackStack(null);
        }
        transition.commit();
    }



























}
