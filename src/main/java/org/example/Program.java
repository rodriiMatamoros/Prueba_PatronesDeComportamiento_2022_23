package org.example;

import org.example.checker.DefaultHaltChecker;
import org.example.checker.HaltChecker;
import org.example.strategy.CountUpProgram;
import org.example.strategy.ExecutionStrategy;
import org.example.strategy.Reverser;

public class Program {
    public static void main(String[] args) {
        // Crear una instancia de HaltChecker por defecto
        HaltChecker haltChecker = new DefaultHaltChecker();

        // Crear una instancia de Reverser y utilizarla como estrategia de ejecución
        ExecutionStrategy reverser = new Reverser("CountDownProgram", haltChecker);
        System.out.println("Ejecutando Reverser con CountDownProgram:");
        reverser.execute();

        System.out.println();

        // Crear una instancia de CountUpProgram y utilizarla como estrategia de ejecución
        ExecutionStrategy countUpProgram = new CountUpProgram();
        System.out.println("Ejecutando CountUpProgram:");
        countUpProgram.execute();
    }
}

