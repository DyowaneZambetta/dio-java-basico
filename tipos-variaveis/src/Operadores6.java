public class Operadores6 {
    
    public static void main(String[] args) {
        String nomeUm = "Dyowane";
        String nomeDois = new String("Dyowane");
        
        System.out.println(nomeUm.equals(nomeDois));       
                
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("O numero um é igual ao numero dois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("O numero um é diferente do numero dois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("O numero um é maior que o numero dois? " + simNao);
    } 
}
