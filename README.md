# Quick Mobility

## Descripción del Producto

**Quick Mobility** se trata sobre una aplicación de movilidad, conectar a pasajeros y conductores con un mismo destino, los usuarios de la aplicación tendrán una plataforma digital que muestre los viajes disponibles en tiempo real y que permita seleccionar cual es la mejor opción para su movilización. De lado del conductor, este podrá publicar la ruta que utilizara para llegar a su destino y así recoger personas que tengan el mismo o parecido destino.

## Repositorios del Proyecto

* [Front-End del Proyecto](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Front-End).
* [Back-End del Proyecto](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Back-End).

## Enlace a la aplicación en Heroku

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://quickmobility.herokuapp.com/)

## Manual de Usuario

Para acceder a la página web de Quick Mobility, ingresamos a la URL que es:    https://quickmobility.herokuapp.com/

### Introducción

Quickmobility es un aplicativo web que permite contactar a usuarios conductores y pasajeros de un servicio de transporte urbano de manera, rápida, fácil y a bajo costo. Para usar este aplicativo es necesario registrarse dentro de la plataforma, una vez registrado puede navegar entre dos tipos de roles. Estos tipos de roles son:

* **Pasajero:** Usuario el cual requiere de un medio de transporte. 
* **Conductor:** Usuario que coloca a disposición su automóvil para trasportar uno o más usuarios. 

#### Uso de la plataforma

* **Pasajero:** Este usuario podrá ver todos los viajes ofertados, los datos del viaje le permitirán conocer si el servicio a tomar pasa o se dirige por el punto que requiere. 
* **Conductor:** Este usuario registra en la plataforma un viaje. Este viaje tiene asociado un punto de partida y un punto destino, así como a las zonas por las cuales se desplazar, esto les permitirá a los usuarios pasajeros determinar si el viaje ofertado pasa por los puntos que requiere. 

Un ves un usuario pasajero coloco un servicio en disposición y un usuario conductor toma dicho viaje, la plataforma de Quickmobility le notifica al pasajero los usuarios que tomarán el servicio. Estos dos roles son tomados como usuarios y cada uno puede dar una calificación al servicio tomado. 

----------

### Acceso al sitio Web

**Requerimiento:**

* Acceso de Internet a Dirección Web.

**Ingrese al navegador y escriba en la barra de direcciones lo siguiente:**

* https://quickmobility.herokuapp.com/ 

**Se mostrará a continuación la interfaz de usuario del menú principal de QuickMobility.**

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/MenuPrincipal.PNG)

----------

### Inicio de Sesión

En la página inicial, realice clic sobre el botón de **Ingresar** que se encuentra en la parte superior de la página web.

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/InicioDeSesion1.1.png)

Para iniciar sesión se requiere llenar los espacios correspondientes como son: Nombre de Usuario, Contraseña y el rol desde cual desea ingresar. Luego hacer clic en el botón Entrar.

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/InicioDeSesion2.PNG)

----------

### Registro

En la página inicial, realice clic sobre el botón de **Registro** que se encuentra en la parte superior de la página web.

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/Registro1.png)

En la página inicial, realice clic sobre el botón de Registro que se encuentran en la parte derecha de la parte superior de la web. Para registrarse se requiere rellenar los espacios correspondientes como son: Username, Contraseña, Barrio, Dirección y Contraseña. Una vez diligenciados todos los espacios, realizar clic en Registro. 

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/Registro2.PNG)

----------

### Acerca de

En la página inicial, realice clic sobre el botón de **Acerca de** que se encuentra en la parte superior de la página web.

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/Acercade2.png)

Una ves realizado clic sobre el botón **Acerca de**, se moveráautomáticamente la página web a la parte inferior de la página, en la cual el usuario podrá consultar información adicional acerca de Quick Mobility.

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/Acercade1.PNG)

----------

### Registro de automóvil

Este espacio es exclusivo para ofertantes deservicios, puede registrar todos los autos con los cuales desea prestar el servicio. Para llenar ese formulario es necesario conocer plata, color, y modelo al automóvil. 

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/RegistroDeAutomovil.PNG)

----------

### Servicios ofertados

Este espacio está disponible para el cualquier que tengas Rol de pasajero, este podrá tomar en cualquiera servicio que el ofertante deseé. 

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/SolicitudesDePasajeros.PNG)

----------

### Solicitud de Servicios

En esta sección pobras visualizar todos los usuarios que se han postulado para poder tomar tu servicio. Se podrá visualizar un botón que le permita aceptar o dejar en espera el servicio, también contará con la dirección destino. 

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/SolicitudDeServicios.PNG)

----------

### Viajes Disponibles

Podrás visualizar todas las ofertas de transporte, siempre que te encuentras como Rol de pasajero, este te dejara determinar el viaje que mejor se acomodó al viaje que necesitas.

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/ViajesDisponibles.PNG)

## Arquitectura y Diseño detallado

### Diagrama de Clases

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/DiagramaDeClases.PNG)

### Diagrama de Casos de Uso

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/DiagramaCasosDeUso.PNG)

### Diagrama Componente y Conector (C&C)

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/DiagramaC&C1.png)

### Diagrama de Despliegue

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/DiagramaDeDespliegue.PNG)

### Diagrama Entidad Relación

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/DiagramaE-R.PNG)

## Enlace al sistema de Integración Continua (Circle CI)

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto)

## Enlace a Taiga

[![Managed with Taiga.io](https://img.shields.io/badge/managed%20with-TAIGA.io-709f14.svg)](https://tree.taiga.io/project/skullzo-2021-1-proyarsw-torocurrambero/backlog "Managed with Taiga.io")

## Enlace a Codacy
	
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/2d0af12fa5624aa49c8cb4d34a95c50d)](https://www.codacy.com/gh/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=2021-1-PROYARSW-TOROCURRAMBERO/Proyecto&amp;utm_campaign=Badge_Grade)

## Enlace al Wireframe

[Wireframe](https://wireframepro.mockflow.com/view/M39a4215e24029688692f6eff38a2048e1612884258925#/page/e926cf47524e402d82c1af086b441bda)

## Descripción del Proceso

### Metodología

Teniendo en cuenta la situación que se vivió tanto en el país de residencia (Colombia) de los tres integrantes como en el mundo de la pandemia, el trabajo fue realizado completamente de manera virtual. No hubo ninguna reunión presencial, todas las reuniones fueron realizadas de forma 100% virtual utilizando la plataforma de **Microsoft Teams**, en la cual realizábamos las sustentaciones de retroalimentación con el profesor, trabajábamos grupalmente desarrollando los Sprints en el horario de clase, y por fuera del horario de clase cada uno por su cuenta realizó las tareas que les fueron asignadas en el **Taiga**.

## Sprint 1

El primer sprint consistió en primero elaborar apropiadamente la propuesta de proyecto, la cual fue revisada y aprobada por el profesor, y se presentaron las respectivas historias de usuario con cada uno de sus Como, Quiero y Para poder. Luego se presentó el modelo del programa, con el Diagrama de Clases, Casos de Uso, C&C y el Modelo Entidad-Relación. Luego de recibir retroalimentación por el profesor, se procedió a crear la página web y a desplegarla en Heroku con una imagen, para así demostrar los avances que se consiguieron hasta esa fecha. Por último, se agregaron todas las insignias al repositorio, las cuales se vienen incluidas las de Codacy, CircleCI, Heroku y Taiga. El taiga fue elaborado teniendo en cuenta la distribución del trabajo en el grupo, las historias de usuario y las entregas correspondientes al Sprint 1. Asimismo, se elaboró un Wireframe demostrando el prototipo del proyecto para así visualizar la interfaz de usuario final de Quick Mobility. 

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/Sprint1.PNG)

## Sprint 2

En el segundo Sprint se abordaron todas las correcciones realizadas por el profesor en cada una de las retroalimentaciones que tuvimos luego de exponer nuestros avances del proyecto, en las cuales modificamos los diagramas concordes a lo que avanzábamos en cada entrega, en el que poco a poco fuimos diseñando de manera diferente el proyecto. Asimismo, mostramos avances funcionales de la aplicación ya desplegada en Heroku, en la cual los usuarios (tanto el conductor como el pasajero que son los dos tipos de usuario) se le crearon a cada uno de ellos un Dashboard o interfaz de usuario, en la cual el pasajero podía consultar los viajes disponibles, y elegir la mejor opción para el mismo, y del mismo modo con el conductor. También se añadieron funcionalidades como la de inicio de sesión y registro, en la que se implementó en el Back-End del proyecto la persistencia con las respectivas bases de datos para así poder entregar en el segundo Sprint un avance 100% funcional con respecto a lo que se pedía en el enunciado de la entrega del segundo Sprint.

![img](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/img/Sprint2.PNG)

## Integrantes
[Alejandro Toro Daza](https://github.com/Skullzo)

[Juan Sebastián Muñoz Dorado](https://github.com/JuanMunozD)

[Laura Alejandra Bernal Hernández](https://github.com/lale1507)
## Licencia & Derechos de Autor
**©** Alejandro Toro Daza, Juan Sebastián Muñoz Dorado, Laura Alejandra Bernal Hernández. [Escuela Colombiana de Ingeniería Julio Garavito](https://www.escuelaing.edu.co/es/).
      
Licencia bajo la [GNU General Public License](https://github.com/2021-1-PROYARSW-TOROCURRAMBERO/Proyecto/blob/main/LICENSE).
