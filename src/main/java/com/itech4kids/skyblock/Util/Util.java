package com.itech4kids.skyblock.Util;

import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Util {

    public static String intToNumeral(int i){
        String str = null;
        if(i == 1){
            str = "I";
        } else if(i == 2){
            str = "II";
        } else if(i == 3){
            str = "III";
        } else if(i == 4){
            str = "IV";
        } else if(i == 5){
            str = "V";
        } else if(i == 6){
            str = "VI";
        } else if(i == 7){
            str = "VII";
        } else if(i == 8){
            str = "VIII";
        } else if(i == 9){
            str = "IX";
        } else if(i == 10){
            str = "X";
        } else if(i == 11){
            str = "XI";
        } else if(i == 12){
            str = "XII";
        } else if(i == 13){
            str = "XIII";
        } else if(i == 14){
            str = "XIV";
        } else if(i == 15){
            str = "XV";
        } else if(i == 16){
            str = "XVI";
        } else{
            str = Integer.toString(i);
        }
        return str;
    }

    public static int numeralToInt(String str){
        int i = 0;
        if(str.equals("I")){
            i = 1;
        } else if(str.equals("II")){
            i = 2;
        } else if(str.equals("III")){
            i = 3;
        } else if(str.equals("IV")){
            i = 4;
        } else if(str.equals("V")){
            i = 5;
        } else if(str.equals("VI")){
            i = 6;
        } else if(str.equals("VII")){
            i = 7;
        } else if(str.equals("VIII")){
            i = 8;
        } else if(str.equals("IX")){
            i = 9;
        } else if(str.equals("X")){
            i = 10;
        } else if(str.equals("XI")){
            i = 11;
        } else if(str.equals("XII")){
            i = 12;
        } else if(str.equals("XIII")){
            i = 13;
        } else if(str.equals("XIV")){
            i = 14;
        } else if(str.equals("XV")){
            i = 15;
        } else if(str.equals("XVI")){
            i = 16;
        } else{
            i = Integer.parseInt(str);
        }
        return i;
    }

    public static int percentage(int c, int m){
        int i = c*100/m;
        return i;
    }

    public static List<String> returnLore(ItemMeta meta){
        List<String> lore = meta.getLore();
        return lore;
    }

    public static void setItemLore(ItemMeta meta, List<String> lore){
        meta.setLore(lore);
    }

    public static void addLore(ItemMeta meta, List<String> lore){
        List<String> itemLore = meta.getLore();
        itemLore.addAll(lore);
    }

}