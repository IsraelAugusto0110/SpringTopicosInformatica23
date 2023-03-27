use anotacao;

create table ant_anotacao (
  ant_id bigint unsigned not null auto_increment,
  ant_texto varchar(256) not null,
  ant_data_hora DATE,
  ant_usr_id bigint unsigned not null,
  primary key (ant_id),
  unique key uni_usuario_nome (usr_nome),

);