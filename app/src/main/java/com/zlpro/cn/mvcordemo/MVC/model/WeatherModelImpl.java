package com.zlpro.cn.mvcordemo.MVC.model;

import android.util.Log;

import com.google.gson.Gson;
import com.squareup.okhttp.Request;
import com.zlpro.cn.mvcordemo.MVC.bean.GanIoAndroid;
import com.zlpro.cn.mvcordemo.MVC.model.inter.IWeatherModel;
import com.zlpro.cn.mvcordemo.http.OkHttpContnent;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xiao_Bailong on 2016/2/26.
 */
public class WeatherModelImpl implements IWeatherModel {

    @Override
    public void getWriter(String cityNumber, final IOnWeatherListerner listener) {

        OkHttpContnent.getAsyn("http://gank.io/api/day/2015/08/06", new OkHttpContnent.ResultCallback<String>() {
            @Override
            public void onErroe(Request request, IOException e) {
                listener.onFail();
            }

            @Override
            public void onResponse(String response) {
                Log.e("WeatherModelImpl", "onResponse: " + response);
                final GanIoAndroid ganIoAndroid = getGankIo(response);
                listener.onSuccess(ganIoAndroid);
            }
        });
    }

    /**
     * 解析Json字符串
     *
     * @param responStr
     * @return
     */
    public GanIoAndroid getGankIo(String responStr) {
        Gson gson = new Gson();
        try {
            JSONObject jsonObject = new JSONObject(responStr);
            boolean error = jsonObject.getBoolean("error");
            if (error) {
                return null;
            } else {
                JSONObject results = jsonObject.getJSONObject("results");
                GanIoAndroid ganIoAndroid = gson.fromJson(results.toString(), GanIoAndroid.class);

                List<GanIoAndroid.AndroidEnity> Android = new ArrayList<GanIoAndroid.AndroidEnity>();
                JSONArray android = results.getJSONArray("Android");

                for (int i = 0; i < android.length(); i++) {
                    String androidJson = android.getString(i);
                    GanIoAndroid.AndroidEnity androidEnity = gson.fromJson(androidJson, GanIoAndroid.AndroidEnity.class);
                    Android.add(androidEnity);
                }

                ganIoAndroid.setAndroid(Android);
                Log.e("tag", "getGankIo: " + ganIoAndroid.toString());
                return ganIoAndroid;
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }


    /**
     * 查询数据成功的回调方法。
     */
    public interface IOnWeatherListerner {
        void onSuccess(GanIoAndroid ganio);

        void onFail();
    }
}
