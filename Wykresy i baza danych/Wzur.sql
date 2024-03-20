-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema LabMaster
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema LabMaster
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `LabMaster` DEFAULT CHARACTER SET utf8 ;
USE `LabMaster` ;

-- -----------------------------------------------------
-- Table `LabMaster`.`Emplyees`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Emplyees` (
  `ID_Pracownicy` INT NOT NULL AUTO_INCREMENT,
  `Nazwisko` VARCHAR(255) NOT NULL,
  `Imię` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  `Konto zatwierdzone` TINYINT NULL,
  `Telefon` VARCHAR(15) NULL,
  `Stanowisko` VARCHAR(255) NULL,
  `Departament` VARCHAR(255) NULL,
  `Pensja` INT NULL,
  `Konto zatwierdzone` TINYINT NOT NULL,
  PRIMARY KEY (`ID_Pracownicy`),
  UNIQUE INDEX `ID_Pracownicy_UNIQUE` (`ID_Pracownicy` ASC) VISIBLE,
  UNIQUE INDEX `Email_UNIQUE` (`Email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Patients`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Patients` (
  `ID_Pacjent` INT NOT NULL AUTO_INCREMENT,
  `Nazwisko` VARCHAR(255) NOT NULL,
  `Imię` VARCHAR(255) NOT NULL,
  `Pesel` VARCHAR(11) NOT NULL,
  `Numer telefonu` VARCHAR(15) NULL,
  `Data urodzenia` DATE NULL,
  PRIMARY KEY (`ID_Pacjent`),
  UNIQUE INDEX `ID_Pacjent_UNIQUE` (`ID_Pacjent` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Types_of_Tests`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Types_of_Tests` (
  `ID_Typ Badania` INT NOT NULL AUTO_INCREMENT,
  `Koszt` DECIMAL(10,2) NOT NULL,
  `Czas konieczyn do wykonania` INT NOT NULL,
  PRIMARY KEY (`ID_Typ Badania`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Visits`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Visits` (
  `ID_Wizyty` INT NOT NULL AUTO_INCREMENT,
  `Patients_ID_Pacjent` INT NOT NULL,
  `Data i godzina` DATETIME NOT NULL,
  `Rodzaj procedury` TEXT NOT NULL,
  `Inne informacje` TEXT NULL,
  PRIMARY KEY (`ID_Wizyty`),
  INDEX `fk_Visits_Patients_idx` (`Patients_ID_Pacjent` ASC) VISIBLE,
  CONSTRAINT `fk_Visits_Patients`
    FOREIGN KEY (`Patients_ID_Pacjent`)
    REFERENCES `LabMaster`.`Patients` (`ID_Pacjent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Sample_For_Tests`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Sample_For_Tests` (
  `ID_Próbki` INT NOT NULL AUTO_INCREMENT,
  `Visits_ID_Wizyty` INT NOT NULL,
  `Typ próbki` VARCHAR(45) NOT NULL,
  `Data pobrania` DATETIME NOT NULL,
  `Emplyees_ID_Pracownicy` INT NOT NULL,
  `Stan` VARCHAR(45) NOT NULL,
  `Uwagi` TEXT NULL,
  PRIMARY KEY (`ID_Próbki`),
  INDEX `fk_Sample_For_Tests_Visits1_idx` (`Visits_ID_Wizyty` ASC) VISIBLE,
  INDEX `fk_Sample_For_Tests_Emplyees1_idx` (`Emplyees_ID_Pracownicy` ASC) VISIBLE,
  CONSTRAINT `fk_Sample_For_Tests_Visits1`
    FOREIGN KEY (`Visits_ID_Wizyty`)
    REFERENCES `LabMaster`.`Visits` (`ID_Wizyty`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Sample_For_Tests_Emplyees1`
    FOREIGN KEY (`Emplyees_ID_Pracownicy`)
    REFERENCES `LabMaster`.`Emplyees` (`ID_Pracownicy`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Test_Results`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Test_Results` (
  `ID_Wyniku` INT NOT NULL AUTO_INCREMENT,
  `Wynik` TEXT NOT NULL,
  `Interpretacja` TEXT NOT NULL,
  `Inne informacje` TEXT NULL,
  PRIMARY KEY (`ID_Wyniku`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Tests_performed`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Tests_performed` (
  `ID_Badania` INT NOT NULL AUTO_INCREMENT,
  `Sample_For_Tests_ID_Próbki` INT NOT NULL,
  `Types_of_Tests_ID_Typ Badania` INT NOT NULL,
  `Data wykonania` DATETIME NOT NULL,
  `Zlecenie NFZ` TINYINT NULL,
  `Zlecone przez` VARCHAR(255) NULL,
  `Test_Results_ID_Wyniku` INT NOT NULL,
  `Wykonanie przez` INT NULL,
  `Uwagi` TEXT(255) NULL,
  PRIMARY KEY (`ID_Badania`),
  INDEX `fk_Tests_performed_Types_of_Tests1_idx` (`Types_of_Tests_ID_Typ Badania` ASC) VISIBLE,
  INDEX `fk_Tests_performed_Sample_For_Tests1_idx` (`Sample_For_Tests_ID_Próbki` ASC) VISIBLE,
  INDEX `fk_Tests_performed_Test_Results1_idx` (`Test_Results_ID_Wyniku` ASC) VISIBLE,
  CONSTRAINT `fk_Tests_performed_Types_of_Tests1`
    FOREIGN KEY (`Types_of_Tests_ID_Typ Badania`)
    REFERENCES `LabMaster`.`Types_of_Tests` (`ID_Typ Badania`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Tests_performed_Sample_For_Tests1`
    FOREIGN KEY (`Sample_For_Tests_ID_Próbki`)
    REFERENCES `LabMaster`.`Sample_For_Tests` (`ID_Próbki`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Tests_performed_Test_Results1`
    FOREIGN KEY (`Test_Results_ID_Wyniku`)
    REFERENCES `LabMaster`.`Test_Results` (`ID_Wyniku`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Costs`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Costs` (
  `ID_Koszta` INT NOT NULL AUTO_INCREMENT,
  `Tests_performed_ID_Badania` INT NOT NULL,
  `Kwota` DECIMAL(10,2) NOT NULL,
  `Data` DATE NOT NULL,
  PRIMARY KEY (`ID_Koszta`),
  INDEX `fk_Costs_Tests_performed1_idx` (`Tests_performed_ID_Badania` ASC) VISIBLE,
  CONSTRAINT `fk_Costs_Tests_performed1`
    FOREIGN KEY (`Tests_performed_ID_Badania`)
    REFERENCES `LabMaster`.`Tests_performed` (`ID_Badania`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Schedule_Diag`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Schedule_Diag` (
  `ID_Maszyny diagnostycznej` INT NOT NULL AUTO_INCREMENT,
  `Stan` VARCHAR(45) NOT NULL,
  `Data_Rozpoczęcia` DATETIME NOT NULL,
  `Data_Zakończenia` DATETIME NOT NULL,
  `Uwagi` TEXT NULL,
  PRIMARY KEY (`ID_Maszyny diagnostycznej`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Schedule_Lab`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Schedule_Lab` (
  `ID_Proces` INT NOT NULL AUTO_INCREMENT,
  `Tests_performed_ID_Badania` INT NOT NULL,
  `Emplyees_ID_Pracownicy` INT NOT NULL,
  `Data zlecenia` DATETIME NOT NULL,
  `Data rozpoczęcia` DATETIME NOT NULL,
  `Data zakończenia` DATETIME NOT NULL,
  `Schedule_Diag_ID_Maszyny diagnostycznej` INT NOT NULL,
  `Stan` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID_Proces`),
  INDEX `fk_Schedule_Lab_Tests_performed1_idx` (`Tests_performed_ID_Badania` ASC) VISIBLE,
  INDEX `fk_Schedule_Lab_Emplyees1_idx` (`Emplyees_ID_Pracownicy` ASC) VISIBLE,
  INDEX `fk_Schedule_Lab_Schedule_Diag1_idx` (`Schedule_Diag_ID_Maszyny diagnostycznej` ASC) VISIBLE,
  CONSTRAINT `fk_Schedule_Lab_Tests_performed1`
    FOREIGN KEY (`Tests_performed_ID_Badania`)
    REFERENCES `LabMaster`.`Tests_performed` (`ID_Badania`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Schedule_Lab_Emplyees1`
    FOREIGN KEY (`Emplyees_ID_Pracownicy`)
    REFERENCES `LabMaster`.`Emplyees` (`ID_Pracownicy`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Schedule_Lab_Schedule_Diag1`
    FOREIGN KEY (`Schedule_Diag_ID_Maszyny diagnostycznej`)
    REFERENCES `LabMaster`.`Schedule_Diag` (`ID_Maszyny diagnostycznej`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`Transactions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`Transactions` (
  `ID_Tranzkacji` INT NOT NULL AUTO_INCREMENT,
  `Typ` VARCHAR(45) NOT NULL,
  `Patients_ID_Pacjent` INT NOT NULL,
  `Tests_performed_ID_Badania` INT NOT NULL,
  `Kwota` DECIMAL(10,2) NOT NULL,
  `Data` DATETIME NOT NULL,
  `Uwagi` TEXT NULL,
  PRIMARY KEY (`ID_Tranzkacji`),
  INDEX `fk_Transactions_Patients1_idx` (`Patients_ID_Pacjent` ASC) VISIBLE,
  INDEX `fk_Transactions_Tests_performed1_idx` (`Tests_performed_ID_Badania` ASC) VISIBLE,
  CONSTRAINT `fk_Transactions_Patients1`
    FOREIGN KEY (`Patients_ID_Pacjent`)
    REFERENCES `LabMaster`.`Patients` (`ID_Pacjent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Transactions_Tests_performed1`
    FOREIGN KEY (`Tests_performed_ID_Badania`)
    REFERENCES `LabMaster`.`Tests_performed` (`ID_Badania`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `LabMaster`.`table1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LabMaster`.`table1` (
)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
