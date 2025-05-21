package org.Aplicacion;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import org.Dominio.IProcesarDatos;

import java.io.StringWriter;

public class ProcesarXML implements IProcesarDatos {

    private final String texto;

    public ProcesarXML(String texto) {
        this.texto = texto;
    }

    @Override
    public String procesar() {
        try {
            TextoDTO textoDTO = new TextoDTO(texto);
            JAXBContext context = JAXBContext.newInstance(TextoDTO.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();
            marshaller.marshal(textoDTO,sw);
            return sw.toString();
        }catch (Exception e){
            return "Error al procesar XML:  "+e.getMessage();
        }
    }
}
