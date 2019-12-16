/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author ADMINISTRADOR
 */
public class demoTest {

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSuma() {

        int resultado = maven.junit.demo.suma(2, 3);
        int esperado = 5;
        TestCase.assertEquals(esperado, resultado);

    }

    @Test
    public void testResta() {

        int resultado = maven.junit.demo.suma(3, 2);
        int esperado = 5;
        TestCase.assertEquals(esperado, resultado);

    }
}
