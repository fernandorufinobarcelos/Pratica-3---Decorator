package AcaiSemTamanho;

public class Banana extends BaseDecorator {
    public Banana(Adicional wrappee){
        super(wrappee);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao()+" Sabor Banana";
    }
    @Override
    public double custo(){
        return super.custo()+7;
    }
}
