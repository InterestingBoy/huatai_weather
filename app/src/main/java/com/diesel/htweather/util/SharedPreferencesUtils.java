package com.diesel.htweather.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.diesel.htweather.constant.Consts;

/**
 * @author Diesel
 *
 *         Time: 2016/8/12
 *
 *         Modified By:
 *         Modified Date:
 *         Why & What is modified:
 * @version 1.0.0
 */
public class SharedPreferencesUtils {

    SharedPreferences mShared = null;

    static SharedPreferencesUtils mUtil = null;

    String mVersionName;

    public static synchronized SharedPreferencesUtils getInstance(Context context) {
        if (mUtil == null) {
            mUtil = new SharedPreferencesUtils(context);
        }
        return mUtil;
    }

    private SharedPreferencesUtils(Context ctx) {
        mShared = ctx.getSharedPreferences(Consts.APP_CONFIGURE, Context.MODE_PRIVATE);
        mVersionName = AppUtils.getVersionName(ctx);
    }


    public boolean getBoolean(String key, boolean defValue) {
        return mShared.getBoolean(key, defValue);
    }

    public void putBoolean(String key, boolean value) {
        mShared.edit().putBoolean(key, value).apply();
    }


    public float getFloat(String key, float defValue) {
        return mShared.getFloat(key, defValue);
    }

    public void putFloat(String key, float value) {
        mShared.edit().putFloat(key, value).apply();
    }


    public long getLong(String key, long defValue) {
        return mShared.getLong(key, defValue);
    }

    public void putLong(String key, long value) {
        mShared.edit().putLong(key, value).apply();
    }


    public int getInt(String key, int defValue) {
        return mShared.getInt(key, defValue);
    }

    public void putInt(String key, int value) {
        mShared.edit().putInt(key, value).apply();
    }

    public String getString(String key, String defValue) {
        return mShared.getString(key, defValue);
    }

    public void putString(String key, String value) {
        mShared.edit().putString(key, value).apply();
    }

    public static final String SP_KEY_NEED_ENTER_GUIDE_PAGE = "sp_key_need_enter_guide_page";

    public void updateEnterGuidePageStatus() {
        putBoolean(SP_KEY_NEED_ENTER_GUIDE_PAGE + mVersionName, false);
    }

    public boolean needEnterGuidePage() {
        return getBoolean(SP_KEY_NEED_ENTER_GUIDE_PAGE + mVersionName, true);
    }

}
