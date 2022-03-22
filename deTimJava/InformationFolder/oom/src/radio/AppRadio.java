package radio;

public class AppRadio {

    public static void main(String[] args) {
        AppRadio appRadio = new AppRadio();
        appRadio.ffh();
        appRadio.antenne();
    }
    public void ffh(){
        Radio ffh = new Radio(false, 0, 77.0);
        ffh.powerSwitch();
        ffh.louder();
        //ffh.chFrequency();
        System.out.println(ffh);

    }
    public void antenne(){
        Radio antenne = new Radio();
        System.out.println(antenne.toString());
    }
}
