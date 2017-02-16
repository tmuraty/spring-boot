package com.muraty.base.tools;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * 文件操作工具类
 */
public class FileUtil {

    private FileUtil() {}

    /**
     * @return HHmmss_UUID32  eg. 150742_3fde6eb87d2f4ea681c20f10ff4159ea.jpg
     */
    public static String getNewFileName() {
        SimpleDateFormat fmt = new SimpleDateFormat("HHmmss");
        return fmt.format(new Date()) + "_" + StringUtil.left(UUIDUtil.UUID(),10);
    }

    /**
     * @return /yyyy/MM/dd/  eg. /2016/09/09/
     */
    public static String getUploadPath() {

        Calendar calendar = Calendar.getInstance();

        Integer y = calendar.get(Calendar.YEAR);
        Integer m = calendar.get(Calendar.MONTH) + 1;
        Integer d = calendar.get(Calendar.DAY_OF_MONTH);

        return File.separator + y + File.separator + m + File.separator + d + File.separator;
    }

}
