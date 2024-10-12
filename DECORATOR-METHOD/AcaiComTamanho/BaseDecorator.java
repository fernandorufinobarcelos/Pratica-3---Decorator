package AcaiComTamanho;

public class BaseDecorator implements Adicional{
    protected Adicional wrappee;
    
    public BaseDecorator(Adicional wrappee){
        this.wrappee = wrappee;
    }
    @Override
    public String getDescricao(){
        return wrappee.getDescricao();
    }
    @Override
    public double custo(){
        return wrappee.custo();
    }
    @Override
    public Tamanho getTamanho(){
        return wrappee.getTamanho();
    }
}
