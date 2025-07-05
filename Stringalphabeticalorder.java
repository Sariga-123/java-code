public class Stringalphabeticalorder {
    public static void main(String[] args) {
        char ks='s';
        char gs='e';
        int temp=0;
        if(ks>gs){
            temp=ks;
            ks=gs;
            gs=(char)temp;
            System.out.println(ks +" "+gs);
        }

    }
}
