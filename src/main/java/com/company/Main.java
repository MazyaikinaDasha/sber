package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.Gson;
import com.company.entity.*;
import com.company.entity1.*;

public class Main {
    static String user_id;
    static String user_id1;

    public static int[] getFriendId(String id, String id1) {
        int[] a = new int[1];
        String query = "https://api.vk.com/method/friends.getMutual?source_uid=" + id + "&target_uid=" + id1 + "&access_token=e024c406cb386a4b08d8204daf0be308aed0216a08c67ad12bb90174617e28c0bf028f4dafc0fcc130ca3&v=5.52";
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(query).openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            if (HttpURLConnection.HTTP_OK == conn.getResponseCode()) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    Gson gson = new Gson();
                    Friend arr = gson.fromJson(line, Friend.class);
                    a = new int[arr.getResponse().length];
                    a = arr.getResponse();
                }
            }
            else {
                System.out.println(conn.getResponseCode() + ", " + conn.getResponseMessage());
            }
        }
        catch (Throwable cause) {
            cause.printStackTrace();
        }
        finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return a;
    }

    public static void getFriend(String id, String id1) {
        int[] b;
        b = getFriendId(id, id1);
        if (b.length == 0){
            System.out.println("Общих друзей нет");
            return;
        }
        System.out.println("Общие друзья");
        System.out.format("%20s%20s%20s\n", "id","имя", "фамилия");
        System.out.println("**************************************************************");
        for (int i = 0; i < b.length; i++) {
            String us = "https://api.vk.com/method/users.get?user_id=" + b[i] + "&access_token=e024c406cb386a4b08d8204daf0be308aed0216a08c67ad12bb90174617e28c0bf028f4dafc0fcc130ca3&v=5.52";
            HttpURLConnection conn1 = null;
            try {
                conn1 = (HttpURLConnection) new URL(us).openConnection();
                conn1.setRequestMethod("GET");
                conn1.connect();
                if (HttpURLConnection.HTTP_OK == conn1.getResponseCode()) {
                    BufferedReader in1 = new BufferedReader(new InputStreamReader(conn1.getInputStream(), "UTF8"));
                    String line1;
                    while ((line1 = in1.readLine()) != null) {
                        Gson gson1 = new Gson();
                        user1 arr1 = gson1.fromJson(line1, user1.class);
                        try {
                            System.out.format("%20d%20s%20s\n", arr1.getResponse()[0].getId(), arr1.getResponse()[0].getFist_name(), arr1.getResponse()[0].getLast_name());
                        }
                        catch (NullPointerException e) {
                            i = i-1;
                        }

                    }

                }

                else {
                    System.out.println(conn1.getResponseCode() + ", " + conn1.getResponseMessage());
                }
            }
            catch (Throwable cause) {
                cause.printStackTrace();
            }
            finally {
                if (conn1 != null) {
                    conn1.disconnect();
                }
            }


        }

    }


    public static void main(String args[]) {
        System.out.println("Введите id первого пользователя");
        user_id = in();
        while (!isNumeric(user_id)) {
            System.out.println("не верный ввод");
            System.out.println("Введите id первого пользователя");
            user_id = in();
        }
        System.out.println("Введите id второго пользователя");
        user_id1 = in();
        while (!isNumeric(user_id1)) {
            System.out.println("Введите id второго пользователя");
            user_id1 = in();
        }
        getFriend(user_id, user_id1);


    }

    public static String in() {
        Scanner inputl = new Scanner(System.in);
        return inputl.next();
    }

    public static boolean isNumeric(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
