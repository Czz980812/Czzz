package cn.kgc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "bbs_detail")
public class BbsDetail implements Serializable {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    @Column(name = "sortId")
    private Integer sortId;
    private String title;
    private String detail;
    private String author;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate;
    @Column(name = "replyCount")
    private Integer replyCount;
    private Integer age;

}
