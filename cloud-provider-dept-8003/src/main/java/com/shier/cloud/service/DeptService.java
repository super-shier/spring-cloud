package com.shier.cloud.service;

import com.shier.cloud.modle.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
