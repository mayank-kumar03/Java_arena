package Oops.Interface;
class Phone{
    public void  call(){
        System.out.println("Phone call");

    }
    public void sms(){
        System.out.println("sms sending by phone");
    }
}
interface ICamera{
    public void  click();
    public void record();
}
interface  IMusicPlayer{
    void play();
    void stop();
}
class  SmartPhone extends  Phone implements  ICamera,IMusicPlayer {
    public void VideoCall() {
        System.out.println("Smart phone video Calling");
    }

    public void click() {
        System.out.println("smart phone clicking photo");
    }

    public void record() {
        System.out.println("smart phone record videos");
    }

    public void play() {
        System.out.println("smart phone play video");
    }

    public void stop() {
        System.out.println("stop music from smatphone");
    }
}


public class Pro1 {
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        sp.call();
        sp.click();
        sp.record();

    }



}
