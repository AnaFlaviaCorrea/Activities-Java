package exerciciosaula20;

public class TesteMercearia {
    
    public static void main(String[] args) {
        
        Mercearia mercearia = new Mercearia(1000, 2);
        
        mercearia.getReceitaBruta();
        mercearia.setPrecoLaranjaVarejo(2);
        mercearia.getPrecoLaranjaVarejo();
       // System.out.println(mercearia.getReceitaBruta());
        mercearia.setPrecoLaranjaVarejo(5);
       // System.out.println( mercearia.getReceitaBruta());
        mercearia.imprimir();
    }
    
}
