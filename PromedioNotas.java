import java.util.Scanner;

/**
 * PromedioNotas
 */
public class PromedioNotas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int notas[] = new int[4];
        int suma=0; 
        float promedioNotas;    

        System.out.println("NOTAS DE LAS MATERIAS");
        System.out.println("--------------------------");
        System.out.println("Digite su nota de Estructura de Datos");
        notas[0] = s.nextInt();
        System.out.println("--------------------------");
        System.out.println("Digite su nota de Sistemas Operativos");
        notas[1] = s.nextInt();
        System.out.println("--------------------------");
        System.out.println("Digite su nota de PESI");
        notas[2] = s.nextInt();
        System.out.println("--------------------------");
        System.out.println("Digite su nota de Ingeniería de Requisitos");
        notas[3] = s.nextInt();
        System.out.println("--------------------------");

        for(int i=0; i<notas.length; i++){

            suma+= notas[i];
        }

        promedioNotas = (suma/notas.length);
        System.out.println("El promedio de las calificaciones es: " + promedioNotas); 
       
    }
}