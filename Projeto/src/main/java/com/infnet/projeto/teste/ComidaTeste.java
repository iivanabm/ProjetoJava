package com.infnet.projeto.teste;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.infnet.projeto.exceptions.NomeException;
import com.infnet.projeto.model.Comida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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

        try {
            // Ler dados do arquivo JSON
            String jsonContent = new String(Files.readAllBytes(Paths.get("src/main/resources/comidas.json")));
            ObjectMapper objectMapper = new ObjectMapper();
            List<Comida> comidas2 = objectMapper.readValue(jsonContent, new TypeReference<List<Comida>>() {
            });

            // Arquivo de saída
            String saidaArquivo = "src/main/resources/comida.txt";

            // Abrir um BufferedWriter para escrever no arquivo de saída
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(saidaArquivo))) {
                for (Comida comida : comidas) {
                    if (comida.getNome() == null || comida.getNome().equals("")) {
                        throw new NomeException("Nome da comida é obrigatório");
                    }
                    System.out.println("Comida: " + comida.toString());
                    writer.write("Comida: " + comida.toString());
                    writer.newLine(); // Adicionar uma nova linha após cada registro
                }
            } catch (IOException e) {
                System.err.println("Erro ao escrever no arquivo de saída: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}