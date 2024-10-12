package AcaiSemTamanho;
public class Morango extends BaseDecorator {
    public Morango(Adicional wrappee){
        super(wrappee);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao()+" Sabor Morango";
    }
    @Override
    public double custo(){
        return super.custo()+5;
    }
}
