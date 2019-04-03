/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebasR;

import ec.edu.ups.clasesR.DatosCliente;
import ec.edu.ups.clasesR.Empleado;
import ec.edu.ups.clasesR.Menu;
import ec.edu.ups.clasesR.Reservacion;
import ec.edu.ups.clasesR.SucursalRestaurante;
import java.util.Scanner;

///**
// *PruebaRestaurante
// * 
// * Esta clase me permite llamar las otras clases y ppor ende sus metodos ademas de crear un menu
// * 
// * @author Dennnis Andrés Rivadeneira Cabrera
// * @since 2019
// * @version 2.0
// * @see 
// */

public class PruebaRestaurante {

    public static void main(String[] args) {
        Menu men = new Menu();
        Empleado emp = new Empleado();
        SucursalRestaurante sucur = new SucursalRestaurante();
        Reservacion reser = new Reservacion();
        DatosCliente dat = new DatosCliente();
        Scanner x = new Scanner(System.in);
        int opc;
        do {
            System.out.println("MENU RESTAURANTE");
            System.out.println("");
            System.out.println("1 INGRESE DATOS DE SU COMIDA A ELEJIR ");
            System.out.println("2 INGRESE LOS DATOS DE SU EMPLEADO");
            System.out.println("3 INGRESE DATOS DE LA SUCURSAL ELEJIDA");
            System.out.println("4 INGRESE DATOS DEL CLIENTE");
            System.out.println("5 Ingrese datos de la reservacion.");
            do {
                System.out.println("");
                System.out.print("ELIJA UNA OPCIÓN");
                System.out.println(" ");
                opc = x.nextInt();
            } while (opc < 0 && opc > 6);
            switch (opc) {
                case 1:
                    System.out.println("DATOS DE SU COMIDA A ELEGIR ");
                    System.out.println(" ");
                    men.setTipoComida("Comida light");
                    men.setCostoComida(4.50);
                    men.setCostoBebida(1.50);

                    String tipC = men.getTipoComida();
                    double cosC = men.getCostoComida();
                    double cosB = men.getCostoBebida();

                    System.out.println("EL TIPO DE SU COMIDA ES  :" + tipC);
                    System.out.println("EL COSTO DE SU COMIDA ES :" + cosC);
                    System.out.println("EL COSTO DE SU BEBIDA ES :" + cosB);

                    break;
                case 2:
                    System.out.println("DATOS DEL EMPLEADO");
                    System.out.println(" ");
                    emp.setCodigoEmpleado(45);
                    emp.setNombreEmpleado("Dennis Rivadeneira");
                    emp.setCargoEmpleado("Mesero");

                    int codE = emp.getCodigoEmpleado();
                    String nomE = emp.getNombreEmpleado();
                    String carE = emp.getCargoEmpleado();

                    System.out.println("EL CODIGO DEL EMPLEADO ES :" + codE);
                    System.out.println("EL NOMBRE DEL EMPLEADO ES :" + nomE);
                    System.out.println("EL CARGO DEL EMPLEADO ES  :" + carE);

                    break;
                case 3:
                  

                    System.out.println("DATOS DE LA SUCURSAL");
                    System.out.println(" ");
                    sucur.setDireccionSucursal("Av.Americas y A.J Andrade");
                    sucur.setHorarioAtencion(9.00);
                    sucur.setNumeroSucursal(3);

                    String dirS = sucur.getDireccionSucursal();
                    double horA = sucur.getHorarioAtencion();
                    int numS = sucur.getNumeroSucursal();

                    System.out.println("EL CODIGO DEL EMPLEADO ES :" + dirS);
                    System.out.println("EL NOMBRE DEL EMPLEADO ES :" + horA);
                    System.out.println("EL CARGO DEL EMPLEADO ES  :" + numS);

                    break;
                case 4:
                    
                    System.out.println("DATOS DEL CLIENTE");
                    System.out.println(" ");

                    dat.setNombreCliente("Dennis Andrés Rivadeneira Cabrera");
                    dat.setNumeroCedulaCliente(1150536033);
                    dat.setDireccionCliente("Av.Americas");

                    String nomC = dat.getNombreCliente();
                    int numC = dat.getNumeroCedulaCliente();
                    String dirC = dat.getdireccionCliente();

                    System.out.println("EL CODIGO DEL EMPLEADO ES :" + nomC);
                    System.out.println("EL NOMBRE DEL EMPLEADO ES :" + numC);
                    System.out.println("EL CARGO DEL EMPLEADO ES  :" + dirC);

                    break;
                case 5:
                 
                    System.out.println("DATOS DE RESERVACIÓN ");
                    System.out.println(" ");
                    reser.setNombreReservacion("Dennis Andrés Rivadeneira Cabrera");
                    reser.setCostoReservacion(10.50);
                    reser.setNumeroReservacion(15);

                    String nomR = reser.getNombreReservacion();
                    double cosR = reser.getCostoReservacion();
                    int numR = reser.getNumeroReservacion();

                    System.out.println("EL CODIGO DEL EMPLEADO ES :" + nomR);
                    System.out.println("EL NOMBRE DEL EMPLEADO ES :" + cosR);
                    System.out.println("EL CARGO DEL EMPLEADO ES  :" + numR);

                    break;
            }
        } while (opc > 0 && opc < 7);
    }
}
