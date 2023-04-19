	








Dispositivos IOT - Arduino e Raspberry Pi 
Fundamentos e Operação de Sistemas Operativos




João Pinto - Aluno nº 20221050
João Torres - Aluno nº 20221220
Curso Técnico Superior Profissional em Tecnologias e Programação de Sistemas de Informação


Professor
João Cordeiro








Abril de 2023
Resumo
O presente relatório tem como objetivo apresentar informações sobre duas plataformas de desenvolvimento, Arduino e Raspberry Pi, amplamente utilizadas na criação de projetos eletrónicos e de computação. Serão abordados tópicos como, o que são, suas histórias, características, tipos de placas, como utilizar, a comparação entre elas e projetos que combinam ambas as plataformas.

Palavras chave
IoT (Internet das Coisas), Dispositivos, Arduino, Raspberry Pi, Automação
























Índice geral
????????????????????????
























 
 
 
1. Introdução

O Arduino e Raspberry Pi são plataformas de prototipagem e desenvolvimento eletrónico e computacional, são amplamente utilizadas em projetos de Internet das Coisas (IoT), robótica, automação residencial, entre outros. São bastante populares por serem relativamente acessíveis e por contar com uma ampla comunidade de desenvolvedores e entusiastas que compartilham conhecimentos, códigos e projetos na internet. Neste relatório, vamos apresentar noções introdutórias sobre as características, tipos de placas, como utilizá-las e as diferenças entre as plataformas Arduino e Raspberry Pi.

2. Arduino
2.1 O que é o Arduino
O Arduino é uma plataforma de hardware de código aberto e livre, projetada para tornar a criação de projetos eletrónicos interativos acessível a todos, independentemente do nível de habilidade. O Arduino é uma placa de circuito integrado que contém um microcontrolador, conectores e pinos de entrada e saída. A placa pode ser conectada a uma ampla variedade de sensores, dispositivos de entrada e saída e outros componentes eletrónicos.
O Arduino vem com um ambiente de desenvolvimento integrado (IDE), que oferece uma interface intuitiva e fácil de usar para escrever e carregar programas no microcontrolador. Com o IDE do Arduino, é possível programar o microcontrolador para executar uma variedade de tarefas, como controlo de motores, leitura de sensores, comunicação com outros dispositivos e exibição de dados.
Graças à sua acessibilidade, flexibilidade e facilidade de uso, o Arduino tornou-se uma das plataformas mais populares para projetos eletrónicos e robóticos em todo o mundo.
 
Imagem 1 - Logo Arduino - Fonte: Wikipédia [1]

 
2.2. História do Arduino

O Arduino foi criado em 2005 por um grupo de estudantes da Interaction Design Institute Ivrea na Itália. O objetivo era criar uma plataforma de baixo custo e fácil de usar para que designers e artistas pudessem incorporar a eletrónica nos seus projetos.
O grupo, liderado por Massimo Banzi, criou um pequeno microcontrolador baseado no Atmel AVR e o chamou de “Arduino” em homenagem ao bar “Bar di Re Arduino” de Ivrea, na Itália, onde o grupo de estudantes se reunia para trabalhar no projeto. Eles desenvolveram uma placa de circuito impresso e um ambiente de programação integrado (IDE) que permitia aos utilizadores programar o microcontrolador sem a necessidade de conhecimento prévio de eletrónica.
Desde a sua criação, o Arduino evoluiu significativamente. Novos modelos foram lançados, cada um com recursos aprimorados e compatibilidade com uma ampla gama de sensores e atuadores. O Arduino também se tornou uma ferramenta popular para ensinar eletrónica e programação em escolas e universidades em todo o mundo.
                   
Imagem 2 - Interaction Design Institute - Fonte: Wikipédia [2]                                                                                           Imagem 3 - Massimo Banzi - Fonte: Site Oficial do Massimo Banzi [3]
 
Imagem 4 - Bar di Re Arduino - Fonte: Reddit¬ [3]



2.3. Como funciona o Arduino?
O funcionamento do Arduino consiste em uma placa de circuito impresso com um microcontrolador embutido, que pode ser programado por meio de um software específico (Arduino IDE).
A placa Arduino é capaz de receber dados de sensores externos, como sensores de temperatura, luz, humidade, entre outros, e executar ações com base nesses dados, como controlar motores, atuadores, LEDs, entre outros dispositivos.
O Arduino é alimentado pela porta “Power Jack”, para a sua configuração e programação ou ligar outros dispositivos é utilizada uma porta USB, Os “Power pins” são usados para fornecer energia ao Arduino e aos dispositivos conectados a ele, os “Analog pins” do Arduino permitem ler sinais analógicos de sensores e outros dispositivos, os “Digital pins” do Arduino são usados para controlar dispositivos digitais, como LEDs, motores e relés por ultimo os “ICSP pins” (In-Circuit Serial Programming é um padrão de programação de microcontroladores) permitem  programar o microcontrolador sem retirá-lo do circuito (podemos ver todos este conectores na imagem 5).
O microcontrolador da placa Arduino é programado por meio de um dispositivo ligado à placa por meio da porta USB. O software de programação do Arduino é chamado de Arduino IDE (Integrated Development Environment), é gratuito e de código aberto. 
Além disso, o Arduino é compatível com uma grande variedade de módulos e shields, que são placas que podem ser ligadas à placa principal para expandir as suas funcionalidades. Isto permite que o Arduino seja utilizado em uma grande variedade de projetos, desde simples protótipos até projetos complexos de automação e robótica.
 
Imagem 5 - IoT Arduino - Fonte: Site Oficial do Arduino [1]
2.4. Linguagem de programação do Arduino
A linguagem de programação do Arduino é baseada em C/C++, embora tenha algumas peculiaridades e simplificações que a tornam mais fácil de usar para iniciantes em programação. O código em Arduino é escrito em um ambiente de desenvolvimento integrado (IDE) que inclui um editor de código, um compilador e um carregador de bootloader para carregar o código no microcontrolador do Arduino, o Arduino IDE está disponível para Windows, macOS, Linux e também é possível a sua programação online através de um browser pela opção Arduino Web Editor. O código para o Arduino é composto por duas funções principais: a função setup(), que é executada uma vez quando o microcontrolador é ligado, e a função loop(), que é executada continuamente enquanto o microcontrolador está ligado. O código no Arduino pode ser usado para controlar os pinos digitais e analógicos do microcontrolador e também comunicar com outros dispositivos através de interfaces como I2C (Inter-Integrated Circuit), SPI (Serial Peripheral Interface) e UART (Universal Asynchronous Receiver/Transmitter). Além disso, a comunidade do Arduino desenvolveu uma grande quantidade de bibliotecas de código aberto que podem ser usadas para simplificar tarefas comuns, como controlo de motores, leitura de sensores e comunicação sem fio.

 
Imagem 6 - Arduino IDE - Fonte: Própria
 
2.5. Características do Arduino
As principais características do Arduino são:
•	Fácil utilização: Ele possui uma interface simples, onde os utilizadores podem facilmente ligar componentes eletrónicos.
•	Código aberto: O código-fonte do Arduino é aberto e disponível para todos. Isso significa que qualquer pessoa pode aceder ao seu código-fonte e modificá-lo de acordo com suas necessidades. 
•	Flexibilidade: O Arduino é altamente flexível e pode ser usado em uma ampla variedade de projetos, desde simples LEDs piscando até projetos complexos de robótica.
•	Compatibilidade: O Arduino é compatível com uma ampla variedade de componentes eletrónicos, tornando-o uma plataforma ideal para prototipagem e experiências.
•	Baixo custo: O Arduino é uma plataforma de baixo custo em comparação com outras plataformas de prototipagem eletrónica, o que o torna acessível para um público mais amplo.
•	Conectividade: O Arduino pode se conectar facilmente a outros dispositivos eletrónicos, como computadores, smartphones e tablets, permitindo o controlo remoto de projetos.
•	Comunidade: O Arduino possui uma grande comunidade de utilizadores e desenvolvedores que partilham projetos, códigos e ideias em vários meios online.

2.6. Tipos de placas Arduino
Existem muitos tipos de placas Arduino disponíveis, cada uma com os seus próprios recursos e são adequadas para diferentes tipos de projetos, apresento exemplo de algumas placas Arduino: 
Arduino Uno: É uma das placas mais comuns. Possui 14 pinos digitais de entrada/saída, 6 pinos analógicos de entrada, um cristal oscilador de 16 MHz e uma porta USB.
Arduino Mega: Possui 54 pinos digitais de entrada/saída, 16 pinos analógicos de entrada e um cristal oscilador de 16 MHz. É geralmente usada em projetos que exigem muitos pinos.
Arduino Nano: É uma versão compacta do Arduino Uno. Possui 14 pinos digitais de entrada/saída, 8 pinos analógicos de entrada e um oscilador cristal de 16 MHz. É frequentemente usada em projetos em que o espaço é limitado.
Arduino Due: É uma placa mais poderosa que o Arduino Uno ou Mega, com um processador ARM de 32 bits e mais pinos digitais e analógicos. É geralmente usada em projetos que exigem maior poder de processamento.
Arduino Leonardo: Possui um processador diferente do Arduino Uno e Mega, e inclui um conector USB embutido. Também possui uma série de pinos digitais e analógicos.
2.7. Exemplos de projetos com Arduino
Sistema para verificar a temperatura: Ao combinar um sensor de temperatura com o Arduino, é possível desenvolver um sistema para verificar a temperatura ambiente e configurar um alarme no caso de atingir uma certa temperatura.
 
Imagem 7 - Sensor de Temperatura - Fonte: arduinoecia.com.br [6]
Robô controlado por Bluetooth: Com o Arduino, é possível construir um robô que possa ser controlado via Bluetooth a partir de um smartphone ou tablet.
 
Imagem 8 - Robô Controlado Por Bluetooth - Fonte: instructables.com [7]
 
Controlador de luzes de uma casa inteligente: Com um módulo WiFi, o Arduino pode ser usado para controlar as luzes de uma casa remotamente controlado por uma aplicação.
 
Imagem 9 - Led controlado pelo Arduino - Fonte: usinainfo.com.br [8]
Máquina de venda automática: O Arduino pode ser usado para construir uma máquina de venda automática que dispensa um produto após a forma escolhida de pagamento.
 
Imagem 10 - Venduino - Fonte: retrobuiltgames.com [9]
Instrumento musical eletrónico: Com os sensores de toque e um sintetizador, o Arduino pode ser usado para criar um instrumento musical eletrónico único.
 
Imagem 10 - Illumaphone - Fonte: instructables.com [10]
2.8. Vantagens e desvantagens do Arduino
As vantagens e desvantagens do Arduino podem variar dependendo do projeto específico e das necessidades do utilizador. Algumas das vantagens do Arduino são:
•	Facilidade de uso: O Arduino é relativamente fácil de aprender e de usar, mesmo para iniciantes em programação e eletrónica.
•	Baixo custo: O Arduino é uma placa relativamente barata em comparação com outras placas de desenvolvimento de hardware.
•	Grande comunidade de suporte: O Arduino tem uma grande comunidade de utilizadores e desenvolvedores que partilham informações, projetos e recursos.
•	Flexibilidade: O Arduino é altamente flexível e pode ser usado em uma ampla variedade de projetos.
•	Open-source: O Arduino é um projeto open-source, o que significa que as especificações da placa e o software são gratuitos para todos.
E algumas das desvantagens são:
•	Limitações de processamento: O Arduino é limitado em termos de poder de processamento, o que pode ser um problema para projetos mais complexos.
•	Limitações de memória: O Arduino tem uma é limitado na memória, o que deve ter sido em consideração para projetos que exigem um grande armazenamento de dados. 
•	Limitações de entrada/saída: Os projetos estão limitados ao número de pinos de entrada/saída disponíveis na placa.
•	Pouco suporte para gráficos: O Arduino não é ideal para projetos que envolvem muitos gráficos, pois não tem muita capacidade de processamento gráfico.
•	Requer conhecimento em eletrónica: Para projetos mais complexos, pode ser necessário ter conhecimento em eletrônica para entender como ligar componentes externos à placa.
 
3. Raspberry Pi
3.1. O que é o Raspberry Pi
Raspberry Pi é um computador de placa única (Session Border Controller) desenvolvido pela Raspberry Pi Foundation, uma organização sem fins lucrativos do Reino Unido. Ele foi concebido para ser acessível e educativo, permitindo que utilizadores de todos os níveis de habilidade aprendam sobre computação e eletrónica. O Raspberry Pi é essencialmente um computador completo em uma pequena placa de circuito impresso (PCI). O processador do Raspberry Pi é um ARM (Advanced RISC Machine) e inclui portas USB, HDMI, Ethernet, GPIO (entrada/saída de propósito geral) e uma variedade de outros recursos. É possível instalar sistemas operativos Linux e Windows e pode ser programado em várias linguagens, incluindo Python, C++ e Scratch. O Raspberry Pi é usado em uma ampla variedade de projetos, desde sistemas de automação residencial, robótica, jogos, servidores multimídia e projetos educacionais.
 
Imagem 11 - Logo Raspberry Pi - Fonte: Site Oficial do Raspberry Pi [11]
 
3.2. História do Raspberry Pi
A Raspberry Pi Foundation foi fundada em 2009 pelo professor de ciência da computação da Universidade de Cambridge, Eben Upton, junto com os seus colegas para resolver o problema do declínio no número de estudantes que estudam ciência da computação. A ideia era criar um computador barato e acessível que pudesse ser usado para ensinar programação e eletrônica em escolas e universidades. A primeira versão do Raspberry Pi foi lançada em fevereiro de 2012. Era um computador de placa única (SBC) com um processador ARM, 256 MB de RAM e portas USB, Ethernet e HDMI. A primeira versão foi tão bem-sucedida que a fundação lançou várias outras versões do Raspberry Pi desde então, cada uma com melhorias significativas em termos de processamento, memória e recursos. Desde o lançamento do Raspberry Pi, a fundação tem trabalhado ativamente para promover a educação em ciência da computação e eletrônica, fornecendo recursos educacionais e apoiando projetos educacionais em todo o mundo. Além disso, o Raspberry Pi é usado em uma ampla variedade de projetos comerciais e de consumo, tornando-se uma plataforma versátil e popular em todo o mundo.
 
Imagem 12 - Eben Upton - Fonte: E&T Magazine [12]
 
Imagem 13 - Department of Computer Science and Technology, University of Cambridge - Fonte: wikipedia.org [13]
 
3.3. Como funciona o Raspberry Pi?
O Raspberry Pi funciona como qualquer outro computador, com a diferença de que ele é muito menor e mais acessível. Ele executa um sistema operativo baseado em Linux, como o Raspbian (também suporta o Windows), que pode ser instalado em um tipo de memoria (pen usb, disco externo, etc) e ligado a placa. Depois de inicializado, o Raspberry Pi pode ser usado para executar programas, aceder a internet, controlar dispositivos eletrónicos e muito mais. Essas características fazem do Raspberry Pi uma excelente opção para projetos de tecnologia, ensino e muitas outras aplicações. Como exemplo o modelo Raspberry Pi 4 Model B, é equipado com um processador Broadcom BCM2711 com quatro núcleos ARM Cortex-A72 de 64 bits, que rodam a 1,5 GHz. Além disso, ele possui diferentes opções de memória RAM, incluindo 2GB, 4GB e 8GB, e um slot para cartão microSD, onde pode ser inserido um cartão para armazenamento de dados e sistema operacional.
 
Imagem 14 - Raspberry Pi 4 Model B - Fonte: raspberrypi.com [11]
 
3.4. Linguagem de programação do Raspberry Pi
O Raspberry Pi é suporta várias linguagens de programação, incluindo Python, C/C++, Java, Scratch, Ruby e muitas outras. No entanto, a linguagem mais popular para programar o Raspberry Pi é o Python, devido à sua facilidade de uso e à vasta comunidade de desenvolvedores que a utilizam. O Python é uma linguagem de programação de alto nível e de código aberto, que possui uma sintaxe simples e fácil de aprender. Ela é amplamente utilizada no Raspberry Pi para diversas aplicações, como controlo de sensores, automação residencial, programação de robôs entre outros. Além do Python, outras linguagens como C/C++, Java e Ruby também são populares no Raspberry Pi, especialmente para projetos que exigem maior performance e controlo de hardware. É importante ressaltar que a escolha da linguagem de programação depende do objetivo do projeto e da experiência do desenvolvedor.

Imagem 15 - Notepad++ com instrução simples em python para o Raspberry Pi- Fonte: Própria

 
3.5. Características do Raspberry Pi
Algumas das principais características do Raspberry Pi são:
•	Tamanho: O Raspberry Pi é um computador de placa única (SBC), ou seja, todos os seus componentes estão em uma única placa de circuito impresso, fazendo dele extremamente compacto e portátil.
•	Baixo custo: O Raspberry Pi é um computador de baixo custo, o que permite que seja acessível para uma grande variedade de pessoas.
•	Flexibilidade: O Raspberry Pi é altamente flexível e pode ser usado em uma ampla variedade de projetos, desde automação residencial até robótica.
•	Conectividade: O Raspberry Pi oferece uma ampla variedade de opções de conectividade, incluindo Wi-Fi, Bluetooth, Ethernet, USB e GPIO (General Purpose Input/Output, pinos programáveis de entrada e saída).
•	Sistema operativo baseado em Linux: O Raspberry Pi usa um sistema operativo baseado em Linux, o que permite que ele execute uma grande variedade de aplicações e programas.
•	Compatível com Windows: O Windows no Raspberry Pi é baseado em uma versão chamada Windows IoT Core, que é uma versão do Windows projetada especificamente para dispositivos IoT e não inclui a interface gráfica do utilizador completa do Windows.
•	Capacidade de programação: O Raspberry Pi é uma plataforma de desenvolvimento que oferece muitas opções de programação, incluindo Python, C, Java e outras linguagens.
•	Grande comunidade: O Raspberry Pi tem uma grande comunidade de desenvolvedores e entusiastas que contribuem com projetos, tutoriais e suporte.
•	Expansibilidade: O Raspberry Pi é altamente expansível e pode ser conectado a uma grande variedade de acessórios e dispositivos externos, como sensores, displays e módulos de câmara.
 
3.6. Tipos de placas Raspberry Pi
Existem vários tipos de placas Raspberry Pi disponíveis no mercado, cada uma com suas próprias características e especificações. Os modelos mais populares são:
•	Raspberry Pi 1 Model B+: Lançado em 2014, este foi o primeiro modelo a incluir 512 MB de RAM e quatro portas USB.
•	Raspberry Pi 2 Model B: Lançado em 2015, este modelo apresentou um processador quad-core e 1 GB de RAM, tornando-o significativamente mais poderoso do que seu antecessor.
•	Raspberry Pi 3 Model B: Lançado em 2016, este modelo trouxe melhorias significativas na conectividade, incluindo Wi-Fi e Bluetooth integrados, além de um processador mais rápido.
•	Raspberry Pi 4 Model B: Lançado em 2019, este é o modelo mais recente e poderoso da linha Raspberry Pi. Ele inclui até 8 GB de RAM, portas USB 3.0 e suporte para vídeo 4K.
Além desses modelos principais, existem também outras variações do Raspberry Pi, incluindo o Raspberry Pi 400 unit, é uma placa Raspberry Pi integrado em um teclado compacto, Raspberry Pi Zero, que é uma versão extremamente compacta e de baixo custo, e o Raspberry Pi Compute Module, que é projetado para uso em sistemas embarcados e industriais.











Imagem 16 - Raspberry Pi 400 unit - Fonte: raspberrypi.com [11]
 
3.7. Exemplos de projetos com o Raspberry Pi
Alem do Raspberry Pi poder ser programada e ainda ter a capacidade de executar um sistema operativo Linux ou Windows as possibilidades de projetos são quase ilimitados, como desde projetos simples de automação residencial até projetos mais complexos de robótica e IoT. Alguns exemplos mais comuns de projetos com o Raspberry Pi são:
Multimédia Center: Ao combinar o Raspberry Pi com softwares como o Kodi ou Plex, é possível transformá-lo num Multimédia Center para streaming de filmes, séries, músicas e fotos.
Máquina de arcade: Ao usar o Raspberry Pi com um software como o Retro PI de emulação, é possível criar uma máquina de arcade para jogar jogos clássicos.
Servidor web: Utilizando um Raspberry Pi como servidor web, é possível hospedar sites, blogs e outras aplicações web de baixo tráfego de maneira econômica.
Impressora 3D: Utilizando o Raspberry Pi com um software de controle de impressão 3D, é possível criar uma impressora 3D de baixo custo para criar objetos em casa.
Raspberry Pi Pocket Projector Project
Esses são apenas alguns exemplos de projetos com o Raspberry Pi, mas as possibilidades são infinitas e limitadas apenas pela imaginação do desenvolvedor ou entusiasta.
 
3.8. Vantagens e desvantagens do Raspberry Pi
Algumas das vantagens do Raspberry Pi incluem:

Baixo custo: O Raspberry Pi é uma das placas de desenvolvimento mais acessíveis do mercado, o que o torna uma opção viável para projetos com orçamento limitado.

Pequeno tamanho: O tamanho compacto do Raspberry Pi o torna fácil de transportar e integrar em projetos menores.

Flexibilidade: O Raspberry Pi é altamente personalizável e pode ser usado em uma ampla variedade de projetos diferentes, desde servidores até dispositivos IoT.

Grande comunidade de desenvolvedores: O Raspberry Pi tem uma grande base de usuários e uma comunidade de desenvolvedores ativa, o que significa que há muitos recursos disponíveis para ajudar a resolver problemas e desenvolver projetos.

Algumas das desvantagens do Raspberry Pi incluem:

Potência limitada: Apesar de ter uma boa relação custo-benefício, o Raspberry Pi não é tão poderoso quanto outros computadores, o que pode limitar sua capacidade de realizar tarefas mais intensivas.

Limitações de hardware: O Raspberry Pi não possui uma placa gráfica dedicada e o desempenho da rede pode ser limitado em algumas versões, o que pode restringir certos tipos de projetos.

Confiabilidade: O Raspberry Pi não foi projetado para ser usado como um computador de uso geral e pode não ser tão confiável quanto outras opções de computadores de mesa.

Dificuldades de hardware: Algumas pessoas podem ter dificuldades para conectar e configurar dispositivos externos, como sensores e câmeras, ao Raspberry Pi.
 
4. Comparação entre Arduino e Raspberry Pi
A principal diferença entre o Arduino e o Raspberry Pi é a finalidade para a qual foram projetados. O Arduino é um microcontrolador que se concentra em controlar dispositivos eletroeletrônicos em tempo real, enquanto o Raspberry Pi é um computador de placa única que oferece maior capacidade de processamento, armazenamento e conectividade.

O Arduino é mais adequado para projetos que exigem interação em tempo real, como controle de robôs, sensores e atuadores, enquanto o Raspberry Pi é mais adequado para projetos que envolvem tarefas mais complexas, como análise de dados, processamento de imagem e transmissão de vídeo.

O Arduino é mais acessível e fácil de usar para iniciantes em eletrônica e programação, enquanto o Raspberry Pi é mais adequado para usuários com mais conhecimento técnico e experiência em computação.
4.1. Projetos que combinam Arduino e Raspberry Pi
Projetos que combinam Arduino e Raspberry Pi são comuns e oferecem muitas possibilidades de integração entre dispositivos eletrônicos e computadores. Aqui estão alguns exemplos de projetos que combinam os dois:

Sistema de controle de irrigação: utilizando um Arduino para controlar as válvulas de irrigação e um Raspberry Pi para monitorar as condições climáticas e enviar comandos para o Arduino.

Robô controlado por Wi-Fi: utilizando um Arduino para controlar os motores e sensores do robô e um Raspberry Pi para enviar comandos e receber dados por Wi-Fi.

Estação meteorológica conectada à Internet: utilizando um Arduino para coletar dados dos sensores e um Raspberry Pi para enviar esses dados para a nuvem e exibi-los em um painel web.

Sistema de monitoramento e segurança: utilizando um Arduino para controlar sensores de movimento e um Raspberry Pi para enviar alertas e imagens para um servidor remoto.

Sistema de automação residencial inteligente: utilizando um Arduino para controlar dispositivos eletrônicos e um Raspberry Pi para processar dados e fornecer uma interface de usuário amigável.
 
5. Conclusão
 
6. Referências bibliográficas

[1] 	“Arduino Wikipedia,” pt.wikipedia.org, [Online]. Available: https://pt.wikipedia.org/wiki/Arduino. [Acedido em 22 03 2023].
[2] 	“Interaction Design Institute Ivrea wiki,” [Online]. Available: https://en.wikipedia.org/wiki/Interaction_Design_Institute_Ivrea. [Acedido em 22 03 2023].
[3] 	M. Banzi, “Massimo Banzi,” [Online]. Available: https://massimobanzi.com/. [Acedido em 22 03 2023].
[4] 	“Arduino was named after a bar in Ivrea,” reddit.com, [Online]. Available: https://www.reddit.com/r/arduino/comments/2ij0d5/til_arduino_was_named_after_a_bar_in_ivrea_italy/. [Acedido em 22 03 2023].
[5] 	“Arduino,” [Online]. Available: https://www.arduino.cc/. [Acedido em 21 03 2023].
[6] 	C. u. o. S. d. Temperatura, arduinoecia.com.br, [Online]. Available: https://www.arduinoecia.com.br/sensor-de-temperatura-mlx90614-arduino/. [Acedido em 23 03 2023].
[7] 	“Carro Robô Controlado Por Bluetooth,” instructables.com, [Online]. Available: https://www.instructables.com/Carro-Rob%C3%B4-Controlado-Por-Bluetooth/. [Acedido em 23 03 2023].
[8] 	“AUTOMAÇÃO RESIDENCIAL ARDUINO NO CONTROLE DE ILUMINAÇÃO PELO Telemovel,” usinainfo.com.br, [Online]. Available: https://www.usinainfo.com.br/blog/automacao-residencial-arduino-no-controle-de-iluminacao-pelo-celular/. [Acedido em 23 03 2023].
[9] 	“Venduino,” retrobuiltgames.com, [Online]. Available: http://www.retrobuiltgames.com/the-build-page/arduino-vending-machine/. [Acedido em 23 03 2023].
[10] 	“Illumaphone: Light-based Musical Instrument With Arduino,” instructables.com, [Online]. Available: https://www.instructables.com/Illumaphone-Light-based-Electronic-Musical-Instrum/. [Acedido em 23 03 2023].
[11] 	“Raspberrypi,” Raspberrypi.com, [Online]. Available: https://www.raspberrypi.com/. [Acedido em 18 04 2023].
[12] 	J. Loughran, “eandt.theiet.org,” 24 06 2019. [Online]. Available: https://eandt.theiet.org/content/articles/2019/06/raspberry-pi-4-unveiled-interview-with-founder-eben-upton/. [Acedido em 18 04 2023].
[13] 	“Department of Computer Science and Technology, University of Cambridge,” wikipedia.org, [Online]. Available: https://en.wikipedia.org/wiki/Department_of_Computer_Science_and_Technology,_University_of_Cambridge. [Acedido em 18 04 2023].
[14] 	“RaspberryPi 4 Model B,” Raspberrypi.com, [Online]. Available: https://www.raspberrypi.com/products/raspberry-pi-4-model-b/. [Acedido em 18 04 2023].




