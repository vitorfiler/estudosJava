DROP TABLE Aluno;

CREATE TABLE Aluno (
    Id int NOT NULL AUTO_INCREMENT,
    nome varchar(100),
    ra varchar(15),
    cpf varchar(11),
    idade int
);


INSERT INTO Aluno 
VALUES(0, 'vitor', '222222222', '11111111111', 21);