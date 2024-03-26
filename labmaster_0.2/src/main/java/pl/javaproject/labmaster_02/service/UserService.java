package pl.javaproject.labmaster_02.service;

import pl.javaproject.labmaster_02.dto.UserDto;
import pl.javaproject.labmaster_02.model.User;

public interface UserService {
    User save (UserDto userDto);
}
