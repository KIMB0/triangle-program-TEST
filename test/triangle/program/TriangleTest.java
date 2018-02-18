/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle.program;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kim
 */
public class TriangleTest {

    public TriangleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSideA method, of class Triangle.
     */
    @Test
    public void testGetSideA() {
        System.out.println("getSideA");
        Triangle instance = new Triangle();
        instance.setSideA(5);
        int expResult = 5;
        int result = instance.getSideA();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSideB method, of class Triangle.
     */
    @Test
    public void testGetSideB() {
        System.out.println("getSideB");
        Triangle instance = new Triangle();
        instance.setSideB(5);
        int expResult = 5;
        int result = instance.getSideB();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSideC method, of class Triangle.
     */
    @Test
    public void testGetSideC() {
        System.out.println("getSideC");
        Triangle instance = new Triangle();
        instance.setSideC(5);
        int expResult = 5;
        int result = instance.getSideC();
        assertEquals(expResult, result);
    }

    /**
     * Test of giveTriangle method, of class Triangle.
     */
    @Test
    public void testGiveEquilateralTriangle() {
        System.out.println("giveEquilateralTriangle");
        int sideA = 12;
        int sideB = 12;
        int sideC = 12;
        Triangle instance = new Triangle();
        String expResult = "====== Your triangle is a equilateral triangle ======";
        String result = instance.giveTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }

    @Test
    public void testGiveIsoscelesTriangle() {
        System.out.println("giveIsoscelesTriangle");
        int sideA = 12;
        int sideB = 12;
        int sideC = 8;
        Triangle instance = new Triangle();
        String expResult = "====== Your triangle is a isosceles triangle ======";
        String result = instance.giveTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }

    @Test
    public void testGiveScaleneTriangle() {
        System.out.println("giveScaleneTriangle");
        int sideA = 12;
        int sideB = 13;
        int sideC = 8;
        Triangle instance = new Triangle();
        String expResult = "====== Your triangle is a scalene triangle ======";
        String result = instance.giveTriangle(sideA, sideB, sideC);
        assertEquals(expResult, result);
    }

}
