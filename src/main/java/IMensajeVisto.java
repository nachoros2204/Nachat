package main.java;

import java.time.LocalDateTime;

public interface IMensajeVisto {
    boolean getVisto(); //muestra si el mensaje fue visto
    LocalDateTime getFecha(); //fecha en la que se vio el mensaje
}
