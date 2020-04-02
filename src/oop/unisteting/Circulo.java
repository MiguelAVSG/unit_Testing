package oop.unisteting;

public class Circulo {
    int radio;

    public void setRadio(int radio) {
        if (radio <= 0){
            throw new IllegalArgumentException("Radio must be greater than zero");
        }
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public double getArea(){
        return (radio*radio*3.14);
    }
}
