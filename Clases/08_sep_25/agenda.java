import java.util.Scanner;
public class agenda {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        persona p1 = new persona();

        while(true)
        {
        System.out.println("bienvenido a tu agenda personal");
        System.out.println("1. registar un nuevo contacto");
        System.out.println("2. ver contactos");
        System.out.println("3. salir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("registar un nuevo contacto");
                sc.nextLine(); // Limpia buffer
                System.out.println("Ingresa tu nombre completo: ");
                p1.setNombreCompleto(sc.nextLine().toUpperCase());

                System.out.println("Ingresa tu direccion: ");
                p1.setDireccion(sc.nextLine());

                System.out.println("Ingresa tu correo: ");
                p1.setCorreo(sc.nextLine());

                System.out.println("Ingresa tu telefono: ");
                p1.setTelefono(sc.nextLine());

                System.out.println("Ingresa tu edad: ");
                p1.setEdad(sc.nextInt());
                
                
                break;
            case 2:
                System.out.println("ver contactos");
                p1.getMostrarDatos();
                break;

            case 3:
                System.out.println("salir");
                System.exit(0);
                break;

            default:
            break;

        }
    }
    }
}