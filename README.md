## Ejercicio de modelado

1- Ejercicio de modelado (se recomienda leer todo el ejercicio antes de comenzar). Se desea modelar parte de un sistema
mediante el paradigma de objetos. Ponderación: 60%

Un gimnasio tiene diferentes planes para sus socios, que determinan el uso de las instalaciones y actividades, para lo
cual los socios deben reservar cada tipo de actividad (clase o uso de sala de musculación), y no pueden ingresar si no
hay reserva. Hay distintos tipos de planes para asistir:

- Plan Básico: el socio puede tomar una clase grupal por semana, y utilizar la sala de cardio y la de musculación hasta
  dos veces por semana.
- Plan NoTanBasico: el socio puede tomar tres clases grupales por semana, y utilizar la sala de cardio y la de
  musculación hasta cuatro veces por semana.
- Plan Libre: el socio puede tomar clases grupales ilimitadas y utilizar las salas de musculación y cardio en forma
  ilimitada.
- Plan FanDeLasClases: el socio puede tomar clases grupal ilimitadas, y utilizar la sala de cardio y la de musculación
  hasta dos veces por semana.

Los planes además pueden ser mensuales (se paga por mes) o anuales (se paga todo el año), tendiendo diferentes precios y
formas de pago según cual sea.

Supondremos la existencia de una clase externa Agenda Gimnasio, con una única instancia agendaAlgoGimnasio, a la cual
todos los objetos pueden acceder, que tiene métodos cuantas ClasesEsta Semana: unSocio y cuantas VecesASalaMusculacion:
unSocio, y devuelven cuantas reservas ya tienen para las tipo de actividades. Se pide:

Modelar en UML (diagrama de clases) el dominio recién descripto. Use nombres adecuados para todas las clases, métodos y
asociaciones que defina. Incluya todos los métodos que le parezca necesarios en las clases, pero ninguno más. Los
métodos que utilice en los puntos B.a y B.b deben figurar en el diagrama. Modelar en UML (diagrama de secuencia, con
objetos y mensajes) el caso completo para los siguientes escenarios:

- Un socio con plan NoTanBasico quiere reservar la sala de musculación.
- Un socio con el plan FanDeLasClases quiere usar la sala de musculación, pero ya la ha usado 2 veces esa semana.


## Analizando el problema


### Entidades

### Diseño por contrato (estas dos prueba van a estar como casos de uso)

### Extras

### Algunas decisiones de diseño

### Diagrama de clases


### Diagrama de secuencia

