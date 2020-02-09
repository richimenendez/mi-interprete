/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Entorno;

/**
 *
 * @author Richi
 */
public abstract class Valor {
    public Tipo tipo;
    public int dimensiones;
   

    public Valor(Tipo tipo) {
        this.tipo = tipo;
        this.dimensiones = 0;
    }

    public Valor(Tipo tipo, int dimensiones) {
        this.tipo = tipo;
        this.dimensiones = dimensiones;
    }
    
    public boolean esArreglo(){
        return this.dimensiones > 0 ;
    }

    
}
