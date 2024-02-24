/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public enum EstadoSesion {
    NO_LOGIN,           // nunca intentó iniciar sesión
    LOGIN_CORRECTO,     // tiene la sesión iniciada
    LOGIN_INCORRECTO    // le erro a la sesión al menos una vez
}
