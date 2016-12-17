package com.zhaoliang.maven.jar.plugin;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * start class.
 * Created by zhaoliang (weston_contribute@163.com) on 2016/11/13.
 */
public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String test = StringUtils.center("test", 50, '-');
        logger.info(test);
    }
}
