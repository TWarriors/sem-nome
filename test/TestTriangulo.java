/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import java.util.Set;
import static org.junit.Assert.*;
import java.util.HashSet;

/**
 *
 * @author lucie
 */
public class TestTriangulo {
    
    public TestTriangulo() {
    }

    @Test
    public void testTrianguloEquilatero() {
        Triangulo triangulo = new Triangulo();
        
        Set<String> resultado;
        resultado = triangulo.make(3, 3, 3).setHipotenusa().setResultado().getResultado();
        
        int i = 0;
        
        for(String propriedade : resultado) {
            if(i == 0) {
                assertEquals("Válido", propriedade);
            } else if (i == 1) {
                assertEquals("Equilátero", propriedade);
            }
            
            i++;
        }
    }
    
    @Test
    public void testTrianguloIsoceles() {
        Triangulo triangulo = new Triangulo();
        
        Set<String> resultado;
        resultado = triangulo.make(4, 4, 5).setHipotenusa().setResultado().getResultado();
        
        int i = 0;
        
        for(String propriedade : resultado) {
            if(i == 0) {
                assertEquals("Válido", propriedade);
            } else if (i == 1) {
                assertEquals("Isósceles", propriedade);
            }
            
            i++;
        }
    }
    
    @Test
    public void testTrianguloEscaleno() {
        Triangulo triangulo = new Triangulo();
        
        Set<String> resultado;
        resultado = triangulo.make(5, 7, 8).setHipotenusa().setResultado().getResultado();
        
        int i = 0;
        
        for(String propriedade : resultado) {
            if(i == 0) {
                assertEquals("Escaleno", propriedade);
            } else if (i == 1) {
                assertEquals("Válido", propriedade);
            }
            
            i++;
        }
    }
}
