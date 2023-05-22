package org.example.checker;

// Interfaz para el programa HaltChecker
public interface HaltChecker {
    String checkHalt(String program, String input);
}


/*PRUEBA 2 Utilitaria
public class HaltChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la secuencia de comandos: ");
        String commands = input.nextLine();

        // Aquí va la lógica para verificar si la secuencia de comandos termina
        // o no con el comando "halt".

        if (terminaConHalt(commands)) {
            System.out.println("La secuencia de comandos termina con el comando \"halt\".");
        } else {
            System.out.println("La secuencia de comandos NO termina con el comando \"halt\".");
        }
    }

    public static boolean terminaConHalt(String commands) {
        // Aquí va la lógica para verificar si la secuencia de comandos termina
        // o no con el comando "halt".

        return false; // Esta línea es solo temporal. Deberás modificarla.
    }
}

*/

/* PRUEBA 1
public class HaltChecker {

    public static boolean willHalt(String program) {
        // Analiza el programa y determina si se detiene

        // cuando se le da como entrada el mismo programa
        // Devuelve true si se detiene, false si no lo hace
        // Aquí iría el código para analizar el programa
        return true; // O false, dependiendo del resultado
    }


    public static void main(String[] args) {
        // Ejemplo de uso
        String program1 = "public class CountDown { public static void main(String[] args) { for (int i = 10; i >= 0; i--) { System.out.println(i); } } }";
        String program2 = "public class CountUp { public static void main(String[] args) { for (int i = 0; i <= 10; i++) { System.out.println(i); } } }";
        if (willHalt(program1)) {
            System.out.println("El programa CountDown se detendrá cuando se le dé como entrada el mismo programa.");
        } else {
            System.out.println("El programa CountDown nunca se detendrá cuando se le dé como entrada el mismo programa.");
        }
        if (willHalt(program2)) {
            System.out.println("El programa CountUp se detendrá cuando se le dé como entrada el mismo programa.");
        } else {
            System.out.println("El programa CountUp nunca se detendrá cuando se le dé como entrada el mismo programa.");
        }
    }
}*/
