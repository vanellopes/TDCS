DROP DATABASE IF EXISTS dentalclinic;
CREATE DATABASE IF NOT EXISTS dentalclinic;

USE dentalclinic;

ALTER DATABASE dentalclinic
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;  
  
CREATE TABLE IF NOT EXISTS rol (
  rol_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(30),
  descripcion VARCHAR(100),
  INDEX(nombre)
) engine=InnoDB;

INSERT INTO `rol` VALUES (1,'Administrador','Encargado de mantener el sistema'),(2,'Recepcionista','Nexo entre pacientes y profesional'),(3,'Odontologo','Profesional de la salud bucal'),(4,'Paciente','Persona que asiste a la clinica');

CREATE TABLE IF NOT EXISTS usuario (
  usuario_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  usuario VARCHAR(80),
  password VARCHAR(80),
  estado int,
  rol_id INT(4) UNSIGNED NOT NULL,
  INDEX(usuario),
  FOREIGN KEY (rol_id) REFERENCES rol(rol_id)
) engine=InnoDB;

INSERT INTO `usuario` VALUES (1,'mpaez','1234',0,2),(2,'ejara','1234',1,2),(3,'jfari','1234',0,2),(4,'mtguiperro','1234',0,2),(5,'ppicapie','1234',0,2),(6,'mbane','4321',0,3),(7,'amondiu','4321',0,3),(8,'jfairch','4321',0,3),(9,'vgudino','admin',0,1),(10,'agutierrez','admin',0,1),(11,'ssanchez','admin',0,1),(12,'vlportal','admin',0,1),(13,'mdejtiar','admin',1,1),(14,'mvazquez','0000',0,4),(15,'aortiz','0000',1,4),(16,'yestevez','0000',0,4),(17,'mgil','0000',0,4),(18,'crevuel','0000',0,4),(19,'mm','0000',1,4);

CREATE TABLE IF NOT EXISTS paciente (
  paciente_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(30),
  apellido VARCHAR(30),
  num_documento int(20),
  fecha_nac DATE,
  direccion varchar(100),
  celular int(30),
  mail VARCHAR(100),
  num_hc varchar(40),
  usuario_id INT(4) UNSIGNED NOT NULL,
  INDEX(apellido),
  FOREIGN KEY (usuario_id) REFERENCES usuario(usuario_id)
) engine=InnoDB;

INSERT INTO `paciente` VALUES (4000,'Mariana','Vazquez',25648138,'1970-06-28',"Julio Roca 349",1222222222,'pichita70@hotmail.com',6461403,14),(4001,'Angel','Ortiz',21424142,'1985-07-05',"Laprida 1142",1222222222,'ortiz_angel@gmail.com',61686,15),(4002,'Yolanda','Estevez',17359135,'1990-08-25',"Montevideo 2102",1222222222,'estev.yol@yahoo.com',325684,16),(4003,'Maria','Gil',35162866,'1986-05-17',"Av Fuerza Aerea Argentina 4232",1222222222,'maria_gil@gmail.com.ar',26468,17),(4004,'Constanza','Revuel',38482455,'1987-12-15',"Derqui 117 PB B",1222222222,'coty.revuel@yahoo.com',715245,18);

CREATE TABLE IF NOT EXISTS odontologo (
  odontologo_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(30),
  apellido VARCHAR(30),
  num_documento int(20),
  fecha_nac DATE,
  celular int(30),
  mail VARCHAR(100),
  matricula varchar(40),
  usuario_id INT(4) UNSIGNED NOT NULL,
  INDEX(apellido),
  FOREIGN KEY (usuario_id) REFERENCES usuario(usuario_id)
) engine=InnoDB;

INSERT INTO `odontologo` VALUES (3000,'Magnus','Bane',30468218,'2001-12-24',1222222222,'magnus_bane@yahoo.com.ar','105617018',6),(3001,'Alec','Mondiu',26749125,'1991-02-07',1222222222,'alecmo@gmail.com','90015420',7),(3002,'Jocelyn','Fairchaild',07166584,'1950-01-18',1222222222,'fair_joce@hotmail.com','50254802',8);

CREATE TABLE IF NOT EXISTS recepcionista (
  recepcionista_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(30),
  apellido VARCHAR(30),
  num_documento int(20),
  fecha_nac DATE,
  celular int(30),
  mail VARCHAR(100),  
  usuario_id INT(4) UNSIGNED NOT NULL,
  INDEX(apellido),
  FOREIGN KEY (usuario_id) REFERENCES usuario(usuario_id)
) engine=InnoDB;

INSERT INTO `recepcionista` VALUES (2000,'Marta','Paez',28493782,'1980-02-25',1222222222,'mpaez58@gmail.com',1),(2001,'Eduaro','Jara',40589472,'1990-12-03',1222222222,'jara78@hotmail.com',2),(2002,'Jace','Fairchaild',20846182,'1975-05-20',1222222222,'shadowhunter@yahoo.com',3),(2003,'Maria Teresa','Guiperro',35019482,'1986-09-17',1222222222,'guiperro23@gmail.com',4),(2004,'Pedro','Picapiedra',04354318,'1978-04-20',1222222222,'flinstone@gmail.com',5);

CREATE TABLE IF NOT EXISTS estado_turno (
  estado_turno_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(80),
  descripcion VARCHAR(100),
  INDEX(nombre)
) engine=InnoDB;

INSERT INTO `estado_turno` VALUES (1,'Activo','usuario trabajando'),(2,'Baja','usuario dado de baja'),(3,'Suspendido','usuario inactivo'),(4,'Vacaciones','usuario en pausa');

CREATE TABLE IF NOT EXISTS turno (
  turno_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  paciente_id INT(4) UNSIGNED NOT NULL,
  odontologo_id INT(4) UNSIGNED NOT NULL,
  fecha DATE,
  estado_turno_id INT(4) UNSIGNED NOT NULL,
  observaciones VARCHAR(255),
  FOREIGN KEY (estado_turno_id) REFERENCES estado_turno(estado_turno_id),
  FOREIGN KEY (paciente_id) REFERENCES paciente(paciente_id),
  FOREIGN KEY (odontologo_id) REFERENCES odontologo(odontologo_id)
) engine=InnoDB;

INSERT INTO `turno` VALUES (1,4000,3001,'2020-11-09',1,'Control rutinario'),(2,4001,3002,'2020-11-16',1,'Tratamiento de conducto'),(3,4002,3000,'2020-11-20',1,'Extraccion de muela'),(4,4003,3001,'2020-12-03',1,'Protesis');
