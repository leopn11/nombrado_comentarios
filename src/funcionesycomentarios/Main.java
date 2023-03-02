package funcionesycomentarios;

public class Main
{
    public static void main(String[] args) {

       int multiplica = multiplicacionInfinita(2,3,4,5,6,7,8,9);
        System.out.println(multiplica);

        boolean menor = esMenor(57843, 45666);
        System.out.println(menor);

    }

    /**
     *
     * @param cifra Pasa parametros sin restriccion.
     * @return residuo guarda la multiplicacion del primer parametro y multiplica por el siguiente.
     */
    public static int multiplicacionInfinita(int ...cifra){
        int residuo = 1;
        for (int cifras : cifra){
            residuo *= cifras;
        }
        return residuo;
    }

    /**
     *
     * @param a parametro a el que se requiera.
     * @param b parametro b el que se requiera.
     * @return retorna si es menor el parametro a que el b.
     */
    private static boolean esMenor(int a, int b)
    {
        return a < b ? true : false;
    }


}
