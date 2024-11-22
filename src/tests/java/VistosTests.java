package tests.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.java.Chat;
import main.java.Mensaje;
import main.java.MensajeVisto;
import main.java.Usuario;

public class VistosTests {
    @Test
    public void testVistoPorUsuario() {
        //creamos usuario y mensaje
        Usuario usuario1 = new Usuario("Juan", "1234");
        Mensaje mensaje = new Mensaje("Hola", usuario1);

        //se crea chat y enviamos el mensaje
        Chat chat = new Chat();
        chat.agregar(usuario1);
        chat.enviar(mensaje); 

        //el mensaje enviado todavia no es visto
        assertFalse("mensaje sin ver", mensaje.yaVistoPor(usuario1));

        chat.visualizar(usuario1); //el usuario ve el mensaje

        //verficacion de mensaje marcado como visto
        assertTrue("mensaje visto", mensaje.yaVistoPor(usuario1));
    }

    @Test
    public void testFechaVisto() {
        Usuario usuario1 = new Usuario("Juan", "1234");
        Mensaje mensaje = new Mensaje("Hola", usuario1);

        Chat chat = new Chat();
        chat.agregar(usuario1);
        chat.enviar(mensaje);
        chat.visualizar(usuario1);

        //verificamos que hay fecha de vista
        MensajeVisto mensajeVisto = mensaje.getVistos().get(0);  // Obtenemos el primer visto
        assertNotNull("fecha de visto no debe ser null", mensajeVisto.getFechaVisto());

        //verificamos que la fecha de visto es posterior a la fecha antes de ver
        assertTrue("fecha de visto posterior al mensaje enviado", mensajeVisto.getFechaVisto().isAfter(mensaje.getFecha()));
    }
}
