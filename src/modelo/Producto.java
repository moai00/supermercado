/*
 * entidad producto
 */
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mport
 */
public class Producto implements Serializable, Comparable, Cloneable {

    private int codigo;
    private String descripcion;
    private double pvp;
    private int stock;

    public Producto() {
        descripcion = "";
    }

    @Override
    public String toString() {
        if (descripcion.equals("-- Escoge un producto --")) {
            return descripcion;

        } else {

            return descripcion + " - " + pvp + " €";
        }

    }

    public Producto(int codigo, String descripcion, double pvp, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pvp = pvp;
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public static final String PROP_STOCK = "stock";

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        int oldStock = this.stock;
        this.stock = stock;
        propertyChangeSupport.firePropertyChange(PROP_STOCK, oldStock, stock);
    }

    public static final String PROP_PVP = "pvp";

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        double oldPvp = this.pvp;
        this.pvp = pvp;
        propertyChangeSupport.firePropertyChange(PROP_PVP, oldPvp, pvp);
    }

    public static final String PROP_DESCRIPCION = "descripcion";

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        propertyChangeSupport.firePropertyChange(PROP_DESCRIPCION, oldDescripcion, descripcion);
    }

    public static final String PROP_CODIGO = "codigo";

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        int oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    @Override
    public int compareTo(Object t) {
      Producto otro = (Producto) t;
      return descripcion.compareTo(otro.getDescripcion());
    }

    @Override
    public Object clone()  {
        try {
            return super.clone();
            
        }catch (CloneNotSupportedException ex){
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null,ex);
        return null;
        }
    }
    
    

}
