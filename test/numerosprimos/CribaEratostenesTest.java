/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laura
 */
public class CribaEratostenesTest {
    
    public CribaEratostenesTest() {
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
     * Test of generarPrimos method, of class CribaEratostenes.
     */
    @Test
    public void testGenerarPrimos0() {
        System.out.println("generarPrimos 0");
        int max = 0;
        int[] result = CribaEratostenes.generarPrimos(max);
        for (int i=0;i<result.length;i++)
            System.out.println(result[i]);
        
    }
    
        @Test
    public void testGenerarPrimos2() {
        System.out.println("generarPrimos 2");
        int max = 2;
        int[] result = CribaEratostenes.generarPrimos(max);
        for (int i=0;i<result.length;i++)
            System.out.println(result[i]);
        
    }
    
        @Test
    public void testGenerarPrimos3() {
        System.out.println("generarPrimos 3");
        int max = 3;
        int[] result = CribaEratostenes.generarPrimos(max);
        for (int i=0;i<result.length;i++)
            System.out.println(result[i]);
        
    }
    
        @Test
    public void testGenerarPrimos100() {
        System.out.println("generarPrimos 100");
        int max = 100;
        int[] result = CribaEratostenes.generarPrimos(max);
        for (int i=0;i<result.length;i++)
            System.out.println(result[i]);
        
    }
    
}
