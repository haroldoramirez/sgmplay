# --- Sample dataset

# --- !Ups

insert into pais (nome,ddi) values ('Brasil', '+55');
insert into estado (nome,sigla,pais_id) values ('Paran�', 'PR', 1);
insert into cidade (nome,ddd,estado_id) values ('Foz do Igua�u', '45', 1);
insert into bairro (nome,cidade_id) values ('Jardim Am�rica', 1);
insert into bairro (nome,cidade_id) values ('Centro', 1);
