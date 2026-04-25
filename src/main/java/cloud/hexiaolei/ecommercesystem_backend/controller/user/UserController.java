package cloud.hexiaolei.ecommercesystem_backend.controller;

import cloud.hexiaolei.ecommercesystem_backend.dto.entity.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @GetMapping("/login")
    public Result<String> login(@RequestParam String username, @RequestParam String password){
        
        
        return
    }
}
