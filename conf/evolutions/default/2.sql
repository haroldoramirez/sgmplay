# --- Sample dataset

# --- !Ups

insert into usuario(id, data_cadastro, data_alteracao, padrao_do_sistema, email, senha, privilegio) values (1, '2015-04-24 17:30:20', '2015-04-24 17:30:20', true, 'admin@sgmplay.com', '123', 2);

insert into pais (id,nome,ddi) values (1,'Brasil','+55');

insert into estado (id,nome,sigla,pais_id) values (1,'Paraná','PR', 1);

insert into cidade (id,nome,ddd,estado_id) values (1,'Foz do Iguaçu', '45', 1);

insert into bairro (id,nome,cidade_id) values (1,'Jardim América', 1);


