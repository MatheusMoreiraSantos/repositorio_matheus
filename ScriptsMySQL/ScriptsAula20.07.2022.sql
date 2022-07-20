USE modelo;

DELETE FROM
WHERE id > 0;

SELECT * FROM aluno; /*Ou SELECT id, nome, celular, email, github FROM aluno;*/
SELECT nome, email FROM aluno;
SELECT nome, celular FROM aluno
WHERE nome LIKE ('%eus%');

INSERT INTO aluno (id, nome, celular, email, github_usuario) VALUES (1, 'Matheus M. Santos', '(49) 9 8422-8799', 'Matheusmoreiradossantos45@gmail.com', 'MatheusMoreiraSantos');
INSERT INTO aluno (id, nome, celular, email, github_usuario) VALUES (2, 'Cleber', '(48) 9 8422-8799', 'clesbpanik@gmail.com', 'ClebsPanik');


SELECT * FROM prova;
SELECT id, disciplina FROM prova;

INSERT INTO prova (id, disciplina) VALUES (784, 'Bancos de Dados Relacionais e SQL');


SELECT * FROM pergunta;
SELECT id, pergunta FROM pergunta 
WHERE pergunta LIKE 'O que%';


INSERT INTO pergunta (id, pergunta, prova_id) VALUES (2, 'O que é um banco de dados? (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (3, 'Explique o que é um SGBD e cite exemplos. (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (4, 'O que são DML, DCL, DDL e DQL? (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (5, 'O que é uma Entidade? (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (6, 'Descreva o que é uma chave primária. (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (7, 'Descreva o que é chave estrangeira. (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (8, 'Cite a diferença entre chave primaria e chave estrangeira. (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (9, 'Um campo do tipo char armazena quais valores? E do tipo int, varchar, date, datetime? (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (10, '10) Explique a(s) diferenças entre os tipos Time, Year, DateTime e Date? (0,5)', 784);
INSERT INTO pergunta (id, pergunta, prova_id) VALUES (11, 'Explique p/ que serve a instrução DELETE. (0,5)', 784);
 