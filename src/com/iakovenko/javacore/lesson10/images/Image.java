package com.iakovenko.javacore.lesson10.images;


import java.util.Objects;

public class Image implements Drawable , Cloneable{
    private String path;

    public Image(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public void draw() {
        System.out.println(path);
    }

    @Override
    public String toString() {
        return "Image{" +
                "path='" + path + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Image image = (Image) o;
        return Objects.equals(path, image.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path);
    }
    @Override
    public Image clone(){

        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
