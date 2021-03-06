package fr.parisnanterre.poa.Visiteur;

/**
 * Created by thsartre on 04/12/2017.
 */
public class Visitor2 implements Visitor {
    @Override
    public void visit(Univers e) {
        for(Piece p : e.pieces){
            p.accept(this);
        }
        System.out.println("Je suis un univers");
    }

    @Override
    public void visit(Vetement e) {
        System.out.println("Je suis un vetement");
    }

    @Override
    public void visit(Piece e) {
        for(Truc t : e.trucs){
            t.accept(this);
        }
        System.out.println("Je suis une pi�ce");
    }

    @Override
    public void visit(Lit e) {
        System.out.println("Je suis un lit");
    }

    @Override
    public void visit(Lamp e) {
        System.out.println("Je suis une lampe");
    }

    @Override
    public void visit(GardeRobe e) {
        for(Vetement v : e.vetements){
            v.accept(this);
        }
        System.out.println("Je suis une garde robe");
    }

    @Override
    public void visit(CollectionDeLivres e) {
        System.out.println("Je suis une collection de " + e.getNbLivres() + " livre(s)");
    }

    @Override
    public void visit(Bureau e) {
        for(Truc t : e.trucs){
            t.accept(this);
        }
        System.out.println("Je suis un bureau");
    }
}
