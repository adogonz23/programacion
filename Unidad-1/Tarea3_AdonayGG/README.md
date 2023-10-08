<div aling="justify">

## Ejercicios
 
### Numeros perfectos

Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado

### diagrama de flujo
<img src="images/Tarea2.png">

### Pseudocodigo

- Inicio
- Inicializamos la variables ("valorMin","valorMax","Suma=0" "div") 
- Pedimos el arco de valores que queremos comprobar si son o no perfectos
- Creamos un bucle for para que recorra desde el valor minimo hasta el valor maximo  de uno en uno 
- Dentro de ese bucle for creamos otros bucle for para los divisores, que iran desde 1 hasta el "valor min" menos -1 ya que un numero perfecto es la suma de todo sus divisores menos el mismo.
- Si el modulo entre el valor min y el div es =  0 hacemos la suma (suma=suma+div)
- Este proceso repetira hasta que el div sea -1 al valor minimo y hasta que el valor minimo sea igual que el valor maximo.
- Si la suma de sus divisores es igual que el valor minimo nos imprimira el numero en pantalla.
- Fin de programa 
 
### codigo
<a href =src/main/java/ies/puerto/numerosPerfectos.java>
