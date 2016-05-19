/*
 * entidad cliente
 */
package modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

/**
 *
 * @author usu21
 */
public class Cliente implements Serializable {

    private String nif;

    public static final String PROP_NIF = "nif";    
    private String nombre;    
    private String apellidos;
    private String direccion;
    private String poblacion;

    public Cliente() {
        nif = "";
        nombre = "";
        apellidos="";
        direccion="";
        poblacion="";
    }

    public Cliente(String nif, String nombre, String apellidos, String direccion, String poblacion) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.poblacion = poblacion;
    }
    
    
    
    

    public static final String PROP_POBLACION = "poblacion";

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        String oldPoblacion = this.poblacion;
        this.poblacion = poblacion;
        propertyChangeSupport.firePropertyChange(PROP_POBLACION, oldPoblacion, poblacion);
    }


    public static final String PROP_DIRECCION = "direccion";

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        String oldDireccion = this.direccion;
        this.direccion = direccion;
        propertyChangeSupport.firePropertyChange(PROP_DIRECCION, oldDireccion, direccion);
    }


    public static final String PROP_APELLIDOS = "apellidos";

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        propertyChangeSupport.firePropertyChange(PROP_APELLIDOS, oldApellidos, apellidos);
    }


    public static final String PROP_NOMBRE = "nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        String oldNombre = this.nombre;
        this.nombre = nombre;
        propertyChangeSupport.firePropertyChange(PROP_NOMBRE, oldNombre, nombre);
    }


    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        String oldNif = this.nif;
        this.nif = nif;
        propertyChangeSupport.firePropertyChange(PROP_NIF, oldNif, nif);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
