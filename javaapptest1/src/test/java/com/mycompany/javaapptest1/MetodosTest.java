/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.javaapptest1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maxi
 */
public class MetodosTest {
    
    public MetodosTest() {
    }

    @Test
    public void testTallasXS() {
        System.out.println("Tallas");
        String t = "XS";
        Metodos instance = new Metodos();
        String expResult = "Extra pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasS() {
        System.out.println("Tallas");
        String t = "S";
        Metodos instance = new Metodos();
        String expResult = "Pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasM() {
        System.out.println("Tallas");
        String t = "M";
        Metodos instance = new Metodos();
        String expResult = "Mediana";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasL() {
        System.out.println("Tallas");
        String t = "L";
        Metodos instance = new Metodos();
        String expResult = "Grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasXL() {
        System.out.println("Tallas");
        String t = "XL";
        Metodos instance = new Metodos();
        String expResult = "Muy grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasXXL() {
        System.out.println("Tallas");
        String t = "XXL";
        Metodos instance = new Metodos();
        String expResult = "Extra grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    @Test
    public void testTallasxs() {
        System.out.println("Tallas");
        String t = "xs";
        Metodos instance = new Metodos();
        String expResult = "Extra pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallass() {
        System.out.println("Tallas");
        String t = "s";
        Metodos instance = new Metodos();
        String expResult = "Pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasm() {
        System.out.println("Tallas");
        String t = "m";
        Metodos instance = new Metodos();
        String expResult = "Mediana";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasl() {
        System.out.println("Tallas");
        String t = "l";
        Metodos instance = new Metodos();
        String expResult = "Grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasxl() {
        System.out.println("Tallas");
        String t = "xl";
        Metodos instance = new Metodos();
        String expResult = "Muy grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasxxl() {
        System.out.println("Tallas");
        String t = "xxl";
        Metodos instance = new Metodos();
        String expResult = "Extra grande";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasNumero() {
        System.out.println("Tallas");
        String t = "5";
        Metodos instance = new Metodos();
        String expResult = "Extra pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    public void testTallasOtrasLetras() {
        System.out.println("Tallas");
        String t = "Q";
        Metodos instance = new Metodos();
        String expResult = "Extra pequeña";
        String result = instance.Tallas(t);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIva1() {
        System.out.println("iva");
        double precio = 2.0;
        Metodos instance = new Metodos();
        double expResult = 2.42;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    @Test
    public void testIva2() {
        System.out.println("iva");
        double precio = "f";
        Metodos instance = new Metodos();
        double expResult = 0.0;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    @Test
    public void testIva3() {
        System.out.println("iva");
        double precio = 0.0;
        Metodos instance = new Metodos();
        double expResult = 0.0;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    @Test
    public void testIva4() {
        System.out.println("iva");
        double precio = -2.0;
        Metodos instance = new Metodos();
        double expResult = 0.0;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    @Test
    public void testIva5() {
        System.out.println("iva");
        double precio = 22222222222222222222222222.0;
        Metodos instance = new Metodos();
        double expResult = 2.6888888888888887E25;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    public void testIva6() {
        System.out.println("iva");
        double precio = 999999999999999999999999999999999999999999999999999999999999999999999999.0;
        Metodos instance = new Metodos();
        double expResult = 1.21E72;
        double result = instance.iva(precio);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    
}
