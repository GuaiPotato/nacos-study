package top.dezckd.userservice.service;

import org.springframework.stereotype.Service;
import top.dezckd.userservice.dto.UserDTO;
import top.dezckd.userservice.entity.User;
import top.dezckd.userservice.vo.ErrorResponse;
import top.dezckd.userservice.vo.ServiceResponse;
import top.dezckd.userservice.vo.SuccessResponse;

/**
 * @Author DEZ
 * @Date 2024/9/4
 * @Description UserService
 */
@Service
public class UserService {

    public ServiceResponse getUserById(String id) {
        return switch (id) {
            case "123" -> new SuccessResponse("User Info of ID: " + id);
            default -> new ErrorResponse("User not found");
        };
    }

    public ServiceResponse createUser(UserDTO userDTO) {
        var user = new User(null, userDTO.name(), userDTO.email());
        return new SuccessResponse("User created with name: " + user.name());
    }
}