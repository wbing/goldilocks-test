##1.添加本地maven库依赖
```
install:install-file -Dfile=/{本地jar包路径}/goldilocks8.jar -DgroupId=sunje.goldilocks -DartifactId=gjdbc -Dversion=1.0 -Dpackaging=jar
```
##2.数据库创建用户
```oracle
gsql sys gliese --as sysdba
create user lms identified by lms;
grant all to lms;
```
##3.创建表
```oracle
create table demo (id number,name varchar(100 octets));
```
