create database gymmanagement;
use gymmanagement;
CREATE TABLE `gymmanagement`.`gym_admingym_emp` (
    `admin_id` INT NOT NULL AUTO_INCREMENT,
    `admin_namegym_empgym_admin` VARCHAR(45) NOT NULL,
    `phone_number` VARCHAR(15) NULL,
    `email_id` VARCHAR(45) NULL,
    `password` VARCHAR(45) NULL,
    PRIMARY KEY (`admin_id`),
    UNIQUE INDEX `admin_idgym_admind_UNIQUE` (`admin_id` ASC) VISIBLE);

CREATE TABLE `gymmanagement`.`gym_emp` (
    `emp_id` INT NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(45) NULL,
    `last_name` VARCHAR(45) NULL,
    `address` VARCHAR(150) NULL,
    `gender` VARCHAR(45) NULL,
    `dob` VARCHAR(45) NULL,
    `mobile` VARCHAR(45) NULL,
    `ssn` VARCHAR(45) NULL,
    `designation` VARCHAR(45) NULL,
    `join_date` VARCHAR(45) NULL,
    `new_tablecol` VARCHAR(45) NULL,
    PRIMARY KEY (`emp_id`),
    UNIQUE INDEX `emp_id_UNIQUE` (`emp_id` ASC) VISIBLE,
    UNIQUE INDEX `ssn_UNIQUE` (`ssn` ASC) VISIBLE);

CREATE TABLE `gymmanagement`.`gym_mem` (
    `mem_id` INT NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(45) NULL,
    `lastname` VARCHAR(45) NULL,
    `address` VARCHAR(45) NULL,
    `gender` VARCHAR(45) NULL,
    `email` VARCHAR(45) NULL,
    `phone` VARCHAR(45) NULL,
    `workouts` VARCHAR(45) NULL,
    `status` VARCHAR(45) NULL,
    PRIMARY KEY (`mem_id`),
    UNIQUE INDEX `mem_id_UNIQUE` (`mem_id` ASC) VISIBLE);

CREATE TABLE `gymmanagement`.`gym_emp_attend` (
    `attend_id` INT NOT NULL AUTO_INCREMENT,
    `is_present` TINYINT NULL,`date` VARCHAR(45) NULL,
                                                  `employee_emp_id` INT NULL,
                                                  PRIMARY KEY (`attend_id`),
                                                  UNIQUE INDEX `attegym_emp_attendnd_id_UNIQUE` (`attend_id` ASC) VISIBLE,
                                                  CONSTRAINT `employee_emp_id`
                                                      FOREIGN KEY (`employee_emp_id`)
                                                          REFERENCES `gymmanagement`.`gym_emp` (`emp_id`)
                                                          ON DELETE NO ACTION
                                                          ON UPDATE NO ACTION);


