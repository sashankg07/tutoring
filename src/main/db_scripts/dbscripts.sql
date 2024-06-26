
DROP DATABASE IF EXISTS tutoring;

CREATE DATABASE tutoring
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LOCALE_PROVIDER = 'libc'
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE USER tutoring WITH PASSWORD 'admin';

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
    OWNER to tutoring;

INSERT INTO public.login(
	id, first_name, last_name, email_id, password)
	VALUES (1001, 'Saash', 'Gadi', 'a@b.com', 'abcd1234');