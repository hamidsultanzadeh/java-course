package com.hamidsultanzadeh.builder_pattern.other;

import com.hamidsultanzadeh.builder_pattern.other.Image.ImageBuilder;

public class OtherMain {

    public static void main(String[] args) {
        ImageBuilder builder = new ImageBuilder();
        builder.setAuthor("Hamid");
        builder.setName("car");
        builder.setSize(100);
        builder.setDate("21-01-2020");

        Image image = builder.build();

        ImageBuilder builder2 = new ImageBuilder();

        Image image2 = builder2.build();

        System.out.println(image.toString());
        System.out.println(image2.toString());
    }
}
