package game;

public class Gra {
    static int szerokosc=(Constants.window_width - 2*Constants.border)/3;
    
    static int x1=-Constants.window_width/2 + Constants.border;
    static int y1=Constants.window_height/2 - Constants.border;
    
    public static int pole1=0;
    public static int pole2=0;
    public static int pole3=0;
    public static int pole4=0;
    public static int pole5=0;
    public static int pole6=0;
    public static int pole7=0;
    public static int pole8=0;
    public static int pole9=0;
    
    public static int znak=1;
    
    public static int wartoscZnaku() {
        if (znak == 1) {
            znak = 2;
        } else {
            znak = 1;
        };
        
        return znak;
    }
    
    public static void Rysuj() {
        if (pole1 == 1){
            Graphics.drawX(szerokosc, x1, y1);
        } else if (pole1 == 2) {
            Graphics.drawO(szerokosc, x1, y1);
        }
        if (pole2 == 1){
            Graphics.drawX(szerokosc, x1+szerokosc, y1);
        } else if (pole2 == 2) {
            Graphics.drawO(szerokosc, x1+szerokosc, y1);
        }
        if (pole3 == 1){
            Graphics.drawX(szerokosc, x1+szerokosc*2, y1);
        } else if (pole3 == 2) {
            Graphics.drawO(szerokosc, x1+szerokosc*2, y1);
        }
        
        if (pole4 == 1){
            Graphics.drawX(szerokosc, x1, y1-szerokosc);
        } else if (pole4 == 2) {
            Graphics.drawO(szerokosc, x1, y1-szerokosc);
        }
        if (pole5 == 1){
            Graphics.drawX(szerokosc, x1+szerokosc, y1-szerokosc);
        } else if (pole5 == 2) {
            Graphics.drawO(szerokosc, x1+szerokosc, y1-szerokosc);
        }
        if (pole6 == 1){
            Graphics.drawX(szerokosc, x1+szerokosc*2, y1-szerokosc);
        } else if (pole6 == 2) {
            Graphics.drawO(szerokosc, x1+szerokosc*2, y1-szerokosc);
        }
        
        if (pole7 == 1){
            Graphics.drawX(szerokosc, x1, y1-szerokosc*2);
        } else if (pole7 == 2) {
            Graphics.drawO(szerokosc, x1, y1-szerokosc*2);
        }
        if (pole8 == 1){
            Graphics.drawX(szerokosc, x1+szerokosc, y1-szerokosc*2);
        } else if (pole8 == 2) {
            Graphics.drawO(szerokosc, x1+szerokosc, y1-szerokosc*2);
        }
        if (pole9 == 1){
            Graphics.drawX(szerokosc, x1+szerokosc*2, y1-szerokosc*2);
        } else if (pole9 == 2) {
            Graphics.drawO(szerokosc, x1+szerokosc*2, y1+-szerokosc*2);
        }
              
    }
}
