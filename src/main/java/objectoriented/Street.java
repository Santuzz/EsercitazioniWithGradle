package objectoriented;

/**
 * Implementare una classe Street, che rappresenta una strada a senso unico. Il
 * costruttore accetta la lunghezza della strada in chilometri.
 *
 * insertCar() accetta un intero (km) come argomento ed aggiunge un’automobile
 * al chilometro km. L’automobile inserita percorrerà la strada alla velocità
 * di un chilometro al minuto, (60 km/h) fino alla fine della stessa.
 *
 * getCarsByPosition() riceve come parametro un intero (km) e restituisce il
 * numero di automobili presenti al chilometro km.
 *
 * progress() simula il passaggio di 1 minuto di tempo (cioè fa avanzare tutte le automobili di un chilometro).
 *
 * @author Nicola Bicocchi
 */
public class Street {
    int[] street;

    public Street(int km){
        street = new int[km];
    }

    public int[] getCars(){
        return street;
    }
    public void insertCar(int car){
        street[car] += 1;
    }
    public int getCarsByPosition(int km){
        return street[km];
    }
    public void progress(){
        if (street.length - 1 >= 0)
            System.arraycopy(street, 0, street, 1, street.length - 1);
        street[0] = 0;
    }
}
