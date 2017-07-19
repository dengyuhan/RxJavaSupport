package com.dyhdyh.rxjava.support.action;

import android.view.View;

import com.dyhdyh.widget.loading.bar.LoadingBar;

/**
 * author  dengyuhan
 * created 2017/7/19 17:04
 */
public class LoadingBarShowAction implements ILoadingShow {
    protected View mParent;

    public LoadingBarShowAction(View parent) {
        this.mParent = parent;
    }

    @Override
    public void show(CharSequence message) {
        LoadingBar.make(mParent).show();
    }
}