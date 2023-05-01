Trabalho Prático – Parte I
Neste projeto pretende-se implementar um sistema de informação, cujos dados são geridos por
uma base de dados. O projeto será realizado em grupo e avaliado por um relatório e uma
apresentação dinâmica do projeto.
O trabalho prático divide-se em duas partes: a primeira parte centra-se na análise e modelação de
uma base de dados de apoio ao sistema (A), enquanto na segunda parte se pretende que seja
realizada a implementação da base de dados (B).
1. Problema
EST_DOMESTICO
Considere a organização EST_Domestico, uma empresa dedicada à realização de serviços ao
domicílio (tarefas como por exemplo: limpezas, tratamento de roupa…), que necessita de uma base
de dados para dar suporte às suas atividades, registando todos os dados a elas associados.
Os clientes, que podem ser de vários tipos (individuais, empresas, associações, entre outros), após
a realização de um registo no sistema, ficam em condições de requisitar os serviços da
EST_Domestico, a realizar na morada do cliente numa data específica. Para além desta, também
deve ser guardada a data de requisição do serviço. Cada serviço pode ser constituído por várias
atividades, correspondendo cada uma delas a uma das tarefas que a EST_Domestico oferece,
tendo cada uma um preço específico à hora. Os serviços são tipificados em períodos específicos
do dia: Madrugada: 0h-8h; Normal_Manhã: das 8h-12h; Almoço: das 12h-14h; Normal_Tarde: das
14h-18h; Final_dia: 18h-23h59m, correspondendo a taxas aplicadas a cada um deles,
respetivamente: 200%; 100%; 125%; 100%; 125%; 150% (por exemplo, se o valor hora da limpeza
for 50€, e o serviço solicitado for do tipo “Madrugada”, será aplicada a taxa 200%, logo pagaria
por hora 100€). Cada atividade, da qual deve ser conhecido o momento de realização, pode ser
realizada por um ou mais funcionários, ficando registado para cada um deles o tempo gasto na
respetiva atividade. O mesmo se aplicará aos produtos gastos na execução da respetiva atividade,
sendo neste caso registada a respetiva quantidade utilizada por cada atividade. Existem ainda
algumas atividades que, devido à sua natureza necessitam de maquinaria específica, como por
exemplo a aspiração. Nestes casos o tempo gasto por cada máquina utilizada, deverá também ser
registado no sistema, por atividade. Adicionalmente, deve também ser guardado registo da viatura
usada na deslocação para a execução do serviço, assim como do funcionário responsável pelo
serviço. Em alguns casos os funcionários podem ter um outro funcionário como seu responsável,
podendo este ser responsável por vários funcionários.
Nos casos em que a informação sobre os atributos das entidades não seja diretamente retirada do
enunciado, devem considerar os elementos básicos (ex: um identificador único e um nome ou uma
descrição).
Embora importante, fica de fora toda a envolvente relacionada com o backoffice, como a criação dos
utilizadores, permissões, etc. 
