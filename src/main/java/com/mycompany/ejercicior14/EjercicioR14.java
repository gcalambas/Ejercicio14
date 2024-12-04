/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicior14;
import java.util.Scanner;
public class EjercicioR14 {
    public static void main(String[] args) {
      
        double ventasDepto1, ventasDepto2, ventasDepto3, salario, totalVentas, porcentajeVentas;
        double salarioDepto1, salarioDepto2, salarioDepto3;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las ventas del Departamento 1: ");
        ventasDepto1 = entrada.nextDouble();

        System.out.println("Ingrese las ventas del Departamento 2: ");
        ventasDepto2 = entrada.nextDouble();

        System.out.println("Ingrese las ventas del Departamento 3: ");
        ventasDepto3 = entrada.nextDouble();

        System.out.println("Ingrese el salario de los vendedores: ");
        salario = entrada.nextDouble();

        totalVentas = ventasDepto1 + ventasDepto2 + ventasDepto3;
        porcentajeVentas = 0.33 * totalVentas;

        if (ventasDepto1 > porcentajeVentas) {
            salarioDepto1 = salario + 0.2 * salario;
        } else {
            salarioDepto1 = salario;
        }

        if (ventasDepto2 > porcentajeVentas) {
            salarioDepto2 = salario + 0.2 * salario;
        } else {
            salarioDepto2 = salario;
        }

        if (ventasDepto3 > porcentajeVentas) {
            salarioDepto3 = salario + 0.2 * salario;
        } else {
            salarioDepto3 = salario;
        }


        System.out.println("Salario final de los vendedores del departamento 1: " + salarioDepto1 + ", salario final de los vendedores del departamento 2: " + salarioDepto2 + ", salario final de los vendedores del departamento 3:  " + salarioDepto3);

    }
}