package com.hamidsultanzadeh.builder_pattern.other;

public class Image {

    private String name;
    private String author;
    private int size;
    private String date;

    private Image() {
    }

    private Image(String name, String author, int size, String date) {
        this.name = name;
        this.author = author;
        this.size = size;
        this.date = date;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public int getSize() {
        return size;
    }
    public String getDate() {
        return date;
    }

    public static class ImageBuilder {

        private Image image = null;

        public ImageBuilder() {
            builder();
        }

        public ImageBuilder builder() {
            image = new Image();
            return this;
        }

        public Image build() {
            return new Image(image.name,image.author,image.size,image.date);
        }

        public ImageBuilder setName(String name) {
            this.image.name = name;
            return this;
        }

        public ImageBuilder setAuthor(String author) {
            this.image.author = author;
            return this;
        }

        public ImageBuilder setSize(int size) {
            this.image.size = size;
            return this;
        }

        public ImageBuilder setDate(String date) {
            this.image.date = date;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", size=" + size +
                ", date='" + date + '\'' +
                '}';
    }
}
