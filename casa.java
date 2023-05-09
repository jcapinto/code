class Casa{
//------------------------------------------------------------------------------  
  private char conteudo;
  private int x,y;
  private boolean vitoria;
  public static final int LADO=50;
  private static final int PADDING=5;
  private boolean ativo;
//------------------------------------------------------------------------------  
  public Casa(){
    conteudo=' ';
    x=0;
    y=0;
    vitoria=false;
    ativo=true;
  }
//------------------------------------------------------------------------------  
  public Casa(int _x,int _y){
    conteudo=' ';
    vitoria=false;
    setCoordenadaX(_x);
    setCoordenadaY(_y);
    ativo=true;
  }
//------------------------------------------------------------------------------  
  public char getConteudo(){
    return conteudo;
  }
//------------------------------------------------------------------------------  
  public void ativar(){
    ativo=true;
  }
//------------------------------------------------------------------------------  
  public void desativar(){
    ativo=false;
  }
//------------------------------------------------------------------------------ 
  public boolean estaLivre(){
    return conteudo==' ';
  }
//------------------------------------------------------------------------------  
  public boolean tem(char simb){
    return conteudo==simb;
  }
//------------------------------------------------------------------------------  
  public void setConteudo(char simbolo){
     if(simbolo==' ' || simbolo=='x' || simbolo=='o')
       conteudo=simbolo;
      else conteudo=' ';
  }
//------------------------------------------------------------------------------ 
  public int getCoordenadaX(){
    return x;
  }
//------------------------------------------------------------------------------  
  public int getCoordenadaY(){
    return y;
  }
//------------------------------------------------------------------------------  
  public void setCoordenadaX(int _x){
    x=_x;
    x=x<0?0:x;
    x=x>width-LADO?width-LADO:x;
  }
//------------------------------------------------------------------------------
  public void setCoordenadaY(int _y){
    y=_y;
    y=y<0?0:y;
    y=y>height-LADO?height-LADO:y;
  }
//------------------------------------------------------------------------------  
  public boolean getVitoria(){
    return vitoria;
  }
//------------------------------------------------------------------------------  
  public void setVitoria(boolean vit){
    vitoria=vit;
  }
//------------------------------------------------------------------------------  
  public void desenhar(){
    strokeWeight(5);    
    if(ativo){
      fill(0,125,125);
      stroke(0,125,125);
    }
    else {
      fill(125,125,125);
      stroke(125,125,125);
    }    
    rect(x,y,LADO,LADO);    
    //desenhar o simbolo
    if(conteudo==' ')return;
    if(vitoria)stroke(255,255,0);
    else stroke(255);
    if(conteudo=='x'){
      line(x+PADDING,y+PADDING,x+LADO-PADDING,y+LADO-PADDING);
      line(x+PADDING,y+LADO-PADDING,x+LADO-PADDING,y+PADDING);
    }
    if(conteudo=='o'){
      ellipse(x+LADO/2,y+LADO/2,LADO-2*PADDING,LADO-2*PADDING);
    } 
  }
//------------------------------------------------------------------------------  
  public boolean foiClicada(){
    return (mouseX>=x && mouseX<=x+LADO && mouseY>=y && mouseY<=y+LADO);
  }
//------------------------------------------------------------------------------  
  public void limpar(){
    conteudo=' ';
    vitoria=false;
    ativo=true;
  }
//------------------------------------------------------------------------------
}
