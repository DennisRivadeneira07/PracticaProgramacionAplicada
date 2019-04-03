/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clasesR;

/**
 *Empleado
 *
 * Clase que permite crear los metodos para los objetos  Empleado
 * 
 * @author Dennis Andrés Rivadeneira Cabrera
 * @version 2.0
 * @since 2019
 * @see 
 * 
 */
public class Empleado {
     @Override
    public String toString() 
    {
        return "Empleados:" + "\n Codigo de Empleado=" + codigoEmpleado + "\n Nombre del Empleado=" + nombreEmpleado + "\n Horario de Entrada de Empleado=" + cargoEmpleado + '.';
    }
    private int codigoEmpleado;
    private String nombreEmpleado;
    private String cargoEmpleado;
    
    
    public void setCodigoEmpleado(int codigoEmpleado)
    {
        this.codigoEmpleado=codigoEmpleado; 
    }
       
    public void setNombreEmpleado(  String nombreEmpleado)
    {
        this.nombreEmpleado=nombreEmpleado; 
    }
    
    public void setCargoEmpleado(String cargoEmpleado)
    {
        this.cargoEmpleado=cargoEmpleado;
    } 
    
    public int getCodigoEmpleado()
    {
        return this.codigoEmpleado; 
    }
    
    public String getNombreEmpleado()
    {
        return this.nombreEmpleado; 
    }
    
    public String getCargoEmpleado()
    {
        return this.cargoEmpleado; 
    }
}
    

