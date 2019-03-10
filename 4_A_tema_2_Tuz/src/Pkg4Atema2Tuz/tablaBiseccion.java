
package Pkg4Atema2Tuz;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tablaBiseccion extends AbstractTableModel{
    public String[] columnas={
        "i", "Xi", "Xs", "Xr", "Fxi" , "Fxs", "Fxr", "Error"
    };
    
    public Class [] tipos ={
        Integer.class, Double.class, Double.class, Double.class, Double.class, 
        Double.class, Double.class, Double.class 
    };
    
    private ArrayList<filaBiseccion> filas;
    
    public tablaBiseccion(ArrayList<filaBiseccion> filas){
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
        filaBiseccion fila = this.filas.get(i);
        switch(i1){
            case 0: return fila.getI();
            case 1: return fila.getXi();
            case 2: return fila.getXs();
            case 3: return fila.getXr();
            case 4: return fila.getFxi();
            case 5: return fila.getFxs();
            case 6: return fila.getFxr();
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
