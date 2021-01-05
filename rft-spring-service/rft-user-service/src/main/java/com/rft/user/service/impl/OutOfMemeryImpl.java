package com.rft.user.service.impl;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试常量池中内存溢出问题
 */
public class OutOfMemeryImpl {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i=0;
        while (true){
            set.add(String.valueOf(i++).intern());
        }
    }


}
