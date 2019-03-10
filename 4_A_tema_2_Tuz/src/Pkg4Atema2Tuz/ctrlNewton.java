/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pkg4Atema2Tuz;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author Alejandro Cupul
 */
public class ctrlNewton {
    
    private double xi, errorDeseado;
    //private int iteraciones;

    public ctrlNewton(double xi, double errorDeseado/*, int iteraciones*/) {
        this.xi = xi;
        this.errorDeseado = errorDeseado;
        //this.iteraciones = iteraciones;
    }
   
   public double getFuncion(double x){
       return Math.pow(Math.E, (-1)*x)-(x);
   }
   
   public double getFuncionDerivada(double x){
       //return Math.pow(((-1)*Math.E), ((-1)*x))-1;
       double e = Math.pow(Math.E, -(x));
        return -(e) - 1;
   }
   
   public double getXi1(double x){
       return Math.abs(x - (this.getFuncion(x)/this.getFuncionDerivada(x)));
   }
   
   private double getError(double x){
       return Math.abs((this.getXi1(x) - x)/ this.getXi1(x));
   }
   
   public ArrayList<filaNewton> Newton(){
       int i =1;
       double errorCalculado = 1;
       ArrayList<filaNewton> listaSoluciones = new ArrayList<>();
       while(errorCalculado > this.errorDeseado){
       
       filaNewton fila = new filaNewton();
   
       fila.setI(i);
       fila.setXi(this.xi);
       fila.setFxi(this.getFuncion(this.xi));
       fila.setFdxi(this.getFuncionDerivada(this.xi));
       fila.setXi1(this.getXi1(this.xi));
       fila.setError(this.getError(this.xi));
       
       listaSoluciones.add(fila);
       
       this.xi = fila.getXi1();
       errorCalculado = fila.getError();
       i++;
      }
    return listaSoluciones;
   }
   
   public tablaNewton getTablaN(){
       tablaNewton modelo = null;
       ArrayList<filaNewton> lista = this.Newton();
       
       if(lista != null)
            modelo = new tablaNewton(lista);
      
       return modelo;
   }
    
}
