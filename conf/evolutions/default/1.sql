# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cidade (
  id                        integer not null,
  nome                      varchar(255) not null,
  ddd                       varchar(255),
  estado_id                 integer not null,
  constraint pk_cidade primary key (id))
;

create table estado (
  id                        integer not null,
  nome                      varchar(255) not null,
  sigla                     varchar(255),
  pais_id                   integer not null,
  constraint uq_estado_nome unique (nome),
  constraint pk_estado primary key (id))
;

create table pais (
  id                        integer not null,
  nome                      varchar(255) not null,
  ddi                       varchar(255),
  constraint uq_pais_nome unique (nome),
  constraint pk_pais primary key (id))
;

create sequence cidade_seq;

create sequence estado_seq;

create sequence pais_seq;

alter table cidade add constraint fk_cidade_estado_1 foreign key (estado_id) references estado (id);
create index ix_cidade_estado_1 on cidade (estado_id);
alter table estado add constraint fk_estado_pais_2 foreign key (pais_id) references pais (id);
create index ix_estado_pais_2 on estado (pais_id);



# --- !Downs

drop table if exists cidade cascade;

drop table if exists estado cascade;

drop table if exists pais cascade;

drop sequence if exists cidade_seq;

drop sequence if exists estado_seq;

drop sequence if exists pais_seq;

