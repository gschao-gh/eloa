package com.el.oa.fetch.model;

/**
 * 　　　　　　　　┏┓　　　┏┓+ +
 * 　　　　　　　┏┛┻━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 ████━████ ┃+
 * 　　　　　　　┃　　　　　　　┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　　┃ + +
 * 　　　　　　　┗━┓　　　┏━┛
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃ + + + +
 * 　　　　　　　　　┃　　　┃　　　　Code is far away from bug with the animal protecting
 * 　　　　　　　　　┃　　　┃ + 　　　　神兽保佑,代码无bug
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　+
 * 　　　　　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　　　　　┃ 　　　　　　　┣┓
 * 　　　　　　　　　┃ 　　　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　　　　　┃┫┫　┃┫┫
 * 　　　　　　　　　　┗┻┛　┗┻┛+ + + +
 *
 * @User : Hapic
 * @Date : 2016/7/25 19:12
 */
public class KaoQinUrlModel {
    private String URL = "http://124.65.191.70:10000/iclock/accounts/login/";
    private String userInfoTargetUrl="http://124.65.191.70:10000/iclock/staff/";
    private String dataTargetUrl="http://124.65.191.70:10000/iclock/staff/transaction/?p=&t=staff_transaction.html&UserID__id__exact=&fromTime=&toTime=";
    private String startTime;
    private String endTime;


    public KaoQinUrlModel() {
    }

    public KaoQinUrlModel(String URL, String userInfoTargetUrl, String dataTargetUrl) {
        this.URL = URL;
        this.userInfoTargetUrl = userInfoTargetUrl;
        this.dataTargetUrl = dataTargetUrl;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getUserInfoTargetUrl() {
        return userInfoTargetUrl;
    }

    public void setUserInfoTargetUrl(String userInfoTargetUrl) {
        this.userInfoTargetUrl = userInfoTargetUrl;
    }

    public String getDataTargetUrl() {
        return dataTargetUrl;
    }

    public void setDataTargetUrl(String dataTargetUrl) {
        this.dataTargetUrl = dataTargetUrl;
    }
}
