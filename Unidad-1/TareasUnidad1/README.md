<div aling="justify">

## Ejercicios
 
### Ejercicio 2
Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C
respectivamente. El algoritmo debe imprimir cual es el mayor y cual es el menor. Recuerde constatar que
los tres valores introducidos por el teclado sean valores distintos. Presente un mensaje de alerta en caso de
que se detecte la introducción de valores iguales.

### diagrama de flujo
<img src="images/diagrama_de_flujo2.drawio.png">

### Pseudocodigo

- Inicio
  - Inicializar las variables A, B y C
  - Leer los tres valores
  - Almacenar en las variables A, B
     y C
  - Si A > B y A > C Entonces
  - Escribir A “Es el mayor”
  - Si B > A y B > C Entonces  escribir B “Es el mayor”
  - Sino  Escribir C “Es el mayor”
  - Fin_Si
  - Fin_Si
  - Fin+
### Ejercicio 6

Desarrolle un algoritmo que permita leer un valor entero positivo N y determinar si es primo o no.

### Codigo

public static void numeroPrimo(int num) {
    boolean primo = true; 
    for(int i = 2; i < num; i++) {
        if (num % i == 0) {
            prime = false;
            break;
        }
    }
    if (primo)
        View.input("el numero es primo");
    else
        View.input("el numero no es primo.");
}

### Ejercicio 7

Realice un algoritmo que a partir de proporcionarle la velocidad de un automóvil, expresada en kilómetros por hora, proporcione la velocidad en metros por segundo.

### Codigo
 // Multiplicarlo por 1000 y dividirlo entre 3600

 int velocidadKm ;
 int velocidadMs =( velocidadKm * 1000 % 3600 );
 

 
</div>
