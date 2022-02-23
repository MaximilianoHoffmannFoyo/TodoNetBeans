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
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        fail("The test case is a prototype.");
    }

    @Test
    public void testClasificacionTallas() {
        System.out.println("ClasificacionTallas");
        Main.ClasificacionTallas();
        fail("The test case is a prototype.");
    }
    
}
