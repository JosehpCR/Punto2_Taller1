package org.Aplicacion;

import com.google.gson.Gson;
import org.Dominio.IProcesarDatos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProcesarJSON implements IProcesarDatos {
    private String texto;
    public ProcesarJSON(String texto) {
        this.texto = texto;
    }
    @Override
    public String procesar() {
        Gson gson = new Gson();
        TextoDTO textoDTO = new TextoDTO(texto);
        return gson.toJson(textoDTO);
    }
}
