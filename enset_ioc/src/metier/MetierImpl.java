package metier;
import dao.IDao;

public class MetierImpl implements IMetier {
    //Couplage faible si on utilise new donc couplage fort
    private IDao dao;
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
