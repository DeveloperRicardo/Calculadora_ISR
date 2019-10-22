package com.example.calculadoraisr;

public class clsISR {
    // Campos
    private Double ingreso;
    private Double limiteInferior;
    private Double excLimiteInferior;
    private Double porcExcLimiteInferior;
    private Double impuestoMarginal;
    private Double cuotaFijaImpuesto;
    private Double ISRdeterminado;
    private Double subsidio;
    private Double subsidioEmpleo;

    // Propiedades
    public Double getIngreso() {
        return ingreso;
    }
    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public Double getLimiteInferior() {
        return limiteInferior;
    }
    public void setLimiteInferior(Double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public Double getExcLimiteInferior() {
        return excLimiteInferior;
    }
    public void setExcLimiteInferior(Double excLimiteInferior) {
        this.excLimiteInferior = excLimiteInferior;
    }

    public Double getPorcExcLimiteInferior() {
        return porcExcLimiteInferior;
    }
    public void setPorcExcLimiteInferior(Double porcExcLimiteInferior) {
        this.porcExcLimiteInferior = porcExcLimiteInferior;
    }

    public Double getImpuestoMarginal() {
        return impuestoMarginal;
    }
    public void setImpuestoMarginal(Double impuestoMarginal) {
        this.impuestoMarginal = impuestoMarginal;
    }

    public Double getCuotaFijaImpuesto() {
        return cuotaFijaImpuesto;
    }
    public void setCuotaFijaImpuesto(Double cuotaFijaImpuesto) {
        this.cuotaFijaImpuesto = cuotaFijaImpuesto;
    }

    public Double getISRdeterminado() {
        return ISRdeterminado;
    }
    public void setISRdeterminado(Double ISRdeterminado) {
        this.ISRdeterminado = ISRdeterminado;
    }

    public Double getSubsidio() {
        return subsidio;
    }
    public void setSubsidio(Double subsidio) {
        this.subsidio = subsidio;
    }

    public Double getSubsidioEmpleo() {
        return subsidioEmpleo;
    }
    public void setSubsidioEmpleo(Double subsidioEmpleo) {
        this.subsidioEmpleo = subsidioEmpleo;
    }

    // Métodos
    public clsISR() {
        ingreso = 0.00;
        limiteInferior = 0.00;
        excLimiteInferior = 0.00;
        porcExcLimiteInferior = 0.00;
        impuestoMarginal = 0.00;
        cuotaFijaImpuesto = 0.00;
        ISRdeterminado = 0.00;
        subsidio = 0.00;
        subsidioEmpleo = 0.00;
    }

    public void calcularCuotaFijaPorcentajeSemanal(){
        if (ingreso >= 0.01 && ingreso <= 133.21) {
            limiteInferior = 0.01;
            cuotaFijaImpuesto = 0.00;
            porcExcLimiteInferior = 1.92;
        }
        else if (ingreso >= 133.22 && ingreso <= 1130.64) {
            limiteInferior = 133.22;
            cuotaFijaImpuesto = 2.59;
            porcExcLimiteInferior = 6.40;
        }
        else if (ingreso >= 1130.65 && ingreso >= 1987.02) {
            limiteInferior = 1130.65;
            cuotaFijaImpuesto = 66.36;
            porcExcLimiteInferior = 10.88;
        }
        else if (ingreso >= 1987.03 && ingreso >= 2309.79) {
            limiteInferior = 1987.03;
            cuotaFijaImpuesto = 159.53;
            porcExcLimiteInferior = 16.00;
        }
        else if (ingreso >= 2309.80 && ingreso >= 2765.42) {
            limiteInferior = 2309.80;
            cuotaFijaImpuesto = 211.19;
            porcExcLimiteInferior = 17.92;
        }
        else if (ingreso >= 2765.43 && ingreso >= 5577.53) {
            limiteInferior = 2765.43;
            cuotaFijaImpuesto = 292.88;
            porcExcLimiteInferior = 21.36;
        }
        else if (ingreso >= 5577.54 && ingreso >= 8790.95) {
            limiteInferior = 5577.54;
            cuotaFijaImpuesto = 893.55;
            porcExcLimiteInferior = 23.52;
        }
        else if (ingreso >= 8790.96 && ingreso >= 16783.34) {
            limiteInferior = 8790.96;
            cuotaFijaImpuesto = 1649.34;
            porcExcLimiteInferior = 30.00;
        }
        else if (ingreso >= 16783.35 && ingreso >= 22377.74) {
            limiteInferior = 16783.35;
            cuotaFijaImpuesto = 4047.05;
            porcExcLimiteInferior = 32.00;
        }
        else if (ingreso >= 22377.75 && ingreso >= 67133.22) {
            limiteInferior = 22377.75;
            cuotaFijaImpuesto = 5837.23;
            porcExcLimiteInferior = 34.00;
        }
        else if (ingreso >= 67133.23) {
            limiteInferior = 67133.23;
            cuotaFijaImpuesto = 21054.11;
            porcExcLimiteInferior = 35.00;
        }
    }

    public void calcularCuotaFijaPorcentajeQuincenal() {
        if (ingreso >= 0.01 && ingreso <= 285.45) {
            limiteInferior = 0.01;
            cuotaFijaImpuesto = 0.00;
            porcExcLimiteInferior = 1.92;
        }
        else if (ingreso >= 285.46 && ingreso <= 2422.80) {
            limiteInferior = 285.46;
            cuotaFijaImpuesto = 5.55;
            porcExcLimiteInferior = 6.40;
        }
        else if (ingreso >= 2422.81 && ingreso <= 4257.90) {
            limiteInferior = 2422.81;
            cuotaFijaImpuesto = 142.20;
            porcExcLimiteInferior = 10.88;
        }
        else if (ingreso >= 4257.91 && ingreso <= 4949.55) {
            limiteInferior = 4257.91;
            cuotaFijaImpuesto = 341.85;
            porcExcLimiteInferior = 16.00;
        }
        else if (ingreso >= 4949.56 && ingreso <= 5925.90) {
            limiteInferior = 4949.56;
            cuotaFijaImpuesto = 452.55;
            porcExcLimiteInferior = 17.92;
        }
        else if (ingreso >= 5925.91 && ingreso <= 11951.85) {
            limiteInferior = 5925.91;
            cuotaFijaImpuesto = 627.60;
            porcExcLimiteInferior = 21.36;
        }
        else if (ingreso >= 11951.86 && ingreso <= 18837.75) {
            limiteInferior = 11951.86;
            cuotaFijaImpuesto = 1914.75;
            porcExcLimiteInferior = 23.52;
        }
        else if (ingreso >= 18837.76 && ingreso <= 35964.30) {
            limiteInferior = 18837.76;
            cuotaFijaImpuesto = 3534.30;
            porcExcLimiteInferior = 30.00;
        }
        else if (ingreso >= 35964.31 && ingreso <= 47952.30) {
            limiteInferior = 35964.31;
            cuotaFijaImpuesto = 8672.25;
            porcExcLimiteInferior = 32.00;
        }
        else if (ingreso >= 47952.31 && ingreso <= 143856.90) {
            limiteInferior = 47952.31;
            cuotaFijaImpuesto = 12508.35;
            porcExcLimiteInferior = 34.00;
        }
        else if (ingreso >= 143856.91) {
            limiteInferior = 143856.91;
            cuotaFijaImpuesto = 45115.95;
            porcExcLimiteInferior = 35.00;
        }
    }

    public void calcularCuotaFijaPorcentajeMensual() {
        if (ingreso >= 0.01 && ingreso <= 578.52) {
            limiteInferior = 0.01;
            cuotaFijaImpuesto = 0.00;
            porcExcLimiteInferior = 1.92;
        }
        else if (ingreso >= 278.53 && ingreso <= 4910.18) {
            limiteInferior = 278.53;
            cuotaFijaImpuesto = 11.11;
            porcExcLimiteInferior = 6.40;
        }
        else if (ingreso >= 4910.19 && ingreso >= 8629.20) {
            limiteInferior = 4910.19;
            cuotaFijaImpuesto = 288.33;
            porcExcLimiteInferior = 10.88;
        }
        else if (ingreso >= 8629.21 && ingreso >= 10031.07) {
            limiteInferior = 8628.21;
            cuotaFijaImpuesto = 692.96;
            porcExcLimiteInferior = 16.00;
        }
        else if (ingreso >= 10031.08 && ingreso >= 12009.94) {
            limiteInferior = 10031.08;
            cuotaFijaImpuesto = 917.26;
            porcExcLimiteInferior = 17.92;
        }
        else if (ingreso >= 12009.95 && ingreso >= 24222.31) {
            limiteInferior = 12009.95;
            cuotaFijaImpuesto = 1271.87;
            porcExcLimiteInferior = 21.36;
        }
        else if (ingreso >= 24222.32 && ingreso >= 38177.69) {
            limiteInferior = 24222.32;
            cuotaFijaImpuesto = 3880.44;
            porcExcLimiteInferior = 23.52;
        }
        else if (ingreso >= 38177.70 && ingreso >= 72887.50) {
            limiteInferior = 38177.70;
            cuotaFijaImpuesto = 7162.74;
            porcExcLimiteInferior = 30.00;
        }
        else if (ingreso >= 72887.51 && ingreso >= 97183.33) {
            limiteInferior = 72887.51;
            cuotaFijaImpuesto = 17575.69;
            porcExcLimiteInferior = 32.00;
        }
        else if (ingreso >= 97183.34 && ingreso >= 291550.00) {
            cuotaFijaImpuesto = 25350.35;
            porcExcLimiteInferior = 34.00;
        }
        else if (ingreso >= 291550.01) {
            limiteInferior = 291550.01;
            cuotaFijaImpuesto = 91435.02;
            porcExcLimiteInferior = 35.00;
        }
    }

    public void cantidadSubsidioSemanal() {
        if (ingreso >= 0.01 && ingreso <= 407.33)
            subsidio = 93.66;
        else if (ingreso >= 407.34 && ingreso <= 799.68)
            subsidio = 93.66;
        else if (ingreso >= 799.69 && ingreso <= 814.66)
            subsidio = 90.44;
        else if (ingreso >= 814.67 && ingreso <= 1023.75)
            subsidio = 88.06;
        else if (ingreso >= 1023.76 && ingreso <= 1086.19)
            subsidio = 81.55;
        else if (ingreso >= 1086.20 && ingreso <= 1228.57)
            subsidio = 74.83;
        else if (ingreso >= 1228.58 && ingreso <= 1433.32)
            subsidio = 67.83;
        else if (ingreso >= 1433.33 && ingreso <= 1638.07)
            subsidio = 58.38;
        else if (ingreso >= 1638.08 && ingreso <= 1699.88)
            subsidio = 50.12;
        else if (ingreso >= 1699.89)
            subsidio = 0.00;
    }

    public void cantidadSubsidioQuincenal() {
        if (ingreso >= 0.01 && ingreso <= 872.85)
            subsidio = 200.85;
        else if (ingreso >= 872.86 && ingreso <= 1713.60)
            subsidio = 200.70;
        else if (ingreso >= 1713.61 && ingreso <= 1745.70)
            subsidio = 193.80;
        else if (ingreso >= 1745.71 && ingreso <= 2193.75)
            subsidio = 188.70;
        else if (ingreso >= 2193.76 && ingreso <= 2327.55)
            subsidio = 174.75;
        else if (ingreso >= 2327.56 && ingreso <= 2632.65)
            subsidio = 160.35;
        else if (ingreso >= 2632.66 && ingreso <= 3071.40)
            subsidio = 145.35;
        else if (ingreso >= 3071.41 && ingreso <= 3510.15)
            subsidio = 125.10;
        else if (ingreso >= 3510.16 && ingreso <= 3642.60)
            subsidio = 107.40;
        else if (ingreso >= 3642.61)
            subsidio = 0.00;
    }

    public void cantidadSubsidioMensual() {
        if (ingreso >= 0.01 && ingreso <= 1768.96)
            subsidio = 407.02;
        else if (ingreso >= 1768.97 && ingreso <= 2653.38)
            subsidio = 406.83;
        else if (ingreso >= 2653.39 && ingreso <= 3472.84)
            subsidio = 406.62;
        else if (ingreso >= 3472.85 && ingreso <= 3537.87)
            subsidio = 392.77;
        else if (ingreso >= 3537.88 && ingreso <= 4446.15)
            subsidio = 382.46;
        else if (ingreso >= 4446.16 && ingreso <= 4717.18)
            subsidio = 354.23;
        else if (ingreso >= 4717.19 && ingreso <= 5335.42)
            subsidio = 324.87;
        else if (ingreso >= 5335.43 && ingreso <= 6224.67)
            subsidio = 294.63;
        else if (ingreso >= 6224.68 && ingreso <= 7113.90)
            subsidio = 253.54;
        else if (ingreso >= 7113.91 && ingreso <= 7382.33)
            subsidio = 217.61;
        else if (ingreso >= 7382.34)
            subsidio = 0.00;
    }

    public void resultado() {
        porcExcLimiteInferior = porcExcLimiteInferior / 100;
        excLimiteInferior = ingreso - limiteInferior;
        impuestoMarginal = excLimiteInferior * porcExcLimiteInferior;
        ISRdeterminado = impuestoMarginal + cuotaFijaImpuesto;
        subsidioEmpleo = ISRdeterminado - subsidio;

        if (subsidioEmpleo < 0)
            subsidioEmpleo *= -1;
    }
}
