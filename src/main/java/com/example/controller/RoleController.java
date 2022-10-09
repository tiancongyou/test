package com.example.controller;
import com.example.pojo.Role;
import com.example.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;


@RestController
public class RoleController {
    @Resource
    private RoleService roleService;

    @GetMapping("/list")
    public ResponseEntity<List<Role>> GetRoleList()
    {
        List<Role> roles=roleService.QueryList();
        return ResponseEntity.ok(roles);
    }
    @GetMapping("/one")
    public ResponseEntity<Role> GetOne()
    {
        Role role=roleService.QueryOne();
        return ResponseEntity.ok(role);
    }
}
