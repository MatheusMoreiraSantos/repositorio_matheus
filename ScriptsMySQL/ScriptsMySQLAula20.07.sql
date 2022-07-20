USE modelo;

DELETE FROM aluno
WHERE id > 0; 

INSERT INTO aluno (id, nome, celular, email, github_usuario)  
VALUES (2, 'aluno3', '97855-0120', 'email', 'github'),
(3, 'aluno4', '98857-8745', 'email2', 'github2'),
(4, 'aluno6', '97855-0234', 'email3', 'github3');

INSERT INTO pergunta (id, pergunta, prova_id) VALUES (1, 'O que é um banco de dados? (0,5)', 784);








