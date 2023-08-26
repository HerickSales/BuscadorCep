import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buscador {
    public static void main(String[] args) throws Exception {
        String cep = "\0";
        int cont = 0;
        GeradorArq gerador = new GeradorArq();
        ConsultorCep consultor = new ConsultorCep();
        Scanner scan = new Scanner(System.in);
        List<Endereco> enderecos = new ArrayList<>();

        while (!cep.equalsIgnoreCase("sair"))

        {
            try {
                System.out.println("Diga o CEP que voce deseja pesquisar");
                cep = scan.nextLine();
                // caso a primeira coisa digitrada seja Sair
                if (cep.equalsIgnoreCase("sair"))
                    break;

                enderecos.add(consultor.qualEndereco(cep));
                gerador.salvaJson(enderecos);
                enderecos.get(cont).toString();
                cont++;

            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("finalizando app");
                break;

            }

        }
        scan.close();
    }
}
