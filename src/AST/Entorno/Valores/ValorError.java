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
public class ValorError extends Valor {
    String mensaje;
    
    public ValorError(String msg){
        super(new Tipo(Tipo.EnumTipos.ERROR));
        this.mensaje = msg;
    }
    
    public String getError(){
        return this.mensaje;
    }
    
    
}
