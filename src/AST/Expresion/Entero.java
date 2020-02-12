/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Expresion;
import AST.Entorno.*;
import AST.Entorno.Valores.ValorEntero;
/**
 *
 * @author Richi
 */
public class Entero extends Expresion{

    String numero;
    
    public Entero(String lex){
        this.numero = lex;
    }
    
    
    @Override
    public Valor ejecutar() {
        return new ValorEntero(Integer.parseInt(numero));
    }

    @Override
    public String graficar() {
        return "";
    }
    
}
