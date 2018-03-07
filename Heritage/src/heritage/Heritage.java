package heritage;

import fr.beweb.lunel.algo.poo.heritage.Animal;
import fr.beweb.lunel.algo.poo.heritage.Araignee;
import fr.beweb.lunel.algo.poo.heritage.Chat;
import fr.beweb.lunel.algo.poo.heritage.Chien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yannis
 */
public class Heritage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Chien p = new Chien();
        Chat c = new Chat();
        c.grimpArbre();
        Araignee a = new Araignee();
        
        List<Animal> animaux = new ArrayList<Animal>();
        animaux.add(p);
        animaux.add(new Chat());
        animaux.add(new Chien());
        animaux.add(new Chat());
        animaux.add(new Araignee());
        animaux.add(c);
        animaux.add(a);
        animaux.add(a);
        animaux.add(new Chat());
        animaux.add(new Chat());
        
        for(Animal element : animaux) {
            element.emettreSon();
            if (element instanceof Chat) {
                ((Chat)element).grimpArbre();
            }
        }
        
        
        
        
    }
    
}
