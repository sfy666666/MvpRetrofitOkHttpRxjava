package com.example.mvpretrofitokhttprxjava.base.cookie;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * cookie处理
 * <p>
 * created by JonSnow
 * on 2019/5/31
 */
public class CookieManager implements CookieJar {
    private static Context mContext;
    private static PersistentCookieStore cookieStore;


    public CookieManager(Context context) {
        mContext = context;
        if (cookieStore == null) {
            cookieStore = new PersistentCookieStore(mContext);
        }
    }

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        if (cookies != null && cookies.size() > 0) {
            for (Cookie item : cookies) {
                cookieStore.add(url, item);
                if (item.name() != null && TextUtils.isEmpty(item.name()) &&
                        item.value() != null && TextUtils.isEmpty(item.value())) {
                    /*保存cookie到sp  可能会用到*/
//                    PrefUtils.setString(mContext, "cookie_name", item.name());
//                    PrefUtils.setString(mContext, "cookie_value", item.value());

                }
            }
        }
    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        List<Cookie> cookies = cookieStore.get(url);
        for (int i = 0; i < cookies.size(); i++) {
            Log.e("", "拿出来的cookie name()==" + cookies.get(i).name());
            Log.e("", "拿出来的cookie value()==" + cookies.get(i).value());
        }
        return cookies;
    }
}
