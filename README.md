# Analizador Sintáctico en ANTLR4 para un Sublenguaje de C

Este proyecto implementa un analizador léxico y sintáctico para un sublenguaje de C, usando ANTLR4 y JavaScript. Además, traduce el código fuente válido a JavaScript e interpreta su ejecución.

 Estructura del proyecto

- `Lenguaje.g4`: gramática definida en ANTLR4.
- `input.txt`: archivo de entrada con el código fuente a analizar.
- `index.js`: programa principal que realiza el análisis y la ejecución.
- `generated/`: carpeta con los archivos generados por ANTLR.


##  Funcionalidades

1. **Análisis léxico:** identifica los tokens del lenguaje (palabras clave, identificadores, operadores, etc.).
2. **Análisis sintáctico:** construye el árbol de análisis sintáctico (parse tree) para verificar que el código cumpla la gramática.
3. **Tabla de tokens:** muestra todos los tokens reconocidos junto a su tipo y posición.
4. **Árbol sintáctico:** genera y muestra visualmente (en consola) el árbol del análisis sintáctico.
5. **Interpretación:** traduce el código válido a JavaScript y lo ejecuta (en tiempo real).

# EJECUCIÓN

Colocar el código a analizar en input.txt.

Ejecutar el programa:  node index.js
Ver resultados:
Si el código es válido, se muestra la tabla de tokens, el árbol sintáctico y se ejecuta el código.
Si el código es inválido, se informa el error sintáctico correspondiente.

Se incluyen 4 archivos con código de ejemplo:

2 cadenas válidas (sintaxis correcta). input.txt e input2.txt
2 cadenas inválidas (errores de sintaxis). incorrecto.txt e incorrecto2.txt

  

