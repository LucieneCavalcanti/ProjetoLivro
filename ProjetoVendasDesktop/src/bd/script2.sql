CREATE TABLE produto (
  codigo INTEGER identity,
  descricao VARCHAR(45) NOT NULL,
  quantidade INT NOT NULL,
  preco_custo DECIMAL(5,2) NOT NULL,
  preco_venda DECIMAL(5,2) NOT NULL,
  codigo_categoria INT NOT NULL,
  data datetime,
  PRIMARY KEY(codigo)
)
select * from produto

CREATE TABLE categoria(
  codigo INTEGER identity,
  descricao VARCHAR(45) NOT NULL,
  PRIMARY KEY(codigo)
)
INSERT INTO categoria (descricao) VALUES
 ('Limpeza'),
 ('Açougue'),
 ('Hortifruti'),
 ('Padaria e Confeitaria'),
 ('Enlatados'),
 ('Bebidas');

 SELECT produto.codigo,
 produto.descricao,
 produto.quantidade,
 produto.preco_custo,
 produto.preco_venda,
 produto.data,
 produto.codigo_categoria,
 categoria.descricao FROM produto, categoria
 where produto.codigo_categoria = categoria.codigo and produto.codigo = 2

create procedure cadastrarCategoria(@codigo int,@descricao varchar(45))
as begin
	insert into categoria values (@codigo,@descricao)
end

create procedure cadastrarCategoria5(@descricao varchar(45))
as begin
	insert into categoria values (@descricao)
	return @@IDENTITY
end