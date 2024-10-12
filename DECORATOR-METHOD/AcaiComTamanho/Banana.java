package AcaiComTamanho;

public class Banana extends BaseDecorator {
    public Banana(Adicional wrappee){
        super(wrappee);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao()+" Sabor Banana";
    }
    @Override
    public double custo() {
        double custoAdicional = 0.0;
        switch (wrappee.getTamanho()) {
            case PEQUENO:
                custoAdicional = 1.25;
                break;
            case MEDIO:
                custoAdicional = 2.00;
                break;
            case GRANDE:
                custoAdicional = 2.50;
                break;
        }
        return wrappee.custo() + custoAdicional;
    }
}
