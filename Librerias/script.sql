drop database bytes;
create database bytes;
use bytes;

-- -----------------------------------------------------
-- Table `bytes`.`rol`
-- -----------------------------------------------------
CREATE TABLE table_rol(id_rol_PK INT primary key NOT NULL,
                 Tipo_Rol VARCHAR(45) NOT NULL,Descripcion VARCHAR(45) NOT NULL);

-- -----------------------------------------------------
-- Table `bytes`.`producto`
-- -----------------------------------------------------
CREATE TABLE table_producto(codigo_producto_PK VARCHAR(255) primary key NOT NULL,
                      nombre VARCHAR(255) NOT NULL,precio DOUBLE NOT NULL);

-- -----------------------------------------------------
-- Table `bytes`.`descuento`
-- -----------------------------------------------------
CREATE TABLE table_descuentos(id_descuentos_PK INT primary key NOT NULL AUTO_INCREMENT,
  porcentaje_descuento DOUBLE NOT NULL,
  FK_produc_codigo VARCHAR(255) NOT NULL,foreign key(FK_produc_codigo) references table_producto(codigo_producto_PK));
  
-- -----------------------------------------------------
-- Table `bytes`.`personal`
-- -----------------------------------------------------
CREATE TABLE table_personal(rut_personal_PK varchar(12) primary key NOT NULL,nombre VARCHAR(255) NOT NULL,apellido VARCHAR(255) NOT NULL,
  FK_id_rol INT NOT NULL,foreign key (FK_id_rol) references table_rol(id_rol_PK));
  
-- -----------------------------------------------------
-- Table `bytes`.`venta`
-- -----------------------------------------------------
CREATE TABLE table_venta (Num_venta_PK INT primary key ,
   FK_rut_vendedor varchar(12) NOT NULL, foreign key(FK_rut_vendedor) references table_personal(rut_personal_PK),
  fecha DATE NOT NULL,hora TIME NOT NULL,total DOUBLE NOT NULL);
  
-- -----------------------------------------------------
-- Table `bytes`.`detalle_venta`
-- -----------------------------------------------------
CREATE TABLE table_detalle_venta(id_detalle_venta_PK INt primary key NOT NULL AUTO_INCREMENT,
  FK_num_venta INT NOT NULL, foreign key (FK_num_venta) references table_venta(Num_venta_PK),
  FK_produc_codigo VARCHAR(255) NOT NULL, foreign key (FK_produc_codigo) references table_producto(codigo_producto_PK),
  cantidad_producto INT(11) NOT NULL,
  Precio_venta DOUBLE NOT NULL,
  Valor_iva DOUBLE NOT NULL,
  Descuento DOUBLE NOT NULL,
  Subtotal DOUBLE NOT NULL);
  
  
-- -----------------------------------------------------
-- funcion `bytes`.`rut`
-- -----------------------------------------------------  
  DROP FUNCTION IF EXISTS validate_rut;
delimiter //
CREATE FUNCTION validate_rut (RUT VARCHAR(12)) 
	RETURNS INT
BEGIN
	DECLARE strlen INT;
	DECLARE i INT;
	DECLARE j INT;
	DECLARE suma NUMERIC;
	DECLARE temprut VARCHAR(12);
	DECLARE verify_dv CHAR(2);
	DECLARE DV CHAR(1);
	SET RUT = REPLACE(REPLACE(RUT, '.', ''),'-','');
	SET DV = SUBSTR(RUT,-1,1);
	SET RUT = SUBSTR(RUT,1,LENGTH(RUT)-1);
	SET i = 1;
  	SET strlen = LENGTH(RUT);
  	SET j = 2;
  	SET suma = 0;
	IF strlen = 8 OR strlen = 7 THEN
		SET temprut = REVERSE(RUT);
		moduloonce: LOOP
		    IF i <= LENGTH(temprut) THEN
    			SET suma = suma + (CONVERT(SUBSTRING(temprut, i, 1),UNSIGNED INTEGER) * j); 
	      		SET i = i + 1;
	      		IF j = 7 THEN
		    		SET j = 2;
	    		ELSE
	    			SET j = j + 1;
    			END IF;
	      		ITERATE moduloonce;
		    END IF;
		    LEAVE moduloonce;
	  	END LOOP moduloonce;
	  	SET verify_dv = 11 - (suma % 11);
	  	IF verify_dv = 11 THEN
	  		SET verify_dv = 0;
	  	ELSEIF verify_dv = 10 THEN 
	  		SET verify_dv = 'K';
	  	END IF;
	  	IF DV = verify_dv THEN
	  		RETURN rut;
	  	
	  	END IF;
	END IF;
END
//
delimiter ;
  -- -----------------------------------------------------
-- insert `bytes`.`Rol`
-- -----------------------------------------------------
Insert into table_rol(id_rol_PK,Tipo_Rol,Descripcion) values (1,"Administrador","Usuario con mayor privilegio");
-- -----------------------------------------------------
-- Table `bytes`.`´Personal`
-- -----------------------------------------------------
  insert into table_personal (rut_personal_PK,nombre,apellido,FK_id_rol) values 
  (20401787,"Bastian Alonso" ,"Santibanez Sepulveda",1);
  insert into table_personal (rut_personal_PK,nombre,apellido,FK_id_rol) values 
  (19561064,"Diego Alonso" ,"Parada Sepulveda",1);
  insert into table_personal (rut_personal_PK,nombre,apellido,FK_id_rol) values 
  (20044251,"Joaquin Alonso" ,"Valenzuela ",1);
  
  select * from table_producto
