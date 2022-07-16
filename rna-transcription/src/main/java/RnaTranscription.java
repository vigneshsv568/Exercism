import java.util.Hashtable;

class RnaTranscription {

    String transcribe(String dnaString) {

        Hashtable<Character, Character> check = new Hashtable<Character, Character>();
        String out = "";

        check.put('G','C');
        check.put('C', 'G');
        check.put('A','U');
        check.put('T','A');

        for(int i=0;i<dnaString.length();i++){
            char ch = check.containsKey(dnaString.charAt(i)) ? check.get(dnaString.charAt(i) ) : dnaString.charAt(i);
            out += ch;
        }
        return out;





    }



}
