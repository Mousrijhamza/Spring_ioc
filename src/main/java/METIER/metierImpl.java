package METIER;
import DAO.*;



public class metierImpl implements metier {
    dao d ;

    public metierImpl() {
    }
    public metierImpl(dao d) {
        this.d = d;
    }

    @Override
    public double calcul(double coeff) {
        System.out.println("Voici :");
        return d.getData() * coeff;
    }

    public void setD(dao d) {
        this.d = d;
    }
}
