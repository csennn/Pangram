import java.io.*;

class Result {

    public static String pangrams(String s) {
    
    s = s.toLowerCase();
    
    boolean [] alphabet = new boolean[26];
    
    for (int i = 0; i < 26; i++){
        alphabet[i] = false;
    }
    
    for (int i = 0; i < s.length(); i++){
        if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')){
            alphabet[s.charAt(i) - 'a'] = true;
        }
    }
    
    for(int i = 0; i < 26; i++){
        if (alphabet[i] == false){
            return "not pangram";
        }
    }
    
    return "pangram";
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
