// -*- coding: UTF-8 -*-
package indi.qjx.learnjava.designpattern.pattern.adapter.class_adapter;


public interface SDCard {

    //从SD卡中读取数据
    String readSD();
    //往SD卡中写数据
    void writeSD(String msg);
}
