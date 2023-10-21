/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafae
 */
public class Calcula {

    public Double salarioBruto, salarioLiquido, fgts, inss, ir;

    public Calcula(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public Double getFgts() {
        return fgts;
    }

    public void setFgts(Double fgts) {
        this.fgts = fgts;
    }

    public Double getInss() {
        return inss;
    }

    public void setInss(Double inss) {
        this.inss = inss;
    }

    public Double getIr() {
        return ir;
    }

    public void setIr(Double ir) {
        this.ir = ir;
    }

    public Double calculaFGTS() {
        return this.fgts = this.salarioBruto * 0.08;
    }

    public Double calculaINSS() {
        if (this.salarioBruto <= 1045.00) {
            this.inss = this.salarioBruto * 0.075;
        } else if (this.salarioBruto <= 2089.60) {
            this.inss = this.salarioBruto * 0.09;
        } else if (this.salarioBruto <= 3134.40) {
            this.inss = this.salarioBruto * 0.12;
        } else if (this.salarioBruto <= 6101.06) {
            this.inss = this.salarioBruto * 0.14;
        } else {
            this.inss = 6101.06 * 0.14;
        }
        return this.inss;
    }

    public Double calculaIR() {
        if(this.salarioBruto <= 1903.98){
            this.ir = this.salarioBruto * 0.0;
        } else if (this.salarioBruto <= 2826.65){
            this.ir = (this.salarioBruto - 142.80) * 0.075;
        } else if (this.salarioBruto <= 3751.05){
            this.ir = (this.salarioBruto - 354.80) * 0.15;
        } else if (this.salarioBruto <= 4664.68){
            this.ir = (this.salarioBruto - 636.13) * 0.225;
        } else {
            this.ir = (this.salarioBruto - 869.36) * 0.275;
        }
        return this.ir;
    }
    
    public Double salarioLiquido(){
        this.salarioLiquido = (this.salarioBruto - (this.inss + this.ir));
        return this.salarioLiquido;
    }

}
