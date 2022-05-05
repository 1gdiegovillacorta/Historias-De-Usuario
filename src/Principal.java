import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String [] args) {
        Scanner Input = new Scanner(System.in);

        int HUSelecta;

        //Historias de Usuario
        hu2 HistoriaUsuario2 = new hu2();
        hu1e HistoriaUsuarioEncargado1 = new hu1e();
        hu2e HistroiaUsuarioEncargado2 = new hu2e();
        hu3e HistoriaUsuarioEncargado3 = new hu3e();
        hu3 HistroiaUsuario3 = new hu3();
        hu4 HistoriaUsuario4 = new hu4();
        hu5 HistoriaUsuario5 = new hu5();

        //List Reservaciones
        List<Reservacion> ListaReservaciones = new ArrayList<Reservacion>();

        /*
        ListaReservaciones.add(new Reservacion("Salomon", "Aquino", "1", "G", "7:00 AM - 8:00 AM", "1 Proyector"));
        ListaReservaciones.add(new Reservacion("Douglas", "Martinez", "1", "A", "1:40 PM - 3:00 PM", "Audiovisuales 1"));
        ListaReservaciones.add(new Reservacion("Salvador", "Rivas", "1", "C", "9:55 AM - 10:40 AM", "1 Proyector"));
        */

        do {
            System.out.println("----------Historias de Usuario----------");
            System.out.println("1. Historia de Usuario #1");
            System.out.println("2. Historia de Usuario #2");
            System.out.println("3. Historia de Usuario #3");
            System.out.println("4. Historia de Usuario del Encargado #1");
            System.out.println("5. Historia de Usuario del Encargado #2");
            System.out.println("6. Historia de Usuario del Encargado #3");
            System.out.println("7. Historia de Usuario del Encargado #4");
            System.out.println("8. Historia de Usuario del Encargado #5");
            System.out.println("9. Lista de Reservaciones");

            System.out.println("Ingrese el Numero de Historia que Desea. Escriba 0 para Cancelar");
            HUSelecta = Input.nextInt();

            switch (HUSelecta) {
                //Cancelar
                case 0:
                    System.out.println("Ejecucion Cancelada");
                    break;
                case 1:
                    System.out.println("-----Historia de Usuario #1-----");
                    String NombreProfesor, ApellidoProfesor, Grado, Seccion, Horario;
                    Scanner Input1 = new Scanner(System.in);

                    System.out.println("Ingrese el Nombre del Profesor que Solicita Reservar un Proyector");
                    NombreProfesor = Input1.nextLine();

                    System.out.println("Ingrese el Apellido del Profesor que Solicita Reservar un Proyector");
                    ApellidoProfesor = Input1.nextLine();

                    System.out.println("Ingrese el Grado, para el Proyector (Solo el Numero)");
                    Grado = Input1.nextLine();

                    System.out.println("Ingrese la Seccion a Reservar el Proyector");
                    Seccion = Input1.nextLine();

                    System.out.println("Ingrese el Horario a reservar el Proyector (Hora de Inicio y Hora Final)");
                    Horario = Input1.nextLine();

                    System.out.println("El Profesor " + NombreProfesor + " " + ApellidoProfesor + " ha Solicitado un Proyector para el Grado " + Grado + "-'" + Seccion + "'" + " ,para el Horario de " + Horario);

                    ListaReservaciones.add(new Reservacion(NombreProfesor, ApellidoProfesor, Grado, Seccion, Horario, "1 Proyector"));
                    break;
                case 2:
                    System.out.println("-----Historia de Usuario #2-----");
                    hu2.Mensaje();
                    break;
                case 3:
                    System.out.println("-----Historia de Usuario #3-----");
                    hu3.Mensaje();
                    break;
                case 4:
                    System.out.println("-----Historia de Usuario del Encargado #1-----");
                    hu1e.Mensaje();;
                    break;
                case 5:
                    System.out.println("-----Historia de Usuario del Encargado #2-----");
                    hu2e.Mensaje();
                    break;
                case 6:
                    System.out.println("-----Historia de Usuario del Encargado #3-----");
                    hu3e.Mensaje();
                    break;
                case 7:
                    System.out.println("-----Historia de Usuario del Encargado #4-----");
                    hu4.Mensaje();
                    break;
                case 8:
                    System.out.println("-----Historia de Usuario del Encargado #5-----");
                    hu5.Mensaje();
                    break;
                case 9:
                    System.out.println("-----Lista de Reservaciones-----");
                    for (int i = 0; i <= ListaReservaciones.size()-1; i++) {
                        System.out.println("Nombre: " + ListaReservaciones.get(i).Nombre + " Apellido: " + ListaReservaciones.get(i).Apellido + " Grado: " + ListaReservaciones.get(i).Grado + "-" + ListaReservaciones.get(i).Seccion + " Horario: " + ListaReservaciones.get(i).Horario + " Reservacion: " + ListaReservaciones.get(i).Reservacion);
                    }
            }
        } while (HUSelecta != 0);
    }
}

//Historia de Usuario 2
class hu2 {
    public static void Mensaje() {
        Scanner Input = new Scanner(System.in);
        int NumerodeTelefonos;
        String Grado, Seccion, Horario, Nombre, Apellido;

        System.out.println("Ingrese el Nombre del Profesor");
        Nombre = Input.nextLine();

        System.out.println("Ingrese el Apellido del Profesor");
        Apellido = Input.nextLine();

        System.out.println("Ingrese el Grado");
        Grado = Input.nextLine();

        System.out.println("Ingrese la Seccion");
        Seccion = Input.nextLine();

        System.out.println("Ingrese de que Hora a que hora utilizara los telefonos");
        Horario = Input.nextLine();

        System.out.println("Ingrese el Numero de Telefonos que solicita ");
        NumerodeTelefonos = Input.nextInt();

        System.out.println("El Profesor " + Nombre + " " + Apellido + " ha reservado " + NumerodeTelefonos + " telefonos, para el grado " + Grado + Seccion + " para las horas de " + Horario);
    }
}

//Historia de Usuario 3
class hu3 {
    public static void Mensaje() {
        Scanner Input = new Scanner(System.in);

        String NombreProfesor, ApellidoProfesor, Grado, Seccion, Horario, SalonAudiovisual;

        System.out.println("Ingrese el Nombre del Profesor");
        NombreProfesor = Input.nextLine();

        System.out.println("Ingrese el Apellido del Profesor");
        ApellidoProfesor = Input.nextLine();

        System.out.println("Ingrese el Grado (Solo el Numero)");
        Grado = Input.nextLine();

        System.out.println("Ingrese la Seccion para Reservar Audiovisuales");
        Seccion = Input.nextLine();

        System.out.println("Ingrese el Horario (Hora de Inicio y Hora Final)");
        Horario = Input.nextLine();

        System.out.println("Ingrese el Salon de Audiovisuales que desea Reservar (Audiovisuales 1, 2, 3)");
        SalonAudiovisual = Input.nextLine();

        System.out.println("El Profesor " + NombreProfesor + " " + ApellidoProfesor + " ha Solicitado Reservar el Salon de Audiovisuales " + SalonAudiovisual + ", para el Grado " + Grado + "-" + Seccion + " para el Horario " + Horario);
    }
}

//Historia de Usuario del Encargado 1
class hu1e {
    public static void Mensaje() {
        Scanner teclado = new Scanner(System.in);
        String login = "";
        String pass = "";
        String horario = "";
        String dias = "";
        String proyectores = "";
        if (!login.equals("admin") && !pass.equals("2022")) {
            System.out.print("Hola usuario, Por favor Introducir sus credenciales.");
            login = teclado.nextLine();
            System.out.print("Por favor Introduzca su password.");
            pass = teclado.nextLine();
            System.out.println("Por favor ingrese el horario solicitado.");
            horario = teclado.nextLine();
            System.out.println("Ingrese los dias");
            dias = teclado.nextLine();
            System.out.println("Profavor ingrese la cantidad de proyectores");
            proyectores = teclado.nextLine();
        }
        System.out.println("Login y password son correctos.");
        System.out.println("Cantidad de celulares en uso: 0");
    }
}

//Historia de Usuario del Encargado 2
class hu2e {
    public static void Mensaje() {
        Scanner teclado= new Scanner(System.in);
        String login = "";
        String pass = "";

        while (!login.equals("admin") && !pass.equals("123")) {
            System.out.print("Introduzca sus credenciales.");
            login=teclado.nextLine();
            System.out.print("Introduzca su password.");
            pass=teclado.nextLine();
        }
        System.out.println("Login y pass son correctos.");
        System.out.println("Cantidad de celulares en buen estado: 100");
        System.out.println("Cantidad de cayones en buen estado: 100");
        System.out.println("Cantidad de computadoras en buen estado: 100");
        System.out.println("Salon audivisual en buen estado.");
    }
}

//Historia de Usuario del Encargado 3
class hu3e {
    public static void Mensaje() {
        Scanner teclado = new Scanner(System.in);
        String login = "";
        String pass = "";

        while (!login.equals("admin") && !pass.equals("123")) {
            System.out.print("Introduzca sus credenciales.");
            login = teclado.nextLine();
            System.out.print("Introduzca su password.");
            pass = teclado.nextLine();
        }
        System.out.println("Login y pass son correctos.");
        System.out.println("Cantidad de computadoras en mal estado: 27");
    }
}

class hu4 {
    public static void Mensaje() {
        Scanner Input = new Scanner(System.in);

        String Username, Password;
        int Proyectores_en_uso, Proyectores_Disponibles;

        Proyectores_Disponibles = 5;
        Proyectores_en_uso = 20;

        System.out.println("Ingrese su Username");
        Username = Input.nextLine();

        if (Username.equals("Salomon.Aquino") || Username.equals("Salvador.Rivas") || Username.equals("Sebastian.Villalobos")) {
            System.out.println("Usuario Encontrado");
            System.out.println("Ingrese su Password");
            Password = Input.nextLine();

            if (Password.equals("Arrupe2022")) {
                System.out.println("Bienvenido al Sistema " + Username);
                System.out.println("Proyectores en Uso: " + Proyectores_en_uso);
                System.out.println("Proyectores Disponibles: " + Proyectores_Disponibles);
                System.out.println("Proyectores en Total: " + (Proyectores_Disponibles + Proyectores_en_uso));
            } else {
                System.out.println("Password Incorrecto, Intente de Nuevo");
            }
        } else {
            System.out.println("Username Incorrecto");
            System.out.println("Lista de Usuarios Registrados: Salomon.Aquino, Salvador.Rivas, Sebastian.Villalobos");
        }
    }
}

class hu5 {
    public static void Mensaje() {
        Scanner Input = new Scanner(System.in);

        String Username, Password;
        boolean Audiovisuales1, Audiovisuales2, Audiovisuales3;

        Audiovisuales1 = false;
        Audiovisuales2 = false;
        Audiovisuales3 = true;

        System.out.println("Ingrese su Username");
        Username = Input.nextLine();

        if (Username.equals("Salomon.Aquino") || Username.equals("Salvador.Rivas") || Username.equals("Sebastian.Villalobos")) {
            System.out.println("Usuario Encontrado");
            System.out.println("Ingrese su Password");
            Password = Input.nextLine();

            if (Password.equals("Arrupe2022")) {
                System.out.println("Bienvenido al Sitema " + Username);
                System.out.println("Salon de Audiovisuales del Edificio 1, Ocupado: " + Audiovisuales1);
                System.out.println("Salon de Audiovisuales del Edificio 2, Ocupado: " + Audiovisuales2);
                System.out.println("Salon de Audiovisuales del Edificio 3, Ocupado: " + Audiovisuales3);
            } else {
                System.out.println("Password Incorreto, Intente de Nuevo");
            }
        } else {
            System.out.println("Username Incorrecto");
            System.out.println("Lista de Usuarios Registrados: Salomon.Aquino, Salvador.Rivas, Sebastian.Villalobos");
        }
    }
}

//Lista de Reservaciones
class Reservacion {

    String Nombre;
    String Apellido;
    String Grado;
    String Seccion;
    String Horario;
    String Reservacion;

    public Reservacion(String _Nombre, String _Apelido, String _Grado, String _Seccion, String _Horario, String _Reservacion) {
        Nombre = _Nombre;
        Apellido = _Apelido;
        Grado = _Grado;
        Seccion = _Seccion;
        Horario = _Horario;
        Reservacion = _Reservacion;
    }
}
