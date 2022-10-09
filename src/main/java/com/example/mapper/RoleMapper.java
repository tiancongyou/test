package com.example.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.pojo.Role;

public interface RoleMapper extends BaseMapper<Role> {
    Role QueryOne();

}
