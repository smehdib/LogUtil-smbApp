package com.smb.logutil;

import android.util.Log;

public class LogDebug {
    private static final String TAG = "SUPER_SMB_APP";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
