package AcaiComTamanho;

public class Acai implements Adicional {
    Tamanho tamanho;
    public Acai(Tamanho _tamanho){
        tamanho = _tamanho;
    }

    @Override
    public String getDescricao(){
        return "Açai";
    }
    @Override
    public double custo(){
        double custo = 0.0;
        switch (tamanho) {
            case PEQUENO:
                custo = 5.00;
                break;
            case MEDIO:
                custo = 6.50;
                break;
            case GRANDE:
                custo = 8.00;
                break;
        }
        return custo;
    }
    @Override
    public Tamanho getTamanho(){
        return tamanho;
    }
}
