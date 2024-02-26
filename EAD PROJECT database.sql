create database Students1;
show databases;
drop database Student;
use Students1;

CREATE TABLE StudentsDetails (
    Student_Id int primary key,
    Student_Name Varchar(30),
    Class varchar(3),
    RegsDate varchar(20),
    Contact_Number BIGINT 
);

drop table StudentsDetails;
describe StudentsDetails;
select * from StudentsDetails;


create table BookDetails(
Book_Id int primary key,
Book_Title varchar(130),
Author varchar(50),
Issued_Date varchar(20),
Price int); 

drop table BookDetails;
select * from BookDetails;
describe BookDetails;

select * from StudentsDetails;

create table IssuedBooks(
Book_id int,
Student_id int,
Issued_date varchar(20),
Due_date varchar(20),
Return_book varchar(20));

select * from IssuedBooks;
drop table IssuedBooks;

show tables;

