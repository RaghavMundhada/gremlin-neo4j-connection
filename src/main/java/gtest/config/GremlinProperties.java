package gtest.config;
import org.apache.tinkerpop.gremlin.driver.ser.Serializers;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("gremlin")
public class GremlinProperties {
    private String endpoint;

    private int port;

    private String username;

    private String password;

    private boolean sslEnabled;

    private boolean telemetryAllowed = true;

    private String serializer = Serializers.GRAPHSON.toString();

    public GremlinProperties(String endpoint, int port, String username, String password, boolean sslEnabled, boolean telemetryAllowed, String serializer) {
        this.endpoint = endpoint;
        this.port = port;
        this.username = username;
        this.password = password;
        this.sslEnabled = sslEnabled;
        this.telemetryAllowed = telemetryAllowed;
        this.serializer = serializer;
    }

    public GremlinProperties() {
    }

    public String getEndpoint() {
        return endpoint;
    }

    public int getPort() {
        return port;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isSslEnabled() {
        return sslEnabled;
    }

    public boolean isTelemetryAllowed() {
        return telemetryAllowed;
    }

    public String getSerializer() {
        return serializer;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSslEnabled(boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    public void setTelemetryAllowed(boolean telemetryAllowed) {
        this.telemetryAllowed = telemetryAllowed;
    }

    public void setSerializer(String serializer) {
        this.serializer = serializer;
    }
}