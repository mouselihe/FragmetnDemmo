package com.mslh.www.fragmetndemmo.Fragment;


import android.support.v4.app.Fragment;

import com.mslh.www.fragmetndemmo.onResultListener;
import com.mslh.www.fragmetndemmo.util.Consts;

public class BaseFragment extends Fragment implements onResultListener{
    @Override
    public void onGetResult(Object o, int Error) {
        if (Consts.ERROR==Error&& o!=null){

        }
    }
}
