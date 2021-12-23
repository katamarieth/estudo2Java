package javaDio;

public class Emprestimo {
    public static int duasParcelas(){
        return 2;
    }
    public static int tresParcelas(){
        return 3;
    }
    public static double taxaDuasParcelass(){
        return 0.3;
    }
    public static double taxaTresParcela(){
        return  0.45;
    }
    public static void calcular(double valor, int parcelas){
        if(parcelas == 2){
            double valorFinal = valor + (valor * taxaDuasParcelass());
            System.out.println("Valor para o emprestimo de dois parcelas: R$" + valorFinal);
        }else if (parcelas == 3){
            double valorFinal = valor + (valor * taxaTresParcela());
            System.out.println("Valor para o emprestimo de tres parcelas: R$" + valorFinal);
        }else {
            System.out.println("Parcela invalida, selecione 2 ou 3.");
        }
    }
}
