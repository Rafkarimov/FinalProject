CREATE SEQUENCE IF NOT EXISTS default_seq START 1 INCREMENT BY 1;

CREATE TABLE specialization
(
    id          BIGSERIAL    NOT NULL,
    title       VARCHAR(100) NOT NULL,
    description VARCHAR(100) NOT NULL
);


ALTER TABLE specialization
    ADD CONSTRAINT specialization_pkey PRIMARY KEY (id);


CREATE TABLE visitor
(
    id           BIGSERIAL   NOT NULL,
    user_info_id INTEGER     NOT NULL,
    SNILS        VARCHAR(14) NOT NULL
);


ALTER TABLE visitor
    ADD CONSTRAINT visitor_pkey PRIMARY KEY (id);
COMMENT ON TABLE "visitor" IS 'в данной таблице будет храниться информация о всех посетителях ЛПУ: логин, пароль, ФИО, дата рождения, СНИЛС';

CREATE TABLE doctor
(
    id                BIGSERIAL NOT NULL,
    user_info_id      INTEGER   NOT NULL,
    specialization_id INTEGER   NOT NULL
);


ALTER TABLE doctor
    ADD CONSTRAINT doctor_pkey PRIMARY KEY (id);
COMMENT ON TABLE "doctor" IS 'в данной таблице будет храниться информация о всех Врачах ЛПУ: логин, пароль, ФИО, дата рождения, специализация врача';

CREATE TABLE admin
(
    id           BIGSERIAL NOT NULL,
    user_info_id INTEGER   NOT NULL
);


ALTER TABLE admin
    ADD CONSTRAINT admin_pkey PRIMARY KEY (id);


CREATE TABLE laboratory_assistant
(
    id             BIGSERIAL NOT NULL,
    user_info_id   INTEGER   NOT NULL,
    specialization INTEGER   NOT NULL
);


ALTER TABLE laboratory_assistant
    ADD CONSTRAINT laboratory_assistant_pkey PRIMARY KEY (id);
COMMENT ON TABLE "laboratory_assistant" IS 'в данной таблице будет храниться информация о всех лаборантах ЛПУ: логин, пароль, ФИО, дата рождения, специализация лаборанта';

CREATE TABLE user_info
(
    id          BIGSERIAL    NOT NULL,
    login       VARCHAR(100) NOT NULL,
    password    VARCHAR(100) NOT NULL,
    last_name   VARCHAR(100) NOT NULL,
    first_name  VARCHAR(100) NOT NULL,
    middle_name VARCHAR(100) NOT NULL,
    birth_date  DATE         NOT NULL,
    phone       VARCHAR      NOT NULL,
    email       VARCHAR(100) NOT NULL
);


ALTER TABLE user_info
    ADD CONSTRAINT user_info_pkey PRIMARY KEY (id);

CREATE TABLE med_types_of_research
(
    id          BIGSERIAL    NOT NULL,
    title       VARCHAR(100) NOT NULL,
    description VARCHAR(100) NOT NULL
);


ALTER TABLE med_types_of_research
    ADD CONSTRAINT med_types_of_research_pkey PRIMARY KEY (id);
COMMENT ON TABLE "med_types_of_research" IS 'тут будут храниться виды мед исследований';

CREATE TABLE visitor_research
(
    id                            BIGSERIAL NOT NULL,
    visitor_id                    INTEGER   NOT NULL,
    laborant_assistant_id         INTEGER   NOT NULL,
    doctor_id                     INTEGER   NOT NULL,
    date_of_referral_for_research DATE      NOT NULL,
    date_of_study                 DATE      NOT NULL
);


ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_pkey PRIMARY KEY (id);
COMMENT ON TABLE "visitor_research" IS 'база исследований пациентов';

CREATE TABLE visitor_admission
(
    id                  BIGSERIAL NOT NULL,
    visitor_id          INTEGER   NOT NULL,
    doctor_id           INTEGER   NOT NULL,
    time_of_admission   TIMESTAMP NOT NULL,
    date_of_admission   DATE      NOT NULL,
    result              BOOLEAN   NOT NULL,
    visitor_research_id INTEGER   NOT NULL
);


ALTER TABLE visitor_admission
    ADD CONSTRAINT visitor_admission_pkey PRIMARY KEY (id);
COMMENT ON TABLE visitor_admission IS 'регистрация приема пациентов';

CREATE TABLE reception_schedule
(
    id               BIGSERIAL NOT NULL,
    reception_time   TIMESTAMP NOT NULL,
    reception_date   DATE      NOT NULL,
    visitor_id       INTEGER   NOT NULL,
    doctor_id        INTEGER   NOT NULL,
    reception_status BOOLEAN   NOT NULL,
    result           BOOLEAN   NOT NULL
);


ALTER TABLE reception_schedule
    ADD CONSTRAINT reception_schedule_pkey PRIMARY KEY (id);
COMMENT ON TABLE "reception_schedule" IS 'расписание приемов';

CREATE TABLE laboratory_assistant_med_types
(
    laboratory_assistant_id  INTEGER NOT NULL,
    med_types_of_research_id INTEGER NOT NULL
);


ALTER TABLE laboratory_assistant_med_types
    ADD CONSTRAINT laboratory_assistant_med_types_pkey PRIMARY KEY (laboratory_assistant_id);


ALTER TABLE doctor
    ADD CONSTRAINT doctor_user_info_id_fkey FOREIGN KEY (user_info_id) REFERENCES user_info (id);
ALTER TABLE doctor
    ADD CONSTRAINT doctor_specialization_id_fkey FOREIGN KEY (specialization_id) REFERENCES specialization (id);
ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_visitor_id_fkey FOREIGN KEY (visitor_id) REFERENCES visitor (id);
ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_laborant_assistant_id_fkey FOREIGN KEY (laborant_assistant_id) REFERENCES laboratory_assistant (id);
ALTER TABLE visitor_research
    ADD CONSTRAINT visitor_research_doctor_id_fkey FOREIGN KEY (doctor_id) REFERENCES doctor (id);
ALTER TABLE visitor
    ADD CONSTRAINT visitor_user_info_id_fkey FOREIGN KEY (user_info_id) REFERENCES user_info (id);
ALTER TABLE laboratory_assistant
    ADD CONSTRAINT laboratory_assistant_user_info_id_fkey FOREIGN KEY (user_info_id) REFERENCES user_info (id);
ALTER TABLE laboratory_assistant
    ADD CONSTRAINT laboratory_assistant_specialization_fkey FOREIGN KEY (specialization) REFERENCES specialization (id);
ALTER TABLE visitor_admission
    ADD CONSTRAINT visitor_admission_visitor_id_fkey FOREIGN KEY (visitor_id) REFERENCES visitor (id);
ALTER TABLE visitor_admission
    ADD CONSTRAINT visitor_admission_doctor_id_fkey FOREIGN KEY (doctor_id) REFERENCES doctor (id);
ALTER TABLE visitor_admission
    ADD CONSTRAINT visitor_admission_visitor_research_id_fkey FOREIGN KEY (visitor_research_id) REFERENCES visitor_research (id);
ALTER TABLE reception_schedule
    ADD CONSTRAINT reception_schedule_visitor_id_fkey FOREIGN KEY (visitor_id) REFERENCES visitor (id);
ALTER TABLE reception_schedule
    ADD CONSTRAINT reception_schedule_doctor_id_fkey FOREIGN KEY (doctor_id) REFERENCES doctor (id);
ALTER TABLE admin
    ADD CONSTRAINT admin_user_info_id_fkey FOREIGN KEY (user_info_id) REFERENCES user_info (id);
ALTER TABLE laboratory_assistant_med_types
    ADD CONSTRAINT laboratory_assistant_med_types_laboratory_assistant_id_fkey FOREIGN KEY (laboratory_assistant_id) REFERENCES laboratory_assistant (id);
ALTER TABLE laboratory_assistant_med_types
    ADD CONSTRAINT laboratory_assistant_med_types_med_types_of_research_id_fkey FOREIGN KEY (med_types_of_research_id) REFERENCES med_types_of_research (id);