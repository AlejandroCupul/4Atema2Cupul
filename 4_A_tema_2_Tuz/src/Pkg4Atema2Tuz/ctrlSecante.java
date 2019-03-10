
package Pkg4Atema2Tuz;
import javax.swing.*;

import java.util.ArrayList;

public class ctrlSecante {
    private double x,xi,error;
    
    public ctrlSecante(double X,double Xi,double error){
        this.x=X;
        this.xi=Xi;
        this.error=error;
    }

    
    public double getEvaluar(double x){
        double potencia = Math.pow(x,2);
        return Math.pow(Math.E, -potencia) - x;
    }
    
    
    
    
    public double getOperacion(double x, double xi){
        return (this.getEvaluar(x)*(xi - x)) / (this.getEvaluar(xi)-this.getEvaluar(x));
    }

    public double getError(double x, double xi){
        return Math.abs((this.getOperacionN(x, xi) - x)/this.getOperacionN(x, xi));
    }
    
    public double getOperacionN(double x, double xi){
        return x - this.getOperacion(x, xi);
    }
    
    public ArrayList<filaSecante> Secante(){
        int i=1;
        double errorcalculado=1;
        
        ArrayList<filaSecante> listaSoluciones = new ArrayList<>();
        
        while(errorcalculado>this.error){
           
         filaSecante fila = new filaSecante();  
         fila.setI(i);
         fila.setXi(this.x);
         fila.setX(this.xi);
         fila.setFxi(this.getEvaluar(this.x));
         fila.setFx(this.getEvaluar(this.xi));
         fila.setForm1(this.getOperacion(this.x, this.xi));
         fila.setForm2(this.getOperacionN(this.x, this.xi));
         fila.setError(this.getError(this.x, this.xi));
         
         listaSoluciones.add(fila);
         
         this.xi = fila.getXi();
         this.x = fila.getForm2();
         
         errorcalculado = fila.getError();
         i++;
        }
        
      return listaSoluciones;  
    }
    
    public tablaSecante getTablaSecante(){
    tablaSecante modelo = null;
    ArrayList<filaSecante> lista = this.Secante();
    
    if(lista != null)
        modelo = new tablaSecante(lista);
    return modelo;
   }
    
}

