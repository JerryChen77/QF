package com.shine.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component  // 把对象注入spring容器，user3
public class User3 {
    private Integer id;
    private String username;
    private String password;
    private String[] names;
    private List<String> hobby;
    private Map<String,String> phones;
}
