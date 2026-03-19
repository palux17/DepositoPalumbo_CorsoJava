public class ProvaVariabile {
    public static void main(String[] args) {
        /*Primitive
        I tipi primitivi sono intrinsechi a java mentre i non primitivi vengono definiti dal programmatore (eccetto String)
        char
        String
        int
        float
        boolean
         */

        //char
        /*I char sono legati all'ASCII
        var65 = A, var66 = B */
        
        // int
        int provaNumero = 12;
        System.out.println(provaNumero);
        int x=1, y=2, z= 3;
        System.out.println(x+y+z);

        //String
        /* Le Stringhe hanno i metodi */
        String provaTesto = "Ciao Mondo";
        String firstpart = "Ciaoooooo";
        String lastpart = "Mondooooo";
        String fullpart = firstpart + lastpart;
        System.out.println(provaTesto);
        System.out.println("Ciao " + lastpart);
        System.out.println(firstpart + lastpart);
        System.out.println(fullpart);
        System.out.println(lastpart.charAt(0));

        //boolean
        boolean provaBool = true;
        System.out.println(provaBool);

        //costanti
        final int PROVANUMEROO = 15;
        //PROVANUMEROO = 25;    errore poiché final non permette di cambiare ulteriormente la variabile
        System.out.println(PROVANUMEROO);

    }
}
