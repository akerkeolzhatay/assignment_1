// LandTransportFactory.java
public class LandTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
