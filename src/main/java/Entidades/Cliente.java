/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Guzman
 */
@Entity
public class Cliente extends Usuario implements Serializable {
    @Column(name = "Edad")
    private int edad;
 
    @Column(name = "Telefono")
    private String telefono;
    
    @Column(name = "Suscripto")
    private boolean suscripto;
    
    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservas;
    
    

    public Cliente() {
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente(int edad, String telefono, boolean suscripto, List<Reserva> reservas, Long idUsuario, String nick, String nombre, String apellido, String email, String contraseña) {
        super(idUsuario, nick, nombre, apellido, email, contraseña);
        this.edad = edad;
        this.telefono = telefono;
        this.suscripto = suscripto;
        this.reservas = reservas;
    }

    

    public boolean isSuscripto() {
        return suscripto;
    }

    public void setSuscripto(boolean suscripto) {
        this.suscripto = suscripto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }    
    
    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Cliente(Long idUsuario, String nick, String nombre, String apellido, String email, String contraseña) {
        super(idUsuario, nick, nombre, apellido, email, contraseña);
    }

    
    
    
    
    
}
