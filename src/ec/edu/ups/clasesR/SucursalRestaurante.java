
package ec.edu.ups.clasesR;

/**
 * SucursalRestaurante
 *
 * Esta clase nos permite crear los objetos de la clase sucursalRestaurante
 * 
 * @author Dennis Andrés Rivadeneira Cabrera
 * @version 2.0
 * @since 2019
 * @see 
 * 
 */
public class SucursalRestaurante 
{

    @Override
    public String toString() 
    {
        return "Sucursal:" + "\n Direccion Sucursal=" + direccionSucursal + "\n Horario Atencion=" + horarioAtencion + "\n Numero de Sucursal=" + numeroSucursal + '.';
    }
    private String direccionSucursal;
    private double horarioAtencion;
    private int numeroSucursal;
    
    
    public void setDireccionSucursal(String direccionSucursal)
    {
        this.direccionSucursal=direccionSucursal; 
    }
    
    public void setHorarioAtencion(double horarioAtencion)
    {
        this.horarioAtencion=horarioAtencion; 
    }
    
    public void setNumeroSucursal(int numeroSucursal)
    {
        this.numeroSucursal=numeroSucursal;
    } 
    
    public String getDireccionSucursal()
    {
        return this.direccionSucursal; 
    }
    
    public double getHorarioAtencion()
    {
        return this.horarioAtencion; 
    }
    
    public int  getNumeroSucursal()
    {
        return this.numeroSucursal; 
    }
}
