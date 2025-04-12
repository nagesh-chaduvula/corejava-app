package com.java.standard.generics.basics;

import com.java.standard.generics.basics.Box;

public class BoxApp {
    public static void main(String[] args) {
        //Box box = getBox();
        Box box = getStringBox();
        box.printContentList();
    }

    private static Box getBox() {
        Box box = new Box();
        box.addContent("apple");
        box.addContent("watermelon");
        box.addContent(10);
        return box;
    }

    private static Box getStringBox() {
        Box<String> box = new Box();
        box.addContent("apple");
        box.addContent("watermelon");
        //box.addContent(10);   // CTE "required type: String, provided: int"
        return box;
    }


}
