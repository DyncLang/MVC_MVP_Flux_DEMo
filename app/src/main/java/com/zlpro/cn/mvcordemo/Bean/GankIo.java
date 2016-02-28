package com.zlpro.cn.mvcordemo.Bean;

import java.util.List;

/**
 * Created by Xiao_Bailong on 2016/2/26.
 */
public class GankIo {


    /**
     * publishedAt : 2015-08-06T04:16:55.575Z
     * _ns : ganhuo
     * desc : 一个查看设备规格的库，并且可以计算哪一年被定为“高端”机
     * _id : 56cc6d23421aa95caa707bba
     * createdAt : 2015-08-06T02:05:32.826Z
     * used : true
     * type : Android
     * url : https://github.com/facebook/device-year-class
     * who : 有时放纵
     */

    private List<AndroidEntity> Android;
    /**
     * publishedAt : 2015-08-06T04:16:55.601Z
     * _ns : ganhuo
     * desc : node express 源码接卸
     * _id : 56cc6d1d421aa95caa707781
     * createdAt : 2015-08-06T00:53:43.851Z
     * used : true
     * type : 拓展资源
     * url : https://gist.github.com/dlutwuwei/3faf88d535ac81c4e263
     * who : YJX
     */

    private List<拓展资源Entity> 拓展资源;
    /**
     * publishedAt : 2015-08-06T04:16:55.578Z
     * _ns : ganhuo
     * desc : 重温字幕版倒鸭子~~~
     * _id : 56cc6d23421aa95caa707c2b
     * createdAt : 2015-08-06T03:55:07.175Z
     * used : true
     * type : 休息视频
     * url : http://video.weibo.com/show?fid=1034:0c79a69b1bafe17df62e750391d92118
     * who : 代码家
     */

    private List<休息视频Entity> 休息视频;
    /**
     * publishedAt : 2015-08-06T04:16:55.592Z
     * _ns : ganhuo
     * desc : iOS 核心动画高级技巧
     * _id : 56cc6d1d421aa95caa70777e
     * createdAt : 2015-08-06T01:55:36.30Z
     * used : true
     * type : iOS
     * url : http://zsisme.gitbooks.io/ios-/content/
     * who : Andrew Liu
     */

    private List<IOSEntity> iOS;
    /**
     * publishedAt : 2015-08-06T04:16:55.601Z
     * _ns : ganhuo
     * desc : 8.6
     * _id : 56cc6d23421aa95caa707c6f
     * createdAt : 2015-08-06T01:33:55.463Z
     * used : true
     * type : 福利
     * url : http://ww4.sinaimg.cn/large/7a8aed7bgw1eusn3niy2bj20hs0qo0wb.jpg
     * who : 张涵宇
     */

    private List<福利Entity> 福利;

    public void setAndroid(List<AndroidEntity> Android) {
        this.Android = Android;
    }

    public void set拓展资源(List<拓展资源Entity> 拓展资源) {
        this.拓展资源 = 拓展资源;
    }

    public void set休息视频(List<休息视频Entity> 休息视频) {
        this.休息视频 = 休息视频;
    }

    public void setIOS(List<IOSEntity> iOS) {
        this.iOS = iOS;
    }

    public void set福利(List<福利Entity> 福利) {
        this.福利 = 福利;
    }

    public List<AndroidEntity> getAndroid() {
        return Android;
    }

    public List<拓展资源Entity> get拓展资源() {
        return 拓展资源;
    }

    public List<休息视频Entity> get休息视频() {
        return 休息视频;
    }

    public List<IOSEntity> getIOS() {
        return iOS;
    }

    public List<福利Entity> get福利() {
        return 福利;
    }

    public static class AndroidEntity {
        private String publishedAt;
        private String _ns;
        private String desc;
        private String _id;
        private String createdAt;
        private boolean used;
        private String type;
        private String url;
        private String who;

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void set_ns(String _ns) {
            this._ns = _ns;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String get_ns() {
            return _ns;
        }

        public String getDesc() {
            return desc;
        }

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public boolean isUsed() {
            return used;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getWho() {
            return who;
        }
    }

    public static class 拓展资源Entity {
        private String publishedAt;
        private String _ns;
        private String desc;
        private String _id;
        private String createdAt;
        private boolean used;
        private String type;
        private String url;
        private String who;

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void set_ns(String _ns) {
            this._ns = _ns;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String get_ns() {
            return _ns;
        }

        public String getDesc() {
            return desc;
        }

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public boolean isUsed() {
            return used;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getWho() {
            return who;
        }
    }

    public static class 休息视频Entity {
        private String publishedAt;
        private String _ns;
        private String desc;
        private String _id;
        private String createdAt;
        private boolean used;
        private String type;
        private String url;
        private String who;

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void set_ns(String _ns) {
            this._ns = _ns;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String get_ns() {
            return _ns;
        }

        public String getDesc() {
            return desc;
        }

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public boolean isUsed() {
            return used;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getWho() {
            return who;
        }
    }

    public static class IOSEntity {
        private String publishedAt;
        private String _ns;
        private String desc;
        private String _id;
        private String createdAt;
        private boolean used;
        private String type;
        private String url;
        private String who;

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void set_ns(String _ns) {
            this._ns = _ns;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String get_ns() {
            return _ns;
        }

        public String getDesc() {
            return desc;
        }

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public boolean isUsed() {
            return used;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getWho() {
            return who;
        }
    }

    public static class 福利Entity {
        private String publishedAt;
        private String _ns;
        private String desc;
        private String _id;
        private String createdAt;
        private boolean used;
        private String type;
        private String url;
        private String who;

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void set_ns(String _ns) {
            this._ns = _ns;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String get_ns() {
            return _ns;
        }

        public String getDesc() {
            return desc;
        }

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public boolean isUsed() {
            return used;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getWho() {
            return who;
        }
    }
}
