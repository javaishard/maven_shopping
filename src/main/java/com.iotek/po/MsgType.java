package com.iotek.po;

/**
 * Created by xiaohuang on 2018/1/30.
 */
public enum MsgType {
    orderMsgType("order"), productMsgType("product"), customerMsgType("customer"),
    stockMsgType("stock"), shelfMsgType("shelf"), discussMsgType("discuss");

    private String info;

    MsgType(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "MsgType{" +
                "info='" + info + '\'' +
                '}';
    }

    public static MsgType getMsgType(String name) {
        if (name.equals("order")) {
            return orderMsgType;
        } else if (name.equals("product")) {
            return productMsgType;
        } else if (name.equals("customer")) {
            return customerMsgType;
        } else if (name.equals("stock")) {
            return stockMsgType;
        } else if (name.equals("shelf")) {
            return shelfMsgType;
        } else if (name.equals("discuss")) {
            return discussMsgType;
        } else {
            return null;
        }
    }
}
