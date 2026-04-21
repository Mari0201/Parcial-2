package com.parcial;

import com.parcial.modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BatallaTest {

    @Test
    public void testGuerreroEstaVivo() {
        guerrero g = new guerrero("Conan", 100, 15);
        assertTrue(g.estaViva());
    }

    @Test
    public void testGuerreraMuere() {
        guerrero g = new guerrero("Conan", 10, 15);
        g.defender(50);
        assertFalse(g.estaViva());
    }

    @Test
    public void testDragonAtaca() {
        dragon d = new dragon("Smaug", 120, 20);
        guerrero g = new guerrero("Conan", 100, 15);
        int saludAntes = g.getSalud();
        d.atacar(g);
        assertTrue(g.getSalud() < saludAntes);
    }

    @Test
    public void testArmaAumentaDano() {
        Arma a = new Arma(20);
        assertEquals(20, a.getDañoAdicional());
    }
}
