create database gymmanagement;
use gymmanagement;
CREATE TABLE `gymmanagement`.`gym_admin` (
    `adminid` INT NOT NULL AUTO_INCREMENT,
    `empid` INT NOT NULL,
    `firstname` VARCHAR(45) NOT NULL,
    `lastname` VARCHAR(45) NOT NULL,
    `phonenumber` VARCHAR(15) NULL,
    `emailid` VARCHAR(45) NULL,
    `password` VARCHAR(45) NULL,
    PRIMARY KEY (`adminid`),
    UNIQUE INDEX `adminid_UNIQUE` (`adminid` ASC) VISIBLE);

CREATE TABLE `gymmanagement`.`gym_emp` (
    `empid` INT NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(45) NULL,
    `lastname` VARCHAR(45) NULL,
    `address` VARCHAR(150) NULL,
    `gender` VARCHAR(45) NULL,
    `dob` VARCHAR(45) NULL,
    `phone` VARCHAR(45) NULL,
    `ssn` VARCHAR(45) NULL,
    `designation` VARCHAR(45) NULL,
    `joindate` VARCHAR(45) NULL,
    PRIMARY KEY (`empid`),
    UNIQUE INDEX `emp_id_UNIQUE` (`empid` ASC) VISIBLE,
    UNIQUE INDEX `ssn_UNIQUE` (`ssn` ASC) VISIBLE);

CREATE TABLE `gymmanagement`.`gym_mem` (
    `memid` INT NOT NULL AUTO_INCREMENT,
    `firstname` VARCHAR(45) NULL,
    `lastname` VARCHAR(45) NULL,
    `address` VARCHAR(45) NULL,
    `gender` VARCHAR(45) NULL,
    `emailid` VARCHAR(45) NULL,
    `phone` VARCHAR(45) NULL,
    `workouts` VARCHAR(45) NULL,
    `status` VARCHAR(45) NULL,
    PRIMARY KEY (`memid`),
    UNIQUE INDEX `mem_id_UNIQUE` (`memid` ASC) VISIBLE);

CREATE TABLE `gymmanagement`.`gym_emp_attend` (
    `attendid` INT NOT NULL AUTO_INCREMENT,
    `empid` INT NOT NULL,
    `ispresent` BOOLEAN NULL,
    `date` VARCHAR(45) NULL,
    PRIMARY KEY (`attendid`),
    UNIQUE INDEX `attend_id_UNIQUE` (`attendid` ASC) VISIBLE);

CREATE TABLE `gymmanagement`.`gym_mem_attend` (
    `attendid` INT NOT NULL AUTO_INCREMENT,
    `memid` INT NOT NULL,
    `ispresent` BOOLEAN NULL,
    `date` VARCHAR(45) NULL,
    PRIMARY KEY (`attendid`),
    UNIQUE INDEX `attend_id_UNIQUE` (`attendid` ASC) VISIBLE);

SELECT * FROM `gymmanagement`.`gym_admin`;

SELECT * FROM `gymmanagement`.`gym_emp`;

SELECT * FROM `gymmanagement`.`gym_mem`;

SELECT * FROM `gymmanagement`.`gym_emp_attend`;

SELECT * FROM `gymmanagement`.`gym_mem_attend`;

select * from `gymmanagement`.`gym_admin` join gym_emp gma on gma.empid = gym_admin.empid;

select * from `gymmanagement`.`gym_emp` join gym_emp_attend gma on gma.empid = gym_emp.empid;

select * from `gymmanagement`.`gym_mem` join gym_mem_attend gma on gma.memid = gym_mem.memid;
