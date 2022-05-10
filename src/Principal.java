import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String [] args) {
        Scanner Input = new Scanner(System.in);

        int HUSelecta;

        //List Reservaciones
        List<Reservacion> ListaReservaciones = new ArrayList<Reservacion>();

        do {
            System.out.println("----------Menu - Sistema de Reservacion de Recursos Multimedia----------");
            System.out.println("1. Reservacion de un Proyector");
            System.out.println("2. Reservacion de Telefonos");
            System.out.println("3. Reservacion de Salon Audiovisual");
            System.out.println("4. Verificar Disponibilidad de Telefonos");
            System.out.println("5. Verificar el Estado de los Recursos Multimedia");
            System.out.println("6. Verificar Computadoras en Mal Estado");
            System.out.println("7. Verificar Proyectores en Uso y Disponibles");
            System.out.println("8. Verificar Salones Audiovisuales Disponibles");
            System.out.println("9. Lista de Reservaciones");

            System.out.println("Ingrese el Numero de Historia que Desea. Escriba 0 para Cancelar");
            HUSelecta = Input.nextInt();

            switch (HUSelecta) {
                //Cancelar
                case 0:
                    System.out.println("Ejecucion Cancelada");
                    break;

                case 1:
                    System.out.println("-----Reservacion de un Proyector-----");
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

                    //Reservacion
                    ListaReservaciones.add(new Reservacion(NombreProfesor, ApellidoProfesor, Grado, Seccion, Horario, "1 Proyector"));
                    break;

                case 2:
                    System.out.println("-----Reservacion de Telefonos-----");
                    Scanner Input2 = new Scanner(System.in);
                    int NumerodeTelefonos2;
                    String Grado2, Seccion2, Horario2, Nombre2, Apellido2;

                    System.out.println("Ingrese el Nombre del Profesor");
                    Nombre2 = Input2.nextLine();

                    System.out.println("Ingrese el Apellido del Profesor");
                    Apellido2 = Input2.nextLine();

                    System.out.println("Ingrese el Grado");
                    Grado2 = Input2.nextLine();

                    System.out.println("Ingrese la Seccion");
                    Seccion2 = Input2.nextLine();

                    System.out.println("Ingrese de que Hora a que hora utilizara los telefonos");
                    Horario2 = Input2.nextLine();

                    System.out.println("Ingrese el Numero de Telefonos que solicita ");
                    NumerodeTelefonos2 = Input2.nextInt();

                    System.out.println("El Profesor " + Nombre2 + " " + Apellido2 + " ha Reservado " + NumerodeTelefonos2 + " Telefonos, para el Grado " + Grado2 + "-" + Seccion2 + " para el Horario de " + Horario2);

                    //Reservacion
                    ListaReservaciones.add(new Reservacion(Nombre2, Apellido2, Grado2, Seccion2, Horario2, NumerodeTelefonos2 + " Telefonos"));
                    break;

                case 3:
                    System.out.println("-----Reservacion de Salon Audiovisual-----");
                    Scanner Input3 = new Scanner(System.in);

                    String NombreProfesor3, ApellidoProfesor3, Grado3, Seccion3, Horario3, SalonAudiovisual3;

                    System.out.println("Ingrese el Nombre del Profesor");
                    NombreProfesor3 = Input3.nextLine();

                    System.out.println("Ingrese el Apellido del Profesor");
                    ApellidoProfesor3 = Input3.nextLine();

                    System.out.println("Ingrese el Grado (Solo el Numero)");
                    Grado3 = Input3.nextLine();

                    System.out.println("Ingrese la Seccion para Reservar Audiovisuales");
                    Seccion3 = Input3.nextLine();

                    System.out.println("Ingrese el Horario (Hora de Inicio y Hora Final)");
                    Horario3 = Input3.nextLine();

                    System.out.println("Ingrese el Salon de Audiovisuales que desea Reservar (Audiovisuales 1, 2, 3)");
                    SalonAudiovisual3 = Input3.nextLine();

                    System.out.println("El Profesor " + NombreProfesor3 + " " + ApellidoProfesor3 + " ha Solicitado Reservar el Salon de Audiovisuales " + SalonAudiovisual3 + ", para el Grado " + Grado3 + "-" + Seccion3 + " para el Horario " + Horario3);

                    //Reservacion
                    ListaReservaciones.add(new Reservacion(NombreProfesor3, ApellidoProfesor3, Grado3, Seccion3, Horario3, " Audiovisuales " + SalonAudiovisual3));
                    break;

                case 4:
                    System.out.println("-----Verificar Disponibilidad de Telefonos-----");
                    Scanner imput4 = new Scanner(System.in);

                    String Username4e, Password4e;
                    int Celulares_en_uso4, Celulares_Total4, Celulares_Disponibles;

                    System.out.println("Ingrese su username");
                    Username4e = imput4.nextLine();

                    if (Username4e.equals("Salomon.Aquino") || Username4e.equals("Salvador.Rivas")) {
                        System.out.println("Usuario Correcto");
                        System.out.println("Ingrese su Password");
                        Password4e = imput4.nextLine();

                        if (Password4e.equals("Pontevedra2022")) {
                            System.out.println("Bienvenido " + Username4e);

                            System.out.println("Ingrese el Numero de Celulares en Total");
                            Celulares_Total4 = imput4.nextInt();

                            System.out.println("Ingrese el Numero de Celulares en Uso");
                            Celulares_en_uso4 = imput4.nextInt();

                            System.out.println("Celulares en Total: " + Celulares_Total4);
                            System.out.println("Celulares en Uso: " + Celulares_en_uso4);
                            Celulares_Disponibles = Celulares_Total4 - Celulares_en_uso4;
                            System.out.println("Celulares Disponibles: " + Celulares_Disponibles);
                        } else {
                            System.out.println("Password Incorrecto, por favor vuelva a intentar");
                        }
                    } else {
                        System.out.println("Username incorrecto");
                        System.out.println("Lista de usuarios Registrados: Salomon.Aquino, Salvador.Rivas");
                    }
                    break;

                case 5:
                    System.out.println("-----Verificar el Estado de los Recursos Multimedia-----");
                    Scanner teclado = new Scanner(System.in);
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
                    System.out.println("Cantidad de Proyectores en buen estado: 100");
                    System.out.println("Cantidad de computadoras en buen estado: 100");
                    System.out.println("Salones Audiovisuales en buen Estado");
                    break;

                case 6:
                    System.out.println("-----Verificar Computadoras en Mal Estado-----");
                    Scanner teclado3 = new Scanner(System.in);
                    String login3 = "";
                    String pass3 = "";

                    while (!login3.equals("admin") && !pass3.equals("123")) {
                        System.out.print("Introduzca sus credenciales.");
                        login3 = teclado3.nextLine();
                        System.out.print("Introduzca su password.");
                        pass3 = teclado3.nextLine();
                    }
                    System.out.println("Login y pass son correctos.");
                    System.out.println("Cantidad de Computadoras en mal estado: 0");
                    break;

                case 7:
                    System.out.println("-----Verificar Proyectores en Uso y Disponibles-----");
                    Scanner Input4 = new Scanner(System.in);

                    String Username4, Password4;
                    int Proyectores_Total, Proyectores_en_uso, Proyectores_Disponibles;

                    System.out.println("Ingrese su Username");
                    Username4 = Input4.nextLine();

                    if (Username4.equals("Salomon.Aquino") || Username4.equals("Salvador.Rivas") || Username4.equals("Sebastian.Villalobos")) {
                        System.out.println("Usuario Encontrado");
                        System.out.println("Ingrese su Password");
                        Password4 = Input4.nextLine();

                        if (Password4.equals("Arrupe2022")) {
                            System.out.println("Bienvenido al Sistema " + Username4);

                            System.out.println("Ingrese el Numero de Proyectores en Total");
                            Proyectores_Total = Input4.nextInt();

                            System.out.println("Ingrese el Numero de Proyectores en Uso");
                            Proyectores_en_uso = Input4.nextInt();

                            Proyectores_Disponibles = Proyectores_Total - Proyectores_en_uso;

                            System.out.println("Proyectores en Total: " + Proyectores_Total);
                            System.out.println("Proyectores en Uso: " + Proyectores_en_uso);
                            System.out.println("Proyectores Disponibles: " + Proyectores_Disponibles);
                        } else {
                            System.out.println("Password Incorrecto, Intente de Nuevo");
                        }
                    } else {
                        System.out.println("Username Incorrecto");
                        System.out.println("Lista de Usuarios Registrados: Salomon.Aquino, Salvador.Rivas, Sebastian.Villalobos");
                    }
                    break;
                case 8:
                    System.out.println("-----Verificar Salones Audiovisuales Disponibles-----");
                    Scanner Input5 = new Scanner(System.in);

                    String Username5, Password5;
                    boolean Audiovisuales1, Audiovisuales2, Audiovisuales3;
                    String Audiovisuales1STR, Audiovisuales2STR, Audiovisuales3STR;

                    Audiovisuales1 = false;
                    Audiovisuales2 = false;
                    Audiovisuales3 = false;

                    System.out.println("Ingrese su Username");
                    Username5 = Input5.nextLine();

                    if (Username5.equals("Salomon.Aquino") || Username5.equals("Salvador.Rivas") || Username5.equals("Sebastian.Villalobos")) {
                        System.out.println("Usuario Encontrado");
                        System.out.println("Ingrese su Password");
                        Password5 = Input5.nextLine();

                        if (Password5.equals("Arrupe2022")) {
                            System.out.println("Bienvenido al Sitema " + Username5);

                            System.out.println("Esta el Salon de Audiovisuales 1 Reservado? SI o NO");
                            Audiovisuales1STR = Input5.nextLine();

                            System.out.println("Esta el Salon de Audiovisuales 2 Reservado? SI o NO");
                            Audiovisuales2STR = Input5.nextLine();

                            System.out.println("Esta el Salon de Audiovisuales 3 Reservado? SI o NO");
                            Audiovisuales3STR = Input5.nextLine();

                            System.out.println("Salon de Audiovisuales del Edificio 1, Reservado: " + Audiovisuales1STR);
                            System.out.println("Salon de Audiovisuales del Edificio 2, Reservado: " + Audiovisuales2STR);
                            System.out.println("Salon de Audiovisuales del Edificio 3, Reservado: " + Audiovisuales3STR);
                        } else {
                            System.out.println("Password Incorreto, Intente de Nuevo");
                        }
                    } else {
                        System.out.println("Username Incorrecto");
                        System.out.println("Lista de Usuarios Registrados: Salomon.Aquino, Salvador.Rivas, Sebastian.Villalobos");
                    }
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
