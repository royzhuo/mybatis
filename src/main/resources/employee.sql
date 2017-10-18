create table employee(
id int(10) primary key not null auto_increment,
emp_name VARCHAR(30) not null,
createTime datetime,
updateTime datetime
);


create table department(
id INT(10) PRIMARY KEY not null auto_increment,
dept_name VARCHAR(30) not null,
createTime datetime,
updateTime datetime
);

ALTER TABLE  employee ADD COLUMN d_id INT(10);

ALTER TABLE employee modify d_id INT(10) not NULL ;

ALTER TABLE  employee ADD CONSTRAINT fk_emp_dept FOREIGN KEY (d_id) references department(id);

insert into employee(emp_name,createTime,d_id) VALUES ('nick',CURRENT_DATE,1);
insert into employee(emp_name,createTime,d_id) VALUES ('roy',CURRENT_DATE,1);
insert into employee(emp_name,createTime,d_id) VALUES ('qing',CURRENT_DATE,2);
insert into employee(emp_name,createTime,d_id) VALUES ('jessi',CURRENT_DATE,2);

INSERT into department(dept_name,createTime) VALUES ('平台组',CURRENT_DATE );
INSERT into department(dept_name,createTime) VALUES ('测试组',CURRENT_TIMESTAMP );

SELECT * from department dept LEFT JOIN employee emp ON dept.id=emp.id where dept.id=1;

SELECT