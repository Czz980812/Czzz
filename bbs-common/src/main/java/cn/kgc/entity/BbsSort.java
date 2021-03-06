package cn.kgc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "bbs_sort")
public class BbsSort implements Serializable {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String name;
}
