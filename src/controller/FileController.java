package controller;

import model.Info;
import repository.FileRepository;
import view.Menu;

/**
 *
 * @author ASUS
 */
public class FileController extends Menu{
    static String[] mc = {"Import CSV", "Format Address", "Format Name", "Export CSV", "Exit"};
    Info info;
    FileRepository fr;
    
    public FileController(){
        super("Format CSV Program", mc);
        info = new Info();
        fr = new FileRepository();
    }

    @Override
    public void execute(int choice) {
        switch(choice){
            case 1:
                System.out.println("--------- Import CSV -------");
                fr.importCSV(info.getAl());
                break;
            case 2:
                System.out.println("--------- Format Address -------");
                fr.formatAddress(info.getAl());
                break;
            case 3:
                System.out.println("--------- Format Name -------");
                fr.formatName(info.getAl());
                break;
            case 4:
                System.out.println("--------- Export CSV ------");
                fr.exportCSV(info.getAl());
                break;
            case 5:
                System.out.println("Closed..");
                System.exit(0);
            default:
                System.out.println("Choose again.");
                break;
        }
    }
    
    
}
