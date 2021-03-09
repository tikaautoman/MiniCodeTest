package com.biao.myApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class application {

    public Map<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();

    public application() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("");
        this.map.put("0",list);
        this.map.put("1",list);
        list = new ArrayList<String>();
        list.add("A") ;
        list.add("B") ;
        list.add("C") ;
        this.map.put("2",list);
        list = new ArrayList<String>();
        list.add("D") ;
        list.add("E");
        list.add("F");
        this.map.put("3",list);
        list = new ArrayList<String>();
        list.add("G") ;
        list.add("H");
        list.add("I");
        this.map.put("4",list);
        list = new ArrayList<String>();
        list.add("J") ;
        list.add("K");
        list.add("L");
        this.map.put("5",list);
        list = new ArrayList<String>();
        list.add("M") ;
        list.add("N");
        list.add("O");
        this.map.put("6",list);
        list = new ArrayList<String>();
        list.add("P") ;
        list.add("Q");
        list.add("R");
        list.add("S");
        this.map.put("7",list);
        list = new ArrayList<String>();
        list.add("T") ;
        list.add("U");
        list.add("V");
        this.map.put("8",list);
        list = new ArrayList<String>();
        list.add("W") ;
        list.add("X");
        list.add("Y");
        list.add("Z");
        this.map.put("9",list);


    }

    //每获得一个数字当即调用一次返回改数字所代表的字母组成的数组
    public ArrayList<String> getList(String s) {
        ArrayList<String> value = this.map.get(s);
        return value;
    }

    /**
     * 将在当前数字之前得到的所有组合与当前输入得到的字符数组组装起来，返回新得到的组合
     * @param list1 当前数字之前得到的所有组合
     * @param list2 当前输入得到的字符数组
     * @return 新得到的组合数组
     */
    public ArrayList<String> getCombination(ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> result = new ArrayList<String>();
        for (String s1:list1) {
            for (String s2:list2) {
//                System.out.println("s1=" + s1 + ",s2=" + s2);
                result.add(s1+s2);
            }
        }
        return result;
    }

}
