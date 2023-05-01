Parte I – B
1. Implemente em SQL o resultado do modelo relacional obtido na Parte I - A
2. Responda em SQL às seguintes questões:
i. Faça a listagem geral de todas as tabelas;
ii. Liste toda a informação sobre os clientes, que tenham ‘Rita’ no nome, e que tenham
solicitado serviços no último trimestre de 2022. Apresente o resultado ordenado por
nome de Z para A;
iii. Liste para cada máquina, o valor médio de utilização, apenas para os primeiros 15 dias
de cada mês. Apresente o resultado ordenado por valor médio de utilização começando
pelo mais elevado;
iv. Liste para cada designação de produto, a quantidade total e o número de vezes que foi
utilizado. Tenha em consideração que podem existir produtos que nunca foram
utilizados, mas também estes devem constar do resultado. Ordene o resultado pela
quantidade começando pela maior quantidade até à menor;
v. Para cada viatura indique a quantidade de serviços em que participou. Apresente o
resultado ordenado pela quantidade (da maior para a menor) e diferenciado por
semestre;
vi. Liste toda a informação sobre funcionários nascidos antes de 2000 que tendo realizado
a tarefa de limpar vidros, nunca tenham realizado a limpeza de estores. Apresente o
resultado ordenado por nome de funcionário de Z para A;
vii. Liste o nome dos 3 produtos mais utilizados em termos de quantidade. Apresente o
resultado ordenado por quantidade começando pela maior;
viii. Liste para cada nome de cliente a quantidade de serviços para cada um dos períodos
específicos do dia. Não devem constar no resultado serviços solicitados nos meses de
agosto nem de dezembro. Apresente o resultado ordenado quantidade começando pela
maior;
ix. Liste o nome dos funcionários que, num mesmo serviço, tenham despendido o mesmo
tempo (independentemente da atividade em causa). No resultado deverá constar o
nome do funcionário, o tempo gasto, bem como o respetivo serviço e data. O resultado
apresentado deve ser ordenado por data, iniciando-se a listagem pela mais recente;
PROJETO DE BASES DE DADOS TRABALHO PRÁTICO
CTeSP TPSI 3 2022/2023
x. Apresente o(s) ano(s) com menos serviços a realizar no primeiro semestre. Para além do
ano, o resultado deve incluir a quantidade de serviços.
xi. Liste os dados dos funcionários que sendo supervisores de outros colegas nunca foram
responsáveis por serviços. Apresente o resultado ordenado por antiguidade na empresa.
xii. Recorra ao mecanismo de criação de vista de modo a criar uma vista que para cada
viatura, que contabilize o número de vezes que esta foi utilizada em cada mês do ano
de 2022.
3. Crie, à escolha, consultas com as seguintes características: (apresente o texto da pergunta
e respetiva resposta em sql):
a. 6 consultas que usem: “Like”; “Between”; “In” e os seus opostos “Not Like”; “Not
Between” e “Not In” (podem usar outros operadores: =; >; <; >=; …);
b. 5 consultas que envolvam funções de agregação (“COUNT”; “MIN”; “MAX”;
“AVG”; “SUM”)
c. 2 consultas que envolvam “Group By” e “Having”;
d. 2 consultas que envolvam “Subqueries” (uma sem e outra com correlação);
Pelo menos metade destas consultas devem envolver 2 ou mais tabelas.
Devem inserir as linhas necessárias, em cada tabela, para que se possam observar resultados
coerentes. (As siglas apresentadas entre aspas podem ser mudadas para valores de acordo com os
existentes em cada modelo.) 
