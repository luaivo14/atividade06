/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Parte2.Mediana;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lua
 */
public class TestMediana {
    
     @Test
     public void testvetorNulo() {
        double vetor[]= null;
        Mediana mediana = new Mediana();
        try {
            double res = mediana.acharMediana(vetor);
            fail();
        } catch (Exception ex) {
            assertEquals("Erro vetor e nulo", ex.getMessage());
        }
     }
}
