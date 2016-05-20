/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.observablecollections.ObservableList;

/**
 *
 * @author usu21
 */
public class ListaProductos implements Serializable {

    private ObservableList<Producto> lista;

    public ListaProductos() {
        lista = ObservableCollections.observableList(new ArrayList<Producto>());

    }
    
    public boolean existeProducto (Producto p){
        return lista.contains(p);
    }
    
    public void altaProducto (Producto p){
        lista.add(p);
    }

    public static final String PROP_LISTA = "lista";

    public ObservableList<Producto> getLista() {
        return lista;
    }

    public void setLista(ObservableList<Producto> lista) {
        ObservableList<Producto> oldLista = this.lista;
        this.lista = lista;
        propertyChangeSupport.firePropertyChange(PROP_LISTA, oldLista, lista);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
