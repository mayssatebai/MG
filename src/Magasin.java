public class Magasin {
    protected int identifiant;
    protected String adresse;
    protected Produit[]tabp;
    protected int nbp;

    public void ajouterProduit(Produit produit){
        if(nbp< tabp.length){
            tabp[nbp]=produit;
            nbp++;
        }
        else{
            System.out.println("le magasin est plein");
        }
    }
    public Magasin(int i, String a){
       this.identifiant=i;
       this.adresse=a;
       this.tabp=new Produit[50];
       this.nbp=0;
    }
    public void afficherCaracterstique(){
        System.out.println("identidiant du magasin:  "+identifiant);
        System.out.println("adresse du magasin:  "+adresse);
        System.out.println("capacité du magasin:  "+tabp.length);
        System.out.println("Produit dans le magasin");
        for(int i=0;i<nbp;i++){
           Produit produit=tabp[i];
           System.out.println("Nom: " +produit.getLibelle()+", Prix: "+produit.getPrix() );


        }
    }
}
