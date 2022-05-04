Algoritmo HU5
	
	Definir Salon1, Salon2, Salon3 Como Logico;
	
	Definir Login, Password Como Caracter;
	
	Audiovisuales1 = Falso;
	Audiovisuales2 = Falso;
	Audiovisuales3 = Verdadero;
	
	Escribir "Ingrese su Username";
	Leer Username;
	
	Si Username == "Salomon.Aquino" o Username == "Salvador.Rivas" o Username == "Sebastian.Villalobos" Entonces
		Escribir "Usuario Encontrado";
		Escribir "Ingrese su Password";
		Leer Password;
		Si Password == "Arrupe2022" Entonces
			Escribir "Bienvenido al Sistema ", Username;
			Escribir "Salon de Audiovisuales del Edificio 1, Ocupado: ", Audiovisuales1;
			Escribir "Salon de Audiovisuales del Edificio 2, Ocupado: ", Audiovisuales2;
			Escribir "Salon de Audiovisulaes del Edificio 3, Ocupado: ", Audiovisuales3;
		SiNo
			Escribir "Password Incorrecto, Intente de Nuevo";
		FinSi
	SiNo
		Escribir "Username Incorrecto";
		Escribir "Lista de Usuarios Registrados: Salomon.Aquino, Salvador.Rivas, Sebastian.Villalobos";
	FinSi
FinAlgoritmo
