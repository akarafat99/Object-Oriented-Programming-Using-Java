package Unit_10;

// input file name command line arguments.
import java.io.*;
class BaseSubException
{
    public static void main(String arr[])
    {
        if(arr.length == 0)
        {
            System.out.println("invalid usage");
            System.out.println("usage : Java file1 file2 …");
            return;
        }
        for(int i=0;i<arr.length; i++) {
            File ft = new File(arr[i]);
            try {
                String line;
                DataInput d = new DataInputStream(new FileInputStream(arr[i]));
                if (ft.exists() && ft.isFile()) {
                    System.out.println("file exists");
                    System.out.println(ft + "is ordinary file");
                    System.out.println("printing the contents of file named : " + arr[i]);
                    while((line = d.readLine()) != null)
                    {
                        System.out.println(line);
                    }
                }
            }
            catch(FileNotFoundException e) {
                if(ft.exists() && ft.isDirectory()) {
                    System.out.println("Name : " + ft + " is a directory");
                }
                else {
                    System.out.println("Name : " + arr[i] + " does not exists");
                    System.out.println("exception :"+e);
                }
            }
            catch(IOException e1) {
                System.out.println("super class is higher up in the program");
            }
        }
    }
}
