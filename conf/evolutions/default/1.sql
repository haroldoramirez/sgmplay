# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bairro (
  id                        bigint auto_increment not null,
  nome                      varchar(255) not null,
  cidade_id                 bigint not null,
  constraint uq_bairro_1 unique (nome,cidade_id),
  constraint pk_bairro primary key (id))
;

create table categoria (
  id                        bigint auto_increment not null,
  nome                      varchar(255) not null,
  constraint uq_categoria_nome unique (nome),
  constraint pk_categoria primary key (id))
;

create table cidade (
  id                        bigint auto_increment not null,
  nome                      varchar(255) not null,
  ddd                       varchar(255),
  estado_id                 bigint not null,
  constraint uq_cidade_1 unique (nome,estado_id),
  constraint pk_cidade primary key (id))
;

create table cliente (
  id                        bigint auto_increment not null,
  nome                      varchar(255) not null,
  telefone                  varchar(255) not null,
  cpf                       varchar(255),
  datanascimento            datetime,
  genero                    varchar(9),
  situacao                  varchar(7),
  bairro_id                 bigint,
  rg                        varchar(255),
  email                     varchar(255),
  celular                   varchar(255),
  rua                       varchar(255),
  numero                    varchar(255),
  cep                       varchar(255),
  complemento               varchar(255),
  observacoes               varchar(255),
  data_de_cadastro          datetime not null,
  data_de_alteracao         datetime not null,
  constraint ck_cliente_genero check (genero in ('MASCULINO','FEMININO')),
  constraint ck_cliente_situacao check (situacao in ('ATIVO','INATIVO')),
  constraint uq_cliente_cpf unique (cpf),
  constraint pk_cliente primary key (id))
;

create table compra (
  id                        bigint auto_increment not null,
  data_compra               datetime not null,
  total                     decimal(14,2) not null,
  status                    integer not null,
  fornecedor_id             bigint,
  funcionario_id            bigint,
  constraint ck_compra_status check (status in (0,1,2)),
  constraint pk_compra primary key (id))
;

create table estado (
  id                        bigint auto_increment not null,
  nome                      varchar(255) not null,
  sigla                     varchar(255),
  pais_id                   bigint not null,
  constraint uq_estado_1 unique (nome,pais_id),
  constraint pk_estado primary key (id))
;

create table fabricante (
  id                        bigint auto_increment not null,
  nome                      varchar(255) not null,
  observacoes               varchar(255),
  constraint uq_fabricante_nome unique (nome),
  constraint pk_fabricante primary key (id))
;

create table forma_pagamento (
  id                        bigint auto_increment not null,
  titulo                    varchar(255) not null,
  ativo                     tinyint(1) default 0 not null,
  constraint uq_forma_pagamento_titulo unique (titulo),
  constraint pk_forma_pagamento primary key (id))
;

create table fornecedor (
  id                        bigint auto_increment not null,
  nome_fantasia             varchar(255) not null,
  razao_social              varchar(255) not null,
  telefone                  varchar(255) not null,
  cnpj                      varchar(255),
  inscricao_estadual        varchar(255),
  celular                   varchar(255),
  fax                       varchar(255),
  site                      varchar(255),
  email                     varchar(255),
  rua                       varchar(255),
  numero                    varchar(255),
  cep                       varchar(255),
  complemento               varchar(255),
  observacoes               varchar(255),
  bairro_id                 bigint,
  data_de_cadastro          datetime not null,
  data_de_alteracao         datetime not null,
  constraint uq_fornecedor_cnpj unique (cnpj),
  constraint uq_fornecedor_inscricao_estadual unique (inscricao_estadual),
  constraint pk_fornecedor primary key (id))
;

create table itemcompra (
  id                        bigint auto_increment not null,
  constraint pk_itemcompra primary key (id))
;

create table pais (
  id                        bigint auto_increment not null,
  nome                      varchar(255) not null,
  ddi                       varchar(255),
  constraint uq_pais_nome unique (nome),
  constraint pk_pais primary key (id))
;

create table produto (
  id                        bigint auto_increment not null,
  descricao                 varchar(255) not null,
  quantidade_minima         integer not null,
  quantidade_em_estoque     integer not null,
  preco_de_custo            float not null,
  preco_de_venda            float not null,
  codigo_de_barras          varchar(255),
  observacoes               varchar(255),
  fornecedor_id             bigint,
  categoria_id              bigint,
  fabricante_id             bigint,
  unidadedemedida_id        bigint,
  data_de_cadastro          datetime not null,
  data_de_alteracao         datetime not null,
  last_update               timestamp default '2015-07-23 15:47:50' not null,
  constraint uq_produto_descricao unique (descricao),
  constraint pk_produto primary key (id))
;

create table unidadedemedida (
  id                        bigint auto_increment not null,
  nome                      varchar(255) not null,
  observacoes               varchar(255),
  constraint uq_unidadedemedida_nome unique (nome),
  constraint pk_unidadedemedida primary key (id))
;

create table usuario (
  id                        bigint auto_increment not null,
  email                     varchar(255) not null,
  senha                     varchar(255) not null,
  privilegio                integer not null,
  data_de_cadastro          datetime not null,
  data_de_alteracao         datetime not null,
  padrao_do_sistema         tinyint(1) default 0,
  constraint uq_usuario_email unique (email),
  constraint pk_usuario primary key (id))
;

alter table bairro add constraint fk_bairro_cidade_1 foreign key (cidade_id) references cidade (id) on delete restrict on update restrict;
create index ix_bairro_cidade_1 on bairro (cidade_id);
alter table cidade add constraint fk_cidade_estado_2 foreign key (estado_id) references estado (id) on delete restrict on update restrict;
create index ix_cidade_estado_2 on cidade (estado_id);
alter table cliente add constraint fk_cliente_bairro_3 foreign key (bairro_id) references bairro (id) on delete restrict on update restrict;
create index ix_cliente_bairro_3 on cliente (bairro_id);
alter table compra add constraint fk_compra_fornecedor_4 foreign key (fornecedor_id) references fornecedor (id) on delete restrict on update restrict;
create index ix_compra_fornecedor_4 on compra (fornecedor_id);
alter table compra add constraint fk_compra_funcionario_5 foreign key (funcionario_id) references usuario (id) on delete restrict on update restrict;
create index ix_compra_funcionario_5 on compra (funcionario_id);
alter table estado add constraint fk_estado_pais_6 foreign key (pais_id) references pais (id) on delete restrict on update restrict;
create index ix_estado_pais_6 on estado (pais_id);
alter table fornecedor add constraint fk_fornecedor_bairro_7 foreign key (bairro_id) references bairro (id) on delete restrict on update restrict;
create index ix_fornecedor_bairro_7 on fornecedor (bairro_id);
alter table produto add constraint fk_produto_fornecedor_8 foreign key (fornecedor_id) references fornecedor (id) on delete restrict on update restrict;
create index ix_produto_fornecedor_8 on produto (fornecedor_id);
alter table produto add constraint fk_produto_categoria_9 foreign key (categoria_id) references categoria (id) on delete restrict on update restrict;
create index ix_produto_categoria_9 on produto (categoria_id);
alter table produto add constraint fk_produto_fabricante_10 foreign key (fabricante_id) references fabricante (id) on delete restrict on update restrict;
create index ix_produto_fabricante_10 on produto (fabricante_id);
alter table produto add constraint fk_produto_unidadedemedida_11 foreign key (unidadedemedida_id) references unidadedemedida (id) on delete restrict on update restrict;
create index ix_produto_unidadedemedida_11 on produto (unidadedemedida_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table bairro;

drop table categoria;

drop table cidade;

drop table cliente;

drop table compra;

drop table estado;

drop table fabricante;

drop table forma_pagamento;

drop table fornecedor;

drop table itemcompra;

drop table pais;

drop table produto;

drop table unidadedemedida;

drop table usuario;

SET FOREIGN_KEY_CHECKS=1;

