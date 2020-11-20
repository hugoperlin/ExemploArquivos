package arquivobinario.ler;

import arquivobinario.Pessoa;

import java.io.*;

public class MainLerObjeto {

    public static void main(String[] args) {

        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(
                        new File("UmArquivoDeObjeto.bin")))){


            while(true){
                Pessoa p = (Pessoa)ois.readObject();
                System.out.println(p);
            }

        }catch (ClassNotFoundException e){
            System.out.println("Você tentou ler uma classe que não está definida!!");
        }catch (EOFException e){
            System.out.println("Fim do arquivo...");
        }catch (IOException e){
            System.out.println("Erro de arquivo!!"+e.getMessage());
        }


    }

}
