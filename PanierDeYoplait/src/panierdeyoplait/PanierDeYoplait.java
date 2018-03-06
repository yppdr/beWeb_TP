/**      

                                                         `.`    
                                                     ```.::.    
                                                    `.::;;;.    
                                                    `,;''';.    
                                                    `:;''';.    
                                                    `,;''';.    
                                                    `,;''';.    
                                                    `,;''';.    
                                                    `,;''';.    
                                                    `,;''';.    
                                                    `,;''';,    
                                                    `,;''';,`   
                                                    `,;''';,`   
                                                    `.;''';,`   
                                                    `.;''';,`   
       `                                             .;''';,`   
     `.,.                                            .;''';,`   
 ``.,::;:`                                           .;''';,`   
 `.:;;'';,                                           .;''';:`   
 `.:;''';:.                                          .;''';:`   
  `.;'''';:`                                         .;''';:`   
   `:;'''';,                     `.,.`               .;''';:`   
    .:'''';:`                   .::;:.               .;''';:.   
    `,;'''';,`                 `,;;';:.              .:''';:.   
     `:;'''';.                 `,;''';:`             `:''';:.   
      .;;''';:`                `:;'''';:`            `:''';:.   
      `,;'''';,`               `:;''''';,`           `:''';:.   
       .:;''';:.               `:;''''';;.           `:''';;.   
       `,;'''';:`              `:;'''''';:.          `:''';;.   
        `:;''';;.              .:;''''''';:`         `:''';;.   
         .:;''';:`             .:;'''''''';,`        `:''';;.   
         `,;'''';,`            .;;''''''''';,`       `:''';;.   
          `:;'''';.            .;''';;;;''';;.       `:'''';.   
           .;'''';:`           ,;''';:,;;''';:.      `:'''';.   
           `,;'''';,`         `,;''';,`,;'''';,`     `:'''';.   
            `:'''';:.         `,;''';, `:;'''';,`    `:'''';.`  
            `,;'''';,`        `,;''';,  .:'''';;,    `:'''';.`  
             `:;'''';.        `,;''';,   ,;;'''';.   `:'''';.`  
              .:;''';:.       `:;''';.   `,;'''';:.  `:;''';.`  
              `,;'''';,`      `:;''';.    `:;'''';,` `:;''';.`  
               `:;''';;.      `:;''';.     .:;'''';, `,;''';,`  
                .;'''';:`     `:;'';:.      .;'''';:.`,;''';,`  
                `,;'''';,     `:;'';:.      `,;'''';:.,;''';,`  
                 `:'''';:.    `:;'';:`       `,;'''';::;;'';,`  
                  ,;'''';:`   `:''';,`        `:;'''';;;''';,`  
                  `,;'''';.`  `:''';,`         .:;'''';'''';,`  
                   .;;''';:`  `:''';,`         `.;''''''''';,`  
                   `,;'''';,` `:''';.           `,;'''''''';,`  
                    `:;'''';. .;''';.            `:;''''''';,`  
                     .;'''';:`.;''';.             .:;'''''';,`  
                     `,;''';;,,;''';.              .;;''''';,`  
                      .:;''';;:;''';.              `,;''''';,`  
                       ,;'''';;;''';`               `,;'''';,`  
                       `,;''''''''';`                `:;'';;,`  
                        .;;''''''';:`                 .:;;:,``  
                        `,;''''''';:`                  .,.`     
                         `:;'''''';:`                           
                          .;'''''';:`                           
                          `:;''''';:`                           
                           .:;'''';:`                           
                            ,;'''';:`                           
                            `:;;;;;,`                           
                             .;;:,.`                            

**/
package panierdeyoplait;

/**
 *
 * @author Yannis Piot Pilot
 */
public class PanierDeYoplait {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Define des prix en float **/
        float[] prix = new float[5]; 
        prix[0] = 15.50F;
        prix[1] = 55.12F;
        prix[2] = 79.10F;
        prix[3] = 3.50F;
        prix[4] = 69.69F;
        /** Define des noms en String**/
        String[] nom = new String[5]; 
        nom[0] = "Produit 1";
        nom[1] = "Produit 2";
        nom[2] = "Produit 3";
        nom[3] = "Produit 4";
        nom[4] = "Produit 5";
        /** Get nombre d'entrer du tab **/
        int Nbrprix = prix.length;
        /** Define var default **/
        float total = 0;
        float max = prix[0];
        float min = prix[0];
        /** Boucle : i = Index de la table  **/
        for (int i = 0; i < Nbrprix; i++) {
           /** Calcule le toto des prix **/    
           total += prix[i];
           /** Regarde le prix le plus haut et le plus bas **/
           /* Max */
           if(prix[i]>max){
               max = prix[i];
           }
           /* Min */
           if(prix[i]<min){
               min = prix[i];
           }
           /** Affiche le prix avec un nom via l'index **/
           System.out.println(prix[i] + "€ - " + nom[i]);       
        }
        /** System.out.println de toute nos variable  **/
        System.out.println("--------------------------------------");
        System.out.println("Mon panier est de : " + total + " €");
        System.out.println("--------------------------------------");
        System.out.println("L'article qui coute le plus chere est : " + max + " €");
        System.out.println("--------------------------------------");
        System.out.println("L'article qui coute le moins chere est : " + min + " €");
    }
}
