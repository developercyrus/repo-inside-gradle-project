package foo.bar.commons;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Speaker {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    public String say() {
        return "Hello World!";
    }
}