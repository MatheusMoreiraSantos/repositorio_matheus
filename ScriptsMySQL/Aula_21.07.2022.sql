USE db_agregacao;

SELECT * FROM classe;

INSERT INTO classe (Cod_Clas, Nome_Clas) VALUES (1234, 'Veículos');
INSERT INTO classe (Cod_Clas, Nome_Clas) VALUES (5467, 'Eletrônicos');
INSERT INTO classe (Cod_Clas, Nome_Clas) VALUES (7658, 'Eletrodomésticos');
INSERT INTO classe (Cod_Clas, Nome_Clas) VALUES (4739, 'Livros');
INSERT INTO classe (Cod_Clas, Nome_Clas) VALUES (9357, 'Escritório');
INSERT INTO classe (Cod_Clas, Nome_Clas, Cod_Prod) VALUES (2641, '', 4972);
INSERT INTO classe (Cod_Clas, Nome_Clas, Cod_Prod) VALUES (3749, '', 2957);
INSERT INTO classe (Cod_Clas, Nome_Clas, Cod_Prod) VALUES (5341, '', 6342);
INSERT INTO classe (Cod_Clas, Nome_Clas, Cod_Prod) VALUES (1965, '', 2584);
INSERT INTO classe (Cod_Clas, Nome_Clas, Cod_Prod) VALUES (5638, '', 4528);


SELECT * FROM produto;

INSERT INTO produto (Cod_Prod, Tipo_Prod, Nome_Prod, Qtd_Prod, Val_Prod, classe_Cod_Clas) VALUES (3465, 'carro', 'Gol', 1, 30000, 1234); 
INSERT INTO produto (Cod_Prod, Tipo_Prod, Nome_Prod, Qtd_Prod, Val_Prod, classe_Cod_Clas) VALUES (7653, 'carro', 'HB20', 1, 32000, 1234); 
INSERT INTO produto (Cod_Prod, Tipo_Prod, Nome_Prod, Qtd_Prod, Val_Prod, classe_Cod_Clas) VALUES (4753, 'Celular', 'Galaxy', 1, 1500, 5467); 
INSERT INTO produto (Cod_Prod, Tipo_Prod, Nome_Prod, Qtd_Prod, Val_Prod, classe_Cod_Clas) VALUES (3626, 'Video Game', 'Xbox', 1, 3000, 5467); 
INSERT INTO produto (Cod_Prod, Tipo_Prod, Nome_Prod, Qtd_Prod, Val_Prod, classe_Cod_Clas) VALUES (7648, 'Fantasia', 'Senhor dos Anéis', 1, 30, 4739); 
INSERT INTO produto (Cod_Prod, Tipo_Prod, Nome_Prod, Qtd_Prod, Val_Prod, classe_Cod_Clas) VALUES (1682, 'Escritório', 'Grampeador', 1, 5, 9357); 

SELECT AVG(Val_Prod) FROM produto;

SELECT AVG(ALL Qtd_Prod) FROM produto WHERE classe_Cod_Clas = 1234;

SELECT AVG(DISTINCT Qtd_Prod) FROM produto WHERE classe_Cod_Clas = 1234;

SELECT COUNT(*) FROM produto;

SELECT COUNT(*) FROM produto WHERE classe_Cod_Clas = 1234;

SELECT MAX(Val_Prod) FROM produto;

SELECT MIN(Val_Prod) FROM produto;

SELECT SUM(Qtd_Prod) FROM produto;

SELECT SUM(Distinct Qtd_Prod) FROM produto;



 







