package com.zlpro.cn.mvcordemo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.zlpro.cn.mvcordemo.MVC.bean.GanIoAndroid;
import com.zlpro.cn.mvcordemo.MVC.model.WeatherModelImpl;
import com.zlpro.cn.mvcordemo.MVC.model.inter.IWeatherModel;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements WeatherModelImpl.IOnWeatherListerner {

    @Bind(R.id.et_number)
    EditText etNumber;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.tv_show)
    TextView tvShow;
    @Bind(R.id.btn_mvpp)
    Button btnMvp;

    IWeatherModel weatherModel;
    ProgressDialog loadingDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        weatherModel = new WeatherModelImpl();
        initView();

    }

    private void initView() {
        button.setOnClickListener(goClickLister);
        btnMvp.setOnClickListener(goMvpClickLister);
        loadingDialog = new ProgressDialog(this);
        loadingDialog.setTitle("加载天气中...");
        loadingDialog.show();
    }

    View.OnClickListener goClickLister = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //发送请求数据
            weatherModel.getWriter("测试", MainActivity.this);
            loadingDialog.onStart();
        }
    };

    View.OnClickListener goMvpClickLister = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, MVP_Acitvity.class);
            startActivity(intent);
        }
    };


    private void disPlay(GanIoAndroid ganio) {
        List<GanIoAndroid.AndroidEnity> android = ganio.getAndroid();
        Log.e("main", "disPlay: " + android.get(1).toString());
        tvShow.setText("请求成功");
    }


    /**
     * 成功后 回调这两个方法
     *
     * @param ganio
     */
    @Override
    public void onSuccess(GanIoAndroid ganio) {
        //成功以后执行相应的方法
        loadingDialog.dismiss();
        disPlay(ganio);
    }


    @Override
    public void onFail() {
        Log.e("main", "onFail: ");
    }
}
