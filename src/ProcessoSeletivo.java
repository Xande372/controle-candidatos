import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessoSeletivo {

    public static void main(String[] args) throws Exception {

        Scanner respostaUsuario = new Scanner(System.in);
        List<String> informacoesUsuario = new ArrayList<>();

        System.out.println("= = = Bem-vindo à candidatura para Java Juniors = = =");

        // adicionando linguagem estudada
        System.out.println("1° - Qual linguagem você tem conhecimento?");
        String linguagem = respostaUsuario.nextLine();
        informacoesUsuario.add(linguagem);

        // adicionando localidade
        System.out.println("2° - De qual estado você é? (apenas sigla)");
        String localidade = respostaUsuario.nextLine();
        informacoesUsuario.add(localidade);

        // adicionando conhecimento em Spring Boot
        System.out.println("3° - Tem conhecimento na ferramenta Spring Boot? (responda \"sim\" ou \"não\")");
        String ferramenta = respostaUsuario.nextLine();
        informacoesUsuario.add(ferramenta);

        // adicionando pretensão salarial
        System.out.println("4° - Responda sua pretensão salarial: ");
        String pretensaoSalarial = respostaUsuario.nextLine();
        informacoesUsuario.add(pretensaoSalarial);

        // requisitos para vaga
        List<String> requisitos = new ArrayList<>();
        requisitos.add("Java");
        requisitos.add("SP");
        requisitos.add("sim");
        requisitos.add("2000");

        System.out.println("Informações do usuário: " + informacoesUsuario);
        System.out.println("Requisitos da vaga: " + requisitos);

        respostaUsuario.close();

        boolean aprovado = true;
        for (int i = 0; i < informacoesUsuario.size(); i++) {
            if (!informacoesUsuario.get(i).equalsIgnoreCase(requisitos.get(i))) {
                aprovado = false;
                break;
            }
        }

        if (aprovado) {
            System.out.println("Candidato Aprovado!");
        } else {
            System.out.println("Candidato Reprovado!");
        }
    }
}