package arquivobinario.escrever;

import arquivobinario.Pessoa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainEscreverObjeto {


    public static void main(String[] args) {

        try(ObjectOutputStream obs = new ObjectOutputStream(
                                     new FileOutputStream(
                                     new File("UmArquivoDeObjeto.bin")))){

            Pessoa p = new Pessoa("Zé Teste",34,1.89);

            obs.writeObject(p);


        }catch (IOException e){
            System.out.println("Erro ao de arquivo!!"+e.getMessage());
        }
    }

}
