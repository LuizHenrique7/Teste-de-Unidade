public class ResultadosLaboratoriais {

    private float Triglicerides;

    private float ColesterolTotal;

    private float ColesterolHDL;

    private float ColesterolLDL;

    private float ColesterolVLDL;

    private float Glicose;

    public float getTriglicerides() {
        return Triglicerides;
    }

    public void setTriglicerides(float triglicerides) {
        Triglicerides = triglicerides;
    }

    public float getColesterolTotal() {
        return ColesterolTotal;
    }

    public void setColesterolTotal(float colesterolTotal) {
        ColesterolTotal = colesterolTotal;
    }

    public float getColesterolHDL() {
        return ColesterolHDL;
    }

    public void setColesterolHDL(float colesterolHDL) {
        ColesterolHDL = colesterolHDL;
    }

    public float getColesterolLDL() {
        return ColesterolLDL;
    }

    public void setColesterolLDL(float colesterolLDL) {
        ColesterolLDL = colesterolLDL;
    }

    public float getColesterolVLDL() {
        return ColesterolVLDL;
    }

    public void setColesterolVLDL(float colesterolVLDL) {
        ColesterolVLDL = colesterolVLDL;
    }

    public float getGlicose() {
        return Glicose;
    }

    public void setGlicose(float glicose) {
        Glicose = glicose;
    }


    public String verificadorDeResultadosTriglicerides() {
        float resultados;
        resultados = this.Triglicerides;
        if (resultados <= 0) {
            throw new IllegalArgumentException("Valor inserido não deve ser menor ou igual a zero");
        } else {
            if (resultados < 150) {
                return "Nível de Triglicérides desejável";
            } else {
                if (resultados <= 199) {
                    return "Nível de Triglicérides limítrofe";
                } else {
                    if (!(resultados == 200) && (resultados <= 499)) {
                        return "Nível de Triglicérides alto";
                    } else {
                        return "Nível de Triglicérides muito alto";
                    }
                }

            }
        }
    }

    public String verificadorDeResultadosColesterolTotal() {
        float resultado;
        resultado = this.ColesterolTotal;
        if (resultado <= 0) {
            throw new IllegalArgumentException("Valor inserido não deve ser menor ou igual a zero");
        } else {
            if (resultado < 200) {
                return "Nível de Colesterol total desejável";
            } else {
                if (!(resultado == 200) && (resultado <= 239)) {
                    return "Nível de Colesterol total limítrofe";
                } else {
                    return "Nível de Colesterol total elevado";
                }
            }
        }
    }

    public String verificadorDeResultadosColesterolHDL() {
        float resultado;
        resultado = this.ColesterolHDL;
        if (resultado <= 0) {
            throw new IllegalArgumentException("Valor inserido não deve ser menor ou igual a zero");
        } else {
            if (resultado < 40) {
                return "Nível de Colesterol HDL baixo";
            } else {
                if (!(resultado == 40) && (resultado <= 60)) {
                    return "Nível de Colesterol HDL normal";
                } else {
                    return "Nível de Colesterol HDL desejável";
                }
            }
        }
    }

    public String verificadorDeResultadosColesterolLDL() {
        float resultado;
        resultado = this.ColesterolLDL;
        if (resultado <= 0) {
            throw new IllegalArgumentException("Valor inserido não deve ser menor ou igual a zero");
        } else {
            if (resultado < 100) {
                return "Nível de Colesterol LDL ótimo";
            } else {
                if (resultado <= 129) {
                    return "Nível de Colesterol LDL desejável";
                } else {
                    if (!(resultado == 130) && (resultado <= 159)) {
                        return "Nível de Colesterol LDL limítrofe";
                    } else {
                        if (!(resultado == 160) && (resultado <= 189)) {
                            return "Nível de Colesterol LDL alto";
                        } else {
                            return "Nível de Colesterol LDL muito alto";
                        }
                    }
                }
            }
        }
    }

    public String verificadorDeResultadosColesterolVLDL(){
        float resultado;
        resultado = this.ColesterolVLDL;
        if (resultado <= 0) {
            throw new IllegalArgumentException("Valor inserido não deve ser menor ou igual a zero");
        }else{
            if (resultado < 30){
                return "Nível de Colesterol VLDL desejável";
            } else{
                if (!(resultado == 30) && (resultado <=40)) {
                    return "Nível de Colesterol VLDL limítrofe";
                }else{
                    return "Nível de Colesterol VLDL elevado";
                }
            }
        }
    }
    public String verificadorDeResultadosGlicose(){
        float resultado;
        resultado = this.Glicose;
        if (resultado <= 0) {
            throw new IllegalArgumentException("Valor inserido não deve ser menor ou igual a zero");
        }else{
            if (resultado < 60){
                return "Nível de Glicose hipoglicemia";
            }else{
                if (!(resultado == 60) && (resultado <=99)){
                    return "Nível de Glicose desejável";
                }else{
                    if (!(resultado == 100) && (resultado <=125)) {
                        return "Nível de Glicose é glicemia de jejum inapropriada";
                    }else{
                        return "Nível de Glicose diabetes";
                    }
                }
            }
        }
    }

}
