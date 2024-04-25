public class Veiculos {
    //Atributos
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    //Construtores
    public Veiculos(String marca, String modelo, int ano, int velocidadeMaxima, int velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
    }

    //Getter e Setters
    public String getMarca() {
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public int getVelocidadeMaxima(){
        return velocidadeMaxima;
    }

    public int getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    //Metodos
    public void acelerar(int incremento){
        if (velocidadeAtual + incremento <= velocidadeMaxima){
            velocidadeAtual = velocidadeAtual + incremento;
        }
        else {
            System.out.println("Veiculo não vai mais rapido que isso!");
        }
    }

    public void reduzirVelocidade(int decremento){
        if (velocidadeAtual!= 0 && velocidadeAtual - decremento> = 0){
            velocidadeAtual = velocidadeAtual - decremento;
        }
        else {
            System.out.println("Veiculo já está parado!");
        }
    }

    public void obterStatus(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Velocidade Maxima: " + getVelocidadeMaxima());
        System.out.println("Velocidade Atual: " + getVelocidadeAtual());
    }
}
