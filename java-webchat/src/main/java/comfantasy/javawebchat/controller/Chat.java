package comfantasy.javawebchat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author fantasy
 * @version $ Id: Q, v 0.1 2023/04/21 16:00 Administrator Exp $
 */
@Controller
public class Chat {

    @GetMapping("/index.html")
    public String chat() {
        return "chat";
    }
    @GetMapping("/")
    public String index() {
        return "chat";
    }
}
