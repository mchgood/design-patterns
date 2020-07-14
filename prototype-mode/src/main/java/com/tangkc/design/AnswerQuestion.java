package com.tangkc.design;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: tangkc
 * @Date: 2020-7-14 10:25
 * @Description: 答案
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class AnswerQuestion {
    /**
     * 问题
     */
    private String name;
    /**
     * 答案
     */
    private String key;
}
