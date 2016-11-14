package com.zhaoliang.maven.bundle.plugin;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * start class.
 * <p>
 * Created by zhaoliang (weston_contribute@163.com) on 2016/11/14.
 */
public class Main implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("start");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("stop");
    }
}
