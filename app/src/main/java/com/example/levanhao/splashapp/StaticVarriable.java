package com.example.levanhao.splashapp;

import android.app.Activity;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;

/**
 * Created by LeVanHao on 9/17/2017.
 */

public class StaticVarriable {

    //push notification:
    //String app_server_url_insert = "http://192.168.1.87/push/fcm_insert.php";
    String app_server_url_insert = IP_SERVER + "/push/fcm_insert.php";
    // String app_server_url_notification = "http://192.168.1.87/push/send_notification.php";
    String app_server_url_notification = IP_SERVER + "/push/send_notification.php";


    public static String PRODUCT_ITEM = "PRODUCT_ITEM";
    public static String IMAGE_URI = "IMAGE_URI";
    public static String IMAGE = "IMAGE";
    public static String IMAGE_RETURN = "IMAGE_RETURN";
    public static String CAMERA_ACTIVITY = "CAMERA_ACTIVITY";
    public static final String ID = "id";
    public static final int SCROLL_TOP = 1;
    public static final int SCROLL_BOTTOM = 2;
    public static final int CAMERA_REQUEST = 1888;

    //start activity for result
    public static final int STATUS_REQUEST = 100;
    public static final int EXHIBIT_REQUEST = 101;
    public static final int SIZE_REQUEST = 102;
    public static final int BRAND_REQUEST = 103;
    public static final String STATUS_STRING = "STATUS_STRING";
    public static final String EXHIBIT_STRING = "EXHIBIT_STRING";
    public static final String EXHIBIT_BOOLEAN = "EXHIBIT_BOOLEAN";
    public static final String SIZE_STRING = "SIZE_STRING";
    public static final String BRAND_STRING = "BRAND_STRING";

    public static String IP_SERVER = "http://192.168.1.92";
    //    public static String DOMAIN = "http://192.168.43.53:9000";
    public static String DOMAIN = IP_SERVER + ":9000";
    //code API:
    public static final int ERROR_INTERNET = 203;
    //login
    public static final int LOGIN = 200;
    public static final int LOGIN_SUCCESSFUL = 201;
    public static final int LOGIN_FAIL = 202;
    //getlistproduct
    public static final int GET_LIST_PRODUCT = 204;
    //getComment
    public static final int GET_COMMENT = 205;
    public static final int GET_PRODUCT_INFO = 206;
    public static final int GET_USER_INFO = 207;

    //logout:
    public static final int LOGOUT = 208;
    public static final int GET_MY_LIKE = 209;
    public static final int GET_LIST_FOLLOWING = 210;
    public static final int GET_USER_LISTING = 211;
    public static final int GET_LIST_FOLLOWED = 212;
    public static final int SET_COMMENT = 213;
    public static final int GET_LIST_CATEGORY_PROODUCT = 214;
    public static final int LIKE_PRODUCT = 215;
    public static final int SEND_REPORT = 216;
    public static final int GET_SIZE = 217;
    public static final int GET_BRAND = 218;
    public static final int SEARCH = 219;
    public static final int ADD_PRODUCT = 220;
    public static final int GET_LIST_CAMPAIGN_PROODUCT = 221;
    public static final int REGISTER_NOTIFICATION = 222;
    public static final int PUSH_NOTIFICATION = 223;
    public static final int NOT_VALIDATE = 9995;

    //hanlder:
    public static final int TIMELINE = 300;
    public static final int GIRD = 301;

    public static final String TOKEN = "TOKEN";
    public static final String USER_ID = "USER_ID";

    public static final int SHOW_LOADING = 991;
    public static final int HIDE_LOADING = 992;


    public static int INDEX = 0;
    public static int COUNT = 8;

    public static int BE_AN = 1;
    public static int BE_MAC = 2;
    public static int BE_NGU = 3;
    public static int BE_TAM = 4;

}
