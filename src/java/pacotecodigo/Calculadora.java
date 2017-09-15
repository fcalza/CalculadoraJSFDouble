/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacotecodigo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "calculadora")
@RequestScoped
/**
 *
 * @author Calza
 */
public class Calculadora {

    double valor1, valor2, resultado;
    double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double somar() {
        resultado = valor1 + valor2;
        return resultado;

    }

    public double subtrair() {
        
        return resultado = valor1 - valor2;

    }

    public double dividir() {
        resultado =  valor1 / valor2;
        return resultado;

    }

    public void limpar() {

        this.setResultado(0);
        this.setValor1(0);
        this.setValor2(0);
    }

}
