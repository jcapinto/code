-- Table: TipoCliente
CREATE TABLE TipoCliente (
CodTipoCliente INT PRIMARY KEY,
Descricao VARCHAR(100) NOT NULL);

-- Table: Cliente
CREATE TABLE Cliente (
IdCliente INT PRIMARY KEY,
Nome VARCHAR(30) NOT NULL,
Morada VARCHAR(100),
Telemovel CHAR(9),
Email VARCHAR(40) NOT NULL,
CodTipoCliente INT FOREIGN KEY REFERENCES TipoCliente(CodTipoCliente));

-- Table: TipoServico
CREATE TABLE TipoServico (
CodTipoServico INT PRIMARY KEY,
Descricao VARCHAR(100),
Taxa DECIMAL);

-- Table: Servico
CREATE TABLE Servico (
CodServico INT PRIMARY KEY,
DataRequisicao DATE NOT NULL,
DataExecucao DATE NOT NULL,
HoraInicio TIME NOT NULL,
HoraFim TIME NOT NULL,
PrecoHora MONEY NOT NULL,
IdCliente INT FOREIGN KEY REFERENCES Cliente(IdCliente));

-- Table: Viatura
CREATE TABLE Viatura (
CodViatura INT PRIMARY KEY,
Matricula VARCHAR(30) NOT NULL,
Marca VARCHAR(30) NOT NULL,
Modelo VARCHAR(20) NOT NULL,
Cor VARCHAR(20),
Ano INT,
CodServico INT FOREIGN KEY REFERENCES Servico(CodServico));

-- Table: Tarefa
CREATE TABLE Tarefa (
CodTarefa INT PRIMARY KEY,
Nome VARCHAR(30) NOT NULL,
PrecoHora MONEY DEFAULT 50);

-- Table: Atividade
CREATE TABLE Atividade (
CodAtividade INT PRIMARY KEY,
Data DATE NOT NULL,
HoraInicio TIME NOT NULL,
HoraFim TIME NOT NULL,
Preco MONEY NOT NULL,
CodTarefa INT FOREIGN KEY REFERENCES Tarefa(CodTarefa));

-- Table: FuncionarioResponsavel
CREATE TABLE FuncionarioResponsavel (
IdFuncionarioResponsavel INT PRIMARY KEY,
Nome VARCHAR(30) NOT NULL,
Morada VARCHAR(100),
Telemovel CHAR(9),
Email VARCHAR(40) NOT NULL,
Salario MONEY);

-- Table: Funcionario
CREATE TABLE Funcionario (
IdFuncionario INT PRIMARY KEY,
Nome VARCHAR(30) NOT NULL,
Morada VARCHAR(100),
Telemovel CHAR(9),
Email VARCHAR(40) NOT NULL,
Salario MONEY,
IdFuncResp INT FOREIGN KEY REFERENCES FuncionarioResponsavel(IdFuncionarioResponsavel));

-- Table: Maquina
CREATE TABLE Maquina (
CodMaquina INT PRIMARY KEY,
Nome VARCHAR(30) NOT NULL,
CustoHora MONEY);

-- Table: Produto
CREATE TABLE Produto (
CodProduto INT PRIMARY KEY,
Nome VARCHAR(30) NOT NULL,
Descricao VARCHAR(100),
Quantidade INT,
PrecoUnitario MONEY,
CodAtividade INT FOREIGN KEY REFERENCES Atividade(CodAtividade));

-- Table: Atividade_Funcionario
CREATE TABLE Atividade_Funcionario (
CodAtividade INT FOREIGN KEY REFERENCES Atividade(CodAtividade),
IdFuncionario INT FOREIGN KEY REFERENCES Funcionario(IdFuncionario),
TempoGasto INT,
PRIMARY KEY (CodAtividade, IdFuncionario));

-- Table: Atividade_Tarefa
CREATE TABLE Atividade_Tarefa (
CodAtividade INT FOREIGN KEY REFERENCES Atividade(CodAtividade),
CodTarefa INT FOREIGN KEY REFERENCES Tarefa(CodTarefa),
PrecoTotal MONEY,
PRIMARY KEY (CodAtividade, CodTarefa));