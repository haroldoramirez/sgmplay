# --- Sample dataset

# --- !Ups

insert into usuario(data_de_cadastro, data_de_alteracao, padrao_do_sistema, email, senha, privilegio) values ('2015-04-24 17:30:20', '2015-04-24 17:30:20', true, 'admin@admin.com', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 3);

insert into pais(nome, ddi) values ('Brasil','+55');
insert into pais(nome, ddi) values ('Paraguai', '+21');
insert into pais(nome, ddi) values ('Argentina','+54');

insert into estado(nome, sigla, pais_id) values ('Paraná', 'PR', 1);
insert into estado(nome, sigla, pais_id) values ('São Paulo', 'SP', 1);
insert into estado(nome, sigla, pais_id) values ('Santa Catarina', 'SC', 1);
insert into estado(nome, sigla, pais_id) values ('Rio Grande do Sul', 'RS', 1);


insert into cidade(nome, ddd, estado_id) values ('Foz do Iguaçu', '45', 1);
insert into cidade(nome, ddd, estado_id) values ('Curitiba', '41', 1);

insert into bairro(nome, cidade_id) values ('Jardim América', 1);
insert into bairro(nome, cidade_id) values ('Jardim Karla', 1);
insert into bairro(nome, cidade_id) values ('Vila C', 1);
insert into bairro(nome, cidade_id) values ('Vila B', 1);
insert into bairro(nome, cidade_id) values ('Vila A', 1);