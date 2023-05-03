Este modelo é composto por:

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

4.4.1	Modelo de Dados
Nas seguintes tabelas apresentamos todas as tabelas que iremos criar em SQL, bem como o tipo de dados, uma descrição e as respetivas restrições.

Tabela: TipoCliente 
Campo	Tipo de dados	Descrição	Observações
CodTipoCliente	INT	‘individuais’, ‘empresas’, ‘associações’	Chave primária, não admite o valor NULL
Descrição	Varchar (100)	Descrever o tipo de cliente	Não admite valor NULL

Tabela: Cliente 
Campo	Tipo de dados	Descrição	Observações
IdCliente	INT	Identificador único do cliente	Chave primária, não admite o valor NULL, único
Nome	Varchar (30)	Identificador do nome do cliente	Não admite valor NULL
Morada	Varchar(100)	Morada do cliente	
Telemóvel	INT
	Número de telemóvel do cliente (9 dígitos)	
E-mail	Varchar (40)	E-mail do cliente	Não admite valor NULL
CodTipoCliente	INT	‘individuais’, ‘empresas’, ‘associações’	Chave forasteira

Tabela: TipoServiço 
Campo	Tipo de dados	Descrição	Observações
codTipoServiço	INT	Identificador único do tipo de serviço	Chave primária, não admite o valor NULL, único
Descrição	Varchar (100)	Descrição do tipo de serviço efetuado	Preenchimento opcional
Taxa	decimal
	Taxa aplicada a cada serviço	Tabelada

Tabela: Serviço 
Campo	Tipo de dados	Descrição	Observações
CodServiço	INT	Identificador único do Serviço	Chave primária, não admite o valor NULL, único
DataRequisição	Date	Data em que a requisição foi feita	Não admite valor NULL
DataExecução	Date
	Data em que a execução foi feita	Não admite valor NULL
HoraInicio	Time	Hora em que o serviço foi iniciado	Não admite valor NULL
HoraFim	Time	Hora em que o serviço foi terminado	Não admite valor NULL
PreçoHora	money	Preços tabelados	Não admite valor NULL
IdCliente	INT
	Identificador único do cliente	Chave forasteira
CodViatura	INT	Identificador único da viatura	Chave forasteira

Tabela: Viatura 
Campo	Tipo de dados	Descrição	Observações
CodViatura	INT	Identificador único da viatura	Chave primária, não admite o valor NULL, único
Matrícula	Varchar (30)	Identificador da matrícula	Não admite valor NULL
Marca	Varchar (30)	Identificador da marca	Não admite valor NULL
Modelo	Varchar (20)	Identificador do modelo	Não admite valor NULL
Cor	Varchar (20)	Identificador da cor	
Ano	Data	Identificador do ano	

Tabela: Tarefa 
Campo	Tipo de dados	Descrição	Observações
CodTarefa	INT	Código da tarefa	Chave primária, não admite o valor NULL, único
Nome	Varchar (30)	Data da realização da atividade	Não admite valor NULL
PreçoHora	Money	Identificador da cor	Default 50

Tabela: Atividade 
Campo	Tipo de dados	Descrição	Observações
CodAtividade	INT	Código da atividade	Chave primária, não admite o valor NULL, único
DataAtv	Date	Data da realização da atividade	Não admite valor NULL
HoraInicio	Time	Hora de início da tarefa	Não admite valor NULL
HoraFim	Time	Hora do fim da tarefa	Não admite valor NULL
Preço	Money	Identificador da cor	Default 50
CodTarefa	INT	Identificador da tarefa	Chave forasteira

Tabela: FuncionárioResponsável 
Campo	Tipo de dados	Descrição	Observações
IdFuncionarioResponsavel	INT	Identificação do func. responsável	Chave primária, não admite o valor NULL, único
Nome	Varchar (30)	Nome do responsável	Não admite valor NULL
Morada	Varchar (30)	Morada do responsável	Não admite valor NULL
Telemóvel	int	Telemóvel do responsável	Não admite valor NULL
E-mail	Varchar (30)	E-mail do responsável	Não admite valor NULL
Salário	money	Salário do responsável	
DataNascimento	Data	Data de nascimento do funcionário responsável	Não admite valor NULL

Tabela: Funcionário 
Campo	Tipo de dados	Descrição	Observações
IdFuncionario	INT	Identificação do funcionário	Chave primária, não admite o valor NULL, único
Nome	Varchar (30)	Nome do funcionário	Não admite valor NULL
Morada	Varchar (30)	Morada do funcionário	Não admite valor NULL
Telemóvel	int	Telemóvel do funcionário	Não admite valor NULL
E-mail	Varchar (30)	E-mail do funcionário	Não admite valor NULL
Salário	money	Salário do funcionário	
DataNascimento	Data	Data de nascimento do funcionário 	Não admite valor NULL
IdFuncionarioResponsável	INT	Identificação do funcionário responsável	Chave Forasteira

Tabela: Máquina 
Campo	Tipo de dados	Descrição	Observações
CodMaquina	INT	Código da máquina	Chave primária, não admite o valor NULL, único
Nome	Varchar (30)	Nome da máquina	Não admite valor NULL
CustoHora	Money	Preço que a máquina custa há hora	Default 50

Tabela: Produto 
Campo	Tipo de dados	Descrição	Observações
CodProduto	INT	Identificação do produto	Chave primária, não admite o valor NULL, único
Nome	Varchar (30)	Nome do produto	Não admite valor NULL
Descrição	Varchar (100)	Descrição do produto	
Quantidade	int	Quantidade de produto usado	Não admite valor NULL
PreçoUnitário	Money	Preço individual de cada produto	Não admite valor NULL
CodAtividade	INT	Identificação da atividade	Chave Forasteira

Tabela: AtividadeFuncionário 
Campo	Tipo de dados	Descrição	Observações
CodAtividade	INT	Código da atividade	Chave Primária e Forasteira, não admite o valor NULL.
IdFuncionário	INT	Código do funcionário	Chave primária e chave forasteira
TempoGasto	Time	Tempo gasto por cada funcionário em cada atividade	Não admite valor NULL

Tabela: AtividadeTarefa 
Campo	Tipo de dados	Descrição	Observações
CodAtividade	INT	Código da atividade	Chave Primária e Forasteira, não admite o valor NULL.
CodTarefa	INT	Código da tarefa	Chave forasteira
Preço total	Money	Preço total de uma tarefa que pertence a uma atividade	Não admite valor NULL

Tabela: ServicoTipoServico 
Campo	Tipo de dados	Descrição	Observações
CodServiço	INT	Código do serviço	Chave Primária e Forasteira, não admite o valor NULL.
CodTipoServiço	INT	Código do tipo de serviço	Chave forasteira
