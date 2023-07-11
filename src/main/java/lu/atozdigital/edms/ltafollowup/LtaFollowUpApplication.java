package lu.atozdigital.edms.ltafollowup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
@Controller
public class LtaFollowUpApplication {

    public static void main(String[] args) {
        SpringApplication.run(LtaFollowUpApplication.class, args);
    }

    @GetMapping("/config")
    public ResponseEntity<?> getConfig() throws InterruptedException {
        TimeUnit.MINUTES.sleep(1);
        return ResponseEntity.ok(Map.of(
                "Thread", Thread.currentThread().getName(),
                "HostName", Optional.ofNullable(System.getenv("HOSTNAME"))
        ));
    }
}
