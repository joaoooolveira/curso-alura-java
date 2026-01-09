package Mains;

import horaDaPratica.classes.Arraylist.TituloCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainCollections {
    static void main() {
        TituloCollections titulo1 = new TituloCollections("Código Limpo");
        TituloCollections titulo2 = new TituloCollections("O Programador Pragmático");
        TituloCollections titulo3 = new TituloCollections("Use a cabeça JAVA");
        TituloCollections titulo4 = new TituloCollections("Aprenda Programação Funcional");

        List<TituloCollections> listaDeTitulos= new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo4);

        Collections.sort(listaDeTitulos);

        for(TituloCollections titulos : listaDeTitulos)
        System.out.println(titulos);
    }
}
