package cn.kgc.service.impl;

import cn.kgc.entity.BbsSort;
import cn.kgc.mapper.BbsSortMapper;
import cn.kgc.service.BbsSortService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class BbsSortServiceImpl implements BbsSortService {

    @Autowired
    private BbsSortMapper bbsSortMapper;

    @Override
    public List<BbsSort> findBbsSort() {
        return bbsSortMapper.selectAll();
    }
}
