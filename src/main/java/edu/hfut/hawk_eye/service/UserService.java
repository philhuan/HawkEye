package edu.hfut.hawk_eye.service;

import edu.hfut.hawk_eye.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public boolean add(User user);


}
