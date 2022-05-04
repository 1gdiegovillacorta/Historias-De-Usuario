Algoritmo HU4
	
	Definir Username, Password Como Caracter;
	Definir Proyectores_en_uso, Proyectores_disponibles Como Entero;
	
	Proyectores_disponibles = 5;
	Proyectores_en_uso = 20;
	
	Escribir "Ingrese su Username";
	Leer Username;
	
	Si Username == "Salomon.Aquino" o Username == "Salvador.Rivas" o Username == "Sebastian.Villalobos" Entonces
		Escribir "Usuario Encontrado";
		Escribir "Ingrese su Password";
		Leer Password;
		Si Password == "Arrupe2022" Entonces
			Escribir "Bienvenido al Sistema ", Username;
			Escribir "Proyectores en Uso: ", Proyectores_en_uso;
			Escribir "Proyectores Disponibles: ", Proyectores_disponibles;
			Escribir "Proyectores en Total: ", Proyectores_disponibles + Proyectores_en_uso;
		SiNo
			Escribir "Password Incorrecto, Intente de Nuevo";
		FinSi
	SiNo
		Escribir "Username Incorrecto";
		Escribir "Lista de Usuarios Registrados: Salomon.Aquino, Salvador.Rivas, Sebastian.Villalobos";
	FinSi
	
FinAlgoritmo
