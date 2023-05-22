package org.example.checker;

// Implementación concreta del programa HaltChecker
public class DefaultHaltChecker implements HaltChecker {
    public String checkHalt(String program, String input) {
        // Lógica para verificar si el programa se detiene con la entrada dada
        // Aquí deberías implementar la lógica de análisis del programa P con la entrada I
        // y determinar si el programa se detendrá o no. Retornar "para" o "nunca" en consecuencia.
        // Por simplicidad, asumiré que siempre retorna "nunca" en este ejemplo.
        return "nunca";
    }
}
