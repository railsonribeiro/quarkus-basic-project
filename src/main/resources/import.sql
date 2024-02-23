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

INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-01', 'Bobby Fischer', 'admin_first', '$2a$10$EIS6vWDtMROa7.vJbYzoqeMzDm1WfvYsVwGAJEc8JDekyzfEEPol.', 'admin');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-02', 'Joao Nascimento', 'joaonascimento2024', '$2a$10$8yo9nVRQpoubQAIIb2oatu354BqH0VpED3BVTBspviXo9d4N5SYSC', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-03', 'Ana Barros', 'ana2024', '$2a$10$D/1FFC2Wf/8UhN/SdMLG0OhE.BxDDegaCHjZCTcD9rmTD4d6C9ety', 'usuario_comum');
INSERT INTO DB_DEFAULT.USUARIO(cpf, nome_completo, user_name, senha, role_acess) VALUES ('000000000-04', 'Augusto', 'augusto2019', '$2a$10$durTFMMSFS39kpMNPr1bnuS/9k4ToGEOm0Q3dz1hQG4LyV09P4JEK', 'usuario_comum');
