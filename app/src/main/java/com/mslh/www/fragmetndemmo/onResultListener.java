package com.mslh.www.fragmetndemmo;

/**
 * Fragment处理结果回复的监听类
 */
public interface onResultListener {
    /**
     * 处理结果回调方法
     * @param o
     * @param Error
     */
    void onGetResult(Object o,int Error);
}
