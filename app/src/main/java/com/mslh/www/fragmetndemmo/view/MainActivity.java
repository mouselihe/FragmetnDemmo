package com.mslh.www.fragmetndemmo.view;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.mslh.www.fragmetndemmo.Fragment.HomeFriagment;
import com.mslh.www.fragmetndemmo.Fragment.MoreFragment;
import com.mslh.www.fragmetndemmo.GloableParams;
import com.mslh.www.fragmetndemmo.R;
import com.mslh.www.fragmetndemmo.util.UIManger;

public class MainActivity extends FragmentActivity implements View.OnClickListener{
    private HomeFriagment homeFragment;
    private ImageView home;
    private ImageView channe;
    private ImageView search;
    private ImageView my;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.il_main);
        GloableParams.MAIN=this;
        init();
        setViewListener();
    }

    /**
     * 设置控件监听
     */
    private void setViewListener() {
        home.setOnClickListener(this);
        channe.setOnClickListener(this);
        search.setOnClickListener(this);
        my.setOnClickListener(this);
    }
    /**
     * 初始化控件
     */
    private void init() {
        addHome();
        initBottomView();
    }
    /**
     * 初始化 底部菜单
     */
    private void initBottomView() {
        home=(ImageView)findViewById(R.id.iv_HomePage);
        channe=(ImageView)findViewById(R.id.iv_channel);
        search=(ImageView)findViewById(R.id.iv_search);
        my=(ImageView)findViewById(R.id.iv_my);
        title=(TextView)findViewById(R.id.il_title_content);
        title.setText("首页");
    }
    private void addHome() {
        UIManger.getinstance().changerFragment(new HomeFriagment(),true,null);
//        transaction.add(R.id.rl_middle,homeFragment);// 此方法在添加一个新的Fragment的方法时，不会把之前的Fragment给销毁掉，两个会同时会显示
//        transaction.replace(R.id.rl_middle,homeFragment); 此方法显示之前把已经存在的Fragment给销毁掉
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_HomePage:
                break;
            case R.id.iv_channel:
                addMore();
                break;
            case R.id.iv_search:
                break;
            case R.id.iv_my:
                break;
        }
    }

    /**
     * 更多按钮
     */
    private void addMore() {
        UIManger.getinstance().changerFragment(new MoreFragment(),true,null);
    }
}
