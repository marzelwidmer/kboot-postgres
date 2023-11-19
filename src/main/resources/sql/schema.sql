-- drop sequence if exists hibernate_sequence;

-- create sequence IF NOT EXISTS hibernate_sequence;
-- alter sequence hibernate_sequence owner to postgres;
--
drop table IF EXISTS album cascade;
create table IF NOT EXISTS album
(
    id     varchar(255) not null,
    user_id varchar(255) not null,
    title  varchar(255) not null,
    version int,
    primary key (id)
);
-- drop table if exists USERS cascade;
-- CREATE TABLE USERS
-- (
--     ID     SERIAL PRIMARY KEY,
--     NAME   VARCHAR(100) NOT NULL,
--     STATUS INT
-- );
