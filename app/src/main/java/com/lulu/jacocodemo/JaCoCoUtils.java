package com.lulu.jacocodemo;

import android.content.Context;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author zhanglulu
 */
public class JaCoCoUtils {

    private static final String TAG = "JaCoCoUtils";

    /**
     * 生成 JaCoCo 的 ec 文件
     * @param context 上下文
     */
    public static void generateCoverageReport(Context context) {
        String DEFAULT_COVERAGE_FILE_PATH = context.getExternalFilesDir(null) + "/coverage.ec";
        Log.d(TAG, "generateCoverageReport():" + DEFAULT_COVERAGE_FILE_PATH);
        try {
            OutputStream out = new FileOutputStream(DEFAULT_COVERAGE_FILE_PATH, false);
            Object agent = Class.forName("org.jacoco.agent.rt.RT")
                    .getMethod("getAgent")
                    .invoke(null);

            out.write((byte[]) agent.getClass().getMethod("getExecutionData", boolean.class)
                    .invoke(agent, false));
            out.close();
        } catch (Exception e) {
            Log.d(TAG, e.toString(), e);
        }
    }
}
