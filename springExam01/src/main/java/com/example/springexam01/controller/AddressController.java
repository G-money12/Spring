package com.example.springexam01.controller;

import com.example.springexam01.dto.AddressDTO;
import com.example.springexam01.model.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/address")     // 전체에 영향은 맨위로
@Controller
public class AddressController {
    @Autowired
    private AddressService addressService;
    //추가폼
    @GetMapping("insert")
    public String insert(){
        return "address/insert";
    }
    //추가
    @PostMapping("insert")
    public String insert(@ModelAttribute AddressDTO address){
        addressService.addrInsert(address);
        return "redirect:list";
    }

    //전체보기
    @GetMapping("list")
    public String list(Model model){
        List<AddressDTO>alist = addressService.getAddress();
        int count = addressService.countAddress();
        model.addAttribute("alist", alist);
        model.addAttribute("count", count);
        return "address/list";
    }
    //상세보기
    @GetMapping("view")
    public String view(@RequestParam ("num") int num,
                       Model model){
//        AddressDTO dadress = addressService.viewAddress(num);
        model.addAttribute("address",addressService.viewAddress(num));

        return "address/view";
    }
    //삭제
    @GetMapping("delete")
    public String delete(@RequestParam ("num") int num){
        addressService.deleteAddress(num);
        return "redirect:list";
    }


}
