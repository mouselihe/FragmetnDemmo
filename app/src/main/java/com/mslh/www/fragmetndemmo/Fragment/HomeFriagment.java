package com.mslh.www.fragmetndemmo.Fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mslh.www.fragmetndemmo.R;
import com.mslh.www.fragmetndemmo.util.Consts;
import com.mslh.www.fragmetndemmo.util.PromptManger;

public class HomeFriagment extends BaseFragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("Fragment","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Fragment","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.v("Fragment","oncreateView");
        View view = inflater.inflate(R.layout.il_home,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v("Fragment","onActivityCrated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v("Fragment","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("Fragment","onResum");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("Fragment","onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("Fragment","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("Fragment","onDestoryView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("Fragment","onDestory");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("Fragment","onDetach");
    }

    @Override
    public void onGetResult(Object o, int resultCode) {
        if (resultCode== Consts.SUCCEED && o!=null){

        }else{
            //getActivity  当前仅有的Activty
            PromptManger.showProgressDialog(getActivity(),"首页",R.id.pb_loading,"服务器忙，请骚等..........");
        }
        super.onGetResult(o, resultCode);
    }
}
