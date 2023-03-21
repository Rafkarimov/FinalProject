insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('1', 'Терапевт',
        'Обязанности: сбор анамнеза (жалобы, изучение истории болезни), осмотр (визуальный, прослушивание легких, прощупывание внутренних органов)...',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('2', 'Вирусолог',
        'изучает природу вирусов, их строение, размножение, инфекционные свойства, разрабатывает меры по предупреждению, диагностике и лечению вызываемых ими заболеваний',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('3', 'Гинеколог',
        'специалист по гинекологии. Гинекология — отрасль медицины, которая изучает заболевания, характерные только для организма женщины, прежде всего — заболевания женской репродуктивной системы. Большинство врачей-гинекологов на современном этапе также являются акушерами',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('4', 'Диетолог',
        'специалист, изучающий принципы правильного, рационального питания здорового и больного человека, различные диеты и методы лечения различных заболеваний и патологических состояний с помощью изменения пищевого рациона',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('5', 'Кардиолог',
        'специалист, занимающийся изучением сердечно-сосудистой системы человека: строения и развития сердца и сосудов, их функций, а также заболеваний, включая изучение причин их возникновения, механизмов развития, клинических проявлений, вопросов диагностики, а также разработку эффективных методов их лечения и профилактики',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('6', 'Логопед',
        'специалист, с чьей помощью определяются и реализуются необходимые методики по устранению дефектов речи, актуальных как для детей, так и для взрослых пациентов. Он оказывает помощь в «постановке» должным образом звуков, в избавлении от неправильного произношения, а также от заикания (логоневроза)',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('7', 'Маммолог',
        'специалист, который занимается диагностикой, лечением и профилактикой различных заболеваний молочных желез',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('8', 'Нарколог',
        'это врач, избавляющий пациентов от алкогольной, табачной, наркотической зависимости, выполняющий ее диагностику, лечение и профилактику. Как правило, они проводятся анонимно. Главным условием эффективности работы врача-нарколога является искреннее желание пациента избавиться от зависимости. Кроме того, нарколог занимается проблемами игроманов, токсикоманов и пациентов с патологическим пристрастием к Интернету, а также работает в тесном контакте с психологом и психиатром, предупреждая мысли о суициде и расстройства психики',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('9', 'Невропатолог',
        'врач, получивший высшее медицинское образование и прошедший специализацию по неврологии. Невропатолог занимается диагностикой и лечением болезней, связанных с изменениями в психике. Это заболевания центральной (головной и спинной мозг) и периферической нервной системы (нервные волокна). Например: опухоли головного и спинного мозга, невриты, невралгии, инсульты и другие нарушения кровообращения головного мозга, энцефалиты, приступы эпилепсии. Многие из этих заболеваний сопровождаются изменением поведения и психического функционирования, тогда к лечению таких пациентов привлекаются психиатры и иногда психотерапевты',
        'Admin', now(), 'Admin', now());
insert into public.med_specialization(id, title, description, created_by, created_when, modified_by, modified_when)
values ('10', 'Онколог',
        'специалист, изучающий опухоли, их причины и условия происхождения и патогенез [развитие заболевания — прим. ред.], методы профилактики и лечения',
        'Admin', now(), 'Admin', now());

insert into authority(id, name, created_by, created_when, modified_by, modified_when)
values ('1', 'Администратор',
        'Admin', now(), 'Admin', now());
insert into authority(id, name, created_by, created_when, modified_by, modified_when)
values ('2', 'Медицинский работник',
        'Admin', now(), 'Admin', now());
insert into authority(id, name, created_by, created_when, modified_by, modified_when)
values ('3', 'Пациент',
        'Admin', now(), 'Admin', now());

insert into reception_status(id, status, created_by, created_when, modified_by, modified_when)
values ('1', 'Открыто',
        'Admin', now(), 'Admin', now());
insert into reception_status(id, status, created_by, created_when, modified_by, modified_when)
values ('2', 'Закрыто',
        'Admin', now(), 'Admin', now());
insert into reception_status(id, status, created_by, created_when, modified_by, modified_when)
values ('3', 'В процессе',
        'Admin', now(), 'Admin', now());

insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Terapeft', 'Terapeft2023*', 'Иванов','Иван','Иванович','01.01.1990','+7-933-111-22-33','terapeft2023@yandex.ru','123-321-123 55',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Virusolog', 'Virusolog2023*', 'Петров','Иван','Кириякович','05.02.1984','+7-922-131-11-77','virusolog2023@yandex.ru','321-555-666 44',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Ginekolog', 'Ginekolog2023*', 'Тополева','Раиса','Степановна','10.03.1976','+7-911-555-22-11','ginekolog2023@yandex.ru','444-036-413 11',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Dietolog', 'Dietolog2023*', 'Соболева','Мария','Федоровна','01.07.1971','+7-911-111-32-44','dietolog2023@yandex.ru','123-999-111 22',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Kardiolog', 'Kardiolog2023*', 'Степанов','Николай','Петрович','07.10.1990','+7-911-222-33-11','kardiolog2023@yandex.ru','105-111-321 11',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Logoped', 'Logoped2023*', 'Соболев','Михаил','Анатольевич','02.01.1989','+7-911-751-11-33','logoped2023@yandex.ru','111-333-444 22',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Mammolog', 'Mammolog2023*', 'Киприянова','Любовь','Анатольевна','05.05.1975','+7-911-222-75-13','mammolog2023@yandex.ru','521-412-321 33',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Narkolog', 'Narkolog2023*', 'Ползунова','Нина','Ивановна','07.02.1980','+7-911-456-74-33','narkolog2023@yandex.ru','645-212-123 22',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Nevropatolog', 'Nevropatolog2023*', 'Копылова','Светлана','Ивановна','09.12.1961','+7-911-212-11-33','nevropatolog2023@yandex.ru','123-444-213 22',
        'Admin', now(), 'Admin', now());
insert into person(login, password, last_name, first_name, middle_name, birth_date, phone, email, snils, created_by, created_when, modified_by, modified_when)
values ('Onkolog', 'Onkolog2023*', 'Потапов','Анатолий','Иванович','12.11.1972','+7-911-421-22-44','onkolog2023@yandex.ru','135-444-132 11',
        'Admin', now(), 'Admin', now());

