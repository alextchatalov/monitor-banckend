package com.monitor.service;

import com.monitor.business.InvestimentBusiness;
import com.monitor.business.UserBusiness;
import com.monitor.domain.Investiment;
import com.monitor.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class InvestmentService {

    @Autowired
    private InvestimentBusiness business;

    public List<Investiment> getAll(){
        return business.getAll();
    }

    public void save(Investiment investiment) {
        business.save(investiment);
    }

    public void delete(String investimentCode) {
        business.delete(investimentCode);
    }

    public void uploadFile(MultipartFile[] files) {
        business.uploadFile(files);
    }
}