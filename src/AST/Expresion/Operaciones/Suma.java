/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Expresion.Operaciones;

import AST.Entorno.Tipo;
import AST.Entorno.Valor;
import AST.Entorno.Valores.ValorEntero;
import AST.Expresion.Expresion;
import AST.Expresion.Operacion;
/**
 *
 * @author Richi
 */
public class Suma extends Operacion{

    public Suma(Expresion izq, Expresion der) {
        super(izq, der);
    }
    

    
    
    
    @Override
    public Valor ejecutar() {
        Valor a = this.left.ejecutar();
        Valor b = this.right.ejecutar();
        
        if(a.tipo.isError()) return null;
        if(b.tipo.isError()) return null;
        
        Tipo type = Tipo.operarTipos(a, b, '+');
        if(type.isError())
            return null;
        if(type.isEntero())
            if( a instanceof ValorEntero && b instanceof ValorEntero)
            return new ValorEntero(
                    ((ValorEntero)a).getValor() + ((ValorEntero)b).getValor()
            );
        else
            return null;
        
    }

    @Override
    public String graficar() {
        return "";
    }    
}
