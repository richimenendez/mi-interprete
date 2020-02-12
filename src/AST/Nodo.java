/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;
import AST.Entorno.*;
/**
 *
 * @author Richi
 */
public interface Nodo {
    public Valor ejecutar();
    public String graficar();
}
