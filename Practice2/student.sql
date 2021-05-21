CREATE DATABASE if not EXISTS school;
use school;

CREATE TABLE student(
    studentID varchar(10) PRIMARY KEY not null,
    studentName varchar(50),
    address varchar(100),
    phone varchar(50)
);

INSERT into student VALUES('B01010', 'Nguyen Tuan Anh', 'Ha Noi', '0904818238');
INSERT into student VALUES('B10394', 'Nguyen Hoang Hai', 'Hai Duong', '0494949494');
