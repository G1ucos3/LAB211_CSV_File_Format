package dataAccess;

import common.Validate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Info;

/**
 *
 * @author ASUS
 */
public class FileDAO {

    private static FileDAO instance = null;
    Validate validate = new Validate();

    public static FileDAO Instance() {
        if (instance == null) {
            synchronized (FileDAO.class) {
                if (instance == null) {
                    instance = new FileDAO();
                }
            }
        }
        return instance;
    }

    public void importCSV(ArrayList<Info> al) {
        String line = "";
        String path = validate.checkString("Enter Path");
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                String[] s = line.split(",");
                al.add(new Info(Integer.parseInt(s[0]), s[1], s[2], s[3], s[4]));
            }
            System.out.println("Import Done.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void formatAddress(ArrayList<Info> al){
        for(int i = 0; i < al.size(); i++){
            StringBuilder sb = new StringBuilder();
            String address = al.get(i).getAddress().trim();
            address = address.toLowerCase().replaceAll("\\s+", " ");
            String[] words = address.split(" ");
            for(String word : words){
                sb.append(Character.toUpperCase(word.charAt(0))).
                        append(word.substring(1)).append(" ");
            }
            al.get(i).setAddress(sb.toString().trim());
        }
    }
    
    public void formatName(ArrayList<Info> al){
        for(int i = 0; i < al.size(); i++){
            StringBuilder sb = new StringBuilder();
            String name = al.get(i).getName().trim();
            name = name.toLowerCase().replaceAll("\\s+", " ");
            String[] words = name.split(" ");
            for(String word : words){
                sb.append(Character.toUpperCase(word.charAt(0))).
                        append(word.substring(1)).append(" ");
            }
            al.get(i).setName(sb.toString().trim());
        }
    }

    public void exportCSV(ArrayList<Info> al) {
        String path = validate.checkString("Enter Path");
        try{
            FileWriter fw = new FileWriter(path);
            for(Info in : al){
                fw.append(String.valueOf(in.getiD())).append(",");
                fw.append(String.valueOf(in.getName())).append(",");
                fw.append(String.valueOf(in.getEmail())).append(",");
                fw.append(String.valueOf(in.getPhone())).append(",");
                fw.append(String.valueOf(in.getAddress())).append("\n");
            }
            fw.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
