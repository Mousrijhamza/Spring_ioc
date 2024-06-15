package Present_spring;
import METIER.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        metier metier=context.getBean(METIER.metier.class);
        System.out.println("Res="+metier.calcul(12));


        System.out.println("---------------------------------------");
        //--------------------------------------------------


//        ApplicationContext context1=new AnnotationConfigApplicationContext("METIER", "DAO");
//        metier metier2=context1.getBean(METIER.metier.class);
//
//        System.out.println("Res2="+metier2.calcul(12));


    }
}
