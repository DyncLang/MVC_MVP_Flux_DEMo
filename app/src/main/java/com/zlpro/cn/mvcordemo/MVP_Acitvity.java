package com.zlpro.cn.mvcordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zlpro.cn.mvcordemo.MVP.View.inter.IUserView;
import com.zlpro.cn.mvcordemo.MVP.presenter.UserPresenter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MVP_Acitvity extends AppCompatActivity implements View.OnClickListener, IUserView {
    @Bind(R.id.btn_save)
    Button btnSave;

    @Bind(R.id.btn_get)
    Button btnGet;

    @Bind(R.id.tv_show_mvp)
    TextView tvShowMvp;

    public UserPresenter userPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp__acitvity);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    private void initData() {
        userPresenter = new UserPresenter(this);
    }

    private void initView() {


        btnSave.setOnClickListener(this);
        btnGet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_get:
                userPresenter.loadUser(123);
                break;
            case R.id.btn_save:
                break;
        }
    }


    /**
     * View实现类，用于更新Ui
     *
     * @return
     */
    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getFristName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setFirstName(String firstName) {
        tvShowMvp.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {

    }
}
