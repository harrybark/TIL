package me.harry.designpatterns.designpatterns.structural_patterns.flyweight.usage;

public class FlyweightInJava {

    public static void main(String[] args) {
        // 자주 사용되는 값들을 캐싱해서 범위에 속해있는 것들을 사용한다.
        // Integer Docs를 확인
        Integer i1 = Integer.valueOf(129);
        Integer i2 = Integer.valueOf(129);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
