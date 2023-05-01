4.4	Modelo Relacional
O modelo relacional é feito a partir do modelo E-R. 
Representa dados e relações em forma de tabelas (relações).
 
Este modelo é composto por:

TipoCliente (CodTipoCliente (PK), Descrição);
Cliente (IdCliente (PK), nome, morada, telemóvel, e-mail, CodTipoCliente (FK));
Serviço (CodServiço(PK), dataRequisição, dataExecução, horaInicio, horaFim, preçoHora, IdCliente (FK));
TipoServiço (CodTipoServiço (PK), descrição, hora);
Viatura (CodViatura (PK), matrícula, marca, modelo, cor, ano, CodServiço(Fk));
Atividade (CodAtividade (PK), data, horaInicio, horaFim, preço, CodTarefa (FK));
FuncionarioResponsável (IdFuncionarioResponsável (PK), nome, morada, telemóvel, email, salario)
Funcionario (IdFuncionario (PK), nome, morada, telemóvel, email, salario, IdFuncResp(FK))
Tarefa (CodTarefa (PK), nome, preçoHora)
Máquina (CodMaquina (PK), nome, custoHora)
Produto (CodProduto (PK), nome, descrição, quantidade, preçoUnitario, CodAtividade(FK))
Atividade_Funcionario (CodAtividade (PK) (FK), IdFuncionario (PK) (FK), tempoGasto)
Atividade_Tarefa (CodAtividade (PK) (FK), CodTarefa (FK), preço total)
Serviço_TipoServiço (CodServiço (PK) (FK), CodTipoServiço (FK))



4.4.1	Modelo de Dados
Nas seguintes tabelas apresentamos todas as tabelas que iremos criar em SQL, bem como o tipo de dados, uma descrição e as respetivas restrições.

Tabela: TipoCliente 
Campo	Tipo de dados	Descrição	Observações
IdTipoCliente	INT	‘individuais’, ‘empresas’,’associações’	Chave primária, não admite o valor NULL
Descrição	Varchar (100)	Descrever o tipo de cliente	Não admite valor NULL

Tabela: Cliente 
Campo	Tipo de dados	Descrição	Observações
IdCliente	INT	Identificador único do cliente	Chave Primária, não admite o valor NULL, único
nome	Varchar (30)	Identificador do nome do cliente	Não admite valor NULL
Telemóvel	INT
	Número de telemóvel do cliente (9 digitos)	
E-mail	Varchar (40)	E-mail do cliente	Não admite valor NULL
IdTipoCliente	INT	‘individuais’, ‘empresas’,’associações’	Chave forasteira


Tabela: TipoServiço 
Campo	Tipo de dados	Descrição	Observações
IdTipoServiço	INT	Identificador único do tipo de serviço	Chave Primária, não admite o valor NULL, único
Descrição	Varchar (100)	Descrição do tipo de serviço efetuado	Preenchimento opcional
Taxa	decimal
	Taxa aplicada a cada serviço	Tabelada





Tabela: Serviço 
Campo	Tipo de dados	Descrição	Observações
CodServiço	INT	Identificador único do Serviço	Chave Primária, não admite o valor NULL, único
DataRequisição	Date	Data em que a requisição foi feita	Não admite valor NULL
DataExecução	Date
	Data em que a execução foi feita	Não admite valor NULL
HoraInicio	Time	Hora em que o serviço foi iniciado	Não admite valor NULL
HoraFim	Time	Hora em que o serviço foi terminado	Não admite valor NULL
PreçoHora	money	Preços tabelados	Não admite valor NULL
IdCliente	INT
	Identificador único do cliente	Chave forasteira

Tabela: Viatura 
Campo	Tipo de dados	Descrição	Observações
IdViatura	INT	Identificador único da viatura	Chave Primária, não admite o valor NULL, único
Matrícula	Varchar (30)	Identificador da matricula	Não admite valor NULL
Marca	Varchar (30)	Identificador da marca	Não admite valor NULL
Modelo	Varchar (20)	Identificador do modelo	Não admite valor NULL
Cor	Varchar (20)	Identificador da cor	
Ano	time	Identificador do ano	
CodServiço	INT	Identificador único do Serviço	Chave forasteira

Tabela: Tarefa 
Campo	Tipo de dados	Descrição	Observações
CodTarefa	INT	Codigo da tarefa	Chave Primária, não admite o valor NULL, único
Nome	Varchar (30)	Data da realização da atividade	Não admite valor NULL
PreçoHora	Money	Identificador da cor	Default 50


Tabela: Atividade 
Campo	Tipo de dados	Descrição	Observações
CodAtividade	INT	Codigo da atividade	Chave Primária, não admite o valor NULL, único
Data	Time	Data da realização da atividade	Não admite valor NULL
HoraInicio	Time	Hora de início da tarefa	Não admite valor NULL
HoraFim	Time	Hora do fim da tarefa	Não admite valor NULL
Preço	Money	Identificador da cor	Default 50
CodTarefa	INT	Identificador da tarefa	Chave forasteira

Tabela: Funcionário Responsável 
Campo	Tipo de dados	Descrição	Observações
IdFuncionarioResponsavel	INT	Identificação do func. responsavel	Chave Primária, não admite o valor NULL, único
Nome	Varchar (30)	Nome do responsavel	Não admite valor NULL
Morada	Varchar (30)	Morada do responsavel	Não admite valor NULL
Telemóvel	int	Telemóvel  do responsavel	Não admite valor NULL
E-mail	Varchar (30)	E-mail do responsavel	Não admite valor NULL
Salário	money	Salario do responsavel	

Tabela: Funcionário 
Campo	Tipo de dados	Descrição	Observações
IdFuncionario	INT	Identificação do funcionario	Chave Primária, não admite o valor NULL, único
Nome	Varchar (30)	Nome do funcionario	Não admite valor NULL
Morada	Varchar (30)	Morada do funcionario	Não admite valor NULL
Telemóvel	int	Telemóvel  do funcionario	Não admite valor NULL
E-mail	Varchar (30)	E-mail do funcionario	Não admite valor NULL
Salário	money	Salario do funcionario	
IdFuncionarioResponsavel	INT	Identificação do func. responsavel	Chave Forasteira


Tabela: Máquina 
Campo	Tipo de dados	Descrição	Observações
CodMaquina	INT	Codigo da maquina	Chave Primária, não admite o valor NULL, único
Nome	Varchar (30)	Nome da maquina	Não admite valor NULL
CustoHora	Money	Preço que a maquina custa há hora	Default 50






Tabela: Produto 
Campo	Tipo de dados	Descrição	Observações
CodProduto	INT	Identificação do produto	Chave Primária, não admite o valor NULL, único
Nome	Varchar (30)	Nome do produto	Não admite valor NULL
Descrição	Varchar (100)	Descrição do produto	
Quantidade	int	Quantidade de produto usado	Não admite valor NULL
PreçoUnitário	Money	Preço individual de cada produto	Não admite valor NULL
CodAtividade	INT	Identificação da atividade	Chave Forasteira

Tabela: Atividade-Funcionário 
Campo	Tipo de dados	Descrição	Observações
CodAtividade	INT	Codigo da atividade	Chave Primária e Foresteira, não admite o valor NULL.
CodFuncionário	INT	Codigo do funcionário	Chave forasteira
TempoGasto	Time	Tempo gasto por cada funcionário em cada atividade	Não admite valor NULL

Tabela: Atividade-Tarefa 
Campo	Tipo de dados	Descrição	Observações
CodAtividade	INT	Codigo da atividade	Chave Primária e Foresteira, não admite o valor NULL.
CodTarefa	INT	Codigo da tarefa	Chave forasteira
Preço total	Money	Preço total de uma tarefa que pertence a uma atividade	Não admite valor NULL


Tabela: Serviço- tipo serviço 
Campo	Tipo de dados	Descrição	Observações
CodServiço	INT	Codigo do serviço	Chave Primária e Foresteira, não admite o valor NULL.
CodTipoServiço	INT	Codigo do tipo de serviço	Chave forasteira

