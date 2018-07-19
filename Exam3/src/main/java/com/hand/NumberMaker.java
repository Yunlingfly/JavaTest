package com.hand;

import java.util.*;

public class NumberMaker implements MakeNumberInter {
    private List<Integer> list = new ArrayList<>();
    private Map<Integer,List<Integer>> dataMap = new Hashtable<>();

    /**
     * @param num 生成num个随机数
     * @param max 随机数最大值
     * @return 生成的随机数list
     */
    @Override
    public List<Integer> makeNumber(int num, int max) {
        for (int i = 0; i < num; i++) {
//            System.out.println(new Random().nextInt(100));
            list.add(new Random().nextInt(max));
        }
        return list;
    }

    /**
     * @param list
     * @return 未排序的map
     */
    @Override
    public Map<Integer,List<Integer>> makeMap(List<Integer> list) {

        for (Integer i: list) {
            int key = i/10;
//            System.out.println(key);
            if ((dataMap).containsKey(key))
            {
                dataMap.get(key).add(i);
            }
            else
            {
                dataMap.put(key, new ArrayList<Integer>());
                dataMap.get(key).add(i);
            }
        }

        return dataMap;
    }
}
