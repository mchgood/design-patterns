package com.tangkc.design.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * @author: tangkc
 * @Date: 2020-7-14 13:29
 * @Description: 题目
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class Topic {

    /**
    * 选项；A、B、C、D
    */
    private Map<String, String> option;

    /**
    * 答案；B
    */
    private String key;
}
