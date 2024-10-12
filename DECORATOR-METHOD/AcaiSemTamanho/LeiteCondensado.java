package AcaiSemTamanho;

public class LeiteCondensado extends BaseDecorator  {
    public LeiteCondensado(Adicional wrappee){
        super(wrappee);
    }

    @Override
    public String getDescricao(){
        return super.getDescricao()+" Sabor Leite Condensado";
    }
    @Override
    public double custo(){
        return super.custo()+10;
    }
}
