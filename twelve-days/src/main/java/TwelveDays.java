import java.util.*;
class TwelveDays {

    private final String[] Dates = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    private final String[] Rhythms = {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };
    private String Statement1 = "On the ";
    private String Statement2 = " day of Christmas my true love gave to me: ";
    String verse(int verseNumber) {
        StringBuilder str  = new StringBuilder();
        str.append(Statement1);
        str.append(Dates[verseNumber-1]);
        str.append(Statement2);
        for(int i=verseNumber;i>0;i--){
            str.append(Rhythms[i-1]);
            if(i!=1){
                str.append(", ");
            }
            if(i==2){
                str.append("and ");
            }

        }
        str.append(".\n");
       return str.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder str1 = new StringBuilder();

        for(int i=startVerse;i<=endVerse;i++){
            str1.append(verse(i));
            if(i!=endVerse){
                str1.append("\n");
            }
        }
        return str1.toString();

    }
    
    String sing() {
        return verses(1,12);
    }
}
