/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author loren
 */
public class ClaseProyecto1 {
    Scanner dato = new Scanner(System.in);
    
    public static void main(String[] args){ 
    List<CLSvendedores>misEmp = new ArrayList();
    Random RAN = new Random();
    
    
CLSvendedores vent = new CLSvendedores("Lilian");
vent.setEnero(RAN.nextDouble());
vent.setFebrero(RAN.nextDouble());
vent.setMarzo(RAN.nextDouble());
misEmp.add(vent);

 vent = new CLSvendedores("Katy");
vent.setEnero(RAN.nextDouble());
vent.setFebrero(RAN.nextDouble());
vent.setMarzo(RAN.nextDouble());
misEmp.add(vent);

 vent = new CLSvendedores("Diana");
vent.setEnero(RAN.nextDouble());
vent.setFebrero(RAN.nextDouble());
vent.setMarzo(RAN.nextDouble());
misEmp.add(vent);

vent = new CLSvendedores("Iris");
vent.setEnero(RAN.nextDouble());
vent.setFebrero(RAN.nextDouble());
vent.setMarzo(RAN.nextDouble());
misEmp.add(vent);

vent = new CLSvendedores("Melvin");
vent.setEnero(RAN.nextDouble());
vent.setFebrero(RAN.nextDouble());
vent.setMarzo(RAN.nextDouble());
misEmp.add(vent);

vent = new CLSvendedores("Jorge");
vent.setEnero(RAN.nextDouble());
vent.setFebrero(RAN.nextDouble());
vent.setMarzo(RAN.nextDouble());
misEmp.add(vent);

double sumaEn=0;
double sumaFe=0;
double sumaMa=0;



for (CLSvendedores v : misEmp){
sumaEn +=v.getEnero();
sumaFe +=v.getFebrero();
sumaMa +=v.getMarzo();

}//fin del for

System.out.println("la suma del mes de enero es de= "+sumaEn);
System.out.println("la suma del mes de Febrero es de= "+sumaFe);
System.out.println("la suma del mes de marzo es de= "+sumaMa);
System.out.println("la suma de los meses es de= "+sumaEn+sumaFe+sumaMa);
    }//fin de clase main
            
            
}  //Final del codigo
