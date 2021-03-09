package com.biao.myApp;


import com.biao.Util.NumberUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("==================stage1:==================");
        stage1("");
        System.out.println("==================stage2：converting the digits from 0 to 99 into letters==================");
        stage2();
    }

    public static void stage1(String str) {

        application app = new application();
        NumberUtil numberUtil = new NumberUtil();

        if ("".equals(str)){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input:");
            str = scanner.nextLine();
            while(!numberUtil.isNumber(str)){
                System.out.println("just accept input number");
                System.out.print("Input:");
                str = scanner.nextLine();
            }
        }
//        System.out.println("-----------str=" + str);
        //获得输入的数字组成的数组
        String[] strs = str.split("");

        if(strs.length==0){
            System.out.println("no input");
            return;
        }else if (strs.length==1){
            ArrayList<String> ss = app.getList(strs[0]);
            System.out.print("Output:");
            for (String s:ss) {
                System.out.print(s + " ");
            }
            System.out.println("");
        }else{
            //存放结果的数组
            ArrayList<String> list1 = app.getList(strs[0]);
            for (int i= 1;i<strs.length;i++) {
                ArrayList<String> list2 = app.getList(strs[i]);
                list1 = app.getCombination(list1,list2);
            }
            System.out.print("Output:");
            for (String s:list1) {
                System.out.print(s + " ");
            }
            System.out.println("");
        }
    }

    public static void stage2(){
        String s = "0";
        for(int i=0;i<100;i++){
            System.out.println("Input:" + i);
            stage1(String.valueOf(i));
        }

    }

}
