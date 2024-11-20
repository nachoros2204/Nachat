package tests.java;

import org.junit.Test;

import main.java.Chat;
import main.java.Mensaje;
import main.java.Usuario;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class VistosTests {

    @Test
    public void testMarcarComoVisto() {
        Usuario usuario1 = new Usuario("Juan", "123");
        Usuario usuario2 = new Usuario("Nacho", "456");

        Mensaje mensaje = new Mensaje("Mensaje", LocalDateTime.now());

        Chat chat = new Chat();
        chat.enviarMensaje(mensaje, usuario1, usuario2);

        //el mensaje no ha sido visto
        assertFalse(mensaje.esVistoPor(usuario1));

        //marcamos el mensaje como visto por el usuario1
        mensaje.marcarComoVisto(usuario1);

        assertTrue(mensaje.esVistoPor(usuario1));
    }
}
