# --- Sample dataset

# --- !Ups

insert into pais (nome,ddi) values ('Brasil', '+55');
insert into pais (nome,ddi) values ('Paraguai', '+21');
insert into pais (nome,ddi) values ('Italia', '+39');
insert into pais (nome,ddi) values ('Argentina', '+54');
insert into pais (nome,ddi) values ('Equador', '+593');
insert into pais (nome,ddi) values ('Estados Unidos', '+1');

insert into estado (nome,sigla,pais_id) values ('Paraná', 'PR', 1);
insert into estado (nome,sigla,pais_id) values ('São Paulo', 'SP', 1);
insert into estado (nome,sigla,pais_id) values ('Santa Catarina', 'SC', 1);
insert into estado (nome,sigla,pais_id) values ('Rio Grande do Sul', 'RS', 1);
insert into estado (nome,sigla,pais_id) values ('Acre', 'AC', 1);
insert into estado (nome,sigla,pais_id) values ('Rio de Janeiro', 'RJ', 1);
insert into estado (nome,sigla,pais_id) values ('Paraíba', 'PB', 1);
insert into estado (nome,sigla,pais_id) values ('Pernambuco', 'PE', 1);
insert into estado (nome,sigla,pais_id) values ('Amazonas', 'AM', 1);

insert into cidade (nome,ddd,estado_id) values ('Foz do Iguaçu', '45', 1);
insert into cidade (nome,ddd,estado_id) values ('Curitiba', '41', 1);
insert into cidade (nome,ddd,estado_id) values ('Campina Grande', '83', 7);
insert into cidade (nome,ddd,estado_id) values ('São Paulo Capital', '11', 2);
insert into cidade (nome,ddd,estado_id) values ('João Pessoa', '81', 7);
insert into cidade (nome,ddd,estado_id) values ('Campo Largo', '41', 1);

insert into bairro (nome,cidade_id) values ('Jardim América', 1);
insert into bairro (nome,cidade_id) values ('Jardim Karla', 1);
insert into bairro (nome,cidade_id) values ('Vila C', 1);
insert into bairro (nome,cidade_id) values ('Vila Yolanda', 1);
insert into bairro (nome,cidade_id) values ('Jardim São Paulo', 1);
insert into bairro (nome,cidade_id) values ('Morumbi I', 1);
insert into bairro (nome,cidade_id) values ('Morumbi II', 1);
insert into bairro (nome,cidade_id) values ('Morumbi III', 1);
insert into bairro (nome,cidade_id) values ('Porto Meira', 1);