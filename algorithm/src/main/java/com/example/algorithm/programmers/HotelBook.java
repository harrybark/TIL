package com.example.algorithm.programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

/***
 * @Author : 갈색토마토
 * @Date   : 2023.04.01 (Sat)
 * @Description : 호텔대실
 * @URL         : https://school.programmers.co.kr/learn/courses/30/lessons/155651
 */
public class HotelBook {

    public int solution(String[][] book_time) {
        int answer = 0;
        int bLen = book_time.length;

        int[][] bookRooms = new int[bLen][2];

        // 입실시간과 퇴실시간을 나눠서 배열로 생성
        for( int i = 0 ; i < bLen ; i += 1 ) {
            int startTime = Integer.valueOf(book_time[i][0].replace(":", ""));
            int endTime   = Integer.valueOf(book_time[i][1].replace(":", "")) + 10;

            if ( endTime % 100 >= 60 ) {
                endTime += 40;
            }

            bookRooms[i][0] = startTime;
            bookRooms[i][1] = endTime;
        }

        // 입실 시간이 빠른 것을 기준으로 정렬
        execSorting(bookRooms);

        // 우선순위를 사용하기 위해서 PriorityQueue를 사용함
        PriorityQueue<Integer> rooms = new PriorityQueue<>();

        execBook(bookRooms, rooms);

        answer = rooms.size();
        return answer;
    }

    private static void execBook(int[][] bookRooms, PriorityQueue<Integer> rooms) {
        for ( int[] room : bookRooms) {
            if ( rooms.isEmpty() ) {
                rooms.add(room[1]);
                continue;
            }

            int earliestEmpty = rooms.peek();
            if(room[0] >= earliestEmpty) {
                rooms.poll();
                rooms.add(room[1]);
            } else {
                rooms.add(room[1]);
            }
        }
    }

    private static void execSorting(int[][] bookRooms) {
        Arrays.sort(bookRooms, (o1, o2) -> {
            if(o1[0] > o2[0]) {
                return 1;
            } else if (o1[0] < o2[0]) {
                return -1;
            } else {
                // 입실 시간이 같은 경우에는 퇴실 시간 기준으로 정렬해야 함.
                if ( o1[1] > o2[1] ) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
