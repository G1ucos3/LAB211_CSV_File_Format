package repository;

import dataAccess.FileDAO;
import java.util.ArrayList;
import model.Info;

/**
 *
 * @author ASUS
 */
public class FileRepository implements IFile {

    @Override
    public void importCSV(ArrayList<Info> al) {
        FileDAO.Instance().importCSV(al);
    }

    @Override
    public void formatAddress(ArrayList<Info> al) {
        FileDAO.Instance().formatAddress(al);
        if (al.isEmpty()) {
            System.err.println("Import file first.");
            return;
        }
        System.out.println("Format Done.");
    }

    @Override
    public void formatName(ArrayList<Info> al) {
        FileDAO.Instance().formatName(al);
        if (al.isEmpty()) {
            System.err.println("Import file first.");
            return;
        }
        System.out.println("Format Done.");
    }

    @Override
    public void exportCSV(ArrayList<Info> al) {
        FileDAO.Instance().exportCSV(al);
        if (al.isEmpty()) {
            System.err.println("Import file first.");
            return;
        }
        System.out.println("Export Done.");
    }
}
