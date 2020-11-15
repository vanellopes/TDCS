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

CREATE TABLE IF NOT EXISTS usuario (
  usuario_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  usuario VARCHAR(80),
  password VARCHAR(80),
  estado int,
  rol_id INT(4) UNSIGNED NOT NULL,
  INDEX(usuario),
  FOREIGN KEY (rol_id) REFERENCES rol(rol_id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS persona (
  persona_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(30),
  apellido VARCHAR(30),
  num_documento int(20),
  fecha_nac DATE,
  telefono VARCHAR(30),
  mail VARCHAR(100),  
  usuario_id INT(4) UNSIGNED NOT NULL,
  INDEX(apellido),
  FOREIGN KEY (usuario_id) REFERENCES usuario(usuario_id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS paciente (
  paciente_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  num_hc varchar(40),
  persona_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (persona_id) REFERENCES persona(persona_id)
) engine=InnoDB;


CREATE TABLE IF NOT EXISTS recepcionista (
  recepcionista_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  persona_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (persona_id) REFERENCES persona(persona_id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS odontologo (
  odontologo_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,  
  matricula varchar(40),
  persona_id INT(4) UNSIGNED NOT NULL,
  FOREIGN KEY (persona_id) REFERENCES persona(persona_id)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS estado_turno (
  estado_turno_id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(80),
  descripcion VARCHAR(100),
  INDEX(nombre)
) engine=InnoDB;

CREATE TABLE IF NOT EXISTS turno (
  turno_id INT(4) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  paciente_id INT(4) UNSIGNED NOT NULL,
  odontologo_id INT(4) UNSIGNED NOT NULL,
  fecha DATE,
  estado_turno_id INT(4) UNSIGNED NOT NULL,
  description VARCHAR(255),
  FOREIGN KEY (estado_turno_id) REFERENCES estado_turno(estado_turno_id),
  FOREIGN KEY (paciente_id) REFERENCES paciente(paciente_id),
  FOREIGN KEY (odontologo_id) REFERENCES odontologo(odontologo_id)
) engine=InnoDB;