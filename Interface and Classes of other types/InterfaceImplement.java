public class InterfaceImplement implements Interface {

    @Override
    public void turnOn() {
        System.out.println("켜다.");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다.");
    }

    @Override
    public void changeVolume(int Volume) {
        System.out.println("볼륨을 조절하다.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("channel을 조절하다.");
    }

}
