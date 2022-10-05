/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import enumeracion.Dias;
import enumeracion.continentes;
import enumeracion.taller;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Principal {
    public static void main(String[] args) {
        //ImpDias();
        Diassw(Dias.Jueves);
        //Asignacion directa a traves de enum
        Dias miDia = Dias.Martes;
        //Asignacion de un dia en base a un String a traves de valeuOf
        Dias miSegundoDia = Dias.valueOf("Viernes");
        //Declaracion de un listado de dias inicializado con los values de mi enum
        Dias[] todosMisDias = Dias.values();
        //imprimo el contenido de mi listado de dias
        for(Dias d: todosMisDias){
            System.out.println("d= "+d);
        }
        //visualizando un pais
        System.out.println("continente... "+ continentes.América);
        System.out.println("Numero de paises de" +continentes.América+ ": "+continentes.América.getCont());
        
        //visualizar taller
        System.out.println("Numero de piezas del "+taller.Motor);
        System.out.println("son: " +taller.Motor.getNum()+" de la marca: "+taller.Motor.getMarca());
        
    }
    
    
    
    
    
    public static void ImpDias(){
        Scanner a = new Scanner (System.in);
        int dia;
        System.out.println("elige un dia entre 1 y 7 : ");
        dia=a.nextInt();
        if (dia==1) {
            System.out.println("Es "+Dias.Lunes);   
        }if (dia==2) {
            System.out.println("Es "+Dias.Martes);
        }if (dia==3) {
            System.out.println("Es "+Dias.Miercoles);
        }if (dia==4) {
            System.out.println("Es "+Dias.Jueves);
        }if (dia==5) {
            System.out.println("Es "+Dias.Viernes);
        }if (dia==6) {
            System.out.println("Es "+Dias.Sabado);
        }if (dia==7) {
            System.out.println("Es "+Dias.Domingo);
        }else if (0>=dia || dia>7){
            System.out.println("Introducir un numero valido entre 1 y 7");
        }
    }
    
    public static void Diassw(Dias dias){
        switch (dias) {
            case Lunes:
                System.out.println("Primer dia de la semana  ");
                break;
            case Martes:
                System.out.println("Segundo dia de la semana  ");
                break;
            case Miercoles:
                System.out.println("Tercer dia de la semana ");
                break;
            case Jueves:
                System.out.println("Cuarto dia de la semana ");
                break;
            case Viernes:
                System.out.println("Quinto dia de la semana ");
                break;
            case Sabado:
                System.out.println("Sexto dia de la semana ");
                break;
            case Domingo:
                System.out.println("Septimo dia de la semana ");
            default:
                throw new AssertionError();
        }
    }
    
    
}
