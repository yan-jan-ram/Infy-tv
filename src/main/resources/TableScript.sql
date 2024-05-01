DROP SCHEMA IF EXISTS InfyTv_db;

CREATE SCHEMA InfyTv_db;
USE InfyTv_db;
   
create table series(
	series_id INT AUTO_INCREMENT,
	seriesName_name VARCHAR(50) not null,

	series_type VARCHAR(20) not null,

   CONSTRAINT ps_series_id_pk PRIMARY KEY (series_id)
);
INSERT INTO series VALUES(1001,'abc','aaa');

INSERT INTO series VALUES(1002,'xyz','bbb');



create table user(
	registration_id INT AUTO_INCREMENT,
	user_name VARCHAR(50) not null,
	series_id INT,
	
	
   CONSTRAINT ps_registration_id_pk PRIMARY KEY (registration_id),
   constraint ps_user_series_fk foreign key(series_id) references series(series_id)
);





INSERT INTO user VALUES(1001,'ram',1001);




commit;

select * from series ;
select * from user ;


