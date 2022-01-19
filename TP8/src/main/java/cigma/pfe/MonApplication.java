package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import net.bytebuddy.build.Plugin;
import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class MonApplication {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("ctr");
      //  ctrl.save(new Client("SAAD"));
 //       ctrl.save(new Client("SALMA"));
      //  ctrl.save(new Client("ZIKO"));
     //   ctrl.save(new Client("NIGGA"));
      //  ctrl.modify(new Client(3,"New Name"));
        // ctrl.removeById(1L);
        // Client found = ctrl.getById(1L);
       // ctrl.getAll();

        // Facture zone code

           // Let's start with create
          //  ctrl.create(new Facture(new Date(2022,01,14),200));
         //   ctrl.create(new Facture(new Date(2022,1,4),100));
        //    ctrl.create(new Facture(new Date(2022,07,30),430));
       //     ctrl.create(new Facture(new Date(2022,01,24),4900));
      //      ctrl.update(new Facture(1,new Date(2023,01,14),400))
     //       ctrl.delete(1);
    //        ctrl.readAll();

    }

}