package com.example.algorithm.baekjoon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BOJ25328 {

    static FastReader scan = new FastReader();
    static StringBuffer sb = new StringBuffer();

    static String X,Y,Z;
    static int k;
    static Map<String, Integer> map ;
    static boolean bFlag ;
    static void input() {
        X = scan.next();
        Y = scan.next();
        Z = scan.next();
        k = scan.nextInt();
        map = new HashMap<>();
        bFlag = false;
    }

    static void dfs(char[] cards, char[] result, int idx, int start) {

        if ( idx == k)  {
            String res = String.valueOf(result);
            map.putIfAbsent(res, 0);
            map.put(res, map.get(res) + 1);
        } else {
            for ( int i = start ; i < cards.length ; i += 1 ) {
                result[idx] = cards[i];
                dfs(cards, result, idx + 1 , start + 1);
            }
        }
    }

    static void exec_function() {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1, e2) -> e1.getKey().compareTo(e2.getKey()));
        for ( Map.Entry<String, Integer> e : list ) {
            if ( e.getValue() >= 2 ) {
                sb.append(e.getKey()).append("\n");
                bFlag = true;
            }
        }

        if (bFlag) System.out.println(sb.toString());
        else System.out.println(-1);


    }


    public static void main(String[] args) {
        input();

        dfs(X.toCharArray(), new char[k], 0, 0);
        dfs(Y.toCharArray(), new char[k], 0, 0);
        dfs(Z.toCharArray(), new char[k], 0, 0);

        exec_function();


    }
}
