CREATE database if not exists school;

Use school;

CREATE table Student(
    StudenID varchar(10) primary key not null ,
    Name varchar(20) not null ,
    Address varchar(50) not null ,
    Phone varchar(10) check (Phone not like '%[^0-9]%')
);


INSERT INTO Student values
('B01010','Nguyen Tuan Anh','Ha Noi',0904818238),
('B10394','Nguyen Hoang Hai','Hai Duong',0494949494);
