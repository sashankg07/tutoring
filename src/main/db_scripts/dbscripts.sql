
Database: tutoring-db

DROP DATABASE IF EXISTS tutoring-db;

CREATE DATABASE tutoring-db
    WITH
    OWNER = admin
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE USER admin WITH PASSWORD 'admin';

CREATE TABLE public.login
(
    id integer NOT NULL,
    first_name character varying(64) NOT NULL,
    last_name character varying(64) NOT NULL,
    email_id character varying(64) NOT NULL,
    password character varying(64) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE IF EXISTS public.login
    OWNER to admin;

INSERT INTO public.login(
	id, first_name, last_name, email_id, password)
	VALUES (1001, 'Saash', 'Gadi', 'a@b.com', 'abcd1234');