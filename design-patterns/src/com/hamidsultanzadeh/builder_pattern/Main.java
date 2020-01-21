package com.hamidsultanzadeh.builder_pattern;

public class Main {

    public static void main(String[] args) {
        ImageBuilder builder = new ImageBuilder();
        builder.setAuthor("Hamid");
        builder.setName("car");
        builder.setSize(100);
        builder.setDate("21-01-2020");

        ImageBuilder.Image image = builder.build();
        System.out.println(image.toString());

        ImageBuilder builder2 = new ImageBuilder();
        builder2.setAuthor("HaHaHamid");
        builder2.setName("apple");
        builder2.setSize(90);
        builder2.setDate("21-01-2020");

        ImageBuilder.Image image2 = builder2.build();
        System.out.println(image2.toString());

    }
}
