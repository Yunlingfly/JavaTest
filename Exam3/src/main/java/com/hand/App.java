package com.hand;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MakeNumberInter makeNum=new NumberMaker();
        List<Integer> list=makeNum.makeNumber(50,100);
        Map<Integer,List<Integer>> map=makeNum.makeMap(list);


        for(int i=0;i<10;i++){
            System.out.println(map.get(i));
        }
    }

    // 排序算法
    public Map<Integer,List<Integer>> sort(Map<Integer,List<Integer>> dataMap){

        for (Map.Entry<Integer,List<Integer>> e:dataMap.entrySet())
        {
//            List<Integer> list=e.getValue().stream().sorted().collect();
            List<Integer> list = e.getValue().stream().sorted().collect(Collectors.toList());
            dataMap.put(e.getKey(),list);
        }

        System.out.println("Sorted Map: "+dataMap);
        return dataMap;
    }

}
