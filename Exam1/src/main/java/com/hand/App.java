package com.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        List<Integer> list=new ArrayList<>();
        for(int i=100-1;i<=200;i++){
            if(i%2==0||i%3==0||i%5==0||i%7==0){
//                System.out.println(i+"不是素数");
            }
            else{
                list.add(i);
            }
        }
        System.out.println( "101-200间总共有xx个素数，分别是:" );
        int l=0;
        for (Integer i: list) {
            if(l==list.size()-1){
                System.out.print(i);
            }

            else{
                System.out.print(i+",");
            }
            l++;
        }
    }
}
