package org.dfargueta.junit5app.ejemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {


    @Test
    void testNombreCuenta(){
        Cuenta cuenta = new Cuenta();
        cuenta.setPersona("Daniel");
        String esperando = "Daniel";
        String real = cuenta.getPersona();
        Assertions.assertEquals(esperando, real);
    }

}