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

CREATE TABLE person_authority
(
    person_id     BIGINT       NOT NULL,
    authority_id  BIGINT       NOT NULL
);

ALTER TABLE person_authority
    ADD CONSTRAINT person_authority_pkey PRIMARY KEY (person_id);

ALTER TABLE person_authority
    ADD CONSTRAINT person_authority_person_id_fkey FOREIGN KEY (person_id) REFERENCES person (id);
ALTER TABLE person_authority
    ADD CONSTRAINT person_authority_authority_id_fkey FOREIGN KEY (authority_id) REFERENCES authority (id);

CREATE TABLE med_specialization
(
    id            INTEGER      NOT NULL,
    title         VARCHAR(100) NOT NULL,
    description   text         NOT NULL,
    created_by    VARCHAR(100) NOT NULL,
    created_when  TIMESTAMP    NOT NULL,
    modified_by   VARCHAR(100) NOT NULL,
    modified_when TIMESTAMP    NOT NULL
);

ALTER TABLE med_specialization
    ADD CONSTRAINT med_specialization_pkey PRIMARY KEY (id);

CREATE TABLE doctor
(
    id                    BIGINT GENERATED ALWAYS AS IDENTITY,
    person_id             BIGINT       NOT NULL,
    med_specialization_id BIGINT       NOT NULL,
    created_by            VARCHAR(100) NOT NULL,
    created_when          TIMESTAMP    NOT NULL,
    modified_by           VARCHAR(100) NOT NULL,
    modified_when         TIMESTAMP    NOT NULL
);

ALTER TABLE doctor
    ADD CONSTRAINT doctor_pkey PRIMARY KEY (id);
COMMENT ON TABLE "doctor" IS 'в данной таблице будет храниться информация о всех Врачах ЛПУ: логин, пароль, ФИО, дата рождения, специализация врача';

ALTER TABLE doctor
    ADD CONSTRAINT doctor_person_id_fkey FOREIGN KEY (person_id) REFERENCES person (id);
ALTER TABLE doctor
    ADD CONSTRAINT doctor_med_specialization_id_fkey FOREIGN KEY (med_specialization_id) REFERENCES med_specialization (id);

CREATE TABLE visitor
(
    id            BIGINT GENERATED ALWAYS AS IDENTITY,
    person_id     BIGINT       NOT NULL,
    created_by    VARCHAR(100) NOT NULL,
    created_when  TIMESTAMP    NOT NULL,
    modified_by   VARCHAR(100) NOT NULL,
    modified_when TIMESTAMP    NOT NULL
);

ALTER TABLE visitor
    ADD CONSTRAINT visitor_pkey PRIMARY KEY (id);
COMMENT ON TABLE "visitor" IS 'в данной таблице будет храниться информация о всех посетителях ЛПУ: логин, пароль, ФИО, дата рождения, СНИЛС';

ALTER TABLE visitor
    ADD CONSTRAINT visitor_person_id_fkey FOREIGN KEY (person_id) REFERENCES person (id);

CREATE TABLE laboratory_assistant
(
    id            BIGINT GENERATED ALWAYS AS IDENTITY,
    person_id     BIGINT       NOT NULL,
    created_by    VARCHAR(100) NOT NULL,
    created_when  TIMESTAMP    NOT NULL,
    modified_by   VARCHAR(100) NOT NULL,
    modified_when TIMESTAMP    NOT NULL
);

ALTER TABLE laboratory_assistant
    ADD CONSTRAINT laboratory_assistant_pkey PRIMARY KEY (id);
COMMENT ON TABLE "laboratory_assistant" IS 'в данной таблице будет храниться информация о всех лаборантах ЛПУ: логин, пароль, ФИО, дата рождения, специализация лаборанта';

ALTER TABLE laboratory_assistant
    ADD CONSTRAINT laboratory_assistant_person_id_fkey FOREIGN KEY (person_id) REFERENCES person (id);

CREATE TABLE chief_doctor
(
    id                    BIGINT GENERATED ALWAYS AS IDENTITY,
    person_id             BIGINT       NOT NULL,
    med_specialization_id BIGINT       NOT NULL,
    created_by            VARCHAR(100) NOT NULL,
    created_when          TIMESTAMP    NOT NULL,
    modified_by           VARCHAR(100) NOT NULL,
    modified_when         TIMESTAMP    NOT NULL
);

ALTER TABLE chief_doctor
    ADD CONSTRAINT chief_doctor_pkey PRIMARY KEY (id);
COMMENT ON TABLE "chief_doctor" IS 'главный врач';

ALTER TABLE chief_doctor
    ADD CONSTRAINT chief_doctor_person_id_fkey FOREIGN KEY (person_id) REFERENCES person (id);
ALTER TABLE chief_doctor
    ADD CONSTRAINT chief_doctor_med_specialization_id_fkey FOREIGN KEY (med_specialization_id) REFERENCES med_specialization (id);


CREATE TABLE med_types_of_research
(
    id            INTEGER      NOT NULL,
    title         VARCHAR(100) NOT NULL,
    description   text         NOT NULL,
    created_by    VARCHAR(100) NOT NULL,
    created_when  TIMESTAMP    NOT NULL,
    modified_by   VARCHAR(100) NOT NULL,
    modified_when TIMESTAMP    NOT NULL
);

ALTER TABLE med_types_of_research
    ADD CONSTRAINT med_types_of_research_pkey PRIMARY KEY (id);
COMMENT ON TABLE "med_types_of_research" IS 'тут будут храниться виды мед исследований';

CREATE TABLE laboratory_assistant_med_types
(
    laboratory_assistant_id  BIGINT NOT NULL,
    med_types_of_research_id BIGINT NOT NULL
);

ALTER TABLE laboratory_assistant_med_types
    ADD CONSTRAINT laboratory_assistant_med_types_pkey PRIMARY KEY (laboratory_assistant_id);

ALTER TABLE laboratory_assistant_med_types
    ADD CONSTRAINT laboratory_assistant_med_types_laboratory_assistant_id_fkey FOREIGN KEY (laboratory_assistant_id) REFERENCES laboratory_assistant (id);
ALTER TABLE laboratory_assistant_med_types
    ADD CONSTRAINT laboratory_assistant_med_types_med_types_of_research_id_fkey FOREIGN KEY (med_types_of_research_id) REFERENCES med_types_of_research (id);


CREATE TABLE visitor_research
(
    id                            BIGINT GENERATED ALWAYS AS IDENTITY,
    visitor_id                    BIGINT       NOT NULL,
    doctor_id                     BIGINT       NOT NULL,
    laboratory_assistant_id       BIGINT       NOT NULL,
    date_of_referral_for_research DATE         NOT NULL,
    date_of_study                 DATE         NOT NULL,
    med_types_of_research_id      BIGINT       NOT NULL,
    created_by                    VARCHAR(100) NOT NULL,
    created_when                  TIMESTAMP    NOT NULL,
    modified_by                   VARCHAR(100) NOT NULL,
    modified_when                 TIMESTAMP    NOT NULL
);

ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_pkey PRIMARY KEY (id);
COMMENT ON TABLE "visitor_research" IS 'база исследований пациентов';

ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_visitor_id_fkey FOREIGN KEY (visitor_id) REFERENCES visitor (id);
ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_doctor_id_fkey FOREIGN KEY (doctor_id) REFERENCES doctor (id);
ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_laboratory_assistant_id_fkey FOREIGN KEY (laboratory_assistant_id) REFERENCES laboratory_assistant (id);
ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_med_types_of_research_id_fkey FOREIGN KEY (med_types_of_research_id) REFERENCES med_types_of_research (id);



CREATE TABLE reception_status
(
    id            INTEGER      NOT NULL,
    status        VARCHAR(100) NOT NULL,
    created_by    VARCHAR(100) NOT NULL,
    created_when  TIMESTAMP    NOT NULL,
    modified_by   VARCHAR(100) NOT NULL,
    modified_when TIMESTAMP    NOT NULL
);

ALTER TABLE reception_status
    ADD CONSTRAINT reception_status_pkey PRIMARY KEY (id);
COMMENT ON TABLE "reception_status" IS 'статус приема';


CREATE TABLE reception
(
    id                  BIGINT GENERATED ALWAYS AS IDENTITY,
    visitor_id          BIGINT       NOT NULL,
    doctor_id           BIGINT       NOT NULL,
    reception_date_time TIMESTAMP    NOT NULL,
    reception_status_id BIGINT,
    created_by          VARCHAR(100) NOT NULL,
    created_when        TIMESTAMP    NOT NULL,
    modified_by         VARCHAR(100) NOT NULL,
    modified_when       TIMESTAMP    NOT NULL
);

ALTER TABLE reception
    ADD CONSTRAINT reception_pkey PRIMARY KEY (id);
COMMENT ON TABLE "reception" IS 'прием пациентов';

ALTER TABLE reception
    ADD CONSTRAINT reception_visitor_id_fkey FOREIGN KEY (visitor_id) REFERENCES visitor (id);
ALTER TABLE reception
    ADD CONSTRAINT reception_doctor_id_fkey FOREIGN KEY (doctor_id) REFERENCES doctor (id);
ALTER TABLE reception
    ADD CONSTRAINT reception_reception_status_id_fkey FOREIGN KEY (reception_status_id) REFERENCES reception_status (id);
