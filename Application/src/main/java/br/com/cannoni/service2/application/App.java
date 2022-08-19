package br.com.cannoni.service2.application;

import br.com.cannoni.service2.domain.TipoDocumento;

public class App {
    
    public static void main(String[] args) {
        System.out.println(TipoDocumento.CPF);
    }

    public TipoDocumento verificaDocumento(String tipoDocumentoSt) {
        return TipoDocumento.valueOf(tipoDocumentoSt);
    }

    @Override
    public String toString() {
        return "App";
    }

}
