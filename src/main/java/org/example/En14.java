package org.example;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class En14 {
    public static void main (String[] args) throws Exception {

        List<String> list = En14.getList("https://holidays-jp.github.io/api/v1/2023/date.json");
        System.out.println(list);
    }

    public static List<String> getList(String webApiUrl) throws Exception{
        URL urlObj = new URL(webApiUrl);
        String inputLine;
        StringBuffer response = new StringBuffer();


        //GETリクエスト
        HttpURLConnection con = (HttpURLConnection)urlObj.openConnection();
        con.setRequestMethod("GET");

        //streamから、レスポンスを格納
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        //1行ずつStringBuffer変数(response)へ, JSONファイルの内容を格納
        while( (inputLine = in.readLine())!= null){
            response.append(inputLine);
        }
        in.close();

        //JsonObject型変数を用意し、StringBuffer型から、Jsonへ変換
        //jObj には、key:Value どちらも格納されている
        JSONObject jObj = new JSONObject(response.toString());

        //
        List<String> holidays = new ArrayList<>();

        for (String key : jObj.keySet()){
            holidays.add(key + ":" + JSONObject.valueToString(jObj) + "¥n");

        }

        return holidays;

    }
}
