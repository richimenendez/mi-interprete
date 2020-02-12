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
public class ValorString extends Valor {
    public String val;
    
    public ValorString(String cad){
        super(new Tipo(Tipo.EnumTipos.STRING));
        this.val = cad;
    }
    
    public String getCadena(){
        return this.val;
    }
    
    
}
