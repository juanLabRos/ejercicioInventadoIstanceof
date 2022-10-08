/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.Objects;

/**
 *
 * @author Jon
 */
public class otros {
    
    private String nombre;
    private String apellido;
    private int id;

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellido() {
	return apellido;
    }

    public void setApellido(String apellido) {
	this.apellido = apellido;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public otros(String nombre, String apellido, int id) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.id = id;
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 67 * hash + Objects.hashCode(this.nombre);
	hash = 67 * hash + Objects.hashCode(this.apellido);
	hash = 67 * hash + this.id;
	return hash;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final otros other = (otros) obj;
	if (this.id != other.id) {
	    return false;
	}
	if (!Objects.equals(this.nombre, other.nombre)) {
	    return false;
	}
	return Objects.equals(this.apellido, other.apellido);
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();;
	sb.append("nombre: ").append(nombre);
	sb.append(", apellido: ").append(apellido);
	sb.append(", id: .").append(id);
	sb.append("  "+nombre+" pertenece a otro tipo de personal");
	return sb.toString();
    }
    
    
    
    
    
}
