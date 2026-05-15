
package promedioasignaturas;

import java.util.Scanner;

public class PromedioAsignaturas {
    
 public static void main(String[] args) {
     
     Scanner input = new Scanner(System.in);
     
     double acumProgramacion = 0.0;
     double examenProgramacion = 0.0;
     double finalProgramacion = 0.0;
     
     double acumBaseDatos = 0.0;
     double examenBaseDatos = 0.0;
     double finalBaseDatos = 0.0;
     
     double acumOfimatica = 0.0;
     double examenOfimatica = 0.0;
     double finalOfimatica = 0.0;
     
     double promedioGeneral = 0.0;
     
     String estadoProgramacion = "";
     String estadoBaseDatos = "";
     String estadoOfimatica = "";
     String mensajeHonor = "";
     
     System.out.println("--------------------------------------------------");
     System.out.println("Sistema de Promedio Final de Asignaturas");
     System.out.println("--------------------------------------------------");

     System.out.println("\nAsignatura: Programacion");
     System.out.print("Ingrese la nota acumulativa: ");
     acumProgramacion = input.nextDouble();

     System.out.print("Ingrese la nota de examen: ");
     examenProgramacion = input.nextDouble();

     finalProgramacion = acumProgramacion + examenProgramacion;

     if(finalProgramacion >= 65){
     estadoProgramacion = "Aprobado";
    }
     else{
    estadoProgramacion = "Reprobado";    
    }
     System.out.println("\nAsignatura: Base de Datos");
     System.out.print("Ingrese la nota acumulativa: ");
     acumBaseDatos = input.nextDouble();

     System.out.print("Ingrese la nota de examen: ");
     examenBaseDatos = input.nextDouble();

     finalBaseDatos = acumBaseDatos + examenBaseDatos;

     if(finalBaseDatos >= 65){
     estadoBaseDatos = "Aprobado";
     }
     else{
    estadoBaseDatos = "Reprobado";
     }
     System.out.println("\nAsignatura: Ofimatica");
     System.out.print("Ingrese la nota acumulativa: ");
     acumOfimatica = input.nextDouble();

     System.out.print("Ingrese la nota de examen: ");
     examenOfimatica = input.nextDouble();

     finalOfimatica = acumOfimatica + examenOfimatica;

     if(finalOfimatica >= 65){
     estadoOfimatica = "Aprobado";
     }
     else{
     estadoOfimatica = "Reprobado";
     }

    promedioGeneral = (finalProgramacion + finalBaseDatos + finalOfimatica) / 3;

    if(promedioGeneral >= 95){
    mensajeHonor = "Suma CumLaude";
    }
    else if(promedioGeneral >= 90){
    mensajeHonor = "Magna CumLaude";
    }
    else if(promedioGeneral >= 85){
    mensajeHonor = "CumLaude";
    }
    else{
    mensajeHonor = "Sin mencion honorifica";
    }

    System.out.println("\n--------------------------------------------------");
    System.out.println("Resultados Finales");
    System.out.println("--------------------------------------------------");

    System.out.printf("Programacion: %.2f - %s %n", finalProgramacion, estadoProgramacion);
    System.out.printf("Base de Datos: %.2f - %s %n", finalBaseDatos, estadoBaseDatos);
    System.out.printf("Ofimatica: %.2f - %s %n", finalOfimatica, estadoOfimatica);

    System.out.println("--------------------------------------------------");
    System.out.printf("Promedio general del periodo: %.2f %n", promedioGeneral);
    System.out.printf("Reconocimiento: %s %n", mensajeHonor);
        
}   
     }
    

