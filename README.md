Auditor

## Proyecto hecho en Spring Boot, Angular JS, JQuery, JS.

Se requiere tener Maven, Angular JS, JQuery Datatables, PostgreSQL y MongoDB.


**Ejecutar:**
```
$ mvn spring-boot:run
```


### Ejemplo para usar un API Rest

**Crear nuevo usuario:**
```
POST: http://localhost:4444/users
Header
Content-Type: application/json
Accept: application/json
Body:
{«userId»:»1″,»name»:»Rob»}
{«userId»:»2″,»name»:»Peter»}
{«userId»:»1″,»name»:»Rob»}
```

**Obtener un usuario por userId:**
```
GET: http://localhost:4444/users/1
Nota: userId=1
```

**Obtener todos los usuario:**
```
GET: http://localhost:4444/users
```

**Modificar usuario:**
```
PUT: http://localhost:4444/users
Header
Content-Type: application/json
Accept: application/json
Body:
{«userId»:»1″,»name»:»John»}
```

**Eliminar un usuario por userId:**
```
DELETE: http://localhost:4444/users/1
Nota: userId=1
```


Links:
* [https://www.mongodb.com/](https://www.mongodb.com/es)
* [https://nodejs.org/](https://nodejs.org/)
* [https://datatables.net/](https://datatables.net/)
* [https://angularjs.org/](https://angularjs.org/)
* [https://www.postgresql.org/](https://www.postgresql.org/)
* [http://www.querydsl.com/](http://www.querydsl.com/)
* [http://www.robertocrespo.net/](http://www.robertocrespo.net/kaizen/implementar-microservicios-spring-boot-iii-acceso-datos-mongodb-data/)