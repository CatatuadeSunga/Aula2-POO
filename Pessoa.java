public class Pessoa {
    String nome;
    int idade;
    String genero;


    double posX;
    double posY;

    public void andar(double x, double y){
        posX = x;
        posY = y;
    }

    //construtor da classe pessoa
    public Pessoa(String nome, int idade, String genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;

        posX =0;
        posY = 0;
    }

    public Pessoa(){

    }

    // métods (comportamentos)
    public void falar(String texto){
        System.out.println(texto);
    }

    public static void main(String[] args){

        Pessoa chris = new Pessoa();
        chris.nome = "Christian";
        chris.idade = 19;
        chris.genero = "Masculino";
        chris.posX = 0;
        chris.posY = 0;

        Pessoa claudiney = new Pessoa("Claudineyson",24, "Híbrido");

        chris.falar("Boa tarde!");
        claudiney.falar("Eu gosto dos dois");
    }
}

