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
public class Tipo {
    
    static int matrizSuma [][] = { {0,1,-1,3},{1,1,1,1},{-1,1,-1,-1},{3,1,-1,3} };
    
    static int matrizMul [][] = { {0,-1,-1,3},{-1,-1,-1,-1},{-1,-1,-1,-3},{3,-1,-1,3} };
    
    
    public Tipo(EnumTipos tipoPrimitivo) {
        this.tipo = tipoPrimitivo;
    }
    
    
    public enum EnumTipos{
        ENTERO(0),STRING(1),BOOLEAN(2),DOUBLE(3), ERROR(-1) ;
        
        public final int value;
        
        private EnumTipos(int value){
            this.value = value;
        }
    }
    
    public static Tipo operarTipos(Valor val1 , Valor val2, char ope){
        switch(ope){
            case '+':
                int resultante = matrizSuma[val1.tipo.getEnumVal()][val2.tipo.getEnumVal()];
                return new Tipo(getTipo(resultante));
                
            case '*':
                int r2 = matrizMul[val1.tipo.getEnumVal()][val2.tipo.getEnumVal()];
                return new Tipo(getTipo(r2));
                
            default:
                return new  Tipo(EnumTipos.ERROR);
             }
    }
    
    private EnumTipos tipo;
    
    static EnumTipos getTipo(int x){
        switch(x){
            case 0 : return EnumTipos.ENTERO;
            case 1 : return EnumTipos.STRING;
            case 2 : return EnumTipos.BOOLEAN;  
            case 3 : return EnumTipos.DOUBLE;    
            default: return EnumTipos.ERROR;
        }
    }
    
    public int getEnumVal(){
        return this.tipo.value;
    }
            
    public boolean isEntero(){
         return this.tipo==tipo.ENTERO;
    }
    
    public boolean isError(){
         return this.tipo==tipo.ERROR;
    }
}
