package com.siberiadante.toastutils.bean;


import java.util.List;

/**
 * Created by SiberiaDante on 2017/5/17.
 */

public class ToastBean {
    private static int size;
    private static List<String> content;


    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        ToastBean.size = size;
    }

    public static List<String> getContent() {
        return content;
    }

    public static void setContent(List<String> content) {
        ToastBean.content = content;
    }
    //    private static int color;
//    private static float size;
//    private static int height;
//    private static int width;
//    private static String content = "";
//    private static int background;
//
//    public static int getColor() {
//        return color;
//    }
//
//    public static void setColor(int color) {
//        ToastBean.color = color;
//    }
//
//    public static float getSize() {
//        return size;
//    }
//
//    public static void setSize(float size) {
//        ToastBean.size = size;
//    }
//
//    public static int getHeight() {
//        return height;
//    }
//
//    public static void setHeight(int height) {
//        ToastBean.height = height;
//    }
//
//    public static int getWidth() {
//        return width;
//    }
//
//    public static void setWidth(int width) {
//        ToastBean.width = width;
//    }
//
//    public static String getContent() {
//        return content;
//    }
//
//    public static void setContent(String content) {
//        ToastBean.content = content;
//    }
//
//    public static int getBackground() {
//        return background;
//    }
//
//    public static void setBackground(int background) {
//        ToastBean.background = background;
//    }
}
