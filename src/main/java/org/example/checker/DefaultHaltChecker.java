package org.example.checker;

// Implementación concreta del programa HaltChecker
public class DefaultHaltChecker implements HaltChecker {
    public String checkHalt(String program, String input) {
        // Lógica para verificar si el programa se detiene con la entrada dada
        // Aquí deberías implementar la lógica de análisis del programa P con la entrada I
        // y determinar si el programa se detendrá o no. Retornar "para" o "nunca" en consecuencia.
        // Por simplicidad, asumiré que siempre retorna "nunca" en este ejemplo.

        /*
        * // Lógica para verificar si el programa se detiene con la entrada dada
    boolean[][] haltTable = {
        {true, true, true, false},  // Ejemplo de tabla de parada (debe ser adaptada según las reglas de tu lenguaje)
        {true, true, true, false},
        {true, true, true, false},
        {false, false, false, true}
    };

    int state = 0;  // Estado inicial
    int index = 0;  // Índice para recorrer la entrada

    while (true) {
        char currentChar = program.charAt(index);  // Carácter actual del programa

        // Obtener la acción según el estado y el carácter actual
        boolean haltAction = haltTable[state][Character.getNumericValue(currentChar)];

        if (haltAction) {
            return "nunca";  // El programa no se detiene
        }

        // Actualizar el estado y el índice
        state = (state + 1) % haltTable.length;
        index = (index + 1) % program.length();

        // Verificar si hemos alcanzado el final del programa
        if (index == 0) {
            return "para";  // El programa se detiene
        }
    }
}

      * */
        return "nunca";
    }
}
