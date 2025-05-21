package org.Aplicacion;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TextoDTO")
public class TextoDTO {
    private String texto;

    public TextoDTO() {}

    public TextoDTO(String texto) {
        this.texto = texto;
    }
    @XmlElement
    public String getTexto() {return texto;}
    public void setTexto(String texto) {this.texto = texto;}
}
