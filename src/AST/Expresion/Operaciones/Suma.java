/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Expresion.Operaciones;

import AST.Entorno.Tipo;
import AST.Entorno.Valor;
import AST.Entorno.Valores.ValorDouble;
import AST.Entorno.Valores.ValorEntero;
import AST.Entorno.Valores.ValorError;
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
        
        if(a.tipo.isError()) return a;
        if(b.tipo.isError()) return b;
        
        Tipo type = Tipo.operarTipos(a, b, '+');
        if(type.isError())
            return new ValorError("Tipos incompatibles en la Suma!!!");
        if(type.isEntero())
            return new ValorEntero(
                    ((ValorEntero)a).getValor() + ((ValorEntero)b).getValor()
            );
        if(type.isDouble())
            if( a instanceof ValorEntero && b instanceof ValorEntero)
            return new ValorDouble(
                    ((ValorEntero)a).getValor() + ((ValorEntero)b).getValor()
            );
        else
            return new ValorError("Tipos incompatibles en la Suma!!!");
          
        return new ValorError("Tipos incompatibles en la Suma!!!");
        
        
    }

    @Override
    public String graficar() {
        return "";
    }    
}
