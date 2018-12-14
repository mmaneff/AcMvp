package com.acdesarrollo.acmvp.Views.Main;

import android.content.Context;

public class MainPresenterImpl implements MainPresenter {

    static final String LOGTAG = MainPresenterImpl.class.getSimpleName();

    private Context mContext;
    private MainView mView;

    public  MainPresenterImpl(MainView view, Context context) {
        mView = view;
        mContext = context;
    }


    @Override
    public void initView() {
        if(mView != null) {
            mView.initView();
        }
    }

    @Override
    public void onDestroy() {
        mView = null;
    }

}
