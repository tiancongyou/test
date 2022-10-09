package com.example.service;
import com.example.pojo.Role;
import java.util.List;

public interface RoleService {
    List<Role> QueryList();

    Role QueryOne();
}
