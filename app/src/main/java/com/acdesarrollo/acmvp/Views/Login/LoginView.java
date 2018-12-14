package com.acdesarrollo.acmvp.Views.Login;

import com.acdesarrollo.acmvp.Views.Base.BaseView;

public interface LoginView extends BaseView {

    void onUserNameError(String error);

    void onPasswordError(String error);

    void onError(String error);

    void onSuccess();

}
