package com.zlpro.cn.mvcordemo.MVP.Model.inter;

import com.zlpro.cn.mvcordemo.MVP.Model.UserModel;

/**
 * Created by Xiao_Bailong on 2016/2/28.
 */
public interface IUserModel {
    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    int getID();

    void load(int id, UserModel.IOnWeatherListerner listerner);//通过id读取user信息,返回一个UserBean
}
