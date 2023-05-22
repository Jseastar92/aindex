package com.aindex.aindex.controller;

import com.aindex.aindex.domains.TestTable;
import com.aindex.aindex.service.TestTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class indexController {


    protected final TestTableService testTableService;

    @GetMapping("/index")
    public String index() {
//        ModelAndView mav = new ModelAndView("static/index");
        return "index";
    }

    @GetMapping("/create")
    public String createT() {
        TestTable col = testTableService.createCol();
        return col.getId().toString();
    }

    @GetMapping("/getVal")
    public String getVal(Model model){
        String txt = testTableService.getTablename();
        model.addAttribute("testName", txt);
        return "index";
    }

}
