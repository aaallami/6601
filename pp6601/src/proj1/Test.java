package proj1;

import java.io.*;

public class Test {
    public static void main(String [] args) throws IOException {

        // The name of the file to open.
        String fileName = "/home/ali/workspace/pp6601/src/proj1/temp.txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");

            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
System.out.println("now we excute the cmd");

try {

    // create a new array of 2 strings
    String[] cmdArray = new String[1];

    // first argument is the program we want to open
    cmdArray[0] = "/home/ali/workspace/pp6601/src/proj1/temp.txt";



    // print a message
    System.out.println("Executing notepad.exe and opening example.txt");

    // create a process and execute cmdArray and currect environment
    Process process = Runtime.getRuntime().exec(cmdArray,null);

    // print another message
    System.out.println("example.txt should now open.");
 } catch (Exception ex) {
    ex.printStackTrace();
 }
}



	
    }
