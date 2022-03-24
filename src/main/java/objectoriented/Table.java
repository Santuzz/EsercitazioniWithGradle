package objectoriented;

/**
 * Scrivere una classe Table per rappresentare tavole pitagoriche.
 * Metodi:
 *
 * Table()      costruttore senza parametri che configura una tavola 10x10
 * Table(a, b)  costruttore che configura una tavola axb
 * toString()   ritorna una stringa che rappresenta la tavola
 * double sum() ritorna la somma di tutti i numeri presenti nella tavola
 * double avg() ritorna la media di tutti i numeri presenti nella tavola
 */
public class Table {
    int a,b;

    public Table(){
        a = 10;
        b = 10;
    }

    public Table(int r, int c){
        a = r;
        b = c;
    }

    public double sum(){
        double sum = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    public double avg(){
        return sum() / (a * b);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                str.append(i * j);
                str.append("\t");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
