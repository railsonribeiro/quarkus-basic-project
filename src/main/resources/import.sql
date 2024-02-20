DROP TABLE IF EXISTS DB_DEFAULT.USUARIO;
CREATE TABLE IF NOT EXISTS DB_DEFAULT.USUARIO
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  cpf CHAR(12) UNIQUE,
  nome_completo VARCHAR(20),
  senha VARCHAR(20)
);

INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-01', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-02', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-03', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-04', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-05', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-06', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-07', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-08', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-09', 'Jose', 'senha');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, senha) VALUES ('000000000-10', 'Jose', 'senha');
