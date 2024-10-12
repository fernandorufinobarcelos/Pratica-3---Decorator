package AcaiComTamanho;

public class TestaDecorator {
    public static void main(String[] args) {
        System.out.println("Açao Basico Pequeno");
        Adicional acaiBasicoPequeno = new Acai(Tamanho.PEQUENO);
        System.out.println(acaiBasicoPequeno.getDescricao());
        System.out.println(acaiBasicoPequeno.custo());
        System.out.println("Açao Basico Medio");
        Adicional acaiBasicoMedio = new Acai(Tamanho.MEDIO);
        System.out.println(acaiBasicoMedio.getDescricao());
        System.out.println(acaiBasicoMedio.custo());
        System.out.println("Açao Basico Grande");
        Adicional acaiBasicoGrande = new Acai(Tamanho.GRANDE);
        System.out.println(acaiBasicoGrande.getDescricao());
        System.out.println(acaiBasicoGrande.custo());

        System.out.println("Açao Com Morango Pequeno");
        Adicional acaiMorangoPequeno = new Morango(new Acai(Tamanho.PEQUENO));
        System.out.println(acaiMorangoPequeno.getDescricao());
        System.out.println(acaiMorangoPequeno.custo());
        System.out.println("Açao Com Morango Medio");
        Adicional acaiMorangoMedio = new Morango(new Acai(Tamanho.MEDIO));
        System.out.println(acaiMorangoMedio.getDescricao());
        System.out.println(acaiMorangoMedio.custo());
        System.out.println("Açao Com Morango Grande");
        Adicional acaiMorangoGrande = new Morango(new Acai(Tamanho.GRANDE));
        System.out.println(acaiMorangoGrande.getDescricao());
        System.out.println(acaiMorangoGrande.custo());

        System.out.println("Açao Com Morango Pequeno");
        Adicional acaiTudoPequeno = new Banana(new LeiteCondensado(new Morango(new Acai(Tamanho.MEDIO))));
        System.out.println(acaiTudoPequeno.custo());
        System.out.println("Açao Com Morango Medio");
        Adicional acaiTudoMedio = new Banana(new LeiteCondensado(new Morango(new Acai(Tamanho.MEDIO))));
        System.out.println(acaiTudoMedio.getDescricao());
        System.out.println(acaiTudoMedio.custo());
        System.out.println("Açao Com Morango Grande");
        Adicional acaiTudoGrande = new Banana(new LeiteCondensado(new Morango(new Acai(Tamanho.MEDIO))));
        System.out.println(acaiTudoGrande.getDescricao());
        System.out.println(acaiTudoGrande.custo());
    }
}
