/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clasesR;

/**
 *Menu
 *
 * Clase que permite crear los metodos de la clase Menu
 * 
 * @author Dennis Andrés Rivadeneira Cabrera
 * @version 2.0
 * @since 2019
 * @see 
 * 
 */
public class Menu {
@Override
    public String toString() 
    {
        return "Menu:" + "\n Tipo de Comida=" + tipoComida + "\n Costo Comida=" + costoComida + "\n Costo de bebida=" + costoBebida + '.';
    }
    private String tipoComida;
    private double costoComida;
    private double costoBebida;    
    
    public void setTipoComida(String tipoComida)
    {
        this.tipoComida=tipoComida; 
    }
    
    public void setCostoComida(double costoComida)
    {
        this.costoComida=costoComida; 
    }
    
    public void setCostoBebida(double costoBebida)
    {
        this.costoBebida=costoBebida;
    } 
    public String getTipoComida()
    {
        return this.tipoComida; 
    }
    
    public double getCostoComida()
    {
        return this.costoComida; 
    }
    
    public double getCostoBebida()
    {
        return this.costoBebida;
    } 
}

    
    

