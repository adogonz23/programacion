<div aling="justify">

## Ejercicios
 
### Tarea 2

Un número perfecto es aquel que es igual a la suma de sus divisores propios (excluyendo él mismo). Por ejemplo, 6 es un número perfecto porque sus divisores propios son 1, 2 y 3, y 1 + 2 + 3 = 6.

El ejercicio consiste en escribir un programa que encuentre e imprima todos los números perfectos en un rango dado (por ejemplo, entre 1 y 1000)

### diagrama de flujo
<img src="images/diagrama_de_flujo2.drawio.png">

### Pseudocodigo

- Inicio
- Inicializamos la variables ("valorMin","valorMax","Suma=0" "div") 
- Pedimos el arco de valores que queremos comprobar si son o no perfectos
- Creamos un bucle for para qeu recorra desde el valor minimo hasta el valor maximo  de uno en uno 
- Dentro de ese bucle for creamos otros bucle for para los divisores, que iran desde 1 hasta el "valor min" menos -1 ya que un numero perfecto es la suma de todo sus divisores menos el mismo.
- Si el modulo entre el valor min y el div es = a 0 hacemos la suma (suma=suma+div)
- Este proceso repetira hasta que el div sea -1 al valor minimo y hasta que el valor minimo sea igual que el valor maximo.
- Si la suma de sus divisores es igual que el valor minimo nos imprimira el numero en pantalla.
- Fin de programa 