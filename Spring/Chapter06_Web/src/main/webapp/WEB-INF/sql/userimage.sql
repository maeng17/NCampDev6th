#Oracle
create table USERIMAGE (
SEQ int(10) primary, 
IMAGENAME varchar(50) not null,
IMAGECONTENT varchar(4000),
IMAGE1 varchar(200));
create squnce SEQ_USERIMAGE nocycle nocache;


#MySQL
create table USERIMAGE (
SEQ int(10) primary key auto_increment, 
IMAGENAME varchar(50) not null,
IMAGECONTENT varchar(4000),
IMAGE1 varchar(200));
