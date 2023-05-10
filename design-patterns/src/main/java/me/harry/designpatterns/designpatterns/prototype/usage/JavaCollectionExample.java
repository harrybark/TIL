package me.harry.designpatterns.designpatterns.prototype.usage;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {

        List<String> lists = new ArrayList<>();
        lists.add("harry");
        lists.add("terry");

        // 추상화 타입을 사용하기 때문에 자주 사용하진 않음.

        // 가장 많이 사용되는 방법(prototype pattern을 사용하는 것은 아님)
        List<String>  clone = new ArrayList<>(lists);
    }
}
