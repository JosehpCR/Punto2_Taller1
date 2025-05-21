package org.Aplicacion;

import org.Dominio.IProcesarDatos;

import java.util.Base64;

public class ProcesarBase64 implements IProcesarDatos {
    private String texto;

    public ProcesarBase64(String texto) {
        this.texto = texto;
    }

    @Override
    public String procesar() {
        return Base64.getEncoder().encodeToString(texto.getBytes());
    }
}
