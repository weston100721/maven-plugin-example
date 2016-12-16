package com.zhaoliang.surefire;

/**
 * Created by zhaoliang (weston_contribute@163.com) on 2016/10/9.
 *
 * @author zhaoliang
 */
public class Calculator {

    /**
     * get sum of the expressions.
     *
     * @param expression string
     * @return sum
     */
    public int evaluate(String expression) {
        int sum = 0;
        for (String summand : expression.split("\\+")) {
            sum += Integer.valueOf(summand);
        }
        return sum;
    }
}