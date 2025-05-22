package org.Presentacion;

import org.Aplicacion.ProcesarBase64;
import org.Aplicacion.ProcesarJSON;
import org.Aplicacion.ProcesarXML;

import org.Dominio.IProcesarDatos;

public class Main {
    public static void main(String[] args) {
       String textoPlano = "Hola Mundo desde Java";

        IProcesarDatos procesadorJson= new ProcesarJSON(textoPlano);
        IProcesarDatos procesadorXML = new ProcesarXML(textoPlano);
        IProcesarDatos procesadorBase64 = new ProcesarBase64(textoPlano);

        mostrarInformacion(procesadorJson);
        mostrarInformacion(procesadorBase64);
        mostrarInformacion(procesadorXML);

        }

        public static void mostrarInformacion(IProcesarDatos procesador){
            System.out.println(procesador.procesar());
    }
}