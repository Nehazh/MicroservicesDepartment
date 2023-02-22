package com.micros.user.service;

import com.micros.user.dto.ResponseDto;
import com.micros.user.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}
