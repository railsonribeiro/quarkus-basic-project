-- DROP TABLE IF EXISTS DB_DEFAULT.USUARIO;
CREATE TABLE IF NOT EXISTS DB_DEFAULT.USUARIO
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(15) UNIQUE NOT NULL,
  cpf CHAR(12) UNIQUE NOT NULL,
  nome_completo VARCHAR(20),
  senha VARCHAR(80),
  role_acess VARCHAR(20)
);

-- DROP TABLE IF EXISTS DB_DEFAULT.ORDEM;
CREATE TABLE IF NOT EXISTS DB_DEFAULT.ORDEM
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(15) NOT NULL,
  data_criacao DATETIME,
  status_transacao_enum VARCHAR(15),
  transacao_enum VARCHAR(15),
  preco DECIMAL
);

INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-01', 'Jose', 'jose2016', 'senha', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-02', 'Jose', 'jose2017', 'senha', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-03', 'Jose', 'jose2018', 'senha', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-04', 'Jose', 'jose2019', 'senha', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-05', 'Jose', 'jose2020', 'senha', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-07', 'Jose', 'jose2021', 'senha', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-08', 'Jose', 'jose2022', 'senha', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-09', 'Jose', 'jose2023', 'senha', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-10', 'Jose', 'jose2024', 'senha', 'usuario_comum');
