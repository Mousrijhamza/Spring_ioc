package DAO;

public class daoImplV2 implements dao {

    @Override
    public Integer getData() {
        System.out.print("Version WebService : ");
        return 10;
    }
}
