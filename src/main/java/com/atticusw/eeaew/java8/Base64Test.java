package com.atticusw.eeaew.java8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Base64Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 基本编码 d2FuZ2ppamllaGVuc2h1YWk=
        String base64Encode = Base64.getEncoder().encodeToString("wangjijiehenshuai".getBytes("utf-8"));
        System.out.println("Base64 编码字符串 (基本) :" + base64Encode);

        // 解码
        byte[] base64DeCode = Base64.getDecoder().decode(base64Encode);
        System.out.println("原始字符串： " + new String(base64DeCode,"utf-8"));
        // URL cnVub29iP2phdmE4
        base64Encode = Base64.getUrlEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
        System.out.println("Base64 编码字符串 (URL)" + base64Encode);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; ++i) {
            stringBuilder.append(UUID.randomUUID().toString());
        }
        byte[] bytes = stringBuilder.toString().getBytes("utf-8");
        String mimeEncodedString = Base64.getMimeEncoder().encodeToString(bytes);
        // 很长
        System.out.println("Base64 编码字符串 (MIME) :" + mimeEncodedString);


    }

}
