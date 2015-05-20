create database bd_java;

CREATE TABLE `pessoa_fisica` (
`codigo` INT( 5 ) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY ,
`nome` VARCHAR( 50 ) NOT NULL ,
`telefone` VARCHAR( 30 ) NOT NULL ,
`email` VARCHAR( 50 ) NOT NULL ,
`rg` VARCHAR( 15 ) NOT NULL ,
`cpf` VARCHAR( 15 ) NOT NULL ,
`estado_civil` VARCHAR( 15 ) NOT NULL ,
`sexo` VARCHAR( 15 ) NOT NULL ,
INDEX ( `nome` )
) ENGINE = innodb;

CREATE TABLE `categoria` (
  `codigo` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY(`codigo`)
)
ENGINE = InnoDB;

INSERT INTO `categoria` (`codigo`,`descricao`) VALUES
 (1,'Limpeza'),
 (2,'Açougue'),
 (3,'Hortifruti'),
 (4,'Padaria e Confeitaria'),
 (5,'Enlatados'),
 (6,'Bebidas');


CREATE TABLE `produto` (
  `codigo` INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `quantidade` INTEGER NOT NULL,
  `preco_custo` DOUBLE(5,2) NOT NULL,
  `preco_venda` DOUBLE(5,2) NOT NULL,
  `codigo_categoria` INTEGER UNSIGNED NOT NULL,
  data datetime,
  PRIMARY KEY(`codigo`)
)
ENGINE = InnoDB;


INSERT INTO `produto` (`codigo`,`descricao`,`quantidade`,`preco_custo`, `preco_venda`,`codigo_categoria`) VALUES
 (1,'Omo MultiAção 1 Kg',10,5.89,7.5,1),
 (2,'Detergente IPÊ',10,0.98,1.2,1),
 (3,'Bom Bril',10,1.24,2,1),
 (4,'Pão Francês',10,7.30,8.3,4),
 (5,'Sonho de Creme',10,1.50,2.5,4),
 (6,'Coca cola pet 2 litros',10,2.24,4.5,6);



