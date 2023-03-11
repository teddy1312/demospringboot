package com.cybersoft.demospringboot.controller;
// linl /account

import com.cybersoft.demospringboot.model.AccountModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{id}/{name}")
    public ResponseEntity<?> index(@PathVariable int id,
                                   @PathVariable("name") String customer,
                                   @RequestParam String address ){
                                   //@RequestParam(required = false,defaultValue = "") String address ){


        return new ResponseEntity<>("Hello Restful API " +id+" - "+customer+" - "+address, HttpStatus.OK);
    }

    /*
    * Các type truyền dữ liệu ngầm trong Spring
    * 1. url-encoded: truyền dữ liệu ngầm nhưng ko đính kèm file
    * 2. form-data: truyền dữ liệu ngầm có đính kèm file, có giới hạn về kích thước data, số lượng file vô tận
    * 3. raw body: truyền dữ liệu ngầm nhưng dạng JSON, kích thước data bất tử, nếu truyền hình thì cần đưa về 64
    * */
    @PostMapping("/{id}")
    public ResponseEntity<?> insertAccount(
                                @PathVariable int id,
                                @RequestBody AccountModel accountModel
    ){
//        AccountModel accountModel = new AccountModel();
//        accountModel.setId(id);
//        accountModel.setCustomerName("Nguyễn Anh Tú");
//        accountModel.setAge(29);

        return new ResponseEntity<>(accountModel,HttpStatus.OK);
    }

}
