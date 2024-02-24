/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import Entidades.Usuario;
import java.util.List;
import Entidades.Producto;
import java.util.ArrayList;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Guzman
 */
@Entity
public class Staff extends Usuario implements Serializable {
    @Column(name = "Admin")
    private boolean admin;
    
    @Column(name = "Foto")
    private byte[] foto;
    
    @OneToMany
    private List<Gestion> gestion;
    
    @OneToMany(mappedBy = "staff")
    private List<Venta> venta;
    
    @OneToMany(mappedBy = "staff")
    private List<Turnos> turnos;

    public Staff() {
    }

    public Staff(Long idUsuario, String nick, String nombre, String apellido, String email, String contraseña) {
        super(idUsuario, nick, nombre, apellido, email, contraseña);
    }
    
    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public List<Gestion> getGestion() {
        return gestion;
    }

    public void setGestion(List<Gestion> gestion) {
        this.gestion = gestion;
    }

    public Staff(boolean admin, byte[] foto, List<Gestion> gestion, List<Venta> venta, List<Turnos> turnos, Long idUsuario, String nick, String nombre, String apellido, String email, String contraseña) {
        super(idUsuario, nick, nombre, apellido, email, contraseña);
        this.admin = admin;
        this.foto = foto;
        this.gestion = gestion;
        this.venta = venta;
        this.turnos = turnos;
    }

    public List<Venta> getVenta() {
        return venta;
    }

    public void setVenta(List<Venta> venta) {
        this.venta = venta;
    }

    public List<Turnos> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turnos> turnos) {
        this.turnos = turnos;
    }
    
}
