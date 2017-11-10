package com.bhz.opensourcelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Roc on 2017/11/10.
 */

public class ToastUtils {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
