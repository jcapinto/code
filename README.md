Regras de realização:
1. Leiam todo o enunciado com atenção.
2. Deve ser utilizada a linguagem Java.
3. O código deve ser entregue no relatório cujo modelo é fornecido conjuntamente
com o enunciado.
4. A entrega deve ser feita até às 23:55 do dia 12 de abril de 2023 via Moodle.
5. Após a entrega poderá se realizar uma defesa oral do trabalho em data e hora a definir.
6. A não observação destas regras, ou a apresentação de trabalhos idênticos, pode implicar
a anulação do(s) trabalho(s) ao(s) aluno(s) em causa.
Enunciado:
O objetivo deste trabalho é alterar uma aplicação de processamento estatístico das chaves do
Euromilhões.
Nesta aplicação os dados encontram-se guardados numa mattriz bidimensional de números inteiros e
pretende-se que seja implementada uma classe: Chave, que será responsável por guardar todos os dados
de uma respetiva chave e executar os respetivos métodos associados.
Os dados da aplicação deverão, então, ser guardados num vetor de chaves.
Requisitos
No inicio da execução a aplicação lê a base de dados contendo as chaves (fictícias) desde 1980, ou seja o
ficheiro euro.txt
Este ficheiro contém uma chave por linha e os vários valores encontram-se separados por um espaço:
1984 15 7 12 21 34 46 4 9
Estes valores são, respetivamente, o ano, a semana, as 5 bolas e as 2 estrelas.
A classe Chave a implementar deve contemplar:
• os atributos necessários
• construtores – por defeito, completo (que inicializa todos os atributos), e que recebe uma linha do
ficheiro (é este que deve ser usado no programa ao serem carregados os dados)
• getters e setters
• a função toString()
Importante: Os erros de input, sejam vindos do teclado ou do ficheiro, devem ser resolvidos com
recurso ao uso e manipulação de exceções.
Quando uma chave, ao ser inicializada, detetar erros de input, a linha é apresentada ao
utilizador e é lhe pedido que introduza a linha sem erros.
Entre os possíveis erros, que podem ser originados ao ler o ficheiro só é necessário implementar os
seguintes:
• valor – o ano tem que estar entre 1980 e o ano atual, a semana entre 1 e 52, as bolas entre 1 e 50 e as
estrelas entre 1 e 12.
• tipo de dados - por exemplo o caracter O em vez de 0 (letra o em vez do número zero)
Para realizar os testes ao programa, são fornecidos dois ficheiros de chaves: euro.txt e erro.txt, o primeiro
não tem erros e o segundo tem, nomeadamente nas linhas: 50, 100, 150 e 200.
São fornecidos os exemplos, desenvolvidos em sala de aula, para auxilio na resolução do
trabalho prático
