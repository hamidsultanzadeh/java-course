package com.hamidsultanzadeh.builder_pattern;

public class ImageBuilder {

    private Image image = null;

    public ImageBuilder(){
        builder();
    }

    public ImageBuilder builder(){
        image = new Image();
        return this;
    }

    public Image build(){
        return this.image;
    }

    public ImageBuilder setName(String name) {
        this.image.setName(name);
        return this;
    }

    public ImageBuilder setAuthor(String author) {
        this.image.setAuthor(author);
        return this;
    }

    public ImageBuilder setSize(int size) {
        this.image.setSize(size);
        return this;
    }

    public ImageBuilder setDate(String date) {
        this.image.setDate(date);
        return this;
    }

    public class Image {

        private String name;
        private String author;
        private int size;
        private String date;

        private Image() {
        }

        private String getName() {
            return name;
        }

        private void setName(String name) {
            this.name = name;
        }

        private String getAuthor() {
            return author;
        }

        private void setAuthor(String author) {
            this.author = author;
        }

        private int getSize() {
            return size;
        }

        private void setSize(int size) {
            this.size = size;
        }

        private String getDate() {
            return date;
        }

        private void setDate(String date) {
            this.date = date;
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

}