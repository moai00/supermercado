/*
 * entidad producto
 */
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author mport
 */
public class Producto implements Serializable {

    private int codigo;
    private String descripcion;
    private double pvp;
    private int stock;

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

}
