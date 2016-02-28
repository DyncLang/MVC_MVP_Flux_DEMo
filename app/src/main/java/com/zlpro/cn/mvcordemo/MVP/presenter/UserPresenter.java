package com.zlpro.cn.mvcordemo.MVP.presenter;

import com.zlpro.cn.mvcordemo.MVP.Bean.UserBean;
import com.zlpro.cn.mvcordemo.MVP.Model.UserModel;
import com.zlpro.cn.mvcordemo.MVP.Model.inter.IUserModel;
import com.zlpro.cn.mvcordemo.MVP.View.inter.IUserView;

/**
 * Created by Xiao_Bailong on 2016/2/28.
 */
public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;

    public UserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        //这里可以访问网络数据。。
        mUserModel.load(id, new UserModel.IOnWeatherListerner() {
            @Override
            public void onSuccess(UserBean user) {
                mUserView.setFirstName(user.getmFirstName());//通过调用IUserView的方法来更新显示
                mUserView.setLastName(user.getmLastName());
            }

            @Override
            public void onFail() {
                //如果访问数据失败，那么给予用户相应的提示
            }
        });

    }
}
