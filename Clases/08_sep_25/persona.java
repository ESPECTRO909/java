import java.util.Scanner;

public class persona {

    String nombreCompleto;
    String direccion;
    String correo;
    String telefono; //utilice este dato por que los otros arrojaban errores de memoria
    int edad;

    //Constructor vacio
    persona ()
    {
    }

    //Constructor con parametros    
    persona (String nombreCompleto, String direccion, String correo, String telefono, int edad)
    {
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
    }

    //Metodos
    public void setCapturarDatos()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo: ");
        nombreCompleto = sc.nextLine().toUpperCase();

        System.out.println("Ingrese su direccion: ");
        direccion = sc.nextLine();

        System.out.println("Ingrese su correo: ");
        correo = sc.nextLine();

        System.out.println("Ingrese su telefono: ");
        telefono = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine(); // Limpia buffer

    }

    public void getMostrarDatos()
    {
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Direccion: " + direccion);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Edad: " + edad);
    }

    //metodos para las buenas practicas
    public void setNombreCompleto(String nombreCompleto)
    {
        this.nombreCompleto = nombreCompleto.toUpperCase();
    }

    public String getNombreCompleto()
    {
        return nombreCompleto;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public int getEdad()
    {
        return edad;
    }

    


}