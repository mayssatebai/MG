
import java.util.Date;
public class Main {
    public static void main(String[]arg){
        Produit p1=new Produit();
        System.out.println(p1.getIdentifiant());
        System.out.println(p1.getLibelle());
        System.out.println(p1.getMarque());
        System.out.println(p1.getPrix());
        Produit p2=new Produit(1021,"Lait","Delice");
        System.out.println("id :"+p2.getIdentifiant());
        System.out.println("libelle :"+p2.getLibelle());
        System.out.println("marque :"+p2.getMarque());
        Produit p3=new Produit(2510,"Yaourt","Vitalait");
        System.out.println(p3.getIdentifiant());
        System.out.println(p3.getLibelle());
        System.out.println(p3.getMarque());
        Produit p4=new Produit(3250,"Tomate","Sicam",1.200f);
        System.out.println(p4.getIdentifiant());
        System.out.println(p4.getLibelle());
        System.out.println(p4.getMarque());
        System.out.println(p4.getPrix());
        System.out.println("tester la methode afficher");
        p2.afficher();
        p3.afficher();
        p4.afficher();

    Date d1=new Date();
    p2.setDate_exp(d1);
    p3.setDate_exp(d1);
    p4.setDate_exp(d1);
        System.out.println("methode toString");
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        Magasin m1=new Magasin(1001,"2rue6250");
       m1.ajouterProduit(p2);
        m1.ajouterProduit(p3);
        m1.ajouterProduit(p4);
        m1.afficherCaracterstique();












    }
}
