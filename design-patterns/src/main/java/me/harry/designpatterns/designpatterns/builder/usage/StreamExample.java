package me.harry.designpatterns.designpatterns.builder.usage;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        Stream.Builder<String> stringBuilder = Stream.builder();
        Stream<String> names = stringBuilder.add("keesun").add("whiteship").build();
        names.forEach(System.out::println);
    }
}
