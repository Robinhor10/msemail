Primeiro passo é abrir o aplicativo do docker na sua máquina e deixar aberto

Docker-compose up -d = Subir container conforme descrito no arquivo docker-compose,yaml

'---------------------------------------------------------------------------------------------------------

Comando para executar a imagem do postgres criado no arquivo docker-compose.yaml e cria um banco de dados com nome dbemail
docker exec -it postgres_envio_email psql -U dbemail --password

'----------------------------------------------------------------------------------------------------------
\list mostra todos os bancos de dados existentes
'--------------------------------------------------------------------------------------------------------'
Criando uma base de dados, conforme parametros declarados no aplication.properties
CREATE DATABASE dbemail;
\connect dbemail;

----------------------------------------------------------------------------------------------------------
criando a tabela de e-mail, conforme definição na classe model, digitar linha por linha abaixo, uma por vez

video referencia para apoiar a criar uma base https://www.youtube.com/watch?v=DAWCBiNyh0A
'---------------------------------------------------------------------------------------------------------
video da aula do microsservice de e-mail para pegar o nome dos campos certinhos https://www.youtube.com/watch?v=ZBleZzJf6ro (no minuto 31:13)

create table TB_EMAIL(
email_id bigint not null,
email_from varchar,
email_to varchar,
owner_ref varchar,
send_date_email timestamp without time zone,
status_email int,
subject varchar,
text text,
primary key (email_id));

----------------------------------------------------------------------------------------------------------
Comando para verificar se tem registro na tabela
select * from tb_email;

-----------------------------------------------------------------------------------------------------------
Comando para sair do postgres
\q

-----------------------------------------------------------------------------------------------------------
Comando para parar o container do postgres
docker stop postgres_envio_email
