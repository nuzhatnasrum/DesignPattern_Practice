package State;

// State Interface
public interface TrafficLightState {
    void next(TrafficLight trafficLight);
    void display();
}
