package arquivotexto.escrever;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainTryResources {


    public static void main(String[] args) {


        try(BufferedWriter bw = new BufferedWriter(
                                 new FileWriter(
                                 new File("UmArquivo.txt")))){


            bw.write("Esta é uma linha de um arquivo");
            bw.newLine();
            bw.write("Se quiser escrever um número:"+10);
            bw.newLine();


        }catch (IOException e){
            System.out.println("Erro de arquivo:"+e.getMessage());
        }
    }
}
