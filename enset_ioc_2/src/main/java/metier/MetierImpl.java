package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//pour lannotation
public class MetierImpl implements IMetier {
    //Couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    // avec la notion autowired il ya un conflit de deux bean
    // avec qualifier inject l instance ecrit utiliser si plusieur instance pour choisir la quelle on veut injecter
    private IDao dao;



    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    /*
    Injecter dans la variable dao un objet d'une classe qui implémente
    l'interface IDao
      */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
