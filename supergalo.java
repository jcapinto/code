Jogo jogoDoGalo;
//------------------------------------------------------------------------------
void setup(){
  size(550,650);
  background(0);
  textFont(loadFont("courier.vlw"));
  textAlign(LEFT);
  jogoDoGalo=new Jogo();
}
//------------------------------------------------------------------------------
void draw(){
  background(0);
  jogoDoGalo.desenhar(); 
}
//------------------------------------------------------------------------------
void mouseClicked(){
  jogoDoGalo.executar();  
}
//--------------
