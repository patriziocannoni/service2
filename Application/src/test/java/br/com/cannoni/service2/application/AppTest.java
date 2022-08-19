package br.com.cannoni.service2.application;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.cannoni.service2.domain.TipoDocumento;

class AppTest {

    @Test
    public void appToString_Ok() {
        App app = new App();
        assertEquals("App", app.toString());
    }

    @Test
    void verificaDocumentoTest() {
        String tipoDocumentoSt = "CPF";
        TipoDocumento tipoDocumento = new App().verificaDocumento(tipoDocumentoSt);
        assertEquals(TipoDocumento.CPF, tipoDocumento);
    }
    
}
