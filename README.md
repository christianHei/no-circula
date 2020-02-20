# REST Services - Spring Boot

This project was generated with Spring Boot version 2.2.4.

Small example of a CRUD to save, modify, delete data in a database table that saves information about a vehicle.

## DataBase PostgreSQL version 12
Download the project and modify the file application.yml
Change ddl-auto: none to ddl-auto create to generate to database.

Run `NoCirculaApplication.java` the restore ddl-auto: none

## Development server Spring Boot

Run `NoCirculaApplication.java` for a dev server. Navigate to `http://localhost:3334/`.

## Service Vehículo
http://localhost:3334/vehiculo

If you want to get the entire list of vehicles, example:
http://localhost:3334/vehiculo
or
http://localhost:3334/vehiculo/

If you want to get a vehicle by id, example:
http://localhost:3334/vehiculo/1

If you want to get a vehicle per license plate, exmaple:
http://localhost:3334/vehiculo/placa/123


