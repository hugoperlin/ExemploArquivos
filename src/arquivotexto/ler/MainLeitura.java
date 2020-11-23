package arquivotexto.ler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainLeitura {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader(
                                new FileReader(
                                new File("UmArquivo.txt")))){

            String linha;

            while((linha = br.readLine())!=null ){
                System.out.println(linha);
            }



        }catch (IOException e){
            System.out.println("Erro de arquivo!! "+e.getMessage());
        }


    }
}
