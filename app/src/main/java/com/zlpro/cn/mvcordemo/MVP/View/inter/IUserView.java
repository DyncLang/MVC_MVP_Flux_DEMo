package com.zlpro.cn.mvcordemo.MVP.View.inter;

/**
 * Created by Xiao_Bailong on 2016/2/28.
 */
public interface IUserView {
    int getID();

    String getFristName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);
}
