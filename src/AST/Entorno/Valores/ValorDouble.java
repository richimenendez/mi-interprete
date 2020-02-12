/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Entorno.Valores;

import AST.Entorno.Tipo;
import AST.Entorno.Valor;

/**
 *
 * @author Richi
 */
public class ValorDouble extends Valor {
    double val;
    
    public ValorDouble(double val){
        super(new Tipo(Tipo.EnumTipos.DOUBLE));
        this.val = val;
    }
    
    public double getDouble(){
        return this.val;
    }
    
    public String getCadena(){
        return ""+this.val;
    }
}
