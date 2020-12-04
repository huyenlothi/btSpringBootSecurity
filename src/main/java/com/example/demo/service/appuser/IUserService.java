package com.example.demo.service.appuser;

import com.example.demo.model.AppUser;
import com.example.demo.service.IService;

public interface IUserService extends IService<AppUser> {
AppUser getUserByUsername(String username);
}
