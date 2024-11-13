package State;


// Green Light State
public class GreenLight implements TrafficLightState {
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowLight());
    }

    public void display() {
        System.out.println("Green Light - Cars can go");
    }
}

// Yellow Light State
public class YellowLight implements TrafficLightState {
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedLight());
    }

    public void display() {
        System.out.println("Yellow Light - Cars should slow down");
    }
}

// Red Light State
public class RedLight implements TrafficLightState {
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenLight());
    }

    public void display() {
        System.out.println("Red Light - Cars must stop");
    }
}
