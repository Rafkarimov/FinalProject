--liquibase formatted sql
--changeset Rafail:1

CREATE TABLE person
(
    id            BIGINT GENERATED ALWAYS AS IDENTITY,
    login         VARCHAR(100) NOT NULL,
    password      VARCHAR(100) NOT NULL,
    last_name     VARCHAR(100) NOT NULL,
    first_name    VARCHAR(100) NOT NULL,
    middle_name   VARCHAR(100) NOT NULL,
    birth_date    DATE         NOT NULL,
    phone         VARCHAR      NOT NULL,
    email         VARCHAR(100) NOT NULL,
    snils         VARCHAR(14)  NOT NULL,
    created_by    VARCHAR(100) NOT NULL,
    created_when  TIMESTAMP    NOT NULL,
    modified_by   VARCHAR(100) NOT NULL,
    modified_when TIMESTAMP    NOT NULL
);

ALTER TABLE person
    ADD CONSTRAINT person_pkey PRIMARY KEY (id);

CREATE TABLE authority
(
    id            INTEGER      NOT NULL,
    name          VARCHAR(100) NOT NULL,
    created_by    VARCHAR(100) NOT NULL,
    created_when  TIMESTAMP    NOT NULL,
    modified_by   VARCHAR(100) NOT NULL,
    modified_when TIMESTAMP    NOT NULL
);

ALTER TABLE authority
    ADD CONSTRAINT authority_pkey PRIMARY KEY (id);
COMMENT ON TABLE "authority" IS 'роли';
