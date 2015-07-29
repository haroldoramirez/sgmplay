# --- Sample dataset

# --- !Ups

insert into usuario(data_cadastro, data_alteracao, padrao_do_sistema, email, senha, privilegio) values ('2015-04-24 17:30:20', '2015-04-24 17:30:20', true, 'admin@sgmplay.com', '40bd001563085fc35165329ea1ff5c5ecbdbbeef', 2);

insert into pais (nome,ddi) values ('Brasil','+55');
insert into pais (nome,ddi) values ('Paraguai', '+21');
insert into pais (nome,ddi) values ('Argentina','+54');

insert into estado (nome,sigla,pais_id) values ('Paraná', 'PR', 1);
insert into estado (nome,sigla,pais_id) values ('São Paulo', 'SP', 1);
insert into estado (nome,sigla,pais_id) values ('Santa Catarina', 'SC', 1);
insert into estado (nome,sigla,pais_id) values ('Rio Grande do Sul', 'RS', 1);

insert into cidade (nome,ddd,estado_id) values ('Foz do Iguaçu', '45', 1);
insert into cidade (nome,ddd,estado_id) values ('Curitiba', '41', 1);
insert into cidade (nome,ddd,estado_id) values ('Campo Mourão', '41', 1);
insert into cidade (nome,ddd,estado_id) values ('São Paulo Capital', '11', 2);

insert into bairro (nome,cidade_id) values ('Jardim América', 1);
insert into bairro (nome,cidade_id) values ('Jardim Karla', 1);
insert into bairro (nome,cidade_id) values ('Vila C', 1);
insert into bairro (nome,cidade_id) values ('Vila B', 1);
insert into bairro (nome,cidade_id) values ('Vila A', 1);
insert into bairro (nome,cidade_id) values ('Morumbi I', 1);
insert into bairro (nome,cidade_id) values ('Morumbi II', 1);
insert into bairro (nome,cidade_id) values ('Morumbi III', 1);

insert into categoria (nome) values ('Cereais');
insert into categoria (nome) values ('Sucos');
insert into categoria (nome) values ('Grãos');
insert into categoria (nome) values ('Lacteos');
insert into categoria (nome) values ('Biscoitos');
insert into categoria (nome) values ('Limpeza');
insert into categoria (nome) values ('Pães');
insert into categoria (nome) values ('Refrigerantes');
insert into categoria (nome) values ('Cervejas');
insert into categoria (nome) values ('Vinhos');
insert into categoria (nome) values ('Farinhas');
insert into categoria (nome) values ('Legumes');
insert into categoria (nome) values ('Verduras');
insert into categoria (nome) values ('Frutas');
insert into categoria (nome) values ('Ferramentas');
insert into categoria (nome) values ('Carnes');

insert into fabricante (nome,observacoes) values ('Nestle','Multinacional de Alimentos');
insert into fabricante (nome,observacoes) values ('Pepsico','Multinacional de Bebidas e Alimentos');
insert into fabricante (nome,observacoes) values ('Coca Cola','Multinacional de Bebidas e Sucos');

insert into unidadedemedida (nome,observacoes) values ('Peça','');
insert into unidadedemedida (nome,observacoes) values ('Pacote','');
insert into unidadedemedida (nome,observacoes) values ('Kilo','');

