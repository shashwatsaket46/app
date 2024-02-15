package com.cms.app.restImpl;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.cms.app.constants.CafeConstants;
import com.cms.app.rest.UserRest;
import com.cms.app.service.UserService;
import com.cms.app.utils.CafeUtils;

@RestController
public class UserRestImpl implements UserRest{
    @Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        // TODO Auto-generated method stub
        try {
            return userService.signUp(requestMap);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    
}
