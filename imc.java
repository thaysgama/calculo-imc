import java.util.Scanner;


public class Imc {
    
    public static void main(String[] args) {
        System.out.println("Bem vindo ao programa de cálculo de IMC \n");
    
        Scanner input = new Scanner (System.in);

        System.out.println("Precisaremos que insira alguns alguns dados pessoais para conseguirmos gerar o cálculo, tudo bem? \n");
        System.out.println("Insira '1' para Sim e '2' para não \n");
        int resultado = input.nextInt();

        if (resultado == 1) 
        {
            System.out.println("Show! Me conta o seu nome! \n");
            String nome = input.next();

            System.out.println("Olá " + nome + " !");
            System.out.println("Me conta agora sua altura... [Exemplo: 1,70] \n");
            System.out.println("Não vale mentir hein... \n");
            double altura = input.nextDouble();

            System.out.println("Falta agora só o seu peso...Diz aí [Exemplo: 60,5] \n");
            System.out.println("Estamos quase lá... \n");
            double peso = input.nextDouble();

            double IMC = peso / ((altura)*(altura));
            System.out.println("Seu IMC =" + IMC);

            

            if (IMC < 16) {
                System.out.println("Seu índice é considerado magreza grave. Procure um médico para avaliar sua situação e não deixe de comer feijão.\n");
            };
            if (IMC>=16 & IMC < 17) {
                System.out.println("Seu índice é considerado magreza moderada. Coma mais feijão e esteja esperto com a sua saúde. Em caso de preocupação, consulte um médico.\n");
            };
            if (IMC>=17 & IMC < 18.5) {
                System.out.println("Seu índice é considerado magreza leve. Chama a nutri pra incluir mais feijão na dieta.\n");
            };
            if (IMC>=18.5 & IMC < 25) {
                System.out.println("Seu índice é considerado saudável. Por enquanto... Deixe a cachaça e as fritas de lado.\n");
            };
            if (IMC>=25 & IMC < 30) {
                System.out.println("Seu índice é considerado sobrepeso. É bom manter a atividade física e acompanhar as taxas com o médico.\n");
            };
            if (IMC>=30 & IMC < 35) {
                System.out.println("Seu índice é considerado Obesidade grau I. Consulte um médico para avaliar sua situação.\n");
            };
            if (IMC>=35 & IMC < 40) {
                System.out.println("Seu índice é considerado Obesidade grau II, severa. Consulte um médico para avaliar sua situação.\n");
            };
            if (IMC >= 40) {
                System.out.println("Seu índice é considerado Obesidade grau III, mórbida. Consulte um médico para avaliar sua situação. \n");
            };


        }
        if (resultado == 2) {
            System.out.println("Tranquilo. Quem precisa de IMC não é mesmo?");
        }
        

    }
}
