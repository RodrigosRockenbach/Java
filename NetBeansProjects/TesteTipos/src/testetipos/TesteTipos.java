package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        /*int num = 30;
        //String valor = num;
        String valor = Integer.toString(idade);
        System.out.println("O numero é " + valor + ".");*/
        
        String valor = "30.2";
        //int idade + (int) valor;
        float idade = Float.parseFloat(valor);
        System.out.printf("A idade é %.3f" , idade);
    }
    
}
