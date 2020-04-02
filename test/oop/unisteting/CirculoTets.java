package oop.unisteting;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CirculoTets {

    @Test
    public void givenEvenRadio_whenGetArea_theValideAreaIsReturned(){
        Circulo circulo = new Circulo();
        circulo.setRadio(1);

        double area = circulo.getArea();
        assertEquals("Area is no valid", 3.14, area);
    }

    @Test
    public void givenOddRadio_whenGetArea_theValideAreaIsReturned(){
        Circulo circulo = new Circulo();
        circulo.setRadio(5);

        double area = circulo.getArea();
        assertEquals("Area is no valid", 78.5, area);
    }

    @Test (expected = IllegalArgumentException.class)
    public void givenNegativeRadio_whenGetArea_theValideAreaIsReturned(){
        Circulo circulo = new Circulo();
        circulo.setRadio(-5);
    }
}
