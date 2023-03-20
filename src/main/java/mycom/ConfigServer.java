package mycom;
@org.springframework.cloud.config.server.EnableConfigServer
@org.springframework.boot.autoconfigure.SpringBootApplication;
public class ConfigServer {

    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(ConfigServer.class, args);
    }
}
