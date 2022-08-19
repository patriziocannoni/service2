package br.com.cannoni.service2.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TipoDocumentoTest {

    @Test
    void tipoDocumentoCP_posicao_1_ok() {
        TipoDocumento[] tipoDocumentos = TipoDocumento.values();
        assertEquals(TipoDocumento.CPF, tipoDocumentos[0]);
    }
    
}
