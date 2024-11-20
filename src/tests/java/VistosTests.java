package tests.java;

import org.junit.Test;

import main.java.Mensaje;
import main.java.Usuario;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class VistosTests {

    @Test
    public void testMarcarComoVisto() {
        Usuario usuario1 = new Usuario("Juan", "123456789");
        Mensaje mensaje = new Mensaje("Hola, equipo", LocalDateTime.now());

        //verificamos que el mensaje no ha sido marcado como visto inicialmente
        assertFalse(mensaje.esVistoPor(usuario1));

        //marcamos el mensaje como visto por el usuario1
        mensaje.marcarComoVisto(usuario1);
    }
}
