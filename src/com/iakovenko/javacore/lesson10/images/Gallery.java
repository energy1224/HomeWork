package com.iakovenko.javacore.lesson10.images;


import java.util.Arrays;
import java.util.Objects;

public class Gallery implements Drawable {
    private String name;
    private Drawable[] drawables;

    public Gallery(String name, Drawable[] drawables) {
        this.drawables = drawables;
        this.name = name;
    }

    public Drawable[] getImages() {
        return drawables;
    }

    @Override
    public void draw() {
        System.out.println(name);
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    @Override
    public String toString() {
        return "Gallery{" +
                "name='" + name + '\'' +
                ", drawables=" + Arrays.toString(drawables) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gallery gallery = (Gallery) o;
        return Objects.equals(name, gallery.name) && Arrays.equals(drawables, gallery.drawables);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name);
        result = 31 * result + Arrays.hashCode(drawables);
        return result;
    }

    @Override
    public Gallery clone() {
        String newName = name;
        Drawable[] drawables1 = new Drawable[drawables.length];
        for (int i = 0; i < drawables.length; i++) {
            drawables1[i] = drawables[i];
        }
        return new Gallery(newName, drawables1);


    }
}
