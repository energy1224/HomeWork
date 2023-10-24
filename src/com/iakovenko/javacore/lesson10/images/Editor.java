package com.iakovenko.javacore.lesson10.images;

import java.util.Objects;

public final class Editor implements Cloneable {
    private Drawable drawable;

    public Editor(Drawable drawable) { // конструктор
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable) {
        this.drawable = drawable;
    }

    public void show() {
        drawable.draw();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "drawable=" + drawable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editor editor = (Editor) o;
        return Objects.equals(drawable, editor.drawable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drawable);
    }

    @Override
    public Editor clone() {
        return new Editor(drawable.clone());


    }
}
