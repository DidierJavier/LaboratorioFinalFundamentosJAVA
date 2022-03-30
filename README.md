# LaboratorioFinalFundamentosJAVA
En este laboratorio se aplican los conceptos fundamentales de JAVA
El laboratorio consiste en generar una orden a la cual se le agreguen computadoras hasta un límite determinado. En caso de pasar el límite no se podrán agregar más
computadoras a la orden. Cada computadora contiene monitor, ratón y teclado y tanto el ratón como el teclado requieren de un dispositivo de entrada a la pc.

#Solución
Para la solución, se crearon las siguientes clases:
1.0. DispositivoEntrada: Contiene los atributos tipo String tipoEntrada y marca.
2.0. Raton: Extiende de la clase DispositivoEntrada y se crean objetos de esta clase con los atributos de la clase padre.
3.0. Teclado: Extiende de la clase DispositivoEntrada y se crean objetos de esta clase con los atributos de la clase padre.
4.0. Computadora: Posee los atributos de nombre que es de tipo String, monitor que es de tipo Monitor, teclado que es de tipo Teclado, raton que es de tipo Raton y de 
 tipo int los atributos idComputadora y contadorComputadoras.
5.0. Orden: Posee el atributo computadoras el cual es un Array que almacena los objetos tipo Computadora que se agregan a la orden, un atributo estático, final y de 
 tipo int llamado MAX_COMPUTADORAS para definir la capacidad máxima de computadoras que se agregan a la orden. El atributo contador computadoras cuenta el número de
 computadoras que se agregan a la orden.
 
Cada uno de las clases a excepción de DispositivoEntrada tienen los atributos de tipo int de id y contador según la clase, con el fin de que al crear los objetos, queden
con un identificador único. Todas las clases poseen el método toString excepto la clase Orden; en la clase orden se cuenta con el método mostrarOrden, para poder 
recorrer el Array y poder visualizar cada uno de los elementos. Al mandar a imprimir cada uno de los elementos, se llama al método toString de cada clase y se puede
visualizar la orden correctamente con todos las computadoras agregadas y cada computadora con el ratón, el teclado y el monitor agregados.
