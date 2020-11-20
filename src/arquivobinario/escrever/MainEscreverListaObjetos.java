package arquivobinario.escrever;

import arquivobinario.Pessoa;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainEscreverListaObjetos {

    public static void main(String[] args) {


        ArrayList<Pessoa> lista = new ArrayList<>();

        lista.add(new Pessoa("Zé Teste",34,1.89) );
        lista.add(new Pessoa("Maria Teste",20,1.65));
        lista.add(new Pessoa("Chico Teste",87,1.52));


        try(ObjectOutputStream obs = new ObjectOutputStream(
                new FileOutputStream(
                        new File("UmArquivoDeListaObjeto.bin")))){

            obs.writeObject(lista);


        }catch (IOException e){
            System.out.println("Erro ao de arquivo!!"+e.getMessage());
        }
    }

}
