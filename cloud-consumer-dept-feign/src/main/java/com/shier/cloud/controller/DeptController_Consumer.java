package com.shier.cloud.controller;

import com.shier.cloud.modle.Dept;
import com.shier.cloud.service.DeptClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController_Consumer {
    private static final Logger logger=LoggerFactory.getLogger(DeptController_Consumer.class);
    @Resource
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @RequestMapping(value = "consumer/dept/list")
    public List<Dept> list() {
        List<Dept> depts = deptClientService.list();
        logger.info("******depts:{}", depts.toString());
        return depts;
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept) {
        return deptClientService.add(dept);
    }
}
