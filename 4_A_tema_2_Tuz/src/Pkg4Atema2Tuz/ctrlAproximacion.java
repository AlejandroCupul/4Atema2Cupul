/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pkg4Atema2Tuz;

import javax.swing.*;

import java.util.ArrayList;

public class ctrlAproximacion {
   private double xi, errorDeseado;
   private int iteraciones;

    public ctrlAproximacion(double xi,  int iteraciones, double errorDeseado) {
        this.xi = xi;
        this.errorDeseado = errorDeseado;
        this.iteraciones = iteraciones;
    }
   
   /**
    * @return validacion si no es negativo.
    */
   public boolean esRangoValido(){
       boolean valido = false;
       if(this.getEvaluacion(this.xi) >= 0)
           valido = true;
       return valido;
   }
   
   /**
    * 
    * @param x los intervalos
    * @return la evaluacion.
    */
   public double getEvaluacion(double x){
       //return Math.pow(x, 2) - .9 * Math.pow(x,1)-1.52;
       //return Math.tan(x)-3.5;
       return Math.pow(Math.E,-x);
       //return 16 * Math.pow(x, 5) -20 * Math.pow(x, 3) + Math.pow(x, 2)+ 5*x - .5;
       //return Math.tan(x)-x+1;
      // return Math.sin(x)-.3*Math.pow(Math.E,x);
      //return -Math.pow(x, 3)+x+1;
   }
   
 //  public double getRaiz(double xi){
 //      return xi + 1;
 //  }
   private double getError(double xActual, double xAnterior){
       return Math.abs((xActual - xAnterior)/xActual); 
   }
   
   public ArrayList<filaAproximaciones> Aproximacion(){
       int i =1;
       double errorCalculado = 1;
       ArrayList<filaAproximaciones> listaSoluciones = new ArrayList<>();
       //double xr;
       if(this.esRangoValido()){
           while(i<= this.iteraciones && errorCalculado > this.errorDeseado){
               
               //xr = this.getRaiz(this.xi);
               
               filaAproximaciones fila = new filaAproximaciones();
               
               fila.setI(i);
               fila.setXi(this.xi);
               fila.setGxi(this.getEvaluacion(fila.getXi()));    
               
              if(i==1){
                   errorCalculado = 1;
               }else{
                   double xrAnterior = listaSoluciones.get(listaSoluciones.size()-1).getGxi();
                   double xrActual = fila.getGxi();
                 errorCalculado = this.getError(xrActual, xrAnterior);
                 
               }
               fila.setError(errorCalculado); 
                this.xi =  fila.getGxi();
               listaSoluciones.add(fila);
               i++;
           }
       }else{
           listaSoluciones = null;
           JOptionPane.showMessageDialog(null, "No hay Solución");
       }
    return listaSoluciones;
   }
   
   public tablaAproximacion gettablaAproximacion(){
       tablaAproximacion modelo = null;
       ArrayList<filaAproximaciones> lista = this.Aproximacion();
       
       if(lista != null)
            modelo = new tablaAproximacion(lista);
      
       return modelo;
   }
}
