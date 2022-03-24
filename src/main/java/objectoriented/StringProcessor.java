package objectoriented;

import java.util.Arrays;

/**
 * Implementare una classe StringProcessor per effettuare operazioni su array di stringhe.
 * Metodi:
 *
 * public StringProcessor(String[] v): Costruttore
 * public int findShortest(): ritorna l'indice della stringa più corta
 * public int search(String key): ritorna l'indice dell'elemento key. -1 se non trovato.
 * public void reverse(): capovolge l'ordine delle stringhe
 * public boolean equals(Object obj)
 *
 * @author Nicola Bicocchi
 */
public class StringProcessor {
        String[] str;
    public StringProcessor(String[] v){
        str = v;
    }

    public int findShortest(){
        int min = str[0].length();

        for (int i = 0; i < str.length; i++) {
            if(min > str[i].length()){
                min = i;
            }
        }
        return min;
    }

    public int search(String key){
        int index = -1;

        for(int i = 0; i < str.length; i++){
            if(str[i].equals(key)){
                index = i;
            }
        }
        return index;
    }

    public void reverse(){
        for (int i = 0; i < str.length/2; i++) {
            String tmp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = tmp;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
