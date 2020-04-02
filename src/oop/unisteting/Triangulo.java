package oop.unisteting;

public class Triangulo {
    int base;
    int height;

    public void setHeight(int height) {
        if (height <= 0){
            throw new IllegalArgumentException("Radio must be greater than zero");
        }
        this.height = height;
    }

    public void setBase(int base) {
        if (base <= 0){
            throw new IllegalArgumentException("Radio must be greater than zero");
        }
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public int getBase() {
        return base;
    }

    public double getArea(){
        return base * height / 2.0;
    }
}
