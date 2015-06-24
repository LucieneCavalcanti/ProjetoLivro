
/*
TO-DO 
Chaves primarias das tabelas
Tabela de tipo de saìda
Tabela de Tipo de entrada


*/
create dataBase bdVendas;

use bdVendas;

create table TabSituacoes(
idSituacao int not null primary key identity ,
descricao varchar(50) not null
);


create table TabModulos(
    idModulo int not null primary key identity ,
    descricao varchar(50) not null
);

create table TabPessoas (
    idPessoa int not null primary key identity,
    nome varchar(200) not null,
    email varchar(100) not null,
    endereco varchar(200) not null,
    numero varchar(10),
    bairro varchar(30),
    complemento varchar(50),
    cep varchar(8),
    cidade varchar(200),
    uf char(2),
    idSituacao int not null references TabSituacoes,
    dataCadastro date
);
create table TabTelefones(
    sequencia int not null primary key identity ,
    idPessoa int not null references TabPessoas,
    tipo varchar(20),
    ddd varchar(3),
    numero varchar(10)
);

create table TabPessoaJuridica(
	idPessoaJuridica int not null primary key references TabPessoas,
	cnpj varchar(15) not null,
	ie varchar(15)
);

create table TabPessoaFisica(
	idPessoaFisica int not null primary key references TabPessoas,
	cpf varchar(11) unique,
	rg varchar(15),
	dataNascimento Date
);

create table TabClientes (
	idCliente int not null primary key references TabPessoaFisica,
	empresa varchar(100)
	
);

create table TabFornecedores(
	idFornecedor int not null primary key references TabPessoaJuridica,
	idMatricula int not null,
	nomeVendedor varchar(100)
);

create table TabFuncionarios(
	idFuncionario int not null primary key references TabPessoaFisica,
	ctps varchar(25),
	cargo varchar(50),
	departamento varchar(100)	
);

Create table TabUsuarios(	
	idUsuario int not null primary key references TabPessoaFisica,
	senha varchar(32)
);

create table TabPermissoesUsuario(
	sequencia int not null primary key identity,
	idUsuario int not null references TabUsuarios,
	idModulo int not null references TabModulos,
	niveldeAcesso int not null,
        CONSTRAINT pk_PermissoesUsuario primary key(idUsuario,idModulo,niveldeAcesso)
);
	

create table TabCategorias(
	idCategoria int not null primary key identity ,
	descricao varchar(50)
);

Create table TabProdutos(
	idProduto int not null primary key identity ,
	idCategoria int not null references TabCategorias,
	descricao varchar(200) not null,
	preco decimal(10,2) not null
);

Create table TabEstoque(
	sequencia int not null primary key identity ,
	idProduto int not null references TabProdutos,
	quantidadeMinima decimal(10,2) not null,
	quantidadeAtual decimal(10,2) not null
);


Create table TabTiposMovimento(
	idTipo int not null primary key identity,
	descricao varchar(50) not null,
	tipoLancamento int not null
);


create table TabSaidas(
	idSaida int not null primary key identity ,
	idTipo int not null references TabTiposMovimento,
	idCliente int not null references TabClientes,
	idFuncionario int not null references TabFuncionarios,
	comissao decimal(10,2),
	dataSaida date not null,
        desconto decimal(10,2),
	idSituacao int not null references TabSituacoes
);

create table TabSaidasItens(
	idSaida int not null primary key identity references TabSaidas,
	idProduto int not null references TabProdutos,
	quantidade decimal(10,2) not null,
	valorUnitario decimal(10,2) not null,
	valorDesconto decimal(10,2)
);


create table TabEntradas(
	idEntrada int not null primary key identity,
	idTipo int not null references TabTiposMovimento,
	idFornecedor int not null references TabFornecedores,
	dataCompra date not null,
	dataEntrega date not null,
	idSituacao int not null references TabSituacoes
);

create table TabEntradasItens(
	idEntrada int not null primary key identity references TabEntradas,
	idProduto int not null references TabProdutos,
	quantidade decimal(10,2) not null,
	valorUnitario decimal(10,2)
);

Insert into TabModulos(Descricao)
values('PESSOAS'),('CLIENTES'),('FORNECEDORES'),('FUNCION�RIOS'),('CATEGORIAS'),('PRODUTOS'),('ENTRADAS'),('SAIDAS'),
('TELEFONES'),('TIPOSMOVIMENTOS'),('SITUA��ES'),('USU�RIOS');

insert into TabSituacoes(Descricao)
values('ATIVO'),('INATIVO'),('CANCELADO'),('FECHADO'),('EXPORTADO');