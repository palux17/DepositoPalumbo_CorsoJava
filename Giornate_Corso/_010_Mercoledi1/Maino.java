public class Maino {

    public static void main(String[] args) {

        Outfit outfit = new Outfit();

        Giacca giacca = new Giacca("G1", "Giacca Elegante", "Lana", "Nero", "M", 120, 2);
        Pantalone pantalone = new Pantalone("P1", "Pantalone Classico", "Cotone", "Nero", "M", 80, "Slim");
        Gilet gilet = new Gilet("GL1", "Gilet Formale", "Lana", "Nero", "M", 60, true);

        Cravatta cravatta = new Cravatta("C1", "Cravatta Rossa", "Seta", "Rosso", 25, 7);
        Papillon papillon = new Papillon("PAP1", "Papillon Nero", "Seta", "Nero", 20, "Clip");
        Pochette pochette = new Pochette("PO1", "Pochette Bianca", "Cotone", "Bianco", 15, "Ventaglio");

        outfit.aggiungiCapo(giacca);
        outfit.aggiungiCapo(pantalone);
        outfit.aggiungiCapo(gilet);

        outfit.aggiungiComponente(cravatta);
        outfit.aggiungiComponente(papillon);
        outfit.aggiungiComponente(pochette);

        outfit.stampaOutfit();
    }
}