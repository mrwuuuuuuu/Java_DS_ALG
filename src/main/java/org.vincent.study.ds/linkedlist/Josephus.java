package org.vincent.study.ds.linkedlist;


import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
  
public class Josephus {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("请输入总人数：");  
        int totalNum = scanner.nextInt();  
        System.out.print("请输入从谁开始报数：");
        int start=scanner.nextInt();
        System.out.print("请输入报数的大小：");  
        int cycleNum = scanner.nextInt();  
        yuesefu(totalNum,start,cycleNum);  
    }  
  
   public static void yuesefu(int totalNum, int start,int countNum) {  
        List<Integer> list = new ArrayList<Integer>();  
        for (int i = 1; i <= totalNum; i++) {  
        	list.add(i);  
        }  
       
        int k = start-1;   //k表示索引下标
        while (list.size() >0) {  
            k = k + countNum; 
            k = k % (list.size()) - 1; //索引的位置需要减1
           // 判断是否到队尾  
            if (k < 0) {  
                System.out.print(list.get(list.size()-1)+" ");  
                list.remove(list.size() - 1);  
                k = 0;  
            } else {  
                System.out.print(list.get(k)+" ");  
                list.remove(k);  
            }  
        }   
    }  
}