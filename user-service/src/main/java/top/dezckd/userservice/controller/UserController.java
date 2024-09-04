package top.dezckd.userservice.controller;

import org.springframework.web.bind.annotation.*;
import top.dezckd.userservice.dto.UserDTO;
import top.dezckd.userservice.service.UserService;
import top.dezckd.userservice.vo.ServiceResponse;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description UserController
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ServiceResponse getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public ServiceResponse createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
}
