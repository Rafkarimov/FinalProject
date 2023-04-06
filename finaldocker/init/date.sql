insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('1', 'Терапевт',
        'Обязанности: сбор анамнеза (жалобы, изучение истории болезни), осмотр (визуальный, прослушивание легких, прощупывание внутренних органов)...',
        'Admin', now(), 'Admin', now()),
       ('2', 'Вирусолог',
        'изучает природу вирусов, их строение, размножение, инфекционные свойства, разрабатывает меры по предупреждению, диагностике и лечению вызываемых ими заболеваний',
        'Admin', now(), 'Admin', now()),
       ('3', 'Гинеколог',
        'специалист по гинекологии. Гинекология — отрасль медицины, которая изучает заболевания, характерные только для организма женщины, прежде всего — заболевания женской репродуктивной системы. Большинство врачей-гинекологов на современном этапе также являются акушерами',
        'Admin', now(), 'Admin', now()),
       ('4', 'Диетолог',
        'специалист, изучающий принципы правильного, рационального питания здорового и больного человека, различные диеты и методы лечения различных заболеваний и патологических состояний с помощью изменения пищевого рациона',
        'Admin', now(), 'Admin', now()),
       ('5', 'Кардиолог',
        'специалист, занимающийся изучением сердечно-сосудистой системы человека: строения и развития сердца и сосудов, их функций, а также заболеваний, включая изучение причин их возникновения, механизмов развития, клинических проявлений, вопросов диагностики, а также разработку эффективных методов их лечения и профилактики',
        'Admin', now(), 'Admin', now()),
       ('6', 'Логопед',
        'специалист, с чьей помощью определяются и реализуются необходимые методики по устранению дефектов речи, актуальных как для детей, так и для взрослых пациентов. Он оказывает помощь в «постановке» должным образом звуков, в избавлении от неправильного произношения, а также от заикания (логоневроза)',
        'Admin', now(), 'Admin', now()),
       ('7', 'Маммолог',
        'специалист, который занимается диагностикой, лечением и профилактикой различных заболеваний молочных желез',
        'Admin', now(), 'Admin', now()),
       ('8', 'Нарколог',
        'это врач, избавляющий пациентов от алкогольной, табачной, наркотической зависимости, выполняющий ее диагностику, лечение и профилактику. Как правило, они проводятся анонимно. Главным условием эффективности работы врача-нарколога является искреннее желание пациента избавиться от зависимости. Кроме того, нарколог занимается проблемами игроманов, токсикоманов и пациентов с патологическим пристрастием к Интернету, а также работает в тесном контакте с психологом и психиатром, предупреждая мысли о суициде и расстройства психики',
        'Admin', now(), 'Admin', now()),
       ('9', 'Невропатолог',
        'врач, получивший высшее медицинское образование и прошедший специализацию по неврологии. Невропатолог занимается диагностикой и лечением болезней, связанных с изменениями в психике. Это заболевания центральной (головной и спинной мозг) и периферической нервной системы (нервные волокна). Например: опухоли головного и спинного мозга, невриты, невралгии, инсульты и другие нарушения кровообращения головного мозга, энцефалиты, приступы эпилепсии. Многие из этих заболеваний сопровождаются изменением поведения и психического функционирования, тогда к лечению таких пациентов привлекаются психиатры и иногда психотерапевты',
        'Admin', now(), 'Admin', now()),
       ('10', 'Онколог',
        'специалист, изучающий опухоли, их причины и условия происхождения и патогенез [развитие заболевания — прим. ред.], методы профилактики и лечения',
        'Admin', now(), 'Admin', now()),
       ('11', 'Администратор',
        'администратор БД',
        'Admin', now(), 'Admin', now());

insert into authority(id, name, created_by, created_when, modified_by, modified_when)
values ('1', 'ROLE_ADMIN',
        'Admin', now(), 'Admin', now()),
       ('2', 'ROLE_MED',
        'Admin', now(), 'Admin', now()),
       ('3', 'ROLE_VISITOR',
        'Admin', now(), 'Admin', now());

insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by,
                   created_when, modified_by, modified_when)
values ('Terapeft', 'Terapeft2023*', 'Иванов', 'Иван', 'Иванович', '01.01.1990', '+7-933-111-22-33',
        'terapeft2023@yandex.ru', '123-321-123 55',
        'Admin', now(), 'Admin', now()),
       ('Virusolog', 'Virusolog2023*', 'Петров', 'Иван', 'Кириякович', '05.02.1984', '+7-922-131-11-77',
        'virusolog2023@yandex.ru', '321-555-666 44',
        'Admin', now(), 'Admin', now()),
       ('Ginekolog', 'Ginekolog2023*', 'Тополева', 'Раиса', 'Степановна', '10.03.1976', '+7-911-555-22-11',
        'ginekolog2023@yandex.ru', '444-036-413 11',
        'Admin', now(), 'Admin', now()),
       ('Dietolog', 'Dietolog2023*', 'Соболева', 'Мария', 'Федоровна', '01.07.1971', '+7-911-111-32-44',
        'dietolog2023@yandex.ru', '123-999-111 22',
        'Admin', now(), 'Admin', now()),
       ('Kardiolog', 'Kardiolog2023*', 'Степанов', 'Николай', 'Петрович', '07.10.1990', '+7-911-222-33-11',
        'kardiolog2023@yandex.ru', '105-111-321 11',
        'Admin', now(), 'Admin', now()),
       ('Logoped', 'Logoped2023*', 'Соболев', 'Михаил', 'Анатольевич', '02.01.1989', '+7-911-751-11-33',
        'logoped2023@yandex.ru', '111-333-444 22',
        'Admin', now(), 'Admin', now()),
       ('Mammolog', 'Mammolog2023*', 'Киприянова', 'Любовь', 'Анатольевна', '05.05.1975', '+7-911-222-75-13',
        'mammolog2023@yandex.ru', '521-412-321 33',
        'Admin', now(), 'Admin', now()),
       ('Narkolog', 'Narkolog2023*', 'Ползунова', 'Нина', 'Ивановна', '07.02.1980', '+7-911-456-74-33',
        'narkolog2023@yandex.ru', '645-212-123 22',
        'Admin', now(), 'Admin', now()),
       ('Nevropatolog', 'Nevropatolog2023*', 'Копылова', 'Светлана', 'Ивановна', '09.12.1961', '+7-911-212-11-33',
        'nevropatolog2023@yandex.ru', '123-444-213 22',
        'Admin', now(), 'Admin', now()),
       ('Onkolog', 'Onkolog2023*', 'Потапов', 'Анатолий', 'Иванович', '12.11.1972', '+7-911-421-22-44',
        'onkolog2023@yandex.ru', '135-444-132 11',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by,
                   created_when, modified_by, modified_when)
values ('Rafail', 'Rafail2023*', 'Каримов', 'Рафаиль', 'Римович', '09.01.1985', '+7-900-000-00-00',
        'Raf_2003@mail.ru', '111-444-222 11',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by,
                   created_when, modified_by, modified_when)
values ('User2003', crypt('Delay2003*', gen_salt('bf', 10)), 'Иванов', 'Петр', 'Перович', '05.12.1965', '+7-911-513-11-22',
        'delay2003@mail.ru', '213-222-111 22',
        'Admin', now(), 'Admin', now()),
       ('User2004', crypt('Delay2003*', gen_salt('bf', 10)), 'Свиридова', 'Антонина', 'Леопольдовна', '05.03.1955', '+7-911-777-22-33',
        'delay2004@mail.ru', '123-123-123 22',
        'Admin', now(), 'Admin', now()),
       ('User2005', crypt('Delay2003*', gen_salt('bf', 10)), 'Загинайло', 'Марина', 'Львовна', '06.12.1970', '+7-911-135-12-11',
        'delay2005@mail.ru', '123-123-215 77',
        'Admin', now(), 'Admin', now()),
       ('User2006', crypt('Delay2003*', gen_salt('bf', 10)), 'Петров', 'Степан', 'Иванович', '05.03.1955', '+7-911-777-22-33',
        'delay2006@mail.ru', '123-182-777 65',
        'Admin', now(), 'Admin', now()),
       ('User2007', crypt('Delay2003*', gen_salt('bf', 10)), 'Милорадов', 'Илларион', 'Анатольевич', '12.10.1990', '+7-911-784-11-22',
        'delay2007@mail.ru', '122-175-112 50',
        'Admin', now(), 'Admin', now()),
       ('User2008', crypt('Delay2003*', gen_salt('bf', 10)), 'Миронов', 'Иван', 'Петрович', '06.04.1975', '+7-911-682-12-55',
        'delay2008@mail.ru', '131-123-155 22',
        'Admin', now(), 'Admin', now()),
       ('User2009', crypt('Delay2003*', gen_salt('bf', 10)), 'Кудрешова', 'Марина', 'Ивановна', '12.10.1970', '+7-911-311-11-33',
        'delay2009@mail.ru', '178-112-111 22',
        'Admin', now(), 'Admin', now()),
       ('User2010', crypt('Delay2003*', gen_salt('bf', 10)), 'Аппалонова', 'Светлана', 'Николаевна', '05.05.1970', '+7-911-124-22-33',
        'delay2010@mail.ru', '256-213-123 22',
        'Admin', now(), 'Admin', now()),
       ('User2011', crypt('Delay2003*', gen_salt('bf', 10)), 'Попова', 'Светлана', 'Рудольфовна', '12.05.1980', '+7-911-231-23-33',
        'delay2011@mail.ru', '321-555-756 22',
        'Admin', now(), 'Admin', now()),
       ('User2004', crypt('Delay2003*', gen_salt('bf', 10)), 'Кислицкая', 'Венера', 'Степановна', '05.12.1981', '+7-911-777-22-33',
        'delay2012@mail.ru', '123-123-759 22',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by,
                   created_when, modified_by, modified_when)
values ('Laborant2003', crypt('Delay2003*', gen_salt('bf', 10)), 'Потапова', 'Светлана', 'Ивановна', '06.10.1978', '+7-911-231-13-12',
        'laborant2003@mail.ru', '124-135-223 11',
        'Admin', now(), 'Admin', now()),
       ('Laborant2004', crypt('Delay2003*', gen_salt('bf', 10)), 'Самсонова', 'Ирина', 'Васильевна', '07.11.1955', '+7-911-750-22-78',
        'laborant2004@mail.ru', '123-175-131 22',
        'Admin', now(), 'Admin', now()),
       ('Laborant2005', crypt('Delay2003*', gen_salt('bf', 10)), 'Петрова', 'Мария', 'Ивановна', '08.12.1978', '+7-911-751-33-44',
        'laborant2005@mail.ru', '123-175-131 22',
        'Admin', now(), 'Admin', now()),
       ('Laborant2006', crypt('Delay2003*', gen_salt('bf', 10)), 'Пунцева', 'Валерия', 'Витальевна', '09.01.1990', '+7-911-005-11-22',
        'laborant2006@mail.ru', '124-222-059 12',
        'Admin', now(), 'Admin', now()),
       ('Laborant2007', crypt('Delay2003*', gen_salt('bf', 10)), 'Румянцев', 'Петр', 'Мелентьевич', '09.02.1995', '+7-911-015-22-08',
        'laborant2007@mail.ru', '125-213-078 52',
        'Admin', now(), 'Admin', now());

insert into chief_doctor(person_id, med_specialization_id, created_by, created_when, modified_by, modified_when)
values (1, 5, 'Admin', now(), 'Admin', now()),
       (11, 11, 'Admin', now(), 'Admin', now());
insert into doctor(person_id, med_specialization_id, created_by, created_when, modified_by, modified_when)
values (2, 1, 'Admin', now(), 'Admin', now()),
       (3, 2, 'Admin', now(), 'Admin', now()),
       (4, 3, 'Admin', now(), 'Admin', now()),
       (5, 4, 'Admin', now(), 'Admin', now()),
       (6, 6, 'Admin', now(), 'Admin', now()),
       (7, 7, 'Admin', now(), 'Admin', now()),
       (8, 8, 'Admin', now(), 'Admin', now()),
       (9, 9, 'Admin', now(), 'Admin', now()),
       (10, 10, 'Admin', now(), 'Admin', now());
insert into visitor(person_id, created_by, created_when, modified_by, modified_when)
values (12, 'Admin', now(), 'Admin', now()),
       (13, 'Admin', now(), 'Admin', now()),
       (14, 'Admin', now(), 'Admin', now()),
       (15, 'Admin', now(), 'Admin', now()),
       (16, 'Admin', now(), 'Admin', now()),
       (17, 'Admin', now(), 'Admin', now()),
       (18, 'Admin', now(), 'Admin', now()),
       (19, 'Admin', now(), 'Admin', now()),
       (20, 'Admin', now(), 'Admin', now()),
       (21, 'Admin', now(), 'Admin', now());
insert into laboratory_assistant(person_id, created_by, created_when, modified_by, modified_when)
values (22, 'Admin', now(), 'Admin', now()),
       (23, 'Admin', now(), 'Admin', now()),
       (24, 'Admin', now(), 'Admin', now()),
       (25, 'Admin', now(), 'Admin', now()),
       (26, 'Admin', now(), 'Admin', now());


insert into person_authority(person_id, authority_id)
values (1, 2),
       (2, 2),
       (3, 2),
       (4, 2),
       (5, 2),
       (6, 2),
       (7, 2),
       (8, 2),
       (9, 2),
       (10, 2);
insert into person_authority(person_id, authority_id)
values (11, 1);
insert into person_authority(person_id, authority_id)
values (12, 3),
       (13, 3),
       (14, 3),
       (15, 3),
       (16, 3),
       (17, 3),
       (18, 3),
       (19, 3),
       (20, 3),
       (21, 3);
insert into person_authority(person_id, authority_id)
values (22, 2),
       (23, 2),
       (24, 2),
       (25, 2),
       (26, 2);

insert into med_types_of_research(id, title, description, created_by, created_when, modified_by, modified_when)
values (1, 'Общеклинические',
        'этот вид лабораторных тестов выполняется путем изучения физико-химических свойств и микроскопического исследования биологического материала: мочи, спинномозговой, серозной жидкостей, секрета предстательной железы, кала, мазков из влагалища, уретры, цервикального канала',
        'Admin', now(), 'Admin', now()),
       (2, 'Гематологические',
        'это совокупность лабораторных тестов, в результате проведения которых получают сведения о количественном и качественном составе крови. К самым распространенным гематологическим тестам относится клинический анализ крови, который позволяет оценить общее состояние пациента, выявить воспалительные процессы, анемию, лейкемии',
        'Admin', now(), 'Admin', now()),
       (3, 'Биохимические',
        'Биохимические лабораторные тесты отражают функциональное состояние различных органов и систем, дают представление о состоянии обмена веществ. Биохимические маркеры (исследуемые параметры) подразделяются на маркеры углеводного, липидного и белкового обмена, показатели функций печени и желчевыводящих путей, почек, поджелудочной железы, индикаторы сердечно-сосудистых заболеваний',
        'Admin', now(), 'Admin', now()),
       (4, 'Цитологические',
        'Цитологические исследования предназначены для диагностики злокачественных образований. Во время тестирования при помощи микроскопа оценивается морфологическая структура клеточных элементов биологического материала',
        'Admin', now(), 'Admin', now()),
       (5, 'Гормональные',
        'От работы эндокринной системы зависит состояние всех внутренних органов. Гормоны регулируют способность тканей к росту и созреванию, обмен веществ, процессы репродукции, состояние иммунной системы. Исследования на гормоны позволяют узнать их уровень и выявить эндокринные нарушения. Биологические среды, берущиеся на анализ — кровь, моча.',
        'Admin', now(), 'Admin', now());

insert into laboratory_assistant_med_types(laboratory_assistant_id, med_types_of_research_id)
values (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5);

insert into visitor_research(visitor_id, doctor_id, laboratory_assistant_id, date_of_referral_for_research,
                             date_of_research, med_types_of_research_id, created_by, created_when, modified_by,
                             modified_when)
values (1, 1, 1, now() - interval '72h', now(), 1  ,'Admin', now(), 'Admin', now()),
       (2, 2, 2, now() - interval '72h', now(), 2  ,'Admin', now(), 'Admin', now()),
       (3, 3, 3, now() - interval '72h', now(), 3  ,'Admin', now(), 'Admin', now()),
       (4, 4, 4, now() - interval '72h', now(), 4  ,'Admin', now(), 'Admin', now()),
       (5, 5, 5, now() - interval '72h', now(), 5  ,'Admin', now(), 'Admin', now()),
       (6, 6, 1, now() - interval '72h', now(), 1  ,'Admin', now(), 'Admin', now()),
       (7, 7, 2, now() - interval '72h', now(), 2  ,'Admin', now(), 'Admin', now()),
       (8, 8, 3, now() - interval '72h', now(), 3  ,'Admin', now(), 'Admin', now()),
       (9, 9, 4, now() - interval '72h', now(), 4  ,'Admin', now(), 'Admin', now()),
       (10, 1, 5, now() - interval '72h', now(), 5  ,'Admin', now(), 'Admin', now());

--date of referral for research - дата направления на исследование
--date of research
--visitor research - исследование пациентов

insert into reception_status(id, status, created_by, created_when, modified_by, modified_when)
values ('1', 'Открыто',
        'Admin', now(), 'Admin', now()),
       ('2', 'Ждет приема',
        'Admin', now(), 'Admin', now()),
       ('3', 'Закрыто',
        'Admin', now(), 'Admin', now()),
       ('4', 'Отменен',
        'Admin', now(), 'Admin', now()),
       ('5', 'Прием окончен',
        'Admin', now(), 'Admin', now());


--reception date time - дата и время приема

insert into reception(visitor_id, doctor_id, reception_date_time, reception_status_id, created_by, created_when, modified_by, modified_when)
values ('1', 1, now() - interval '1h', 1,
        'Admin', now(), 'Admin', now()),
       ('2', 2, now() - interval '20d', 2,
        'Admin', now(), 'Admin', now()),
       ('3', '3', now() - interval '40d', 3,
        'Admin', now(), 'Admin', now()),
       ('4', '4', now() - interval '1h', 1,
        'Admin', now(), 'Admin', now()),
       ('5', '5', now() - interval '20d', 2,
        'Admin', now(), 'Admin', now()),
       ('6', '6', now() - interval '15d', 2,
        'Admin', now(), 'Admin', now()),
       ('7', '7', now() + interval '3d', 1,
        'Admin', now(), 'Admin', now()),
       ('8', '8', now() + interval '2d', 1,
        'Admin', now(), 'Admin', now()),
       ('10', '5', now() + interval '5d', 1,
        'Admin', now(), 'Admin', now()),
       ('9', '9', now() + interval '1d', 1,
        'Admin', now(), 'Admin', now());




