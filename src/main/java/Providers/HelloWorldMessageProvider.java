package Providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class HelloWorldMessageProvider implements MessageProvider {
@Autowired
    public String getMessage() {
        return "Hello World!";
    }
}
