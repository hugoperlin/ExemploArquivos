package arquivotexto.ler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) {


        try(Scanner scan = new Scanner(new BufferedReader(
                new FileReader(
                        new File("UmArquivo.txt"))))){

            while(scan.hasNextLine()){
                String linha = scan.nextLine();
                System.out.println(linha);
            }
            
        }catch (IOException e){
            System.out.println("Erro de arquivo!! "+e.getMessage());
        }



    }
}
