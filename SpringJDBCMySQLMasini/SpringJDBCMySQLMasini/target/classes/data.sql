drop table if exists masini;
create table masini (inmatriculare varchar(8) not null primary key, marca varchar(40) not null, an integer not null, culoare varchar(40) not null, nr_km integer);

insert into masini (inmatriculare,marca,an,culoare,nr_km) values ('tm82xdd','Skoda',2008,'gri',20000);
insert into masini (inmatriculare,marca,an,culoare,nr_km) values ('tm22xdd','Mercedes-Benz',2018,'gri',20000);
insert into masini (inmatriculare,marca,an,culoare,nr_km) values ('tm32xdd','Ford',2000,'gri',20000);
insert into masini (inmatriculare,marca,an,culoare,nr_km) values ('tm12xdd','Volkswagen',2010,'gri',20000);
insert into masini (inmatriculare,marca,an,culoare,nr_km) values ('tm52xdd','Volvo',2007,'gri',20000);