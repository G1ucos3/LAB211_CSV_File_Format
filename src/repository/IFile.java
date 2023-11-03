package repository;

import java.util.ArrayList;
import model.Info;

/**
 *
 * @author ASUS
 */
public interface IFile {

    void exportCSV(ArrayList<Info> al);

    void formatAddress(ArrayList<Info> al);

    void formatName(ArrayList<Info> al);

    void importCSV(ArrayList<Info> al);
    
}
