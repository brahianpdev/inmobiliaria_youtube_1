## ¡Bienvenido a nuestro proyecto de Base de Datos Inmobiliaria de Los Simpsons! 

En este emocionante proyecto, hemos creado una base de datos utilizando MySQL para gestionar información relacionada con propiedades inmobiliarias, 
inquilinos y propietarios, y lo hemos ambientado en el colorido y divertido universo de Los Simpsons.

#### Descripción del Proyecto
Nuestra base de datos se enfoca en simular el funcionamiento de una agencia inmobiliaria en la ficticia ciudad de Springfield, donde los personajes icónicos de Los Simpsons, 
como la familia Simpson, Ned Flanders, el Sr. Burns y otros, actúan como inquilinos o propietarios de diversas propiedades. 
El objetivo principal de este proyecto es demostrar cómo se pueden utilizar bases de datos para administrar la información de propiedades y su relación con los habitantes de Springfield.

En este proyecto, exploraremos el fascinante mundo de Internet y el protocolo HTTP, adentrándonos en su funcionamiento y estructura fundamental. 
Comenzaremos nuestro viaje comprendiendo los cimientos de la comunicación en la web y cómo el protocolo HTTP se convierte en el pilar esencial de esta interconexión global.

A medida que avanzamos, profundizaremos en los distintos métodos que ofrece HTTP, incluyendo GET, POST, PUT y otros, desentrañando sus propósitos y aplicaciones en la transmisión de información entre servidores y clientes web. 
Esta exploración nos permitirá comprender cómo se lleva a cabo la interacción dinámica entre aplicaciones y cómo se gestionan las solicitudes y respuestas en la era digital.

Además, nos sumergiremos en la arquitectura subyacente de sistemas web, analizando cómo los componentes clave, como servidores web, bases de datos y servicios, interactúan entre sí para ofrecer experiencias en línea fluidas y eficientes.

Finalmente, tocaremos temas cruciales como los Objetos de Transferencia de Datos (DTO) y la herramienta Postman, que desempeñan un papel esencial en el diseño y prueba de API RESTful. 
Aprenderemos cómo utilizar Postman para realizar solicitudes HTTP, probar servicios web y garantizar que las aplicaciones se comuniquen de manera efectiva.

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/3dc46bbc-f14a-48e6-8b6e-7b6af98fa8b8)

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/2616b1eb-371c-42ce-8d5a-74bc34413340)

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/55db737e-9370-4cff-8f23-e880f0b085ce)

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/4993002c-16d5-43d0-b0ff-2f6b0c8ae7c8)

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/66e76910-acdd-47ef-b740-6a0eddbc29a8)

### Instalaciones necesarias

`1` - Descargar [plugin](https://plugins.netbeans.apache.org/catalogue/?id=4) de Spring Boot para Apache Netbeans e instalarlo o en su defecto, descargar [Intellij Community Edition](https://www.jetbrains.com/edu-products/download/other-IIE.html)
En caso de ir por la primera opcion, verificar que sea este:

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/17829024-dd8e-4a77-befb-35764b94b77d)

`1.1` - Instalacion de Plugin en Apache:

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/6205a05c-f9e2-494d-8745-5f430faf77c7)

`2` - Descarga, instalación de Postman y carga de colección.
`2.1` - [Descargar postman](https://www.postman.com/downloads/)

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/ec902e43-bf2a-4d3a-a732-dd912ddd5456)

`2.2` - Descargar [coleccion](https://www.mediafire.com/file/jhsgmceze4mp99e/TP+Inmobiliaria.postman_collection.json/file) de Postman de TP Inmobiliaria

Ver apartado `5.1` en adelante para ver como configurar el “Menú” utilizando Postman como herramienta.

`3` - Creación y uso de base de datos “inmobiliaria” en MySql Workbench.
`3.1` - Conectarse.

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/b83ee86e-f0e0-4bcd-bd50-d0bf862f87e4)

`3.2` Crear la db y hacer uso de ella.

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/2de6d682-82e7-440f-a256-e00e2157d68b)

`4` - Abrir Apache Netbeans, esperar que carguen las dependencias y ejecutar el programa. Este paso funciona exactamente igual en Intellij.

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/abebdee9-44ec-42aa-a25e-c346d04307dd)

`5.1` - Abrir Postman y abrir la colección.

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/0e4df5a6-13f8-4783-b280-2d36671c9e7e)

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/a6c74b25-4578-4902-8268-1855956e4493)

### DEMO 

De la forma en la que se hizo el código, cuando se inicia NetBeans, genera las tablas en base a entidades que están en la carpeta entities. Y, mediante un script database.sql en la carpeta resources, dichas tablas se pueblan con datos de prueba para facilitar la demostración práctica mediante Postman.

Tenemos endpoints que cubren todo el acronimo CRUD (Create, read, update, delete). 

Endpoint, mas lógica:
`listarClientes`: 
Verifica que existan clientes en la base de datos, si existen, retorna la lista de todos ellos, sino, retorna null (if else).

`buscarClientePorId`:
Verifica que el cliente buscado, exista en la base de datos, y lo retorna, en caso de que no exista, retorna null (if else). 

`registrarNuevoCliente`:
Se registran los datos ingresados por el usuario, y se guarda un nuevo cliente en la base de datos.

`actualizarCliente`: 
Se verifica que el cliente exista en la base de datos, si existe, mediante un while recorre todos los campos que tiene que actualizar, en caso de que no exista dicho cliente, retorna null.

`eliminarCliente`: 
Elimina un cliente de la base de datos.

`mostrarInmobiliaria`: 
Muestra los detalles de la inmobiliaria.

Para ver a nivel código, una explicacion mas “logica o técnica”, revisar la clase “ClientService”.

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/9e1cd078-04d4-4713-b32e-169b936f2e20)

### IMPORTANTE
Si falla por que el PUERTO 8080 está en uso.

`1`- Abrir cmd y ejecutar: 
```
netstat -ano | findstr :8080
taskkill /F /PID {PIDNUMBER}
```
Ver imagen de referencia:

![image](https://github.com/brahianpdev/inmobiliaria_youtube_1/assets/66213550/013e3002-13a9-4d02-8c7a-48c4a53a1ecf)


