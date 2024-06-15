package Presentation;

import DAO.*;
import METIER.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


// intanciation par chargement dynamique des classes


public class PresentationV2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Demander la classe DAO
            System.out.print("Enter the DAO class name: ");
            String daoClass = scanner.nextLine();
            Class cDAO = Class.forName(daoClass);
            dao o1 = (dao) cDAO.getConstructor().newInstance();

            // Demander la classe Metier
            System.out.print("Enter the Metier class name: ");
            String metierClass = scanner.nextLine();
            Class cMetier = Class.forName(metierClass);

//
            Constructor metierConstructor = cMetier.getConstructor();
            metier o2 = (metier) metierConstructor.newInstance();


            Method setDao=cMetier.getMethod("setD", dao.class ) ;
            setDao.invoke(o2, o1);

            // Appeler la méthode calcul et afficher le résultat
            System.out.println(o2.calcul(12));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
