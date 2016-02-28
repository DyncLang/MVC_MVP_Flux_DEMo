package com.zlpro.cn.mvcordemo.MVC.bean;

import java.util.List;

/**
 * Created by Xiao_Bailong on 2016/2/26.
 */
public class GanIoAndroid {

    private static List<AndroidEnity> Android;

    public static List<AndroidEnity> getAndroid() {
        return Android;
    }

    public static void setAndroid(List<AndroidEnity> android) {
        Android = android;
    }

    /**
     * _id : 56cc6d29421aa95caa70832c
     * _ns : ganhuo
     * createdAt : 2016-02-23T03:32:01Z
     * desc : 深入理解LayoutInflater.inflate()
     * publishedAt : 2016-02-26T11:58:00Z
     * type : Android
     * url : http://blog.chengdazhi.com/index.php/110?hmsr=toutiao.io&utm_medium=toutiao.io&utm_source=toutiao.io
     * used : true
     * who : Dear宅学长
     */


    public static class AndroidEnity {
        private String _id;
        private String _ns;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public void set_id(String _id) {
            this._id = _id;
        }

        public void set_ns(String _ns) {
            this._ns = _ns;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public String get_id() {
            return _id;
        }

        public String get_ns() {
            return _ns;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public boolean isUsed() {
            return used;
        }

        public String getWho() {
            return who;
        }

        @Override
        public String toString() {
            return "AndroidEnity{" +
                    "_id='" + _id + '\'' +
                    ", _ns='" + _ns + '\'' +
                    ", createdAt='" + createdAt + '\'' +
                    ", desc='" + desc + '\'' +
                    ", publishedAt='" + publishedAt + '\'' +
                    ", type='" + type + '\'' +
                    ", url='" + url + '\'' +
                    ", used=" + used +
                    ", who='" + who + '\'' +
                    '}';
        }
    }
}
