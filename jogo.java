class Jogo{
//------------------------------------------------------------------------------
  private static final int AJOGAR=0;
  private static final int RESULTADOS=1;
  private Grelha asGrelhas[][];
  private char vez;
  private int estado;
  private int pontosX;
  private int pontosO;
  private Posicao grelhaAtiva;
//------------------------------------------------------------------------------    
  public Jogo(){
    asGrelhas=new Grelha[3][];
    for(int l=0;l<3;l++)asGrelhas[l]=new Grelha[3];
    for(int l=0;l<3;l++)
      for(int c=0;c<3;c++)
        asGrelhas[l][c]=new Grelha(25+(25+3*Casa.LADO)*l,125+(25+3*Casa.LADO)*c);
    vez='x';
    estado=AJOGAR;
    pontosX=pontosO=0;
  }
//------------------------------------------------------------------------------  
  public void desenhar(){
    fill(0,255,0);
    text("Pontos: ["+pontosX+"/"+pontosO+"]",20,75);
    fill(0,100,0);
    text(vez,515,30);
    for(int l=0;l<3;l++)
      for(int c=0;c<3;c++)
        asGrelhas[l][c].desenhar();
    if(estado==RESULTADOS){
      fill(0,0,0,175);
      stroke(0,0,0,175);
      rect(130,345,290,60);
      fill(0,255,0);
      text("GAME OVER",145,390); 
    }
  }
//------------------------------------------------------------------------------  
  public void executar(){
    if(estado==RESULTADOS){
      vez='x';
      estado=AJOGAR;
      for(int l=0;l<3;l++)
        for(int c=0;c<3;c++)
          asGrelhas[l][c].limpar();
      return;
    }
    if(estado==AJOGAR){
      for(int l=0;l<3;l++)
        for(int c=0;c<3;c++){
          if(asGrelhas[l][c].executar(vez)){
            //registar a grelha ativa
            selecionar(grelhaAtiva);
            if(fimJogo())estado=RESULTADOS;
            else vez=vez=='x'?'o':'x';          
          }
        }
      pontosX=pontosO=0;
      //calcular os pontos de cada jogador
       
    }
  }
//------------------------------------------------------------------------------
  private boolean fimJogo(){
    return false;  //verificar se a grelha escolhida tem jogadas livres ou não
  }
//------------------------------------------------------------------------------
  private void selecionar(Posicao pos){
        //ativar a grelha escolhida
        //e desativar as outras
  }
//------------------------------------------------------------------------------
}
