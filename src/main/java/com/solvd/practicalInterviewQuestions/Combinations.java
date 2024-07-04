package com.solvd.practicalInterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class Combinations {


    private List<List<Integer>> res;

    private List<String> menuItems;

    private HashMap<String, Integer> menu;

    private int coins;

    private long sumNonNegative(int[] cnt) {
        long sum = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                sum += (long) cnt[i] * menu.get(menuItems.get(i));
            }
        }
        return sum;
    }

    private void permutationSearch(int i, int[] cnt) {
        int maxCountForThisGood = (int) ((coins - sumNonNegative(cnt)) / menu.get(menuItems.get(i)));
        if (maxCountForThisGood < 1) {
            cnt[i] = -1;
            return;
        }

        for (int k = 0; k <= maxCountForThisGood; k++) {
            if (k == 0) {
                cnt[i] = -1;
            } else {
                cnt[i] = k;
            }
            if (res.contains(Arrays.stream(cnt).boxed().map(el->el==-1?0:el).collect(Collectors.toList()))) {
                continue;
            }
            res.add(Arrays.stream(cnt).boxed().map(el->el==-1?0:el).collect(Collectors.toList()));
            for (int j = 0; j < menuItems.size(); j++) {
                if (cnt[j] == 0) {
                    permutationSearch(j, cnt);
                }
            }
        }
        cnt[i] = 0;

    }

    public void printCombs(int coins, HashMap<String, Integer> menu) {
        this.menu = menu;
        this.coins = coins;
        menuItems = new ArrayList<>(menu.keySet());
        res = new ArrayList<>();
        for (int i = 0; i < menuItems.size(); i++) {
            int[] cnt = new int[menuItems.size()];
            for (int k = 0; k < menuItems.size(); k++) {
                cnt[k] = 0;
            }
            permutationSearch(i, cnt);
        }
        for (List<Integer> list:res) {
            boolean f  = false;
            for (int i=0;i<list.size();i++) {
                if (list.get(i)>0) {
                    System.out.print(menuItems.get(i)+":"+list.get(i)+" ");
                    f = true;
                }
            }
            if (f) {
                System.out.println();
            }
        }
    }
}