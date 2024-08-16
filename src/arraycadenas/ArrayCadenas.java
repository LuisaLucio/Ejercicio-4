package arraycadenas;
import java.util.Scanner;

/**
 *
 * @author Valentina Rubio
 */
public class ArrayCadenas {

    public static void main(String[] args) {
         
        String[] amigos = { "Luisa", "Felipe", "Valentina", "Alexander", "Silvia"};
        
        System.out.println("Listado de amigos: ");
        for ( String amigo : amigos){
            System.out.println(amigo);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre que quiere buscar: ");
        String name = sc.nextLine();
        
        
        boolean y = false;
        for (String amigo : amigos){
            if(amigo.equalsIgnoreCase(name)){
                System.out.println("El nombre " + name + " se encuentra en la lista!");
                y = true;
                break;
            }
        }
        
        if(!y){
            System.out.println("El nombre " + name+ " no se encuentra en la lista!");
        }
    }  
}
