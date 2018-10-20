package game;

public class Gra {
    public static int pole1=0;
    public static int pole2=0;
    public static int pole3=0;
    public static int pole4=0;
    public static int pole5=0;
    public static int pole6=0;
    public static int pole7=0;
    public static int pole8=0;
    public static int pole9=0;
    
    public static void Rysuj() {
        if (pole1 == 1){
            Graphics.drawX((Constants.window_width - 2*Constants.border)/3, -Constants.window_width/2 + Constants.border, Constants.window_height/2 - Constants.border);
        }
    }
}
