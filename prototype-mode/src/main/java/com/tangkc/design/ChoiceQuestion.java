package com.tangkc.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Map;

/**
 * @author: tangkc
 * @Date: 2020-7-14 08:36
 * @Description: 题目模板
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class ChoiceQuestion {
    /**
     * 题目
     */
    private String name;
    /**
     * 选项；A、B、C、D
     */
    private Map<String, String> option;
    /**
     * 答案；B
     */
    private String key;
}
