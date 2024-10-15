## Clase ProcessLauncher

Proporciona funciones utilitarias para la manipulación de archivos. Realiza tareas como leer números de un archivo, fusionar archivos que contienen los números primos, contar los números en un archivo y mostrar los números primos.

### Método
- **getAllNumbers(String inputFile)**
Lee todos los números de un archivo de texto (Numbers.txt) y los convierte en una lista de enteros.

##### Funcionalidad
- Separa los números por comas.
- Maneja excepciones.

![image](./images/image-3.png)


- **mergePrimeFiles(ArrayList<String> numbersTemp, String outputFile)**
Combina los archivos temporales que contienen números primos en un solo archivo final

##### Funcionalidad
Lee cada archivo temporal y escribe su contenido en el archivo final.

![image](./images/image-4.png)

- **getNumbersCount(String outputFile)**
Cuenta cuántos números hay en el archivo de salida que contiene los números primos.

![image](./images/image-5.png)


- **showPrimes(String outputPath)**
Imprime en la consola todos los números primos que se han encontrado.

![image](./images/image-6.png)

---
- Regresar _**Manual del programa**_ [<<**aquí**>>](MANUAL_PROGRAMA.md) 