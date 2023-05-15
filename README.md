## COLEGIO CHAMPAGNAT
***En mi labor diaria en el colegio Champagnat me ha sido encargada la labor de desarrollar una un aplicativo donde se pueda identificar el valor de las compras semanalmente, como información de cada compra se debe registrar: nombre proveedor, precio, nombre, fecha***
### Aclaraciones
- Se requiere calcular el valor de las compras que se realizan semanalmente.
- No se realizará validaciones de los datos ingresados.
### Imágen
![Historia de usuario](https://github.com/joanlero/estructuradatos-2.io/blob/bf38e580759afc35cf34d359b92380a9dab00b37/imagen.PNG)

### Aproximación caso de uso
![Casos de Uso](https://github.com/joanlero/estructuradatos-2.io/blob/9bca773e3918e2c18fdd5abebff0cca2a2ded1ff/Casos%20de%20usos.PNG)

### Aproximación Diagrama de Flujo
![Diagrma de Flujo](https://github.com/joanlero/estructuradatos-2.io/blob/7668622508874bc3447c571ba19baddd94e25746/diagramaFlujo.png)

### Aproximación Seudocódigo
~~~
Inicio
Caracteres: nitProveedor
Caracteres: nombreProveedor[50],
Caracteres: nombreProveedor[50],
Caracteres: referenciaCompra[50],
Real: valorCompra[15],
Date: date
Entero: numCompra, i
Real: valorCompra, valorCompra <- 0
Imprimir: ‘Digite el número de compra:’
Asignar: numCompra
Para i=0 hasta numCompra - 1, 1
Imprimir: ‘Digite nit del proveedor:’
Asignar: nitProveedor
Imprimir: ‘Digite la nombre Proveedor:’
Asignar: nombreProveedor
Imprimir: ‘Digite la referefcia de la compra:’
Asignar: referenciaCompra
Imprimir: ‘Digite el varlor de la compra:’
Asignar: valorCompra
Imprimir: ‘Digite la fecha:’
Asignar: fecha
nitProveedor[i] <- nitProveedor
nombreProveedor[i] <- nombrePproveedor
referenciaCompra[i]<- referenciaCompra
varlorCompra[i] <- referenciaCompra
fecha[i] <- fecha
finPara
Para i=0 hasta numCompra -1, 1
valorCompra <-
valorCompra + (valorCompra[i]+valorCompra[i])
finPara
Imprimir: ‘El total de la compra es:’ + valorCompra
Fin
~~~
