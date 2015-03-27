# --- Sample dataset

# --- !Ups

insert into pais (nome,ddi) values ('Brasil', '+55');
insert into pais (nome,ddi) values ('Paraguai', '+21');
insert into pais (nome,ddi) values ('Italia', '+39');
insert into pais (nome,ddi) values ('Argentina', '+54');
insert into pais (nome,ddi) values ('Equador', '+593');
insert into pais (nome,ddi) values ('Estados Unidos', '+1');
insert into pais (nome,ddi) values ('Colombia', '+57');
insert into pais (nome,ddi) values ('Austrália', '+61');
insert into pais (nome,ddi) values ('Cuba', '+53');
insert into pais (nome,ddi) values ('Japão', '+81');
insert into pais (nome,ddi) values ('Espanha', '+34');
insert into pais (nome,ddi) values ('Portugal', '+351');
insert into pais (nome,ddi) values ('Alemanha', '+49');
insert into pais (nome,ddi) values ('Inglaterra', '+44');
insert into pais (nome,ddi) values ('Coreia do Sul', '+82');
insert into pais (nome,ddi) values ('Russia', '+7');
insert into pais (nome,ddi) values ('China', '+86');
insert into pais (nome,ddi) values ('Índia', '+91');
insert into pais (nome,ddi) values ('Emirados Árabes', '+971');
insert into pais (nome,ddi) values ('Iraque', '+964');
insert into pais (nome,ddi) values ('Uruguai', '+598');
insert into pais (nome,ddi) values ('México', '+52');

insert into estado (nome,sigla,pais_id) values ('Paraná', 'PR', 1);
insert into estado (nome,sigla,pais_id) values ('São Paulo', 'SP', 1);
insert into estado (nome,sigla,pais_id) values ('Santa Catarina', 'SC', 1);
insert into estado (nome,sigla,pais_id) values ('Rio Grande do Sul', 'RS', 1);
insert into estado (nome,sigla,pais_id) values ('Acre', 'AC', 1);
insert into estado (nome,sigla,pais_id) values ('Rio de Janeiro', 'RJ', 1);
insert into estado (nome,sigla,pais_id) values ('Paraíba', 'PB', 1);
insert into estado (nome,sigla,pais_id) values ('Pernambuco', 'PE', 1);
insert into estado (nome,sigla,pais_id) values ('Amazonas', 'AM', 1);
insert into estado (nome,sigla,pais_id) values ('Roraima', 'RO', 1);
insert into estado (nome,sigla,pais_id) values ('Ceará', 'CE', 1);
insert into estado (nome,sigla,pais_id) values ('Rio Grande do Norte', 'RN', 1);
insert into estado (nome,sigla,pais_id) values ('Bahia', 'BA', 1);
insert into estado (nome,sigla,pais_id) values ('Minas Gerais', 'MG', 1);
insert into estado (nome,sigla,pais_id) values ('Espírito Santo', 'ES', 1);
insert into estado (nome,sigla,pais_id) values ('Tocantins', 'TO', 1);
insert into estado (nome,sigla,pais_id) values ('Alagoas', 'AL', 1);
insert into estado (nome,sigla,pais_id) values ('Sergipe', 'SE', 1);
insert into estado (nome,sigla,pais_id) values ('Mato Grosso do Sul', 'MS', 1);
insert into estado (nome,sigla,pais_id) values ('Piauí', 'PI', 1);
insert into estado (nome,sigla,pais_id) values ('Distrito Federal', 'DF', 1);
insert into estado (nome,sigla,pais_id) values ('Amapá', 'AP', 1);
insert into estado (nome,sigla,pais_id) values ('Rondônia', 'RO', 1);
insert into estado (nome,sigla,pais_id) values ('Pará', 'PA', 1);
insert into estado (nome,sigla,pais_id) values ('Goiás', 'GO', 1);
insert into estado (nome,sigla,pais_id) values ('Mato Grosso', 'MT', 1);
insert into estado (nome,sigla,pais_id) values ('Ciudad Del Este', 'CDE', 2);


insert into cidade (nome,ddd,estado_id) values ('Foz do Iguaçu', '45', 1);
insert into cidade (nome,ddd,estado_id) values ('Curitiba', '41', 1);
insert into cidade (nome,ddd,estado_id) values ('Campina Grande', '83', 7);
insert into cidade (nome,ddd,estado_id) values ('São Paulo Capital', '11', 2);
insert into cidade (nome,ddd,estado_id) values ('João Pessoa', '81', 7);
insert into cidade (nome,ddd,estado_id) values ('Campo Largo', '41', 1);

insert into bairro (nome,cidade_id) values ('Jardim América', 1);
insert into bairro (nome,cidade_id) values ('Jardim Karla', 1);
insert into bairro (nome,cidade_id) values ('Vila C', 1);
insert into bairro (nome,cidade_id) values ('Vila B', 1);
insert into bairro (nome,cidade_id) values ('Vila A', 1);
insert into bairro (nome,cidade_id) values ('Vila Yolanda', 1);
insert into bairro (nome,cidade_id) values ('Jardim São Paulo', 1);
insert into bairro (nome,cidade_id) values ('Morumbi I', 1);
insert into bairro (nome,cidade_id) values ('Morumbi II', 1);
insert into bairro (nome,cidade_id) values ('Morumbi III', 1);
insert into bairro (nome,cidade_id) values ('Porto Meira', 1);
insert into bairro (nome,cidade_id) values ('Centro', 1);
insert into bairro (nome,cidade_id) values ('Jardim Polo Centro', 1);
insert into bairro (nome,cidade_id) values ('Festugato', 1);
insert into bairro (nome,cidade_id) values ('Vila Paraguaia', 1);
insert into bairro (nome,cidade_id) values ('Vila Portes', 1);
insert into bairro (nome,cidade_id) values ('Jardim Jupira', 1);

insert into categoria (descricao) values ('Cereais');
insert into categoria (descricao) values ('Sucos');
insert into categoria (descricao) values ('Grãos');
insert into categoria (descricao) values ('Lacteos');
insert into categoria (descricao) values ('Biscoitos');
insert into categoria (descricao) values ('Limpeza');
insert into categoria (descricao) values ('Pães');
insert into categoria (descricao) values ('Refrigerantes');
insert into categoria (descricao) values ('Cervejas');
insert into categoria (descricao) values ('Vinhos');
insert into categoria (descricao) values ('Farinhas');
insert into categoria (descricao) values ('Legumes');
insert into categoria (descricao) values ('Verduras');
insert into categoria (descricao) values ('Frutas');
insert into categoria (descricao) values ('Ferramentas');
insert into categoria (descricao) values ('Carnes');

insert into fabricante (nome, observacoes) values ('Nestle', 'Multinacional de Alimentos');
insert into fabricante (nome, observacoes) values ('Pepsico', 'Multinacional de Bebidas e Alimentos');
insert into fabricante (nome, observacoes) values ('Coca Cola', 'Multinacional de Bebidas e Sucos');
insert into fabricante (nome, observacoes) values ('Renata', 'Multinacional de Alimentos');
insert into fabricante (nome, observacoes) values ('Monster', '');
insert into fabricante (nome, observacoes) values ('Tio João', '');

insert into unidadedemedida (nome, observacoes) values ('Lata 350ml', '');
insert into unidadedemedida (nome, observacoes) values ('Pacote', '');
insert into unidadedemedida (nome, observacoes) values ('Litro', '');
insert into unidadedemedida (nome, observacoes) values ('Caixa', '');
insert into unidadedemedida (nome, observacoes) values ('Dúzia', '');
insert into unidadedemedida (nome, observacoes) values ('Lata 600ml', '');
insert into unidadedemedida (nome, observacoes) values ('Kilo', '');

insert into usuario (login, senha, privilegio) values ('Haroldo', '123456', 1);
insert into usuario (login, senha, privilegio) values ('Operador 2', '123456', 2);
insert into usuario (login, senha, privilegio) values ('Operador 3', '123456', 1);
insert into usuario (login, senha, privilegio) values ('Operador 4', '123456', 3);
insert into usuario (login, senha, privilegio) values ('Vendedor 1', '123456', 1);
insert into usuario (login, senha, privilegio) values ('Vendedor 2', '123456', 1);