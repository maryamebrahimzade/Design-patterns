package org.mapsa.structural.adapter.shape;

public class Rectangle implements Shape {
    private Integer width;
    private Integer height;

    public Rectangle(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
