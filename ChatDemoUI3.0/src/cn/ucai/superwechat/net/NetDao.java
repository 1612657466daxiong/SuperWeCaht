package cn.ucai.superwechat.net;

import android.content.Context;

import cn.ucai.superwechat.bean.Result;
import cn.ucai.superwechat.utils.I;
import cn.ucai.superwechat.utils.OkHttpUtils;

/**
 * Created by Administrator on 2016/11/1.
 */
public class NetDao {
    public static void register(Context context, String username, String usernick, String passwrod, OkHttpUtils.OnCompleteListener listener){
        OkHttpUtils<Result> utils = new OkHttpUtils<>(context);
        utils.url(I.SERVER_ROOT+I.REQUEST_REGISTER)
                .addParam(I.User.USER_NAME,username)
                .addParam(I.User.USER_NAME,usernick)
                .addParam(I.User.PASSWORD,passwrod)
                .targetClass(Result.class)
                .execute(listener);
    }

    public static void unregister(Context context,String username,OkHttpUtils.OnCompleteListener listener){
        OkHttpUtils<Result> utils = new OkHttpUtils<>(context);
        utils.url(I.SERVER_ROOT+I.REQUEST_UNREGISTER)
                .addParam(I.User.USER_NAME,username)
                .targetClass(Result.class)
                .execute(listener);
    }

}