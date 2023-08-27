package aula19;

public class Vetores_arrays {

    public static void main(String[] args) {

       // Abaixo é um exemplo de criação errada do array, uma variavél para cada temperatura.

        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 33.1;

        // new double = cria o array, é necessário incluir o tamanho

        double  [] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        System.out.println("O valor da temperatura do 1 é: " + temperaturas[0]);

        // Saber o tamanho do array, propriedade "length

        System.out.println("O tamanho do array: " + temperaturas.length);

        // Saber o endereço na memória
        System.out.println("Valores do array: " + temperaturas);


        // Imprimir toda minha lista usando o for e sabendo indece de cada um
        for (int i=0; i<temperaturas.length;i++){

            System.out.println("O valor da temperatura do " + (i+1) + " é: " + temperaturas[i]);

        }

        // for melhorado, consegue imprimir os valores.

        for (double temp : temperaturas){
            System.out.println(temp);

        }







    }
}
