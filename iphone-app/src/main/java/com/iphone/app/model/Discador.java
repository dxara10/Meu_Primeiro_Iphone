package com.iphone.app.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Discador {
    
    public void discar(String numero) {
        // Implementar lógica para discar um número
        System.out.println("Discando o número: " + numero);
    }

    public void discarContato(Contato contato) {
        // Implementar lógica para discar um contato
        System.out.println("Discando o contato: " + contato.getNome() + " - " + contato.getNumero());
    }
}