package com.acdesarrollo.acmvp.Views.Login;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

import com.acdesarrollo.acmvp.Views.Main.MainActivity;

public class LoginPresenterImpl implements LoginPresenter {

    static final String LOGTAG = LoginPresenterImpl.class.getSimpleName();

    private Context mContext;
    private LoginView mView;

    public  LoginPresenterImpl(LoginView view, Context context) {
        mView = view;
        mContext = context;
    }


    @Override
    public void onLoginClicked(String userName, String password) {
        if (TextUtils.isEmpty(userName)) {
            mView.onUserNameError("Nombre de usuario requerido");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            mView.onPasswordError("Contraseña requerida");
            return;
        }

        openMainActivity(userName);

    }

    private void openMainActivity(String userName) {
        try {
            Thread.sleep(2000);

            mView.onSuccess();
            Intent intent = new Intent(mContext, MainActivity.class);
            intent.putExtra("UserName", userName);
            mContext.startActivity(intent);
        } catch (Exception e) {
            Log.e(LOGTAG, e.getMessage());
            mView.onError("Error inesperado");
        }
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
