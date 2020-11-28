package repaso;

import java.util.Scanner;

public class Repaso {
    
    private static final int CLASES = 4;

    public static void main(String[] args) {
        
        Scanner r = new Scanner(System.in);
        String nombreAlumno;
        int notas[] = new int[CLASES];
        String claseMaxima = new String();
        int notaMaxima = 0;
        double promedio;
        String asignaturas[] = new String[CLASES];
        int repetir = 1;
        
        while(repetir != 2) {
            System.out.println("***** PROMEDIOS *****\n");
            System.out.println("Nombre del Alumno: ");
            nombreAlumno = r.next();
            
            for (int i = 0; i < CLASES; i++) {
                System.out.println("Nombre de la asignatura no." + (i + 1) + ": ");
                asignaturas[i] = r.next();
                System.out.println("Nota asignada a la asignatura de " + asignaturas[i] + ": ");
                notas[i] = r.nextInt();

                if(notas[i] > notaMaxima){
                    notaMaxima = notas[i];
                    claseMaxima= asignaturas[i];
                }
            }
            
            promedio = 0;
            for(int j = 0; j < CLASES; j++) {
                promedio += notas[j];
            }
            promedio /= CLASES;
                    
            System.out.println("El promedio del alumno " + nombreAlumno + " es de " + promedio + "%");
            System.out.println("La nota mas alta es de la clase: " + claseMaxima + " con una nota de " + notaMaxima + "%");
            
            System.out.println("Desea repetir?");
            System.out.println("1 - Si");
            System.out.println("2 - No");
            repetir = r.nextInt();
            System.out.println("\n");
        }
        
    }
    
}
