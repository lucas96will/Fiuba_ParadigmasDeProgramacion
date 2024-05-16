# Libreria

Una librería vende productos que se dividen en las siguientes categorías: libros, artículos de librería, revistas y
periódicos. Las revistas y periódicos tienen una periodicidad que mediremos en cantidad de veces al mes que se publican.
Todos los productos tienen un precio asociado. Los artículos de librería tienen además del precio de venta, llevan IVA
en la venta. Además el kiosco tiene clientes, de los cuales almacena los datos esenciales incluyendo la dirección, y que
productos han comprado en un determinado mes y que suscripciones (a revistas o periódicos) ha adquirido el cliente, los
productos que compran los clientes se anotan en su cuenta corriente y se les cobra a fin de mes. El kiosco necesita como
funcionalidad saber para un determinado mes cuánto debe cobrarle a cada cliente, y lo mismo para un año entero. Para los
clientes registrados en el sistema hay un 5% de descuento sobre todas sus compras y además quienes realizan una
suscripción anual existe un 20% de descuento sobre el precio del producto (revista o periódico) al cual se suscriben (
este descuento es sobre el precio del producto y no se acumula a otros descuentos).

- Realizar el diagrama de clases correspondiente, detallando los métodos y atributos más importantes.
- Realizar un diagrama de secuencia sobre la obtención de la suma de los importes a cobrarles a los clientes
  registrados, para un mes determinado.

## Analizando el problema por primera vez

### Entidades

- Libreria
- Cliente
- Productos (Libros, ArticulosDeLibreria, Revistas, Periodicos)

### Diseño por contrato (estas dos prueba van a estar como casos de uso)

- El kiosco necesita como funcionalidad saber para un determinado mes cuánto debe cobrarle a cada cliente
- idem pero un año

### Extras

- ArticulosDeLibreria tiene iva 21%
- revistas y periodicos tiene 20% descuento si se subscribe 12 meses
- los clientes registrados tienen 5% descuento -> se debe poder registrar un cliente
- a los clientes se les cobra a fin de mes por su cuenta corriente

### Algunas decisiones de diseño

- el stock de la libreria es infinito (imposible de probar)
- la libreria tiene todo lo que vos quieras (imposible de probar)
- Luego vamos a cambiar esto