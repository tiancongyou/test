package com.example.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mapper.RoleMapper;
import com.example.pojo.Role;
import com.example.service.RoleService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;
    @Override
    public List<Role> QueryList() {
        QueryWrapper<Role> roleQueryWrapper = new QueryWrapper<>();
        return roleMapper.selectList(roleQueryWrapper);
    }

    @Override
    public Role QueryOne() {
        return roleMapper.QueryOne();
    }
}
