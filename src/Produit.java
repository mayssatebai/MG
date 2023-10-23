import java.util.Date;

public class Produit {

   private int identifiant;
   private String libelle,marque;
   private float prix;
   private Date date_exp;
public Produit(){

}
    public Produit(int i,String li, String ma){
        this.identifiant=i;
        this.libelle=li;
        this.marque=ma;

    }
    public Produit(int i, String li,String ma,float p){
        this.identifiant=i;
        this.libelle=li;
        this.marque=ma;
        this.prix=p;
    }
    public Produit(int i, String li,String ma,float p, Date d){
        this.identifiant=i;
        this.libelle=li;
        this.marque=ma;
        this.prix=p;
        this.date_exp=d;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
    if(prix>=0) {
        this.prix = prix;
    }
    else{
        System.out.println("Le prix ne peux pas etre negative");
    }
    }

    public Date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

    public void afficher(){
    System.out.println("id: "+this.identifiant);
    System.out.println("libelle: "+this.libelle);
    System.out.println("marque :"+this.marque);
    System.out.println("prix :"+prix);
    System.out.println("Date :"+date_exp);

    }

    public String toString(){
    return " identifiant :"+identifiant+
            " libelle :"+libelle+
            " marque :"+marque+
            " prix :"+prix+
           " date :"+date_exp;
    }
}
