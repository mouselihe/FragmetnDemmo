package com.mslh.www.fragmetndemmo.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;

import com.mslh.www.fragmetndemmo.R;

/**
 *信息提示管理器
 */

public class PromptManger {
    //进度条对话框
    private static ProgressDialog dialog;

    /**
     * 进度条对话框
     * @param context
     */
    public static void showProgressDialog(Context context,String title,int Icon,String message){
        dialog = new ProgressDialog(context);
        dialog.setTitle(title);
        dialog.setIcon(Icon);
        dialog.setMessage(message);
        dialog.show();
    }
}
