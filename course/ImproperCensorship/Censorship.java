public class Censorship {
    public String censored(String line){
         String newLine;
         newLine = (line.toLowerCase()).replace("блин", "");
         return newLine.trim();
    }
}
