package com.acdesarrollo.acmvp.Views.Main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.acdesarrollo.acmvp.R;
import com.acdesarrollo.acmvp.Views.Login.LoginView;

public class MainActivity extends AppCompatActivity implements MainView {

    static final String LOGTAG = MainActivity.class.getSimpleName();

    private TextView mUserName;

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenterImpl(this, getApplicationContext());
        mainPresenter.initView();

        //La variable aux no hace falta es ejemplo
        String aux = "Hola " + getIntent().getStringExtra("UserName");
        mUserName.setText(aux);
    }

    @Override
    public void initView() {
        mUserName = (TextView) findViewById(R.id.userName);

    }

    @Override
    protected void onDestroy() {
        mainPresenter.onDestroy();
        super.onDestroy();
    }


}
