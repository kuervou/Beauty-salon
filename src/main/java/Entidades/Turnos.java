/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Guzman
 */
@Entity
public class Turnos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTurnos;

    @Column(name = "HoraInicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horaIni;
    
    @Column(name = "HoraFin")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horaFin;
    
    @Column(name = "Dia")
    private String dia;
    
    @Column(name = "Libre")
    private boolean libre;
    
    @ManyToOne
    private Staff staff;
    
    @ManyToOne
    private Reserva reserva;

    public Turnos() {
    }
    
    
    
    public Long getId() {
        return idTurnos;
    }

    public void setId(Long id) {
        this.idTurnos = idTurnos;
    }

    public Date getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Date horaIni) {
        this.horaIni = horaIni;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public Turnos(Long id, Date horaIni, Date horaFin, String dia, boolean libre) {
        this.idTurnos = id;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.dia = dia;
        this.libre = libre;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTurnos != null ? idTurnos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turnos)) {
            return false;
        }
        Turnos other = (Turnos) object;
        if ((this.idTurnos == null && other.idTurnos != null) || (this.idTurnos != null && !this.idTurnos.equals(other.idTurnos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Turnos[ id=" + idTurnos + " ]";
    }

    public Long getIdTurnos() {
        return idTurnos;
    }

    public void setIdTurnos(Long idTurnos) {
        this.idTurnos = idTurnos;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
}