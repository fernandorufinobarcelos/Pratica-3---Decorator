package AcaiSemTamanho;

public class TestaDecorator {
    public static void main(String[] args) {
        Adicional acaiBasico = new Acai();
        System.out.println(acaiBasico.getDescricao());
        System.out.println(acaiBasico.custo());

        Adicional acaiMorango = new Morango(new Acai());
        System.out.println(acaiMorango.getDescricao());
        System.out.println(acaiMorango.custo());

        Adicional acaiTudo = new Banana(new LeiteCondensado(new Morango(new Acai())));
        System.out.println(acaiTudo.getDescricao());
        System.out.println(acaiTudo.custo());
    }
}