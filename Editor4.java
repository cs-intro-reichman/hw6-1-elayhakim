import java.awt.Color;

public class Editor4 {
    public static void main (String[] args) {
        // קבלת שם הקובץ ומספר הצעדים משורת הפקודה
        String fileName = args[0];
        int n = Integer.parseInt(args[1]);
        
        // קריאת תמונת המקור
        Color[][] sourceImage = Runigram.read(fileName);
        
        // יצירת תמונת היעד (גרסת גווני האפור של המקור)
        Color[][] targetImage = Runigram.grayScaled(sourceImage);
        
        // הגדרת הקנבס והצגת האנימציה
        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage, targetImage, n);
    }
}