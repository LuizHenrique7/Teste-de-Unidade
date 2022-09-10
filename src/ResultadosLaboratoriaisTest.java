import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultadosLaboratoriaisTest {

    @Test
    public void deveTestarValorTriglicerides() {
        try {
            ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
            resultado.setTriglicerides(0);
            resultado.verificadorDeResultadosTriglicerides();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inserido não deve ser menor ou igual a zero", e.getMessage());
        }
    }
    @Test
    void deveTestarTrigliceridesNivelDesejado() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setTriglicerides(149);
        assertEquals("Nível de Triglicérides desejável", resultado.verificadorDeResultadosTriglicerides());
    }
    @Test
    void deveTestarTrigliceridesNivelLimitrofe() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setTriglicerides(198);
        assertEquals("Nível de Triglicérides limítrofe", resultado.verificadorDeResultadosTriglicerides());
    }
    @Test
    void deveTestarTrigliceridesNivelAlto() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setTriglicerides(499);
        assertEquals("Nível de Triglicérides alto", resultado.verificadorDeResultadosTriglicerides());
    }
    @Test
    public void deveTestarValorColesterolTotal() {
        try {
            ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
            resultado.setColesterolTotal(0);
            resultado.verificadorDeResultadosColesterolTotal();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inserido não deve ser menor ou igual a zero", e.getMessage());
        }
    }
    @Test
    void deveTestarTrigliceridesNivelMuitoAlto() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setTriglicerides(500);
        assertEquals("Nível de Triglicérides muito alto", resultado.verificadorDeResultadosTriglicerides());
    }
    @Test
    void deveTestarColesterolTotalDesejavel() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolTotal(199);
        assertEquals("Nível de Colesterol total desejável", resultado.verificadorDeResultadosColesterolTotal());
    }
    @Test
    void deveTestarColesterolTotalLimitrofe() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolTotal(238);
        assertEquals("Nível de Colesterol total limítrofe", resultado.verificadorDeResultadosColesterolTotal());
    }
    @Test
    void deveTestarColesterolTotalElevado() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolTotal(240);
        assertEquals("Nível de Colesterol total elevado", resultado.verificadorDeResultadosColesterolTotal());
    }
    @Test
    public void deveTestarValorColesterolHDL() {
        try {
            ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
            resultado.setColesterolHDL(0);
            resultado.verificadorDeResultadosColesterolHDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inserido não deve ser menor ou igual a zero", e.getMessage());
        }
    }
    @Test
    void deveTestarColesterolHDLBaixo() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolHDL(39);
        assertEquals("Nível de Colesterol HDL baixo", resultado.verificadorDeResultadosColesterolHDL());
    }
    @Test
    void deveTestarColesterolHDLNormal() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolHDL(59);
        assertEquals("Nível de Colesterol HDL normal", resultado.verificadorDeResultadosColesterolHDL());
    }
    @Test
    void deveTestarColesterolHDLDesejavel() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolHDL(61);
        assertEquals("Nível de Colesterol HDL desejável", resultado.verificadorDeResultadosColesterolHDL());
    }
    @Test
    public void deveTestarValorColesterolLDL() {
        try {
            ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
            resultado.setColesterolLDL(0);
            resultado.verificadorDeResultadosColesterolLDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inserido não deve ser menor ou igual a zero", e.getMessage());
        }
    }
    @Test
    void deveTestarColesterolLDLOtimo() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolLDL(99);
        assertEquals("Nível de Colesterol LDL ótimo", resultado.verificadorDeResultadosColesterolLDL());
    }
    @Test
    void deveTestarColesterolLDLDesejavel() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolLDL(128);
        assertEquals("Nível de Colesterol LDL desejável", resultado.verificadorDeResultadosColesterolLDL());
    }
    @Test
    void deveTestarColesterolLDLLimitrofe() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolLDL(158);
        assertEquals("Nível de Colesterol LDL limítrofe", resultado.verificadorDeResultadosColesterolLDL());
    }
    @Test
    void deveTestarColesterolLDLAlto() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolLDL(188);
        assertEquals("Nível de Colesterol LDL alto", resultado.verificadorDeResultadosColesterolLDL());
    }
    @Test
    void deveTestarColesterolLDLMuitoAlto() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolLDL(191);
        assertEquals("Nível de Colesterol LDL muito alto", resultado.verificadorDeResultadosColesterolLDL());
    }
    @Test
    public void deveTestarValorColesterolVLDL() {
        try {
            ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
            resultado.setColesterolVLDL(0);
            resultado.verificadorDeResultadosColesterolVLDL();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inserido não deve ser menor ou igual a zero", e.getMessage());
        }
    }
    @Test
    void deveTestarColesterolVLDLDesejavel() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolVLDL(29);
        assertEquals("Nível de Colesterol VLDL desejável", resultado. verificadorDeResultadosColesterolVLDL());
    }
    @Test
    void deveTestarColesterolVLDLLimItrofe() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolVLDL(39);
        assertEquals("Nível de Colesterol VLDL limítrofe", resultado. verificadorDeResultadosColesterolVLDL());
    }
    @Test
    void deveTestarColesterolVLDLElevado() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setColesterolVLDL(41);
        assertEquals("Nível de Colesterol VLDL elevado", resultado. verificadorDeResultadosColesterolVLDL());
    }
    @Test
    public void deveTestarValorGlicose() {
        try {
            ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
            resultado.setGlicose(0);
            resultado.verificadorDeResultadosGlicose();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor inserido não deve ser menor ou igual a zero", e.getMessage());
        }
    }
    @Test
    void deveTestarGlicoseHipoglicemiao() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setGlicose(59);
        assertEquals("Nível de Glicose hipoglicemia", resultado. verificadorDeResultadosGlicose());
    }
    @Test
    void deveTestarGlicoseDesejavel() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setGlicose(98);
        assertEquals("Nível de Glicose desejável", resultado. verificadorDeResultadosGlicose());
    }
    @Test
    void deveTestarGlicoseGlicemia() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setGlicose(124);
        assertEquals("Nível de Glicose é glicemia de jejum inapropriada", resultado. verificadorDeResultadosGlicose());
    }
    @Test
    void deveTestarGlicoseDiabetes() {
        ResultadosLaboratoriais resultado = new ResultadosLaboratoriais();
        resultado.setGlicose(126);
        assertEquals("Nível de Glicose diabetes", resultado. verificadorDeResultadosGlicose());
    }

}