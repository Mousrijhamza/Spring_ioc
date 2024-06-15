package METIER;
import DAO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service("METIER")
public class metierImpl implements metier {

    private dao d ;

//    public metierImpl() {
//    }
    public metierImpl(@Qualifier("DAO2") dao d) {
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
