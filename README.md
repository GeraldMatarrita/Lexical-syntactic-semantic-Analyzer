# Proyecto_Compiladores
Analizador léxico, sintáctico y semántico

Este analizador léxico, y semántico se puede ejecutar por medio del .JAR en la carpeta comprimida de este proyecto.
(Se necesita tener instalado Java 18 o superior, dado que el programa está compilado en esta versión).

Para ser ejecutado es necesario descomprimir el .zip en una carpeta a gusto, 
después abrir esa carpeta en el terminal o CMD y ejecutar el siguiente comando:

```
java -jar miCompilador.jar prueba1.ml output.txt
```

Tomar en cuenta que la extensión del archivo de entrada debe de ser .ml, que es la extensión que se le asignó a los
archivos escritos en miLenguaje. Los archivos de ejemplo se encuentran en la carpeta raíz del proyecto \miCompilador.
Además, para los primeros dos archivos de ejemplo se han creado archivos de salida con los resultados obtenidos por el
compilador. En cuanto a los otros dos archivos de ejemplo, no se han creado archivos de salida dado que se encuentran
con errores.

Después de ejecutar el jar debe de salir este mensaje (En caso de éxito):

```
Return 'valor'
```

Si se encuentra algún error en el archivo input.txt se mostrará un mensaje de error y se detendrá la ejecución. Por lo
que no se generará el archivo output.txt.

En el archivo output.txt se mostrarán los resultados obtenidos por cada una de las fases del compilador. En el caso del
analizador léxico se mostrará la tabla de símbolos, en el caso del analizador sintáctico se mostrará el árbol sintáctico
y en el caso del analizador semántico se mostrará la tabla de símbolos con los tipos de datos de cada variable o función.

Si desea ver el código en IntelliJ puede seleccionar la opción de abrir proyecto y seleccionar la carpeta llamada
miCompilador y dirigirse a las carpetas src para ver las diferentes clases.

