package com.java.standard.generics.basics;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> contentList = new ArrayList<>();

    public void addContent(T content) {
        contentList.add(content);
    }

    public List<T> getContentList() {
        return contentList;
    }

    public void printContentList() {
        System.out.println("Box content list type: " + contentList.getClass().getSimpleName());
        for (T content : contentList) {
            System.out.println(" - " + content + "  (" + content.getClass().getSimpleName() + ")");
            String strContent = (String) content;
            String upperCase = strContent.toUpperCase();
            System.out.println("content to upper case: " + upperCase);
        }
    }
}
