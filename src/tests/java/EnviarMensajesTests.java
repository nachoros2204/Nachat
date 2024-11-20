package tests.java;

import main.java.Chat;
import main.java.Grupo;
import main.java.Mensaje;
import main.java.Usuario;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;

public class EnviarMensajesTests {

    @Test
    public void testEnviarMensajeAGrupo() {
        //creamos usuarios
        Usuario usuario1 = new Usuario("Juan", "123");
        Usuario usuario2 = new Usuario("Nacho", "456");
        Usuario usuario3 = new Usuario("Jose", "789");


        //creamos grupo y agregamos miembros
        Grupo grupo = new Grupo("LOS PIBES");
        grupo.agregarMiembro(usuario1);
        grupo.agregarMiembro(usuario2);
        grupo.agregarMiembro(usuario3);

        //creamos un mensaje
        Mensaje mensaje = new Mensaje("hola");

        //creamos chat y enviamos el mensaje al grupo
        Chat chat = new Chat(grupo);
        chat.enviarMensaje(mensaje, usuario1);
        chat.enviarMensaje(mensaje, usuario1);

        //verificamos que los usuarios recibieron el mensaje
        assertEquals(1, usuario1.getMensajesRecibidos().size());
        assertEquals(1, usuario2.getMensajesRecibidos().size());
        assertEquals(1, usuario3.getMensajesRecibidos().size());
        assertEquals(mensaje.getTexto(), usuario1.getMensajesRecibidos().get(0).getTexto());
        assertEquals(mensaje.getTexto(), usuario2.getMensajesRecibidos().get(0).getTexto());
        assertEquals(mensaje.getTexto(), usuario3.getMensajesRecibidos().get(0).getTexto());
    }

    @Test
    public void testEnviarMensajeAUsuario() {

        Usuario usuario1 = new Usuario("Juan", "123");
        Usuario usuario2 = new Usuario("Nacho", "456");

        Mensaje mensaje = new Mensaje("Mensaje", usuario1);


        Chat chat = new Chat();
        chat.agregar(usuario1);
        chat.agregar(usuario2);
        
        chat.enviar(mensaje);

        //verificar que usuario2 ha recibido el mensaje
        assertEquals(1, chat.getMensajesChat().size());
        assertEquals("Mensaje", chat.getMensajesChat().get(0).getTexto());
        assertEquals("Juan", chat.getMensajesChat().get(0).getUsuarioRemitente().getNombre());
    }

    @Test
    public void testAutomensaje() {

        Usuario usuario1 = new Usuario("Juan", "123");

        Mensaje mensaje = new Mensaje("Mensaje");

        Chat chat = new Chat(usuario1);
        chat.enviarMensaje(mensaje, usuario1);

        //verificar que usuario1 ha recibido el mensaje
        assertEquals(1, usuario1.getMensajesRecibidos().size());
        assertEquals(mensaje.getTexto(), usuario1.getMensajesRecibidos().get(0).getTexto());
    }
}
