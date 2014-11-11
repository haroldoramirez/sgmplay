# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bairro (
  id                        integer not null,
  nome                      varchar(255) not null,
  cidade_id                 integer not null,
  constraint uq_bairro_1 unique (nome,cidade_id),
  constraint pk_bairro primary key (id))
;

create table cidade (
  id                        integer not null,
  nome                      varchar(255) not null,
  ddd                       varchar(255),
  estado_id                 integer not null,
  constraint uq_cidade_1 unique (nome,estado_id),
  constraint pk_cidade primary key (id))
;

create table cliente (
  id                        integer not null,
  nome                      varchar(255) not null,
  telefone                  varchar(255) not null,
  rg                        varchar(255),
  cpf                       varchar(255),
  celular                   varchar(255),
  email                     varchar(255),
  rua                       varchar(255),
  numero                    varchar(255),
  cep                       varchar(255),
  complemento               varchar(255),
  datanascimento            timestamp,
  genero                    varchar(9),
  bairro_id                 integer,
  constraint ck_cliente_genero check (genero in ('MASCULINO','FEMININO')),
  constraint uq_cliente_rg unique (rg),
  constraint uq_cliente_cpf unique (cpf),
  constraint pk_cliente primary key (id))
;

create table estado (
  id                        integer not null,
  nome                      varchar(255) not null,
  sigla                     varchar(255),
  pais_id                   integer not null,
  constraint uq_estado_1 unique (nome,pais_id),
  constraint pk_estado primary key (id))
;

create table pais (
  id                        integer not null,
  nome                      varchar(255) not null,
  ddi                       varchar(255),
  constraint uq_pais_nome unique (nome),
  constraint pk_pais primary key (id))
;

create sequence bairro_seq;

create sequence cidade_seq;

create sequence cliente_seq;

create sequence estado_seq;

create sequence pais_seq;

alter table bairro add constraint fk_bairro_cidade_1 foreign key (cidade_id) references cidade (id);
create index ix_bairro_cidade_1 on bairro (cidade_id);
alter table cidade add constraint fk_cidade_estado_2 foreign key (estado_id) references estado (id);
create index ix_cidade_estado_2 on cidade (estado_id);
alter table cliente add constraint fk_cliente_bairro_3 foreign key (bairro_id) references bairro (id);
create index ix_cliente_bairro_3 on cliente (bairro_id);
alter table estado add constraint fk_estado_pais_4 foreign key (pais_id) references pais (id);
create index ix_estado_pais_4 on estado (pais_id);



# --- !Downs

drop table if exists bairro cascade;

drop table if exists cidade cascade;

drop table if exists cliente cascade;

drop table if exists estado cascade;

drop table if exists pais cascade;

drop sequence if exists bairro_seq;

drop sequence if exists cidade_seq;

drop sequence if exists cliente_seq;

drop sequence if exists estado_seq;

drop sequence if exists pais_seq;

