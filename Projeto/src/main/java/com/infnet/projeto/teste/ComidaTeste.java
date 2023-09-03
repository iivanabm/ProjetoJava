package com.infnet.projeto.teste;

import com.infnet.projeto.model.Comida;

import java.util.ArrayList;
import java.util.List;

public class ComidaTeste {

    public static void main(String[] args) {
        String[] ingredientesMacarronada = {"macarrão", "queijo", "molho branco"};
        Comida macarronada = new Comida();
        macarronada.setCodigo(4);
        macarronada.setNome("Macarronda da Casa");
        macarronada.setValor(39.90f);
        macarronada.setPeso(400.00f);
        macarronada.setVegano(false);
        macarronada.setIngredientes(ingredientesMacarronada);

        String[] ingredientesPizza = {"frango", "catupiry", "queijo"};
        Comida pizza = new Comida();
        pizza.setCodigo(5);
        pizza.setNome("Pizza frango");
        pizza.setValor(59.90f);
        pizza.setPeso(500.00f);
        pizza.setVegano(false);
        pizza.setIngredientes(ingredientesPizza);

        String[] ingredientesLasanha = {"carne", "queijo", "presunto"};
        Comida lasanha = new Comida();
        lasanha.setCodigo(5);
        lasanha.setNome("Lasanha Carne");
        lasanha.setValor(19.90f);
        lasanha.setPeso(50.00f);
        lasanha.setVegano(false);
        lasanha.setIngredientes(ingredientesLasanha);

        List<Comida> comidas = new ArrayList<>();
        comidas.add(macarronada);
        comidas.add(pizza);
        comidas.add(lasanha);


//       public static void main(String[] args) {
//            try {
//                String jsonContent = new String(Files.readAllBytes(Paths.get("src/main/resources/comidas.json")));
//                ObjectMapper objectMapper = new ObjectMapper();
//                List<Comida> comidas = objectMapper.readValue(jsonContent, new TypeReference<List<Comida>>() {});
//
//                String saidaArquivo = "src/main/resources/saida_comida.txt";
//                for (Comida comida : comidas) {
//                    System.out.println("Comida: " + comida.toString());
//                    comida.imprimirComida(saidaArquivo); // Gravando em um arquivo específico
//                }
//            } catch (IOException e) {
//                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
//            }
//        }

    }

}
