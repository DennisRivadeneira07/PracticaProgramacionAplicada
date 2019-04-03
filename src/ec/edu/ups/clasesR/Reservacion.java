/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clasesR;

/**
 *Reservacion
 *
 * Clase que permite crear los metodos de la clase  Reservacion
 * 
 * @author Dennis Andrés Rivadeneira Cabrera
 * @version 2.0
 * @since 2019
 * @see 
 * 
 */
public class Reservacion 
{

    @Override
    public String toString() 
    {
        return "Reservacion:" + "\n Nombre de la Persona =" + nombreReservacion + "\n Costo de Reservacion=" + costoReservacion + "\n numero Reservacion=" +numeroReservacion + '.';
    }
    private String nombreReservacion;
    private double costoReservacion;
    private int numeroReservacion;
    
    
    public void setNombreReservacion(String nombreReservacion)
    {
        this.nombreReservacion=nombreReservacion; 
    }
    
    public void setCostoReservacion(double costoReservacion)
    {
        this.costoReservacion=costoReservacion; 
    }
    
    public void setNumeroReservacion(int numeroReservacion)
    {
        this.numeroReservacion=numeroReservacion;
    }  
    
    public String getNombreReservacion()
    {
        return this.nombreReservacion; 
    }
    
    public double getCostoReservacion()
    {
        return this.costoReservacion; 
    }
    
    public int getNumeroReservacion()
    {
        return this.numeroReservacion; 
    }
}
