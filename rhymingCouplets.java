package rhymingCouplets.main;
import java.io.*;

public class rhymingCouplets {
  public static void main(String[] args){
    File english = new File("/english.lang"); //declares file as a File in the root of /res calles english.lang
    BufferedReader reader;
    String englishWords;
    String rhymingCouplets = new String([oo, ot, aw, ay, ad]);
    String outputWords = new String([],[],[],[],[]);
   
    createIOVariables();
    
    for(int i = 0; i < englishWords.length(); i++){
      if(englishWords[i].substring(0, englishWords[i].length() - 2) = rhymingCouplets[0]){
        outputWords[0].add(englishWords[i]); 
      }
      
      if(englishWords[i].substring(0, englishWords[i].length() - 2) = rhymingCouplets[1]){
        outputWords[1].add(englishWords[i]); 
      }
      
      if(englishWords[i].substring(0, englishWords[i].length() - 2) = rhymingCouplets[2]){
        outputWords[2].add(englishWords[i]); 
      }
      
      if(englishWords[i].substring(0, englishWords[i].length() - 2) = rhymingCouplets[3]){
        outputWords[3].add(englishWords[i]); 
      }
      
      if(englishWords[i].substring(0, englishWords[i].length() - 2) = rhymingCouplets[4]){
        outputWords[4].add(englishWords[i]); 
      }
      
    }
  }
  
  
  public static void createIOVariables(){
    try {
      reader = new BufferedReader(new FileReader(english));
      englishWords = reader.read().split("\n");
    }
    
    catch(FileNotFoundException e) {
      System.out.println("The specified file not found" + e);
    }
    catch(IOException e) {
      System.out.println("I/O Exception: " + e); 
    }
  }
}


