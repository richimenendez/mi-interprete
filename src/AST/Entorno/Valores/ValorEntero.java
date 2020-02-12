/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Entorno.Valores;
import AST.Entorno.Tipo;
import AST.Entorno.Tipo.EnumTipos;
import AST.Entorno.Valor;
/**
 *
 * @author Richi
 */
public class ValorEntero extends Valor {
    
    int valor;
    
    public ValorEntero(int number){
        super(new Tipo(EnumTipos.ENTERO));
        this.valor = number;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    public String getCadena(){
        return ""+this.valor;
    }
    
    public static int doubleToEntero(Valor val){
        if(val instanceof ValorEntero){
            return ((ValorEntero) val).getValor();
        }else{
            return (int)
        }
    }
}
