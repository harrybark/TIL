package me.harry.designpatterns.designpatterns.builder.usage;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {

    public static void main(String[] args) {
        UriComponents build = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java-playlist-ep1")
                .build();

        System.out.println(build);
    }
}
