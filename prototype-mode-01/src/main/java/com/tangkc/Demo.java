package com.tangkc;

import com.tangkc.design.QuestionBankController;

/**
 * @author: tangkc
 * @Date: 2020-7-14 13:28
 * @Description: 原型模式重构代码
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}
