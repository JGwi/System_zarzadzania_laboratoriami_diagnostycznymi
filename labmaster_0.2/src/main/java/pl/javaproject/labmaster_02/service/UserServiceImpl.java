package pl.javaproject.labmaster_02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.javaproject.labmaster_02.dto.UserDto;
import pl.javaproject.labmaster_02.model.User;
import pl.javaproject.labmaster_02.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getNazwisko(), userDto.getImie(), userDto.getEmail(), userDto.getTelefon(), userDto.getStanowisko(), userDto.getDepartament(), userDto.getPensja(), userDto.getKonto_zatwierdzone());
        return userRepository.save(user);
    }
}
