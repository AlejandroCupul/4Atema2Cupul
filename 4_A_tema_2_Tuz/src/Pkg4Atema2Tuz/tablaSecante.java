
package Pkg4Atema2Tuz;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tablaSecante extends AbstractTableModel{
    public String[] columnas={
        "i", "Xi-1", "Xi", "F(Xi-1)", "F(xi)" , "Formula", "Raiz", "Error"
    };
    public Class [] tipos ={
        Integer.class, Double.class, Double.class, Double.class,Double.class, Double.class, Double.class,Double.class 
    };
     
     private ArrayList<filaSecante> filas;
    
    public tablaSecante(ArrayList<filaSecante> filas){
        this.filas = filas;
    }
      @Override
    public int getRowCount() {
        return this.filas.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        filaSecante fila = this.filas.get(i);
        switch(i1){
            case 0: return fila.getI();
            case 1: return fila.getX();
            case 2: return fila.getXi();
            case 3: return fila.getFx();
            case 4: return fila.getFxi();
            case 5: return fila.getForm1();
            case 6: return fila.getForm2();
            case 7: return fila.getError();
            
        }
        return null;
    }

    @Override
     public boolean isCellEditable(int i, int i1) {   
         return false;
    }

    @Override
    public Class<?> getColumnClass(int i) {
        return this.tipos[i];
    }

    @Override
    public String getColumnName(int i) {
       return this.columnas[i];
    }
    
    
}


