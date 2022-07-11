package restbackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import restbackend.domain.LoginInfo;
import restbackend.domain.UserInfo;
import restbackend.exeption.InvalidUserNameExeption;

import java.util.Date;

@RestController
public class BankController {


    @PostMapping("user/login")
    public UserInfo doLogin(@RequestBody LoginInfo loginInfo) {

        if (loginInfo.getUserName().equals("Lena")){
            return UserInfo.builder()
                    .loginDate(new Date())
                    .userName(loginInfo.getUserName())
                    .build();

        } else {
            throw new InvalidUserNameExeption();
        }

    }

}
