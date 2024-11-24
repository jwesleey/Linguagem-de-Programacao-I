--
-- PostgreSQL database dump
--

-- Dumped from database version 17.0
-- Dumped by pg_dump version 17.0

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: anotacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.anotacao (
    notas character varying(300)
);


ALTER TABLE public.anotacao OWNER TO postgres;

--
-- Name: perguntas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.perguntas (
    pergunta character varying(300)
);


ALTER TABLE public.perguntas OWNER TO postgres;

--
-- Name: TABLE anotacao; Type: ACL; Schema: public; Owner: postgres
--

GRANT SELECT,INSERT,DELETE,UPDATE ON TABLE public.anotacao TO userlp1;


--
-- Name: TABLE perguntas; Type: ACL; Schema: public; Owner: postgres
--

GRANT SELECT,INSERT,DELETE,UPDATE ON TABLE public.perguntas TO userlp1;


--
-- PostgreSQL database dump complete
--

