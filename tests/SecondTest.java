package tests;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.beans.Transient;

public class SecondTest {
	private int numeroUno = 5;
    private int numeroDos = 3;
	private WebDriver driver;
	private String[] personas = {
			"Pepe", "Gonzales"
	};
	
	@Test
    public void testNumeroVerdadero() {
        assertTrue(numeroUno==numeroDos+2);
    }

    @Test
    public void testNumeroFalso() {
        assertFalse(numeroUno==numeroDos);
    }

    @Test
    public void testNumerosIguales() {
        assertEquals(numeroUno+10, numeroDos+12);
    }

    @Test 
    public void testNumerosNoIguales() {    
        assertNotEquals(numeroUno-1, numeroDos*514);
    }

    @Test 
    public void testDeNoNulo() {
           
        assertNotNull(personas);
    }

    @Test 
    public void testDeNulo() {
    	
        String juguetes = null;
        assertNull(juguetes);
    }

    @Test 
    public void SameArray() {
       String[] lista = {
    		   "Pepe", "Gonzales"
       };
       assertArrayEquals(personas, lista);
    }
/*
    @Test 
    public void mismoObjeto() {
        String str2 = new String ("abc");
        Personas persona = new Personas("Pepe", "Gonzalez");
        Personas personaDos= persona;
        assertSame(persona, personaDos);
    }
	*/

	
	

}
