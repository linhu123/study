package com.linfix.java8;

import java.io.File;
import java.io.FileFilter;

/**
 * @program: study
 * @description: java8 新功能01 java 8 方法的引用
 * 将方法当成一等值 传递
 * @author: linfix
 * @create: 2019-08-23 14:21
 **/
public class NewFeature01 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * this style code is before java8
         */
        File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isHidden();
            }
        });
        for (File file : hiddenFiles){
            System.out.println(file);
        }
        /**
         * you can do this then in java8
         */
        File[] hiddens = new File(".").listFiles(File::isHidden);
        for (File file : hiddens){
            System.out.println(file);
        }


    }
}
