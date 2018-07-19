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
        list.add(5000-3500);
        list.add(10000-3500);
        list.add(15000-3500);
        list.add(60000-3500);

        MakeShui make=MakeShui.getInstance();
        int l=1;
        for (Integer i: list) {
            System.out.print("\nUser:"+l+" ");
            System.out.print("需要交纳的税费为："+make.calculate(i));
            l++;
        }
    }
}
