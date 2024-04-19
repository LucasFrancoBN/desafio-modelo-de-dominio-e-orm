INSERT INTO tb_category (id, description) VALUES (1, 'Curso');
INSERT INTO tb_category (id, description) VALUES (2, 'Oficina');

INSERT INTO tb_activity (id, name, description, price, category_id) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_activity (id, name, description, price, category_id) VALUES (2, 'Oficina de Github', 'Controle versões de seus projetos', 50.00, 2);

INSERT INTO tb_block (id, initialized, finalized, activity_id) VALUES (1, '2017-09-25T08:00:00Z', '2017-09-25T11:00:00Z', 1);
INSERT INTO tb_block (id, initialized, finalized, activity_id) VALUES (2, '2017-09-25T14:00:00Z', '2017-09-25T18:00:00Z', 2);
INSERT INTO tb_block (id, initialized, finalized, activity_id) VALUES (3, '2017-09-26T08:00:00Z', '2017-09-26T11:00:00Z', 2);

INSERT INTO tb_participant (id, email, name) VALUES (1, 'jose@gmail.com', 'José Silva');
INSERT INTO tb_participant (id, email, name) VALUES (2, 'tiago@gmail.com', 'Tiago  Faria');
INSERT INTO tb_participant (id, email, name) VALUES (3, 'maria@gmail.com', 'Maria do Rosário');
INSERT INTO tb_participant (id, email, name) VALUES (4, 'teresa@gmail.com', 'Teresa Silva');

INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 1);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 2);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 3);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 1);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 3);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 4);
