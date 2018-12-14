package com.acdesarrollo.acmvp.Views.Login;

import com.acdesarrollo.acmvp.Views.Base.BasePresenter;

public interface LoginPresenter extends BasePresenter {

    void onLoginClicked(String userName, String password);

}
