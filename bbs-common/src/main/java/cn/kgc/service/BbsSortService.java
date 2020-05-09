package cn.kgc.service;

import cn.kgc.entity.BbsSort;

import java.util.List;

public interface BbsSortService {

    /**
     * 查询所有帖子类别
     * @return
     */
    public List<BbsSort> findBbsSort();
}
