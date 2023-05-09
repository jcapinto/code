class Grelha{
  private Casa [][]asCasas;
  private int x,y;
  private boolean ativo;
//------------------------------------------------------------------------------  
  public Grelha(int _x,int _y){
    ativo=true;
    setCoordenadaX(_x);
    setCoordenadaY(_y);
    asCasas=new Casa[3][];
    for(int i=0;i<3;i++)asCasas[i]=new Casa[3];
    for(int l=0;l<3;l++)
      for(int c=0;c<3;c++)
        asCasas[l][c]=new Casa(x+l*Casa.LADO,y+c*Casa.LADO);   
  }
//------------------------------------------------------------------------------  
  public boolean executar(char simb){
    //em vez de retornar um boolean com o sucesso (ou insucesso) do click
    //retornar a posição, linha e coluna, para ativar a grelha correta no
    //tabuleiro e desativas as outras
    if(ativo)
      for(int l=0;l<3;l++)
        for(int c=0;c<3;c++){ 
            if(asCasas[l][c].foiClicada()){
                if(asCasas[l][c].estaLivre()){
                  asCasas[l][c].setConteudo(simb);
                  return true;
                }
                else return false; 
            }
         }
    return false;
  }
//------------------------------------------------------------------------------  
  public void ativar(){
    //marcar esta grelha como ativa
    //e ativar cada uma das suas casas
  }
//------------------------------------------------------------------------------  
  public void desativar(){
    //igual à função anterior mas
    //a marcar esta grelha como inativa
    //e desativar cada uma das suas casas
  }
//------------------------------------------------------------------------------  
  public void desenhar(){
    for(int l=0;l<3;l++)
      for(int c=0;c<3;c++)
        asCasas[l][c].desenhar();
    strokeWeight(2);
    stroke(0);
    line(x+Casa.LADO,y,x+Casa.LADO,y+3*Casa.LADO);
    line(x+2*Casa.LADO,y,x+2*Casa.LADO,y+3*Casa.LADO);
    line(x,y+Casa.LADO,x+3*Casa.LADO,y+Casa.LADO);
    line(x,y+2*Casa.LADO,x+3*Casa.LADO,y+2*Casa.LADO);
  }
//------------------------------------------------------------------------------  
  public void setCoordenadaX(int _x){
    x=_x;
    x=x<0?0:x;
    x=x>width-3*Casa.LADO?width-3*Casa.LADO:x;
  }
//------------------------------------------------------------------------------  
  public void setCoordenadaY(int _y){
    y=_y;
    y=y<0?0:y;
    y=y>height-3*Casa.LADO?height-3*Casa.LADO:y;
  }
//------------------------------------------------------------------------------  
  public void limpar(){
    for(int i=0;i<3;i++)
      for(int j=0;j<3;j++)
        asCasas[i][j].limpar();
    ativo=true;
  }
//------------------------------------------------------------------------------  
  public boolean empate(){
    for(int i=0;i<3;i++)
      for(int j=0;j<3;j++)
        if(asCasas[i][j].estaLivre())
          return false;
     return true;
  }
//------------------------------------------------------------------------------  
  public boolean vitoria(char simb){
    
    //em vez de retornar simplesmente se houve vitoria ou não
    //esta função tem agora que retornar QUANTAS linhas encontrou com o simbolo
    
    for(int lin=0;lin<3;lin++) //horizontais
      if(asCasas[lin][0].tem(simb)&&
         asCasas[lin][1].tem(simb)&&
         asCasas[lin][2].tem(simb)){
           asCasas[lin][0].setVitoria(true);
           asCasas[lin][1].setVitoria(true);
           asCasas[lin][2].setVitoria(true);
           return true;
      }
    for(int col=0;col<3;col++) //verticais
      if(asCasas[0][col].tem(simb)&&
         asCasas[1][col].tem(simb)&&
         asCasas[2][col].tem(simb)){
           asCasas[0][col].setVitoria(true);
           asCasas[1][col].setVitoria(true);
           asCasas[2][col].setVitoria(true);
           return true;
      }      
    if(asCasas[0][0].tem(simb)&& //diagonal descendente
       asCasas[1][1].tem(simb)&&
       asCasas[2][2].tem(simb)){
         asCasas[0][0].setVitoria(true);
         asCasas[1][1].setVitoria(true);
         asCasas[2][2].setVitoria(true);
         return true;
    }
    if(asCasas[0][2].tem(simb)&& //diagonal ascendente
       asCasas[1][1].tem(simb)&&
       asCasas[2][0].tem(simb)){
         asCasas[0][2].setVitoria(true);
         asCasas[1][1].setVitoria(true);
         asCasas[2][0].setVitoria(true);
         return true;
    }      
    return false;
  }
//------------------------------------------------------------------------------  
}
