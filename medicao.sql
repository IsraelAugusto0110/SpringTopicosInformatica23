use anotacao;

create table mdc_medicao (
    mdc_id bigint primary key auto_increment,
    mdc_data_hora datetime not null,
    mdc_temperatura float not null,
    mdc_umidade float not null,
    mdc_particulas float,
    mdc_status varchar(10),
    mdc_data_processamento datetime
);

insert into mdc_medicao (mdc_data_hora, mdc_temperatura, mdc_umidade, mdc_particulas)
    values (current_timestamp(), 28.7, 0.4, 0.3),
            (current_timestamp(), 28.8, 0.4, null);