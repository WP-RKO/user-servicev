package com.happy.research.user.controller;

import com.alibaba.fastjson2.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("base")
public class LoginController {

    @PostMapping("login")
    public JSONObject login(@RequestBody JSONObject jsonpObject) {
        jsonpObject.put("msg", "新年好，昆强！");

        jsonpObject.put("code", 200);
        return jsonpObject;
    }


    @GetMapping("/happy")
    public JSONObject test() {
        JSONObject jsonpObject = new JSONObject();
        jsonpObject.put("王鹏", "杨旸，我永远爱你!");
        return jsonpObject;
    }
}
