package com.zlpro.cn.mvcordemo.MVC.model.inter;

import com.zlpro.cn.mvcordemo.MVC.model.WeatherModelImpl;

/**
 * Created by Xiao_Bailong on 2016/2/26.
 */
public interface IWeatherModel {
    void getWriter(String cityNumber, WeatherModelImpl.IOnWeatherListerner listener);
}
