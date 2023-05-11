## COLEGIO CHAMPAGNAT
***En mi labor diaria en el colegio Champagnat me ha sido encargada la labor de desarrollar una un aplicativo donde se pueda identificar el valor de las compras semanalmente, como información de cada compra se debe registrar: nombre proveedor, precio, nombre, fecha***
### Aclaraciones
- Se requiere calcular el valor de las compras que se realizan semanalmente.
- No se realizará validaciones de los datos ingresados.
### Imágen
![Historia de usuario](https://github.com/joanlero/estructuradatos-2.io/blob/f0adcf5b9f4f988aa15d32d3a2dc8c3a92e6dc27/imagen.PNG)

### Aproximación caso de uso
![Casos de Uso](https://github.com/joanlero/estructuradatos-2.io/blob/b0a38886ef13e08c1b26bdc54c502a67cbb78ceb/Casos%20de%20usos.PNG)

### Aproximación Diagrama de Flujo
![Diagrma de Flujo](https://github.com/joanlero/estructuradatos-2.io/blob/818a7cdbdb6e4a51ddb5d040e46cfcb7a8a8928a/diagramaFlujo.png)

### Aproximación Seudocódigo
~~~
Inicio
Caracteres: proveedor[50],
Real: precio[15],
Date: date
Caracteres: proveedor
Entero: numCompra, i
Real: precio, valorCompra <- 0
Imprimir: ‘Digite el número de compra:’
Asignar: numCompra
Para i=0 hasta numCompra - 1, 1
Imprimir: ‘Digite la nombre Proveedor:’
Asignar: proveedor
Imprimir: ‘Digite el precio:’
Asignar: precio
Imprimir: ‘Digite la fecha:’
Asignar: fecha
proveedor[i] <- proveedor
precio[i] <- precio
fecha[i] <- fecha
finPara
Para i=0 hasta numCompra -1, 1
valorCompra <-
valorCompra + (precio[i]+precio[i])
finPara
Imprimir: ‘El valor de la compra es:’ + valorCompra
Fin
~~~
