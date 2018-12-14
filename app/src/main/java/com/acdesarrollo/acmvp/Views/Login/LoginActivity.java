package com.acdesarrollo.acmvp.Views.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.acdesarrollo.acmvp.R;

/****
 * Mayormente uso butterknife para los controles
 */
public class LoginActivity extends AppCompatActivity implements LoginView {

    static final String LOGTAG = LoginActivity.class.getSimpleName();

    private Button mLoginButton;
    //El uso de este progressBar es solo ilustrativo.
    //Me gusta más la libreria MaterialDialog
    private ProgressBar mLoginProgressBar;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresenter = new LoginPresenterImpl(this, getApplicationContext());
        loginPresenter.initView();

    }

    @Override
    public void onUserNameError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPasswordError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onError(String error) {
        Toast.makeText(getApplicationContext(), error, Toast.LENGTH_SHORT).show();
        mLoginProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void initView() {
        //Se inician todos los controles
        mLoginButton = (Button) findViewById(R.id.loginButton);
        mLoginProgressBar = (ProgressBar) findViewById(R.id.loginProgressBar);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                mLoginProgressBar.setVisibility(View.VISIBLE);
                loginPresenter.onLoginClicked("Mateo", "12345678");
            }
        });
    }

    @Override
    protected void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onSuccess() {
        mLoginProgressBar.setVisibility(View.GONE);
    }
}
