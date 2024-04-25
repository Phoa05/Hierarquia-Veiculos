public class Carro extends Veiculos{
    //Atributos
    private boolean ligado = false;
    private String arCondicionado;
    public Carro(String marca, String modelo, int ano, int velocidadeMaxima, int velocidadeAtual, String arCondicionado) {
        super(marca, modelo, ano, velocidadeMaxima, velocidadeAtual);
        this.arCondicionado = arCondicionado;
    }

    //Getter e Setter
    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(String arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    //Metodos
    public void statusArCondicionado(boolean ligado){
        if (ligado = true){
            arCondicionado = "ligado";
        }
        else{
            arCondicionado = "desligado";
        }
    }
}
