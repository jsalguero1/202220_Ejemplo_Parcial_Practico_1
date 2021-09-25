# Ejemplo Parcial Práctico 1

## Instrucciones

1. Haga un fork de este repositorio
2. Clone el repositorio bifurcado en su máquina virtual
3. Abra el proyecto en Spring Tools (o en el editor de su preferencia)
4. Lea el enunciado completamente antes de iniciar

## Punto 1 (30%). Persistencia

Esta aplicación tiene el propósito de crear un sistema de información para un consultorio médico.

(15%) Cree la entidad Medico en la carpeta correspondiente. Un Medico tiene un nombre, un apellido, un registro médico, una especilidad y un id de tipo _Long_ que representa su llave primaria.

(15%) Realice la implementación de la persistencia del Medico.


## Punto 2 (40%). Lógica

(20%) Usted debe crear la lógica de la aplicación; para esto implemente la clase correspondiente y el método _getMedicos_.

(20%) Crear la prueba unitaria para el método _getMedicos_.

## Punto 3 (20%). API

(5%) Cree la clase _MedicoDTO_ con los atributos correspondientes. 

(5%) Cree la clase _MedicoController_

(10%) Implement el método _findAll_ para que llame al método de la lógica que obtiene todos los médicos, y retorna al usuario el listado de todos los médicos.

## Punto 4 (10%). Pruebas de Postman

(5%) Abra la consola de H2 e inserte varios registros en la tabla MEDICO_ENTITY.  

Cree las siguiente prueba de integración en una colección

### Obtener todos los médicos

Se espera un resultado semejante a este ejemplo:
```
Method: GET
URL: http://localhost:8080/api/medicos
Response Status: 200
Response body:
[{
	"nombre": "Juan Jose",
	"apellido": "Rodríguez Ortiz"
	"registroMedico": "FC3578K",
	"especialidad": "Anestesiología"
},
{
	"nombre": "María Paula",
	"apellido": "Sarmiento Mancipe"
	"registroMedico": "DE7825",
	"especialidad": "Medicina Interna"
}]


```


