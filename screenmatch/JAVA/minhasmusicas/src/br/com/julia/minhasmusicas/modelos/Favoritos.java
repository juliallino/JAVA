package br.com.julia.minhasmusicas.modelos;

public class Favoritos {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >=9){
            System.out.println(audio.getNome() + " é sucesso!");
        }
        else{
            System.out.println(audio.getNome() + " escute depois!");
        }
    }
}
