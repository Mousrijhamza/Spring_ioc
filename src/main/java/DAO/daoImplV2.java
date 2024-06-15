package DAO;

import org.springframework.stereotype.Repository;

@Repository("DAO2")
public class daoImplV2 implements dao {

    @Override
    public Integer getData() {
        System.out.print("Version WebService : ");
        return 10;
    }
}
