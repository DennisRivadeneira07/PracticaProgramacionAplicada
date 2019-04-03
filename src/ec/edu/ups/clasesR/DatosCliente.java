/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clasesR;

/**
 *DatosCliente
 * 
 * En esta clase crearemos los metodos de los objetos DatosCliente
 * 
 * @author Dennnis Andrés Rivadeneira Cabrera
 * @since 2019
 * @version 2.0
 * @see 
 */
public class DatosCliente {
    @Override
    public String toString() 
    {
        return "Reservacion:" + "\n Nombre de la Persona =" + nombreCliente + "\n Costo de Reservacion=" + numeroCedulaCliente + "\n numero Reservacion=" +direccionCliente + '.';
    }
    private String nombreCliente;
    private int numeroCedulaCliente;
    private String direccionCliente;
    
    
    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente=nombreCliente; 
    }
    
    public void setNumeroCedulaCliente(int numeroCedulaCliente)
    {
        this.numeroCedulaCliente=numeroCedulaCliente; 
    }
    
    public void setDireccionCliente(String direccionCliente)
    {
        this.direccionCliente=direccionCliente;
    }  
    
    public String getNombreCliente()
    {
        return this.nombreCliente; 
    }
    
    public int getNumeroCedulaCliente()
    {
        return this.numeroCedulaCliente; 
    }
    
    public String getdireccionCliente()
    {
        return this.direccionCliente; 
    }
}

    
