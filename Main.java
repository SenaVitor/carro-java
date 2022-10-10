class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro();
    carro1.modelo = "FUSCA";
    carro1.rodas = new Roda[4];
    for (int i = 0; i < 5; i++) {
      Aro aro = new Aro();
      aro.diametro = 14;
      aro.material = "Liga Leve";
      aro.modelo = "SeiLa";

      Pneu pneu = new Pneu();
      pneu.diametro = 14;
      pneu.pressao = 30;
      pneu.perfil = 175;

      Roda roda = new Roda();
      roda.aro = aro;
      roda.pneu = pneu;
      if(i < 4){
        carro1.rodas[i] = roda;
      }else{
        carro1.estepe = roda;
      }
    
    }

    Motor motor = new Motor();
    motor.potencia = 100;
    carro1.motor = motor;

    TanqueCombustivel tanque = new TanqueCombustivel();
    tanque.capacidadeMaxima = 45;
    tanque.volumeAtual = 15;
    carro1.tanque = tanque;
    
    Roda rodaAux = carro1.rodas[0];
    carro1.rodas[0] = carro1.estepe;
    carro1.estepe = rodaAux;
    System.out.println("Trocou o Pneu!");
  }
}
