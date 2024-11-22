package main.java;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends ParticipanteDeChat {
    private String numeroTelefono;
    private List<Mensaje> mensajesRecibidos;

    public Usuario(String nombre, String numeroTelefono) {
        super(nombre);
        this.numeroTelefono = numeroTelefono;
        this.mensajesRecibidos = new ArrayList<>();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    @Override
    public void recibirMensaje(Mensaje mensaje) {
        mensajesRecibidos.add(mensaje);//el usuario recibe el mensaje
    }   
}
