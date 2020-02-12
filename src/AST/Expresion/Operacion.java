/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST.Expresion;
import AST.*;
/**
 *
 * @author Richi
 */
public abstract class Operacion extends Expresion{

    public Expresion left;
    public Expresion right;
    
    public Operacion(Expresion left_, Expresion right_){
        this.left = left_;
        this.right = right_;
    }
    
    public Operacion(Expresion left_){
        this.left = left_;
        this.right = null;
        
    }
    
    
    
}
