-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema taller
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema taller
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `taller` ;
USE `taller` ;

-- -----------------------------------------------------
-- Table `taller`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `taller`.`producto` (
  `idProducto` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `Categoria` VARCHAR(60) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `Marca` VARCHAR(30) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `Material` VARCHAR(50) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `Descripcion` VARCHAR(200) COLLATE 'utf8mb3_spanish_ci' NULL DEFAULT NULL,
  `Precio` DECIMAL(6,2) NOT NULL,
  `Stock` INT NOT NULL,
  PRIMARY KEY (`idProducto`))
ENGINE = InnoDB
AUTO_INCREMENT = 6;


-- -----------------------------------------------------
-- Table `taller`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `taller`.`usuario` (
  `dni` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `Poblacion` VARCHAR(100) COLLATE 'utf8mb3_spanish_ci' NULL DEFAULT NULL,
  `Telefono` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`dni`))
ENGINE = InnoDB
AUTO_INCREMENT = 61234344;


-- -----------------------------------------------------
-- Table `taller`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `taller`.`pedido` (
  `Usuario_dni` INT UNSIGNED NOT NULL,
  `Producto_idProducto` INT UNSIGNED NOT NULL,
  `Numero_Pedido` INT UNSIGNED NOT NULL,
  `Precio_Venta` DECIMAL(6,2) UNSIGNED NOT NULL,
  PRIMARY KEY (`Numero_Pedido`),
  INDEX `fk_Usuario_has_Producto_Producto1_idx` (`Producto_idProducto` ASC) VISIBLE,
  INDEX `fk_Usuario_has_Producto_Usuario_idx` (`Usuario_dni` ASC) VISIBLE,
  CONSTRAINT `fk_Usuario_has_Producto_Producto1`
    FOREIGN KEY (`Producto_idProducto`)
    REFERENCES `taller`.`producto` (`idProducto`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Usuario_has_Producto_Usuario`
    FOREIGN KEY (`Usuario_dni`)
    REFERENCES `taller`.`usuario` (`dni`)
    ON DELETE RESTRICT
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
