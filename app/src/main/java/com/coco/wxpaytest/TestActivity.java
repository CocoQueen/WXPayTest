package com.coco.wxpaytest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.coco.wxpaytest.bean.OrderBean;
import com.coco.wxpaytest.bean.OrderPayBean;
import com.coco.wxpaytest.utils.WxUtils;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by ydx on 18-6-8.
 */

public class TestActivity extends AppCompatActivity{
    private static final String TAG = "TestActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //在服务端签名
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                OkHttpClient okHttpClient = new OkHttpClient();
//                FormBody body = new FormBody.Builder()
//                        .add("id","")
//                        .build();
//                final Request request = new Request.Builder()
//                        .addHeader("x-auth-token", "x-auth-token")
//                        .url(Constant.BASE_URL+Constant.ORDER_WX_PAY)
//                        .post(body)
//                        .build();
//                Call call = okHttpClient.newCall(request);
//
//                call.enqueue(new Callback() {
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//                        Log.e(TAG, "onFailure: "+e.getMessage());
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        String string = response.body().string();
//                        Gson gson = new Gson();
//                        OrderPayBean bean = gson.fromJson(string, OrderPayBean.class);
//                        String appId = bean.getAppId();
//                        String partnerId = bean.getPartnerId();
//                        String packageValue = bean.getPackageValue();
//                        String prepayId = bean.getPrepayId();
//                        String sign = bean.getSign();
//                        int timeStamp = bean.getTimeStamp();
//                        String nonceStr = bean.getNonceStr();
//
//                        //假装请求了服务器 获取到了所有的数据
//                        WxUtils.WXPayBuilder builder = new WxUtils.WXPayBuilder();
//                        builder.setAppId(appId)
//                                .setPartnerId(partnerId)
//                                .setPrepayId(prepayId)
//                                .setPackageValue(packageValue)
//                                .setNonceStr(nonceStr)
//                                .setTimeStamp(timeStamp+"")
//                                .setSign(sign)
//                                .build().toWXPayNotSign(TestActivity.this,appId);
//                    }
//                });

            }
        });
//        //在客户端签名
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //假装请求了服务端信息，并获取了appid、partnerId、prepayId

                OkHttpClient okHttpClient = new OkHttpClient();
//                FormBody body = new FormBody.Builder()
//                        .add("payOrderRequest","string")
//                        .build();
                FormBody.Builder fBuilder = new FormBody.Builder();
                FormBody formBody = null;
                HashMap<String,String>map=new HashMap<>();
                map.put("payOrderRequest","59b74ff0526dcd63a559c084");
                if (map != null && !map.isEmpty()) {
                    Set<Map.Entry<String, String>> entrySet = map.entrySet();
                    for (Map.Entry<String, String>entrys:entrySet){
                        fBuilder.add(entrys.getKey(),entrys.getValue());

                    }
                    formBody=fBuilder.build();
                }

                final Request request = new Request.Builder()
                        .addHeader("x-auth-token", "x-auth-token")
                        .url(Constant.BASE_URL+Constant.ORDER_WX_PAY)
                        .post(formBody)
                        .build();
                Call call = okHttpClient.newCall(request);

                call.enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Log.e(TAG, "onFailure: "+e.getMessage());
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        String string = response.body().string();
                        Gson gson = new Gson();
                        OrderPayBean bean = gson.fromJson(string, OrderPayBean.class);
                        String appId = bean.getAppId();
                        String partnerId = bean.getPartnerId();
                        String packageValue = bean.getPackageValue();
                        String prepayId = bean.getPrepayId();
                        String sign = bean.getSign();
                        int timeStamp = bean.getTimeStamp();
                        String nonceStr = bean.getNonceStr();

                        //假装请求了服务器 获取到了所有的数据
                        WxUtils.WXPayBuilder builder = new WxUtils.WXPayBuilder();
                        builder.setAppId(Constant.APP_ID)
                                .setPartnerId("59b74fe2526dcd63a559c082")
                                .setPrepayId("59b74fe2526dcd63a559c082")
                                .setPackageValue(packageValue)
                                .build()
                                .toWXPayAndSign(TestActivity.this,Constant.APP_ID,Constant.APP_KEY);
                    }
                });



            }
        });
    }
}
