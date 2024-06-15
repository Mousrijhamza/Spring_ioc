package DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("DAO")
public class daoImpl implements dao {

    @Override
    public Integer getData() {
        System.out.print("Version BDR : ");
        return 13;
    }
}
