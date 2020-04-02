package oop.unisteting;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrianguloTest {

    @Test
    public void givenEvenBaseAndHeiht_whenGetArea_theValideAreaIsReturned(){
        Triangulo triangulo= new Triangulo();
        triangulo.setBase(2);
        triangulo.setHeight(6);

        double area= triangulo.getArea();
        assertEquals("Area is no valid", 6.0, area);
    }

    @Test
    public void givenOddBaseAndHeiht_whenGetArea_theValideAreaIsReturned(){
        Triangulo triangulo= new Triangulo();
        triangulo.setBase(3);
        triangulo.setHeight(5);

        double area= triangulo.getArea();
        assertEquals("Area is no valid", 7.5, area);
    }

    @Test (expected = IllegalArgumentException.class)
    public void givenNegativeBase_whenGetArea_theValideAreaIsReturned(){
        Triangulo triangulo= new Triangulo();
        triangulo.setBase(-3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void givenEvenHeightAndHeiht_whenGetArea_theValideAreaIsReturned(){
        Triangulo triangulo= new Triangulo();
        triangulo.setHeight(-2);
    }
}


