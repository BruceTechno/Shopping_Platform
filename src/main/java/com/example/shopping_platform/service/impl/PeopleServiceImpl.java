package com.example.shopping_platform.service.impl;

import com.example.shopping_platform.constants.RtnCode;
import com.example.shopping_platform.entity.People;
import com.example.shopping_platform.repository.PeopleDao;
import com.example.shopping_platform.service.ifs.PeopleService;
import com.example.shopping_platform.vo.ActiveRequest;
import com.example.shopping_platform.vo.ActiveResponse;
import com.example.shopping_platform.vo.RegisterRequest;
import com.example.shopping_platform.vo.RegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private PeopleDao peopleDao;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        String account = request.getAccount();
        String pwd = request.getPwd();
        String name = request.getName();
        String address = request.getAddress();
        String phone = request.getPhone();
        String patternAccount = "^[^\\s]{3,8}$";
        String patternPwd = "^(?=.+[\\p{Punct}])(?!.*[\\s\\t\\r\\n\\f])[\\p{Print}]{8,12}$";
        //todo phone正規表達式
        if (!StringUtils.hasText(account) || !StringUtils.hasText(pwd) || !StringUtils.hasText(name) ||
                !StringUtils.hasText(address) || !StringUtils.hasText(phone)) {
            return new RegisterResponse(RtnCode.CANNOT_EMPTY.getMessage());
        }
        if (!account.matches(patternAccount) || !pwd.matches(patternPwd)) {
            return new RegisterResponse(RtnCode.DATA_ERROR.getMessage());
        }
        if (peopleDao.existsById(account)) {
            return new RegisterResponse(RtnCode.DATA_DUPLICATE.getMessage());
        }
        People result = new People(account, pwd, name, address, phone);
        peopleDao.save(result);

        return new RegisterResponse(RtnCode.SUCCESSFUL.getMessage());
    }

    @Override
    public ActiveResponse active(ActiveRequest request) {
        String account = request.getAccount();
        String pwd = request.getPwd();
        if (!StringUtils.hasText(account) || !StringUtils.hasText(pwd)) {
            return new ActiveResponse(RtnCode.CANNOT_EMPTY.getMessage());
        }
        People result = peopleDao.findByAccountAndPwd(account, pwd);
        if (result == null){
            return new ActiveResponse(RtnCode.DATA_ERROR.getMessage());
        }
        result.setActive(true);
        peopleDao.save(result);
        return new ActiveResponse(RtnCode.SUCCESSFUL.getMessage());
    }


}
