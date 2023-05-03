TipoCliente (CodTipoCliente (PK), Descrição);
Cliente (IdCliente (PK), nome, morada, telemóvel, e-mail, CodTipoCliente (FK));
Serviço (CodServiço(PK), dataRequisição, dataExecução, horaInicio, horaFim, preçoHora, IdCliente (FK), CodViatura(FK));
TipoServiço (CodTipoServiço (PK), descrição, taxa);
Viatura (CodViatura (PK), matrícula, marca, modelo, cor, ano);
Atividade (CodAtividade (PK), data, horaInicio, horaFim, preço, CodTarefa (FK));
FuncionarioResponsável (IdFuncionarioResponsável (PK), nome, morada, telemóvel, email, salário)
Funcionario (IdFuncionario (PK), nome, morada, telemóvel, email, salario, IdFuncResp(FK))
Tarefa (CodTarefa (PK), nome, preçoHora)
Máquina (CodMaquina (PK), nome, custoHora)
Produto (CodProduto (PK), nome, descrição, quantidade, preçoUnitario, CodAtividade(FK))
AtividadeFuncionario (CodAtividade (PK) (FK), IdFuncionario (PK) (FK), tempoGasto)
AtividadeTarefa (CodAtividade (PK) (FK), CodTarefa (FK), preço total)
ServicoTipoServico (CodServiço (PK) (FK), CodTipoServiço (FK))







Tabela: TipoCliente 
Campo	Tipo de dados
CodTipoCliente	INT
Descrição	Varchar (100)

Tabela: Cliente 
Campo	Tipo de dados
IdCliente	INT
Nome	Varchar (30)
Morada	Varchar(100)
Telemóvel	INT

E-mail	Varchar (40)
CodTipoCliente	INT


Tabela: TipoServiço 
Campo	Tipo de dados
codTipoServiço	INT
Descrição	Varchar (100)
Taxa	decimal




Tabela: Serviço 
Campo	Tipo de dados
CodServiço	INT
DataRequisição	Date
DataExecução	Date

HoraInicio	Time
HoraFim	Time
PreçoHora	money
IdCliente	INT

CodViatura	INT

Tabela: Viatura 
Campo	Tipo de dados
CodViatura	INT
Matrícula	Varchar (30)
Marca	Varchar (30)
Modelo	Varchar (20)
Cor	Varchar (20)
Ano	Data

Tabela: Tarefa 
Campo	Tipo de dados
CodTarefa	INT
Nome	Varchar (30)
PreçoHora	Money


Tabela: Atividade 
Campo	Tipo de dados
CodAtividade	INT
DataAtv	Date
HoraInicio	Time
HoraFim	Time
Preço	Money
CodTarefa	INT

Tabela: FuncionárioResponsável 
Campo	Tipo de dados
IdFuncionarioResponsavel	INT
Nome	Varchar (30)
Morada	Varchar (30)
Telemóvel	int
E-mail	Varchar (30)
Salário	money
DataNascimento	Data

Tabela: Funcionário 
Campo	Tipo de dados
IdFuncionario	INT
Nome	Varchar (30)
Morada	Varchar (30)
Telemóvel	int
E-mail	Varchar (30)
Salário	money
DataNascimento	Data
IdFuncionarioResponsável	INT

Tabela: Máquina 
Campo	Tipo de dados
CodMaquina	INT
Nome	Varchar (30)
CustoHora	Money



Tabela: Produto 
Campo	Tipo de dados
CodProduto	INT
Nome	Varchar (30)
Descrição	Varchar (100)
Quantidade	int
PreçoUnitário	Money
CodAtividade	INT

Tabela: AtividadeFuncionário 
Campo	Tipo de dados
CodAtividade	INT
IdFuncionário	INT
TempoGasto	Time

Tabela: AtividadeTarefa 
Campo	Tipo de dados
CodAtividade	INT
CodTarefa	INT
Preço total	Money

Tabela: ServicoTipoServico 
Campo	Tipo de dados
CodServiço	INT
CodTipoServiço	INT
