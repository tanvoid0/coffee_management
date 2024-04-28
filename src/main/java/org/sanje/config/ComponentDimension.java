package org.sanje.config;

public class ComponentDimension {
    final int x;
    final int y;
    final int width;
    final int height;

    public ComponentDimension(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public ComponentDimension(final int width, final int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
